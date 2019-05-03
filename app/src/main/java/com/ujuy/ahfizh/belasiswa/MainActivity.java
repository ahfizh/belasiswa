package com.ujuy.ahfizh.belasiswa;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private int time=3000;

    ImageView b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Splashscreen_logo.class);
                startActivity(intent);
                finish();
            }
        },time);
    }

    public void run(){
        b = (ImageView)findViewById(R.id.logoBelasiswa);
        overridePendingTransition(R.anim.fadein,R.anim.fadeout);
    }

}
