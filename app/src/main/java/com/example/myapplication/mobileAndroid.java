package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class mobileAndroid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_android);

        WebView mywebview = (WebView) findViewById(R.id.androidWeb);
        WebSettings webSettings = mywebview.getSettings();
        webSettings.setJavaScriptEnabled(false);

        mywebview.loadUrl("https://www.cvedetails.com/vulnerability-list/vendor_id-1224/product_id-19997/Google-Android.html");
    }
}
