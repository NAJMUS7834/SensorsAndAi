package com.example.najmus.sensorsai;
/*====================================
    Author : NAJMUS SEEMAB
======================================*/

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SpeciaSensor extends AppCompatActivity {


    public void StepCounterButtonClicked(View view){
        Intent StepCounterIntent = new Intent(SpeciaSensor.this,StepCounter.class);
        startActivity(StepCounterIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_specia_sensor );
    }
}
