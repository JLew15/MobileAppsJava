package com.example.reminder;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.util.Calendar;
import java.util.Random;
import java.util.StringTokenizer;

public class AlarmKeeper{
    public String alarmName;
    public String alarmDescription;
    public int alarmYear;
    public int alarmMonth;
    public int alarmDay;
    public int alarmHour;
    public int alarmMinute;
    private int alarmReqCode;

    public AlarmKeeper(){
        Random r = new Random(System.currentTimeMillis());
        alarmReqCode = (1 + r.nextInt(2)) * 10000 + r.nextInt(10000);
    }

    public void fromString(String alarmString){
        StringTokenizer st = new StringTokenizer(alarmString, ",");
        alarmName = st.nextToken();
        alarmDay = Integer.parseInt(st.nextToken());
        alarmMonth = Integer.parseInt(st.nextToken());
        alarmYear = Integer.parseInt(st.nextToken());
        alarmHour = Integer.parseInt(st.nextToken());
        alarmMinute = Integer.parseInt(st.nextToken());
        alarmDescription = st.nextToken();
        alarmReqCode = Integer.parseInt(st.nextToken());
    }

    public void setReqCode(int reqCode){
        alarmReqCode = reqCode;
    }

    public int getReqCode(){
        return alarmReqCode;
    }

    public void setAlarm(Context context){
        Calendar c = Calendar.getInstance();
        c.set(alarmYear, alarmMonth, alarmDay, alarmHour, alarmMinute);
        Intent intent = new Intent(context, AlarmReceiver.class);
        intent.putExtra("alarmName", alarmName);
        intent.putExtra("alarmDescription", alarmDescription);

        PendingIntent sender = PendingIntent.getBroadcast(context, alarmReqCode, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager am = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);

        am.set(AlarmManager.RTC_WAKEUP, c.getTimeInMillis(), sender);
    }

    public void cancelAlarm(Context context){

    }

    public void clear(){
        alarmName = "";
        alarmDescription = "";
        alarmYear = 0;
        alarmMonth = 0;
        alarmDay = 0;
        alarmHour = 0;
        alarmMinute = 0;

        Random r = new Random(System.currentTimeMillis());
        alarmReqCode = (1 + r.nextInt(2)) * 10000 + r.nextInt(10000);
    }

    public String buildString(){

        String strReturn = "";
        strReturn += alarmName + ",";
        strReturn += alarmDay + ",";
        strReturn += alarmMonth + ",";
        strReturn += alarmYear + ",";
        strReturn += alarmHour + ",";
        strReturn += alarmMinute + ",";
        strReturn += alarmDescription + ",";
        strReturn += alarmReqCode;

        return strReturn;
    }
}