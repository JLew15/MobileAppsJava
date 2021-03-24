package com.example.fogthefrog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

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
        /*Bundle bundle = getIntent().getExtras();
        playerName = bundle.getString("name");
        difficultyLevel = bundle.getInt("difficulty");
        numMoles = bundle.getInt("numMoles");
        standardDuration = bundle.getInt("duration");*/


        initButtons();
        setNewMole();
        setTimer(difficultyLevel * 1000);
    }

    @Override
    public void onClick(View v) {
        if(isComplete){
            return;
        }
        if(v == currentMole){
            score++;
            TextView scores = (TextView)findViewById(R.id.scoar);
            scores.setText("Score : "+ score);
            setNewMole();
        }
    }

    public void gameOver(){
        isComplete = true;
        TextView scores = (TextView)findViewById(R.id.scoar);
        scores.setText("Game Over! \n Score: " + score);

        Intent gameOverIntent = new Intent(this, GameOver.class);
        gameOverIntent.putExtra("Score", score);
        gameOverIntent.putExtra("name", playerName);
        startActivity(gameOverIntent);
        finish();
    }

    public void setNewMole(){
        Random gen = new Random();

        int ranItem = gen.nextInt(numMoles);

        int newButtonID = myButtonIDs.get(ranItem);
        if(currentMole != null){
            currentMole.setVisibility(View.INVISIBLE);
        }
        Button newMole = (Button)findViewById(newButtonID);
        newMole.setVisibility(View.VISIBLE);
        currentMole = newMole;

    }

    public void initButtons(){
        ViewGroup group = (ViewGroup)findViewById(R.id.layoutgroup);
        View v;

        for(int i = 0; i < group.getChildCount(); i++){
            v = group.getChildAt(i);
            if(v instanceof Button){
                v.setOnClickListener(this);
                if(!isComplete){
                    myButtonIDs.add(v.getId());
                    v.setVisibility(View.INVISIBLE);
                }
            }
        }
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