package com.example.analog_clock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DigitalClock;
import android.widget.Toast;

public class DigitalScrenn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital_screnn);

        Button previos = findViewById(R.id.previos_page);
        DigitalClock digitalClock = findViewById(R.id.digital_clock);
        digitalClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DigitalScrenn.this, "Digital Clock",
                        Toast.LENGTH_SHORT).show();
            }});
        previos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DigitalScrenn.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}