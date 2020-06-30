package com.example.datetimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    //TimePicker timePicker; //for time picker
    DatePicker datePicker;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //timePicker= findViewById(R.id.timepicker); //for time picker
        datePicker= findViewById(R.id.datepicker);
        textView= findViewById(R.id.textview);

        Calendar calendar = Calendar.getInstance();
        datePicker.init(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                textView.setText("You selected: " + dayOfMonth + "-" + (monthOfYear+1) + "-" + year);
            }
        });

        //timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() { //for time picker
          //  @Override //for time picker
            //public void onTimeChanged(TimePicker view, int hourOfDay, int minute) { //for time picker

              //  textView.setText("Hour:" + hourOfDay + "\nMinutes:" + minute); //for time picker
            //} //for time picker
        }//); //for time picker
    } //for time picker
