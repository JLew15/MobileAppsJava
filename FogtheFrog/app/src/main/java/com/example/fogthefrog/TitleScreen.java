package com.example.fogthefrog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TitleScreen extends AppCompatActivity implements View.OnClickListener {
    Intent playScreen;
    Intent optionsScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.titlescreen);
        playScreen = new Intent(this, Game.class);
        optionsScreen = new Intent(this, OptionsScreen.class);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button12){
            startActivity(playScreen);
            finish();
        }
        if(v.getId() == R.id.button13){
            startActivity(optionsScreen);
            finish();
        }
    }
}