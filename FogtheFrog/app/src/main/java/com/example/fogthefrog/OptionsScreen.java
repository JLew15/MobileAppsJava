package com.example.fogthefrog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;

public class OptionsScreen extends AppCompatActivity implements View.OnClickListener {
    Intent playScreen;
    int difficulty;
    int duration;
    int numMoles;
    String name;
    EditText etName;
    RadioButton easy;
    RadioButton medium;
    RadioButton hard;
    SeekBar sb;
    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.optionsscreen);
        playScreen = new Intent(this, Game.class);
        setUpSpinner();
    }

    private void setUpSpinner(){
        sp = (Spinner)findViewById(R.id.spinner);
        String[] numMoles = {"3","4","5","6","7","8"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, numMoles);
        sp.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        etName = (EditText)findViewById(R.id.editTextTextPersonName);
        easy = (RadioButton)findViewById(R.id.ezButton);
        medium = (RadioButton)findViewById(R.id.mdButton);
        hard = (RadioButton)findViewById(R.id.hdButton);
        sb = (SeekBar)findViewById(R.id.seekBar);
        name = etName.getText().toString();
        duration = sb.getProgress();
        numMoles = sp.getSelectedItemPosition()+3;
        if(easy.isChecked()){
            difficulty = 3;
        }
        else if(medium.isChecked()){
            difficulty = 2;
        }
        else{
            difficulty = 1;
        }
//        saveSettings(difficulty, name, numMoles, duration, playScreen);
        savePreferences(difficulty, name, numMoles, duration);
        if (v.getId() == R.id.button14){
            startActivity(playScreen);
        }
    }

    private void savePreferences(int difficulty, String name, int numMoles, int duration){
        SharedPreferences prefs = getSharedPreferences("Settings", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("name", name);
        editor.putInt("difficulty", difficulty);
        editor.putInt("numMoles", numMoles);
        editor.putInt("duration", duration);

        editor.commit();
    }

    private void saveSettings(int difficulty, String name, int numMoles, int duration, Intent myIntent){
        myIntent.putExtra("name", name);
        myIntent.putExtra("difficulty", difficulty);
        myIntent.putExtra("duration", duration);
        myIntent.putExtra("numMoles", numMoles);
    }

    private void loadSettings(){
        SharedPreferences prefs = getSharedPreferences("Settings", MODE_PRIVATE);
        String playerName = prefs.getString("name", "Default");
        int difficultyLevel = prefs.getInt("difficulty", 2);
        int numMoles = prefs.getInt("numMoles", 8);
        int standardDuration = prefs.getInt("duration", 20);

        EditText etName = (EditText)findViewById(R.id.editTextTextPersonName);
        RadioButton easy = (RadioButton)findViewById(R.id.ezButton);
        RadioButton medium = (RadioButton)findViewById(R.id.mdButton);
        RadioButton hard = (RadioButton)findViewById(R.id.hdButton);
        SeekBar sb = (SeekBar)findViewById(R.id.seekBar);

        etName.setText(playerName);
        sp.setSelection(numMoles - 3);
        sb.setProgress(standardDuration);

        if (difficultyLevel == 3){
            easy.setChecked(true);
        }
        else if (difficultyLevel == 2){
            medium.setChecked(true);
        }
        else{
            hard.setChecked(true);
        }
    }
}