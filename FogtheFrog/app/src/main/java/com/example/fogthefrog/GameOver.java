package com.example.fogthefrog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

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
        Boolean isSDPresent = android.os.Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);

        if(isSDPresent){
            saveDatatoSD();
        }
        else{
            saveDataFile();
        }

    }

    private void saveDataFile(){
        try{
            FileOutputStream fos = openFileOutput("highScores.txt", MODE_APPEND);
            writeToFOS(fos);
        }
        catch(Exception e){
            CharSequence text = "The file could not be opened"+e.toString();
            Toast toastMessage = Toast.makeText(this, text, Toast.LENGTH_LONG);
            toastMessage.show();
        }
    }

    private void saveDatatoSD(){
        try{
            File privateLocation = getExternalFilesDir(null);
            File myFile = new File(privateLocation, "highScores.txt");
            FileOutputStream fos = new FileOutputStream(myFile, true);
            writeToFOS(fos);
        }
        catch(Exception e){
            CharSequence text = "The file could not be opened"+e.toString();
            Toast toastMessage = Toast.makeText(this, text, Toast.LENGTH_LONG);
            toastMessage.show();
        }
    }

    private void writeToFOS(FileOutputStream fos){
        try{
            OutputStreamWriter osw = new OutputStreamWriter(fos);

            String endLine = System.getProperty("line.separator");

            osw.write(playername+endLine);
            osw.write(score+endLine);

            osw.flush();
            osw.close();
        }
        catch(Exception e){
            CharSequence text = "Could not write to file"+e.toString();
            Toast toastMessage = Toast.makeText(this, text, Toast.LENGTH_LONG);
            toastMessage.show();
        }
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