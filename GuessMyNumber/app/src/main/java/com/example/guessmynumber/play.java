package com.example.guessmynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class play extends AppCompatActivity {
    Integer tries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        Integer guess = getIntent().getIntExtra("guess",0);
        Integer ranNum = getIntent().getIntExtra("number", 0);
        tries = getIntent().getIntExtra("tries", 0);
        TextView guessText = (TextView)findViewById(R.id.guess);
        guessText.setText("You guessed " + guess.toString());

        TextView triesLeft = (TextView)findViewById(R.id.triesLeft);
        triesLeft.setText("You have " + tries.toString() + " tries left");
        TextView highLow = (TextView)findViewById(R.id.highlow);
        if (guess < ranNum){
            highLow.setText(R.string.higher);
            tries --;
        }
        else if(guess > ranNum){
            highLow.setText(R.string.lower);
            tries --;
        }
        else{
            if(tries > 0) {
                if (guess == ranNum) {
                    highLow.setText(R.string.correct);
                }
                else{
                    highLow.setText("Guess again.");
                    tries --;
                }
            }
            else{
                highLow.setText(R.string.incorrect);
            }
        }
    }
    public void buttonClick(View view){
        if(tries > 0){
            Intent backToGuess = new Intent(this, MainActivity.class);
            startActivity(backToGuess);
        }
    }
}