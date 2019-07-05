package com.ujuy.ahfizh.belasiswa.activity.Pembayaran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.ujuy.ahfizh.belasiswa.R;
import com.ujuy.ahfizh.belasiswa.activity.MainActivity;
import com.ujuy.ahfizh.belasiswa.activity.fragment.FragmentHome;
import com.ujuy.ahfizh.belasiswa.activity.fragment.FragmentTask;

public class KonfirmasiPembayaran extends AppCompatActivity {

    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi_pembayaran2);

        ok = (Button) findViewById(R.id.okbtn);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KonfirmasiPembayaran.this, MainActivity.class);
                startActivity(intent);
            }
        });
        ImageView backArrowcnf = findViewById(R.id.backarrowconfrm);

        backArrowcnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KonfirmasiPembayaran.this, MetodePembayaran.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
