package com.example.reminder;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class AlarmList extends ListActivity {

        ArrayList<AlarmKeeper> myAlarms = new ArrayList<>();
        ArrayList<String> myAlarmDisplayStrings = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadAlarms();
        buildAlarmDisplayStrings();
    }

    public void buildAlarmDisplayStrings(){
        myAlarmDisplayStrings.clear();
        if(myAlarms.isEmpty()){
            myAlarmDisplayStrings.add("No Alarms Set");
        }
        else{
            for (AlarmKeeper alarm: myAlarms){
                myAlarmDisplayStrings.add(alarm.alarmName);
            }
        }
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, myAlarmDisplayStrings);
        setListAdapter(myAdapter);
    }

    public void loadAlarms(){
        try{
            InputStreamReader isr = new InputStreamReader(openFileInput("alarms.txt"));
            BufferedReader bR = new BufferedReader(isr);
            String line = bR.readLine();
            while (line != null){
                StringTokenizer st = new StringTokenizer(line, ",");

                AlarmKeeper newAlarm = new AlarmKeeper();
                newAlarm.alarmName = st.nextToken();
                newAlarm.alarmDay = Integer.parseInt(st.nextToken());
                newAlarm.alarmMonth = Integer.parseInt(st.nextToken());
                newAlarm.alarmYear = Integer.parseInt(st.nextToken());
                newAlarm.alarmHour = Integer.parseInt(st.nextToken());
                newAlarm.alarmMinute = Integer.parseInt(st.nextToken());
                newAlarm.alarmDescription = st.nextToken();
                newAlarm.setReqCode(Integer.parseInt(st.nextToken()));

                myAlarms.add(newAlarm);
                line = bR.readLine();
            }
            bR.close();

        }
        catch(Exception e){
            return;
        }
    }

    public void saveAlarms(){
        try{
            OutputStreamWriter osr = new OutputStreamWriter(openFileOutput("alarms.txt", MODE_PRIVATE));
            String endLine = System.getProperty("line.separator");
            for(int i = 0; i < myAlarms.size(); i ++){
                AlarmKeeper alarm = myAlarms.get(i);
                osr.write(alarm.alarmName + ",");
                osr.write(alarm.alarmDay + ",");
                osr.write(alarm.alarmMonth + ",");
                osr.write(alarm.alarmYear + ",");
                osr.write(alarm.alarmHour + ",");
                osr.write(alarm.alarmMinute + ",");
                osr.write(alarm.alarmDescription + ",");
                osr.write(alarm.getReqCode() + ",");
                osr.write(endLine);
            }
            osr.flush();
            osr.close();
        }
        catch(Exception e){
            return;
        }
    }

    public boolean onOptionsItemSelected(MenuItem item){

        return super.onOptionsItemSelected(item);
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    public boolean onContextItemSelected(MenuItem item){

        return super.onOptionsItemSelected(item);
    }
    public boolean onCreateOptionsMenu(Menu menu){

        return true;
    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        if ((position > -0) && (position<myAlarms.size())){
            AlarmKeeper alarm = myAlarms.get(position);
            Intent editIntent = new Intent(this, AddAlarm.class);
            editIntent.putExtra("alarm", alarm.buildString());
            editIntent.putExtra("index", position);
            startActivityForResult(editIntent, 0);
        }
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(data != null){
            Bundle extras = data.getExtras();
            if (extras!= null){
                String alarmString = extras.getString("alarm");
                int index = extras.getInt("index");
                if (alarmString != null){
                    AlarmKeeper changedAlarm = new AlarmKeeper();
                    changedAlarm.fromString(alarmString);
                    if (index >= 0){
                        myAlarms.set(index, changedAlarm);changedAlarm.cancelAlarm(this);
                    }
                    else{
                        index = myAlarms.size();
                        myAlarms.add(changedAlarm);
                    }
                    changedAlarm.setAlarm(this);
                    saveAlarms();
                }
            }
        }
        buildAlarmDisplayStrings();
    }
}