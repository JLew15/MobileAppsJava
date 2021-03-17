package com.example.fogthefrog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameOver extends AppCompatActivity implements View.OnClickListener {
    int score;
    String playername;
    Intent playScreen;
    Intent hsScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameover);
        TextView gameOverMsg = (TextView)findViewById(R.id.message);
        TextView scoreMsg = (TextView)findViewById(R.id.scoremsg);
        score = getIntent().getExtras().getInt("Score");
        playername = getIntent().getExtras().getString("name");
        scoreMsg.setText("You fogged "+score+" frogs");
        gameOverMsg.setText("Game Over "+playername);
        playScreen = new Intent(this, Game.class);
        hsScreen = new Intent(this, HighScores.class);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button){
            startActivity(playScreen);
            finish();
        }
        if(v.getId() == R.id.button9){
            startActivity(hsScreen);
            finish();
        }
    }
}