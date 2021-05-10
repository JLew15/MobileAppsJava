package com.example.reminder;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        try{
            Bundle bun = intent.getExtras();
            String name = bun.getString("alarmName");
            String description = bun.getString("alarmDescription");
            Toast t = Toast.makeText(context, name + description, Toast.LENGTH_LONG);
            t.show();
            Intent snoozeIntent = new Intent(context, Snooze.class);
            snoozeIntent.putExtra("alarmName", name);
            snoozeIntent.putExtra("alarmDescription", description);

            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, snoozeIntent, 0);
            Notification.Builder builder = new Notification.Builder(context);

            builder.setSmallIcon(R.drawable.ic_launcher_foreground);
            builder.setTicker("Reminder!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            builder.setContentTitle(name);
            builder.setContentText(description);
            builder.setContentIntent(pendingIntent);
            builder.setAutoCancel(true);

            Notification notify = builder.build();

            NotificationManager nm = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
            nm.notify(0, notify);
        }
        catch(Exception e){
            Toast t = Toast.makeText(context, "something went wrong.", Toast.LENGTH_LONG);
            t.show();
        }
    }
}