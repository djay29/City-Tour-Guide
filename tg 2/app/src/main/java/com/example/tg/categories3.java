package com.example.tg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class categories3 extends AppCompatActivity implements View.OnClickListener {
    Button button1, button2, button3, button4,button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagories3);

        button1 = (Button) findViewById(R.id.btnHotelrooms3);
        button2 = (Button) findViewById(R.id.btnRestaurant3);
        button3 = (Button) findViewById(R.id.btnFamousplaces3);
        button4 = (Button) findViewById(R.id.btnHistory3);
        button5=  (Button) findViewById(R.id.btnWeather3);

        button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getApplicationContext(),Hrooms3.class);
            startActivity(intent);

        }
    });

        button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getApplicationContext(),Resturant3.class);
            startActivity(intent);
        }
    });


        button3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getApplicationContext(),famous3.class);
            startActivity(intent);
        }
    });


        button4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getApplicationContext(),History3.class);
            startActivity(intent);

        }
    });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),weather3.class);
                startActivity(intent);

            }
        });
}

    @Override
    public void onClick(View v) {

    }

}

