package com.example.admin.hive;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.squareup.timessquare.CalendarPickerView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class EventFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_event,container,false);

//        final Date today = new Date();
//        Calendar nextYear = Calendar.getInstance();
//        nextYear.add(Calendar.YEAR,1);
//
//
//
//        CalendarPickerView datePicker = findViewById(R.id.calendar);
//        datePicker.init(today,nextYear.getTime()).withSelectedDate(today);
//
//        datePicker.setOnDateSelectedListener(new CalendarPickerView.OnDateSelectedListener() {
//            @Override
//            public void onDateSelected(Date date) {
//                String selectedDate = DateFormat.getDateInstance(DateFormat.FULL).format(date);
//                //Toast.makeText(EventFragment.this,selectedDate,Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onDateUnselected(Date date) {
//
//            }
//        });
    }
}
