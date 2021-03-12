package com.example.orderapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    CheckBox cb1;
    CheckBox cb2;
    CheckBox cb3;
    Boolean cb1bool;
    Boolean cb2bool;
    Boolean cb3bool;
    RadioGroup creamers;
    Spinner temps;
    String cofefe = "";
    String temperature = "";
    String additions = "";
    String creamer = "";
    String name = "";
    EditText nameBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1 = (CheckBox)findViewById(R.id.cb1);
        cb2 = (CheckBox)findViewById(R.id.cb2);
        cb3 = (CheckBox)findViewById(R.id.cb3);
        creamers = (RadioGroup)findViewById(R.id.creamerGroup);
        temps = (Spinner)findViewById(R.id.temp);
        submit = (Button)findViewById(R.id.submitButton);
        nameBox = (EditText)findViewById(R.id.nameBox);
    }

    public void onButtonClick(View view){
        name = nameBox.getText().toString();
        temperature = String.valueOf(temps.getSelectedItem());
        cofefe = name + ", you ordered a(n) " + temperature + ", " + creamer + " coffee";
        if (name.equals("")){
            cofefe = "Enter a name first.";
        }
        else if (creamer.equals("")){
            cofefe = "Enter in your creamer";
        }
        if(!additions.equals("")){
            cofefe += ", with " + additions;
        }
        CharSequence text = cofefe;
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(this, text, duration);
        toast.show();
    }

    public void onCheck(View view){
        additions = "";
        cb1bool = cb1.isChecked();
        cb2bool = cb2.isChecked();
        cb3bool = cb3.isChecked();
        if (cb1bool){
            additions += cb1.getText() + " ";
        }
        if (cb2bool){
            additions += cb2.getText() + " ";
        }
        if (cb3bool){
            additions += cb3.getText() + " ";
        }
    }

    public void onRadio(View view){
        int id = creamers.getCheckedRadioButtonId();
        switch (id){
            case R.id.rb1:
                creamer = "French Vanilla";
                break;
            case R.id.rb2:
                creamer = "Caramel";
                break;
            case R.id.rb3:
                creamer = "Mocha";
                break;
            case R.id.rb4:
                creamer = "Irish Creme";
                break;
        }
    }
}