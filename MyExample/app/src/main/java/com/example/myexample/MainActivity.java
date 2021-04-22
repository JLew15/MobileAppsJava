package com.example.myexample;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.*;
import android.content.DialogInterface;
import android.widget.*;

import org.w3c.dom.Text;

import java.util.Calendar;

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

    public static class AlertDialog2 extends DialogFragment{
        public Dialog onCreateDialog(Bundle savedInstanceState){
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setMessage("This is another alert message.");
            builder.setCancelable(true);

            builder.setPositiveButton("Yes it is.", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    MainActivity myActivity = (MainActivity)getActivity();
                    TextView myView = (TextView)myActivity.findViewById(R.id.tv1);
                    myView.setText("So now you acknowledge me?");
                    DialogFragment newFragment = new TimeDialog();
                    newFragment.show(getFragmentManager(), "dialog");
                }
            });
            return builder.create();
        }
    }

    public static class TimeDialog extends DialogFragment implements TimePickerDialog.OnTimeSetListener{


        public Dialog onCreateDialog(Bundle savedInstanceState) {
            Calendar c = Calendar.getInstance();
            int hour = c.get(Calendar.HOUR_OF_DAY);
            int minutes = c.get(Calendar.MINUTE);
            int seconds = c.get(Calendar.SECOND);

            return new TimePickerDialog(getActivity(), this, hour, minutes, true);
        }

        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            MainActivity main = (MainActivity)getActivity();
            TextView text = (TextView)main.findViewById(R.id.tv1);
            text.setText(hourOfDay + ":" + minute);

        }
    }

    public static class DateDialog extends DialogFragment implements  DatePickerDialog.OnDateSetListener{
        public Dialog onCreateDialog(Bundle savedInstanceState){

            Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            return new DatePickerDialog(getActivity(), this, year, month, day);
        }

        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            MainActivity main = (MainActivity)getActivity();
            TextView text = (TextView)main.findViewById(R.id.tv1);
            text.setText(year+"/"+month+"/"+dayOfMonth);

        }
    }

    public static class AlertDialogList extends DialogFragment{
        String[] tips = {"10%", "15%", "20%", "$0.02"};
        public Dialog onCreateDialog(Bundle savedInstanceState){
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle("How much do you want to tip?");
            builder.setSingleChoiceItems(tips, 0, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    String tip = tips[which];
                    MainActivity mainActivity = (MainActivity)getActivity();
                    TextView text = (TextView)mainActivity.findViewById(R.id.tv1);
                    text.setText("I will tip "+tip);

                }
            });
            builder.setNeutralButton("Submit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            });
            return builder.create();
        }
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
                            DialogFragment newFragment = new AlertDialog2();
                            newFragment.show(getFragmentManager(), "dialog");
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