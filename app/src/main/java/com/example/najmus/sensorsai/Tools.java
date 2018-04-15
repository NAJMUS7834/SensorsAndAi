package com.example.najmus.sensorsai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tools extends AppCompatActivity {


    public void CompassButtonClicked(View view){
        Intent CompassIntent = new Intent(Tools.this,Compass.class);
        startActivity(CompassIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_tools );
    }
}
