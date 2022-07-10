package com.example.tg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class categories extends AppCompatActivity implements View.OnClickListener {
    Button button1, button2, button3, button4,button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagories);

        Intent intent = getIntent();
        String cityname = intent.getStringExtra("cityname");

        button1 = (Button) findViewById(R.id.btnHotelrooms);
        button2 = (Button) findViewById(R.id.btnRestaurant);
        button3 = (Button) findViewById(R.id.btnFamousplaces);
        button4 = (Button) findViewById(R.id.btnHistory);
        button5 = (Button) findViewById(R.id.btnWeather);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Hrooms.class);
                startActivity(intent);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Resturant.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), famous.class);
                startActivity(intent);
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), History.class);
                startActivity(intent);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),weather.class);
                startActivity(intent);

            }
        });
    }

    @Override
    public void onClick(View v) {

    }

}

