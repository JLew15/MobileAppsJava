package com.example.fogthefrog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

public class HighScores extends AppCompatActivity implements View.OnClickListener {
    Intent playScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.highscores);
        playScreen = new Intent(this, Game.class);

        Boolean isSDPresent = android.os.Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
        loadHighScoresSD();

        if(isSDPresent){
            saveDatatoSD();
        }
        else{
            saveDatatoIF();
        }
    }

    private void loadHighScoresSD(){
        try{
            File privateLocation = getExternalFilesDir(null);
            File myFile = new File(privateLocation, "highScores.txt");
            FileInputStream fis = openFileInput("highScores.txt");
            readScoresFIS(fis);
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
        }
        catch(Exception e){
            CharSequence text = "The file could not be opened"+e.toString();
            Toast toastMessage = Toast.makeText(this, text, Toast.LENGTH_LONG);
            toastMessage.show();
        }
    }

    private void loadHighScoresIF() {
        try {
            FileInputStream fis = openFileInput("highScores.txt");
            readScoresFIS(fis);
        }
        catch(Exception e){
            CharSequence text = "The file could not be opened"+e.toString();
            Toast toastMessage = Toast.makeText(this, text, Toast.LENGTH_LONG);
            toastMessage.show();
        }
    }

    private void readScoresFIS(FileInputStream fis){
        InputStreamReader iSReader = new InputStreamReader(fis);

        TextView tView = (TextView)findViewById(R.id.textView7);
        TextView tSView = (TextView)findViewById(R.id.textView8);

        String endLine = System.getProperty("line.separator");

        LinkedList<String> playerNames = new LinkedList<>();
        LinkedList<Integer> playerScores = new LinkedList<>();

        try{
            BufferedReader bR = new BufferedReader(iSReader);
            String name = bR.readLine();

            while(name != null){
                String strScore = bR.readLine();
                int score = Integer.parseInt(strScore);

                ListIterator<Integer> scoreIter = playerScores.listIterator();
                ListIterator<String> playerIter = playerNames.listIterator();
                while (scoreIter.hasNext()){
                    Integer thisScore = scoreIter.next();
                    playerIter.next();
                    if(score >= thisScore){
                        break;
                    }
                }
                if(playerScores.size()>0){
                    scoreIter.previous();
                    playerIter.previous();
                }
                scoreIter.add(new Integer(score));
                playerIter.add(name);

                name = bR.readLine();
            }
            bR.close();
        }
        catch (Exception e){
            CharSequence text = "Issue with reading file"+e.toString();
            Toast toastMessage = Toast.makeText(this, text, Toast.LENGTH_SHORT);
            toastMessage.show();
        }
        ListIterator<Integer> scoreIter = playerScores.listIterator();
        ListIterator<String> playerIter = playerNames.listIterator();

        String sortedNames = "";
        String sortedScores = "";

        int numPresent = 0;
        while (scoreIter.hasNext()){
            Integer score = scoreIter.next();
            String name = playerIter.next();

            sortedScores += score.toString() + endLine;
            sortedNames += name+endLine;
            numPresent ++;
            if(numPresent>= 10){
                break;
            }
        }

        tView.setText(sortedNames);
        tSView.setText(sortedScores);
    }

    private void saveDatatoIF(){
        try{
            FileOutputStream fos = openFileOutput("highScores.txt", MODE_APPEND);
        }
        catch(Exception e){
            CharSequence text = "The file could not be opened"+e.toString();
            Toast toastMessage = Toast.makeText(this, text, Toast.LENGTH_LONG);
            toastMessage.show();
        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button10){
            startActivity(playScreen);
            finish();
        }
        if(v.getId() == R.id.button11){
            finish();
        }
    }
}