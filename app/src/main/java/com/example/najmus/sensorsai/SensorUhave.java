package com.example.najmus.sensorsai;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class SensorUhave extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_sensor_uhave ); SensorManager sensorManager = (SensorManager) getSystemService ( Context.SENSOR_SERVICE );
        assert sensorManager != null;
        List<Sensor> sensors = sensorManager.getSensorList ( Sensor.TYPE_ALL );
        ListView list = findViewById ( R.id.list );
        list.setAdapter ( new MySensorsAdapter ( this ,R.layout.row_item,sensors ) );
    }
}
