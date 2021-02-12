package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private Boolean running = false;
    private Integer seconds = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        runTimer();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void onClickStart(View view){
        running = true;
    }

    public void onClickStop(View view){
        running = false;
    }

    public void onClickReset(View view){
        running = false;
        seconds = 0;
    }

    private void runTimer(){
        final TextView timeLabel = (TextView)findViewById(R.id.timeView);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run(){
                Integer hours = seconds/3600;
                Integer minutes = (seconds%3600)/60;
                Integer secs = seconds%60;
                String time = String.format(Locale.getDefault(), "%02d:%02d:%02d",hours, minutes, secs);
                timeLabel.setText(time);
                if (running){
                    seconds++;
                }
                handler.postDelayed(this, 1000);
            }
        });

    }

}