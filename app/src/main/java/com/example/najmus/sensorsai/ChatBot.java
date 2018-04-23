 package com.example.najmus.sensorsai;
/*====================================
    Author : NAJMUS SEEMAB
======================================*/

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.TextView;
import com.google.gson.JsonElement;
import android.widget.Button;
import java.util.Map;
import ai.api.AIListener;
import ai.api.android.AIService;
import ai.api.model.AIError;
import ai.api.model.AIResponse;
import ai.api.model.Result;

public class ChatBot extends AppCompatActivity implements AIListener {
    AIService aiService;
    TextView t;
    private Button listenButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_chat_bot );
        resultTextView=(TextView) findViewById ( R.id.resultTextView );
        listenButton=(Button) findViewById ( R.id.listenButton);
        int permission = ContextCompat.checkSelfPermission ( this, Manifest.permission.RECORD_AUDIO );
        if (permission!= PackageManager.PERMISSION_GRANTED){

            makeRequest();
        }
        final ai.api.android.AIConfiguration config = new ai.api.android.AIConfiguration(
                "5676027c25554d4da3ae2e0238c07e38",
                ai.api.AIConfiguration.SupportedLanguages.English, ai.api.android.AIConfiguration.RecognitionEngine.System);


        aiService = AIService.getService(this, (ai.api.android.AIConfiguration) config );
        aiService.setListener(this);
    }
    protected  void makeRequest(){
        ActivityCompat.requestPermissions (this,new String[]{Manifest.permission.RECORD_AUDIO},101);
    }
    @Override
    public void onRequestPermissionsResult(int requestCode,String permissions[],int[] grantResults){
        switch (requestCode){
            case 101:{
                if (grantResults.length ==0 || grantResults[0]!=PackageManager.PERMISSION_GRANTED) {

                }else {

                }
                return;
            }
        }
    }
    public void buttonClicked(View view){
        aiService.startListening();
    }
    @Override
    public void onResult(final AIResponse response) {
        Result result = response.getResult();
        String parameterString = "";
        if (result.getParameters() != null && !result.getParameters().isEmpty()) {
            for (final Map.Entry<String, JsonElement> entry : result.getParameters().entrySet()) {
                parameterString += "(" + entry.getKey() + ", " + entry.getValue() + ") ";

            }}
        resultTextView.setText("Users Say:\n\n\n" + result.getResolvedQuery() +
                "\nAnswer:\n " + result.getAction() +
                "\n " + parameterString);}

    @Override
    public void onError(AIError error) {
        resultTextView.setText(error.toString());

    }

    @Override
    public void onAudioLevel(float level) {

    }

    @Override
    public void onListeningStarted() {

    }

    @Override
    public void onListeningCanceled() {

    }

    @Override
    public void onListeningFinished() {

    }
    }

