package com.example.najmus.sensorsai;
/*====================================
    Author : NAJMUS SEEMAB
======================================*/

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Ai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_ai );
    }
    public void BotButtonClicked(View view){
        Intent BotIntent = new Intent(Ai.this,ChatBot.class);
        startActivity(BotIntent);
    }
    public void AiGamesClicked(View view){
        Intent AiGamesIntent = new Intent(Ai.this,Game.class);
        startActivity(AiGamesIntent);
    }


}
