package com.example.viewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Boolean ont;
    String bread = "";
    CheckBox cb1;
    CheckBox cb2;
    CheckBox cb3;
    Boolean cb1bool;
    Boolean cb2bool;
    Boolean cb3bool;
    TextView text1;
    String jelly = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bttn = (Button)findViewById(R.id.button2);

        ToggleButton toggler = (ToggleButton)findViewById(R.id.toggleButton);

        cb1 = (CheckBox)findViewById(R.id.checkBox);
        cb2 = (CheckBox)findViewById(R.id.checkBox2);
        cb3 = (CheckBox)findViewById(R.id.checkBox3);
        text1 = (TextView)findViewById(R.id.textView);



    }

    public void onCheckedcb(View view){
        cb1bool = cb1.isChecked();
        cb2bool = cb2.isChecked();
        cb3bool = cb3.isChecked();
        bread = "";
//        Boolean checked = ((CheckBox)view).isChecked();
//        switch(view.getId()){
//            case R.id.checkBox:
//                if (checked){
//                    bread+=cb1.getText() + " ";
//                }
//                break;
//            case R.id.checkBox2:
//                if(checked){
//                    bread+=cb2.getText() + " ";
//                }
//                break;
//            case R.id.checkBox3:
//                if(checked){
//                    bread+=cb3.getText() + " ";
//                }
//        }
        if (cb1bool){
            bread += cb1.getText() + " ";
        }
        if (cb2bool){
            bread += cb2.getText() + " ";
        }
        if (cb3bool){
            bread += cb3.getText() + " ";
        }
    }

    public void onToggleButton(View view){
        ont = ((ToggleButton)view).isChecked();

        LinearLayout layout = (LinearLayout)findViewById(R.id.layout);

        if (ont){
            layout.setBackgroundColor(Color.YELLOW);
        }
        else{
            layout.setBackgroundColor(Color.BLACK);
        }
    }

    public void onClick(View view){
        String toast = "";
        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        toast = String.valueOf(spinner.getSelectedItem());

        text1.setText(bread + jelly + " " + toast);

        ImageView img = (ImageView)findViewById(R.id.imageView);
        int image = R.drawable.ic_launcher_background;
        String description = "Background Photo";
        if (jelly.equals("Grape") && toast.equals("Golden") && bread.contains("Wheat")){
            image = R.drawable.bubblegum;
            description = "Duke Nukem";
        }
        img.setImageResource(image);
        img.setContentDescription(description);
        CharSequence text = "This is a toast message.";
        int duration = Toast.LENGTH_LONG;
        Toast toaster = Toast.makeText(this, text, duration);
        toaster.show();
    }

    public void radioChecked(View view){
        RadioGroup radiogroup = (RadioGroup)findViewById(R.id.jelly);
        int id = radiogroup.getCheckedRadioButtonId();
        switch (id){
            case R.id.radioButton:
                jelly = "Strawberry";
                break;
            case R.id.radioButton2:
                jelly = "Grape";
                break;
            case R.id.radioButton3:
                jelly = "Orange";
                break;
        }
    }
}