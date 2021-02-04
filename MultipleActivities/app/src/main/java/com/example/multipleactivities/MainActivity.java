package com.example.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.lang.annotation.Target;

public class MainActivity extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        public void onSendMessage(View view){
            Intent intent1 = new Intent(this, MessageReceiver.class);
            EditText entryBox = (EditText)findViewById(R.id.textEntry);
            EditText ageEntryBox = (EditText)findViewById(R.id.ageEntry);
            String ageNum = ageEntryBox.getText().toString();
            String value = entryBox.getText().toString();
            intent1.putExtra("Name", value);
            intent1.putExtra("Age", ageNum);
            startActivity(intent1);
        }


    }