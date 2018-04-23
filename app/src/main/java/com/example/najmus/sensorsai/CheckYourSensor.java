package com.example.najmus.sensorsai;
/*====================================
    Author : NAJMUS SEEMAB
======================================*/

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CheckYourSensor extends AppCompatActivity {
    public void lightSensorButtonClicked (View view){
        Intent lightSensorIntent = new Intent(CheckYourSensor.this,LightSensor.class);
        startActivity(lightSensorIntent);
    }
    public void magneticSenosorClicked (View view){
        Intent MagneticSensorIntent = new Intent(CheckYourSensor.this,MagneticSensor.class);
        startActivity(MagneticSensorIntent);
    }
    public void GravitySensorButtonClicked(View view){
        Intent GravitySensorIntent = new Intent(CheckYourSensor.this,GravitySensor.class);
        startActivity(GravitySensorIntent);
    }
    public void SpecialSensorButtonClicked(View view){
        Intent SpecialSensorIntent = new Intent(CheckYourSensor.this,SpeciaSensor.class);
         startActivity(SpecialSensorIntent);
    }
    public void ProxSensorClicked(View view){
        Intent ProximitySensorIntent = new Intent(CheckYourSensor.this,ProximitySensor.class);
        startActivity(ProximitySensorIntent);
    }


    public void SensorsUHaveBtnCkd(View view){
        Intent SensorUhaveIntent = new Intent(CheckYourSensor.this,SensorUhave.class);
        startActivity(SensorUhaveIntent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_check_your_sensor );
        getSupportActionBar ().setDisplayHomeAsUpEnabled ( true );
    }
}
