package com.example.najmus.sensorsai;
/*====================================
    Author : NAJMUS SEEMAB
======================================*/

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SensorVisual extends AppCompatActivity {

    public void LightSensorGclicked(View view){
        Intent lightSensorVisualIntent = new Intent(SensorVisual.this,LightVisual.class);
        startActivity(lightSensorVisualIntent);
    }
    public void ProxGraButtonClicked(View view){
        Intent ProximitySensorVisualIntent = new Intent(SensorVisual.this,ProximityVisual.class);
        startActivity(ProximitySensorVisualIntent);
    }












    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_sensor_visual );
    }

}
