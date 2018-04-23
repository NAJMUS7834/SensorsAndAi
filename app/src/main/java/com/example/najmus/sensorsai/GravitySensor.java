package com.example.najmus.sensorsai;
/*====================================
    Author : NAJMUS SEEMAB
======================================*/

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.widget.TextView;

public class GravitySensor extends AppCompatActivity  implements SensorEventListener {
    private  TextView xText,yText,zText;
    private Sensor mySensor;
    private SensorManager SM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gravity_sensor);
        //FOR CREATING SENSOR MANAGER
        SM =(SensorManager)getSystemService(SENSOR_SERVICE);
        //ACCELEROMETER
        mySensor = SM.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        //REGISTER SENSOR LISTENER
        SM.registerListener((SensorEventListener) this,mySensor,SensorManager.SENSOR_DELAY_NORMAL);


        //ASSIGN TEXTVIEW
        xText =(TextView) findViewById(R.id.xtext);
        yText =(TextView) findViewById(R.id.ytext);
        zText =(TextView) findViewById(R.id.ztext);
    }
    public  void onAccuracyChanged(Sensor sensor,int accuracy){

    }
    public void onSensorChanged(SensorEvent event){

        xText.setText("X="   + event.values[0]);
        yText.setText("Y="   + event.values[1]);
        zText.setText("Z="   + event.values[2]);

    }
}
