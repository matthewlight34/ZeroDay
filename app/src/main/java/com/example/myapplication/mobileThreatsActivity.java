package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class mobileThreatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_threats);

        Button IOSBtn =findViewById(R.id.IOSBtn);
        IOSBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent mobileIOS = new Intent(getApplicationContext(), mobileIOS.class);
                startActivity(mobileIOS);
            }
        });

        Button androidBtn =findViewById(R.id.androidBtn);
        androidBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent mobileAndroid = new Intent(getApplicationContext(), mobileAndroid.class);
                startActivity(mobileAndroid);
            }
        });


    }
}
