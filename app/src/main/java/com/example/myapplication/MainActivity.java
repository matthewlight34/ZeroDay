package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOne =findViewById(R.id.buttonOne);
        buttonOne.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent Main2Activity = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(Main2Activity);
            }
        });

        Button hipaaBtn =findViewById(R.id.hipaaBtn);
        hipaaBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent hipaaActivity = new Intent(getApplicationContext(), hipaaActivity.class);
                startActivity(hipaaActivity);
            }
        });

        Button mobileBtn =findViewById(R.id.mobileBtn);
        mobileBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent mobileThreatsActivity = new Intent(getApplicationContext(), mobileThreatsActivity.class);
                startActivity(mobileThreatsActivity);
            }
        });

        Button filterBtn =findViewById(R.id.filterBtn);
        filterBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent filterActivity = new Intent(getApplicationContext(), filterActivity.class);
                startActivity(filterActivity);
            }
        });
    }

}
