package com.ujuy.ahfizh.belasiswa.activity.splash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.ujuy.ahfizh.belasiswa.R;
import com.ujuy.ahfizh.belasiswa.activity.intro.Splashscreen_logo;


public class Splashscreen extends AppCompatActivity {
public class MainActivity extends AppCompatActivity {

    // ini untuk splashscreen
    // konyon text

    private int time=3000;

    ImageView b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splashscreen.this, Splashscreen_logo.class);
                startActivity(intent);
                finish();
            }
        },time);
    }

    public void run(){
        b = (ImageView)findViewById(R.id.logoBelasiswa);
        overridePendingTransition(R.anim.fadein,R.anim.fadeout);
    }
}}
