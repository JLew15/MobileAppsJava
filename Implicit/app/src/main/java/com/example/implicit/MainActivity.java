package com.example.implicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.net.*;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Uri uri = Uri.parse("https://www.compuscholar.com");
//        Intent viewIntent = new Intent(Intent.ACTION_VIEW, uri);
//        startActivity(viewIntent);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.button){
            Uri uri = Uri.parse("https://www.youtube.com/watch?v=0K4oym9Pw48");
            Intent viewIntent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(viewIntent);
        }
        else if(id == R.id.button2){
            Uri uri = Uri.parse("content://contacts/people/1");
            Intent viewIntent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(viewIntent);
        }
        else if(id == R.id.button3){
            Uri uri = Uri.parse("tel:1:385-272-3825");
            Intent viewIntent = new Intent(Intent.ACTION_DIAL, uri);
            startActivity(viewIntent);
        }

    }
}