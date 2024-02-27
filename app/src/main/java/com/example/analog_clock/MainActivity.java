package com.example.analog_clock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.Toast;

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
                Toast.makeText(MainActivity.this, "Analog Clock",
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
