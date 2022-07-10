package com.example.tg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class categories4 extends AppCompatActivity implements View.OnClickListener {
    Button button1, button2, button3, button4,button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagories4);

        button1 = (Button) findViewById(R.id.btnHotelrooms4);
        button2 = (Button) findViewById(R.id.btnRestaurant4);
        button3 = (Button) findViewById(R.id.btnFamousplaces4);
        button4 = (Button) findViewById(R.id.btnHistory4);
        button5=(Button) findViewById(R.id.btnWeather4);

        button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getApplicationContext(),Hrooms4.class);
            startActivity(intent);

        }
    });

        button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getApplicationContext(),Resturant4.class);
            startActivity(intent);
        }
    });


        button3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getApplicationContext(),famous4.class);
            startActivity(intent);
        }
    });


        button4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getApplicationContext(),History4.class);
            startActivity(intent);

        }
    });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),weather4.class);
                startActivity(intent);

            }
        });
}

    @Override
    public void onClick(View v) {

    }

}

