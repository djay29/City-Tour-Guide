
package com.example.tg;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class weather extends AppCompatActivity {

    TextView textView;
    Button bt;
    TextView tv;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    String st="https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}";
    String apikey="8c2e1b9ffc88183bc6b3e66493048071";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        tv=findViewById(R.id.info);
        tv1=findViewById(R.id.info1);
        tv2=findViewById(R.id.info2);
        tv3=findViewById(R.id.info3);
    }

    public void getweather(View v){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://api.openweathermap.org/data/2.5/").addConverterFactory(GsonConverterFactory.create()).build();


        weatherapi myapi=retrofit.create(weatherapi.class);
        Call<Example> example=myapi.getweather("ahmedabad",apikey);
        example.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                if(response.code()==404){
                    Toast.makeText(weather.this,"SOMETHING WENT WRONG!!!",Toast.LENGTH_LONG).show();
                }
                Example mydata= response.body();

                Main main= mydata.getMain();

                Double diss=main.getDis();
                tv.setText("Description: "+String.valueOf(diss));

                Double temp=main.getTemp();
                Integer Temperature=(int)(temp-273.15);
                tv1.setText(" Current Temp: "+String.valueOf(Temperature)+" C");

                Integer humid=main.getHumidity();
                tv2.setText(" Humidity: "+String.valueOf(humid)+"%");


                Double maxtemp=main.getTempMax();
                Integer Temperature1=(int)(temp-273.15);
                tv3.setText(" Max. Temp: "+String.valueOf(Temperature1)+" C");



            }
                    @Override
                    public void onFailure(Call<Example> call, Throwable t) {

                    }
                });
            }
        }

