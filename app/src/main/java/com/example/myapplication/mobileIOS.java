package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class mobileIOS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_ios);

        WebView mywebview = (WebView) findViewById(R.id.iosWeb);
        WebSettings webSettings = mywebview.getSettings();
        webSettings.setJavaScriptEnabled(false);

        mywebview.loadUrl("https://www.cvedetails.com/vulnerability-list/vendor_id-49/product_id-15556/Apple-Iphone-Os.html");
    }
}
