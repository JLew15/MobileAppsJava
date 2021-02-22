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
    private Boolean wasRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState != null) {
            running = savedInstanceState.getBoolean("running");
            seconds = savedInstanceState.getInt("seconds");
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }
        setContentView(R.layout.activity_main);
        runTimer();
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

    @Override
    protected void onStart(){
        super.onStart();
        if(wasRunning) {
            running = true;
        }
    }

    @Override
    protected void onResume(){
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("seconds", seconds);
        savedInstanceState.putBoolean("running", running);
        savedInstanceState.putBoolean("wasRunning", wasRunning);
    }

    @Override
    protected void onStop(){
        super.onStop();
        wasRunning = running;
        running = false;
    }

}