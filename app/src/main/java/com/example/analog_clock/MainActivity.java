package com.example.analog_clock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         AnalogClock analogclock = findViewById(R.id.analog_clock);
         Button next_screnn = findViewById(R.id.next_screnn);
        analogclock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentTime = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
                Toast.makeText(MainActivity.this,currentTime,
                        Toast.LENGTH_SHORT).show();
            }});
           next_screnn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent = new Intent(MainActivity.this, DigitalScrenn.class);
                   startActivity(intent);
               }
           });

    }



}
