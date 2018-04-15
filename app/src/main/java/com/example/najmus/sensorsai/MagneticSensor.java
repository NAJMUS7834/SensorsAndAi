package com.example.najmus.sensorsai;

import android.app.Service;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MagneticSensor extends AppCompatActivity implements SensorEventListener {
    TextView textView;
    SensorManager sensorManager;
    Sensor sensor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magnetic_sensor);
        getSupportActionBar ().setDisplayHomeAsUpEnabled ( true );
        textView = (TextView) findViewById(R.id.textView);
        sensorManager = (SensorManager) getSystemService( Service.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);

    }
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);

    }

    @Override
    protected void onResume(){
        super.onResume();
        if (sensor!=null) {
            sensorManager.registerListener ( this, sensor, SensorManager.SENSOR_DELAY_NORMAL );
        }else {
            Toast.makeText ( this,"NOT SUPPORTED",Toast.LENGTH_SHORT ).show ();
            finish ();
        }
    }
    public void onSensorChanged(SensorEvent sensorEvent) {
        float azimuthal = Math.round ( sensorEvent.values[0] );
        float pitch = Math.round ( sensorEvent.values[1] );
        float roll= Math.round ( sensorEvent.values[2] );
        double tesla = Math.sqrt ( (azimuthal*azimuthal)+(pitch*pitch)+(roll*roll) );
        String text =String.format ( "%.0f",tesla );
        textView.setText ( text +"µT" );


    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {


    }

}

