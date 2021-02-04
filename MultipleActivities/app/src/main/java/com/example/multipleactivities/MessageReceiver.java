package com.example.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MessageReceiver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_receiver);




        Intent intent1 = getIntent();
        String name = intent1.getStringExtra("Name");
        
        TextView text = (TextView)findViewById(R.id.textView);
        text.setText(name);

    }
    public void onReturn(View view){
        Intent intent2 = new Intent(this, TestScreen.class);
        EditText ageText = (EditText)findViewById(R.id.enterAge);
        String age = ageText.getText().toString();
        intent2.putExtra("AGE", age);
        startActivity(intent2);
    }
}