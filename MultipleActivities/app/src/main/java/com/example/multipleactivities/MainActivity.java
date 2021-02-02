package com.example.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.lang.annotation.Target;

public class MainActivity extends Activity {
    public static String baba;
    EditText text;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText)findViewById(R.id.textEntry);

    }
        public void onSendMessage(View view){
            Intent intent1 = new Intent(this, MessageReceiver.class);
            baba = text.getText().toString();
            startActivity(intent1);
        }


    }