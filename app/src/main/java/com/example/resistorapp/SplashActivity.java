package com.example.resistorapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView banner;
    private ImageView logo;
    //Clinton - Duration of display for overall splash screen / Duration for fade effect in splashanimation.xml
    private static int splashTimeOut=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        logo=(ImageView)findViewById(R.id.logo);
        banner=(TextView) findViewById(R.id.textView);

        //Clinton - Handler allows for intent to be initialized post splashTimeOut time
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },splashTimeOut);

        //Clinton - Implements splash animation on desired views
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.splashanimation);
        logo.startAnimation(myanim);
        banner.startAnimation(myanim);
    }
}
