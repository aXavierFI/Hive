package com.example.admin.hive;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.squareup.timessquare.CalendarPickerView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListerner);
// setting up the main page when you open to app to display the home page

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeFragment()).commit();


//setting the date for the calendar
//        final Date today = new Date();
//        Calendar nextYear = Calendar.getInstance();
//        nextYear.add(Calendar.YEAR,1);
//
//        CalendarPickerView datePicker = findViewById(R.id.calendar);
//        datePicker.init(today,nextYear.getTime()).withSelectedDate(today);
//
//        datePicker.setOnDateSelectedListener(new CalendarPickerView.OnDateSelectedListener() {
//            @Override
//            public void onDateSelected(Date date) {
//                String selectedDate = DateFormat.getDateInstance(DateFormat.FULL).format(date);
//                Toast.makeText(MainActivity.this,selectedDate,Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onDateUnselected(Date date) {
//
//            }
//        });



    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListerner =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;

                    switch (menuItem.getItemId()){
                        case R.id.nav_home:
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.nav_chat:
                            selectedFragment = new ChatFragment();
                            break;
                        case R.id.nav_dash:
                            selectedFragment = new DashFragment();
                            break;
                        case R.id.nav_cal:
                            selectedFragment = new EventFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };
}
