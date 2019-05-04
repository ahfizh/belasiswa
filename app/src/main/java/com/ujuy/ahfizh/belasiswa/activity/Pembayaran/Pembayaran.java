package com.ujuy.ahfizh.belasiswa.activity.Pembayaran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ujuy.ahfizh.belasiswa.R;
import com.ujuy.ahfizh.belasiswa.activity.intro.Splashscreen_logo;
import com.ujuy.ahfizh.belasiswa.activity.splash.Splashscreen;

public class Pembayaran extends AppCompatActivity {

    Button btnlanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);

        btnlanjut = findViewById(R.id.btn_lanjut);
        btnlanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pembayaran.this, MetodePembayaran.class);
                startActivity(intent);
            }
        });
    }




}
