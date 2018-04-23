package com.example.najmus.sensorsai;
/*====================================
    Author : NAJMUS SEEMAB
======================================*/
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class AiUpdates extends Activity {
    private WebView mywebView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        requestWindowFeature ( Window.FEATURE_NO_TITLE );//for full screen
        getWindow ().setFlags ( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView ( R.layout.activity_ai_updates );
        mywebView1 =(WebView)findViewById ( R.id.webView1 );
        WebSettings webSettings;
        webSettings = mywebView1.getSettings ();
        webSettings.setJavaScriptEnabled ( true );
        mywebView1.loadUrl ( "https://sensors7834.blogspot.in" );
        mywebView1.setWebViewClient ( new WebViewClient () );//prevents our url to open in another browser

    }

    @Override
    public void onBackPressed() {
        if(mywebView1.canGoBack ()){
            mywebView1.goBack ();
        }else{
            super.onBackPressed ();

        }

    }
}
