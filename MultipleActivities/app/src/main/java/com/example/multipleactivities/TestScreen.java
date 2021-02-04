package com.example.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TestScreen extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_screen);
        Intent intent = getIntent();
        String age = intent.getStringExtra("AGE");
        TextView label = (TextView)findViewById(R.id.label);
        label.setText(age);
    }
    public void onClick(View view){
        Intent intent3 = new Intent(this, MainActivity.class);
        startActivity(intent3);
    }
}
