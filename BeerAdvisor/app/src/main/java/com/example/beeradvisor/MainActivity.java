package com.example.beeradvisor;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick_findDrink(View view){
        TextView brands = (TextView) findViewById(R.id.brands);
        brands.setText("You clicked the button.");
    }
}