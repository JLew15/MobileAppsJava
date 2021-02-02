package com.example.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MessageReceiver extends AppCompatActivity {

    TextView label;
    String baba = MainActivity.baba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_receiver);
        label = (TextView)findViewById(R.id.textView);
        label.setText(baba);

    }
    public void onReturn(View view){
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
}