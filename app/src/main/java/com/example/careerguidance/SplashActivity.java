package com.example.careerguidance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();
    }

    private void initView() {
        new Handler().postDelayed(new Runnable() {

            @Override

            public void run() {


                Intent i = new Intent(SplashActivity.this, OnBoardingActivity.class);

                startActivity(i);


                finish();

            }

        }, 2000);
    }
}