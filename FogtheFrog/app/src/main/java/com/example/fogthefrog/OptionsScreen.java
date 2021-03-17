package com.example.fogthefrog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OptionsScreen extends AppCompatActivity implements View.OnClickListener {
    Intent playScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.optionsscreen);
        playScreen = new Intent(this, Game.class);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button14){
            startActivity(playScreen);
        }
    }
}