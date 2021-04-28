package com.example.reminder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class AlarmReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        try{
            Bundle bun = intent.getExtras();
            String name = bun.getString("alarmName");
            String description = bun.getString("alarmDescription");
        }
        catch(Exception e){
            return;
        }
    }
}