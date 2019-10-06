package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        WebView mywebview = (WebView) findViewById(R.id.newThreatsWeb);
        WebSettings webSettings = mywebview.getSettings();
        webSettings.setJavaScriptEnabled(false);

        mywebview.loadUrl("https://www.infosecurity-magazine.com/white-papers/");
    }
}
