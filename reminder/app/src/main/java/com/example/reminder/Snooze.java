package com.example.reminder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import java.util.Calendar;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Snooze extends AppCompatActivity implements View.OnClickListener {
    String alarmName;
    String alarmDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snooze);

        Button button = (Button)findViewById(R.id.button3);
        button.setOnClickListener(this);
        Intent startingIntent = getIntent();
        Bundle bun = startingIntent.getExtras();
        alarmName = bun.getString("alarmName");
        alarmDescription = bun.getString("alarmDescription");
    }

    @Override
    public void onClick(View v) {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(c.getTimeInMillis() + 60000);

        AlarmKeeper snoozeAlarm = new AlarmKeeper();
        snoozeAlarm.alarmDescription = alarmDescription;
        snoozeAlarm.alarmName = alarmName;
        snoozeAlarm.alarmDay = c.get(Calendar.DAY_OF_MONTH);
        snoozeAlarm.alarmMonth = c.get(Calendar.MONTH);
        snoozeAlarm.alarmYear = c.get(Calendar.YEAR);
        snoozeAlarm.alarmHour = c.get(Calendar.HOUR_OF_DAY);
        snoozeAlarm.alarmMinute = c.get(Calendar.MINUTE);

        snoozeAlarm.setAlarm(Snooze.this);
        finish();

    }
}