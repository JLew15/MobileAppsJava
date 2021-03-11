package com.example.fogthefrog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Game extends AppCompatActivity implements View.OnClickListener{

    ArrayList<Integer> myButtonIDs = new ArrayList<>();

    protected Handler taskHandler = new Handler();
    protected Boolean isComplete = false;
    Button currentMole;
    long startTime = System.currentTimeMillis();
    int score = 0;
    String playerName = "Default";
    int difficultyLevel = 2;
    int numMoles = 8;
    int standardDuration = 20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
    }

    @Override
    public void onClick(View v) {

    }

    public void gameOver(){

    }

    public void setNewMole(){

    }

    public void initButtons(){

    }

    public void setTimer(long time){
        final long elapse = time;
        Runnable t = new Runnable() {
            @Override
            public void run() {
                onTimerTask();
                if(!isComplete){
                    taskHandler.postDelayed(this, elapse);
                }
            }
        };
        taskHandler.postDelayed(t, elapse);

    }

    protected void onTimerTask(){
        long endTime = startTime + (standardDuration*1000);

        if (endTime > System.currentTimeMillis()){
            setNewMole();
        }
        else{
            gameOver();
        }
    }
}