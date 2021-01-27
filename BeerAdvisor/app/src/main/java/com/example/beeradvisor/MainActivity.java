package com.example.beeradvisor;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import java.util.*;

public class MainActivity extends Activity {
    private DrinkExpert expert = new DrinkExpert();
    private Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick_findDrink(View view){
        TextView brands = (TextView) findViewById(R.id.brands);
        brands.setText("You pushed the button.");
        Spinner color = (Spinner) findViewById(R.id.color);
        String selected = color.getSelectedItem().toString();
        List<String> drinkList = expert.getBrands(selected);
        brands.setText("Try this drink. " + drinkList.get(r.nextInt(drinkList.size())));
    }
}