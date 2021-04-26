package com.example.reminder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class AddAlarm extends AppCompatActivity implements View.OnClickListener {

    AlarmKeeper thisAlarm;

    int index = -1;
    Button saveButton;
    Button timeButton;
    Button dateButton;
    EditText description;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_alarm);

        saveButton = (Button)findViewById(R.id.button5);
        timeButton = (Button)findViewById(R.id.button2);
        dateButton = (Button)findViewById(R.id.button);

        saveButton.setOnClickListener(this);
        timeButton.setOnClickListener(this);
        dateButton.setOnClickListener(this);

        thisAlarm = new AlarmKeeper();

        Bundle extras = getIntent().getExtras();

        if(extras != null){
            String alarmString = extras.getString("alarm");
            index = extras.getInt("index");
            if ((index >= 0) && (alarmString != null)){
                thisAlarm.fromString(alarmString);
                displayAlarm();
            }
        }
    }

    @Override
    public void onClick(View v) {

    }

    private void displayAlarm(){
        description = (EditText)findViewById(R.id.editTextTextMultiLine2);
        name = (EditText)findViewById(R.id.editTextTextPersonName);

        description.setText(thisAlarm.alarmDescription);
        name.setText(thisAlarm.alarmName);

        dateButton.setText((thisAlarm.alarmMonth + 1) + "/" + thisAlarm.alarmDay + "/" + thisAlarm.alarmYear);
        String AMPM = "AM";
        String strMinute;
        int hour = thisAlarm.alarmHour;
        if (hour > 12){
            hour = hour - 12;
            AMPM = "PM";
        }
        if(thisAlarm.alarmMinute < 10){
            strMinute = "0" + thisAlarm.alarmMinute;
        }
        else{
            strMinute = thisAlarm.alarmMinute;
        }
        timeButton.setText(hour + ":" +strMinute + " " + AMPM);
    }

    public static class DatePicker extends DialogFragment implements DatePickerDialog.OnDateSetListener{

        public Dialog onCreateDialog(Bundle savedInstanceState){
            Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            return new DatePickerDialog(getActivity(), this, year, month, day);
        }

        @Override
        public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {

        }
    }

    public static class TimePicker extends DialogFragment implements TimePickerDialog.OnTimeSetListener{

        public Dialog onCreateDialog(Bundle savedInstanceState){
            Calendar c = Calendar.getInstance();
            int hour = c.get(Calendar.HOUR_OF_DAY);
            int minutes = c.get(Calendar.MINUTE);

            return new TimePickerDialog(getActivity(), this, hour, minutes, true);
        }

        @Override
        public void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minute) {

        }
    }

    public static class AlertDialog1 extends DialogFragment{
        public Dialog onCreateDialog(Bundle savedInstanceState){
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            return builder.create();
        }
    }

    public void clearAlarmScreen() {
        description = (EditText)findViewById(R.id.editTextTextMultiLine2);
        name = (EditText)findViewById(R.id.editTextTextPersonName);
        timeButton = (Button)findViewById(R.id.button2);
        dateButton = (Button)findViewById(R.id.button);

        description.setText("");
        name.setText("");
        timeButton.setText("Set Time");
        dateButton.setText("Set Date");

        thisAlarm.clear();
    }

    public void closeAlarmScreen(){
        String alarmString = thisAlarm.buildString();
        Intent listIntent = new Intent(AddAlarm.this, AlarmList.class);
        listIntent.putExtra("alarm", alarmString);
        listIntent.putExtra("index", index);

        setResult(RESULT_OK, listIntent);
        finish();
    }
}