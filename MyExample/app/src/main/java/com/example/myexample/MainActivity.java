package com.example.myexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.*;
import android.content.DialogInterface;
import android.widget.*;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button)findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new MyAlertDialog();
                newFragment.show(getSupportFragmentManager(), "dialog");
            }
        });
    }

    public static class MyAlertDialog extends DialogFragment{
        public Dialog onCreateDialog(Bundle savedInstanceState){
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setMessage("Do you hate when these pop up?");
            builder.setCancelable(false);
            builder.setPositiveButton("Absopositutely",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Do Positive Action
                            MainActivity myActivity = (MainActivity)getActivity();
                            TextView myView = (TextView)myActivity.findViewById(R.id.tv1);
                            myView.setText("I hate when you come around too.");
                        }
                    });
            builder.setNeutralButton("Maybe...",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Do Neutral Action
                            MainActivity myActivity = (MainActivity)getActivity();
                            TextView myView = (TextView)myActivity.findViewById(R.id.tv1);
                            myView.setText("Afraid to hurt my feelings? I'm a robot for christ's sake.");
                        }
                    });
            builder.setNegativeButton("Absolutely NOT",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Do Negative Action
                            MainActivity myActivity = (MainActivity)getActivity();
                            TextView myView = (TextView)myActivity.findViewById(R.id.tv1);
                            myView.setText("Yay! We can be friends then!");
                        }
                    });

            return builder.create();
        }
    }
}