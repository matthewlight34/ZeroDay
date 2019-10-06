package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

public class hipaaActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hipaa);
        // Ignoring SSL certificate errors


       WebView mywebview = (WebView) findViewById(R.id.hipaaWeb);
       WebSettings webSettings = mywebview.getSettings();
       webSettings.setJavaScriptEnabled(false);

       mywebview.loadUrl("https://compliancy-group.com/hipaa-fines-directory-year/");


    }

}
