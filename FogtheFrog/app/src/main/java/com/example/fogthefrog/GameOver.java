package com.example.fogthefrog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class GameOver extends AppCompatActivity {
    int score;
    String playername;

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

    }
}