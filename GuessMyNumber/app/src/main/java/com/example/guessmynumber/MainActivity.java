package com.example.guessmynumber;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int tries = 3;
    Integer ranNum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Random r = new Random();
        ranNum = r.nextInt(10);
        ranNum ++;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView test = (TextView)findViewById(R.id.testOutput);
        test.setText(ranNum.toString());



    }
    public void onGuess(View view){
        Intent intent = new Intent(this, play.class);
        EditText guessEntry = (EditText)findViewById(R.id.numberEntry);
        Integer guessNum = Integer.parseInt(guessEntry.getText().toString());
        intent.putExtra("number", ranNum);
        intent.putExtra("tries", tries);
        intent.putExtra("guess",guessNum);
        startActivity(intent);
        }
    }