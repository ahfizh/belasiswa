package com.ujuy.ahfizh.belasiswa.activity.Pembayaran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.ujuy.ahfizh.belasiswa.R;
import com.ujuy.ahfizh.belasiswa.activity.Pembayaran.MetodetPembayaran.ListDetailRuangMetodePembayaran;

public class MetodePembayaran extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode_pembayaran3);

        final ListView listView = findViewById(R.id.listView5);
        String nama [] = {" Transfer BCA" , "Transfer BNI" ,"Transfer BRI" , "GO - PAY " ,"Transfer MANDIRI" , "Credit Card"};
        int gambar [] = {R.drawable.bankbca,R.drawable.bankbni,R.drawable.bankbri,R.drawable.bankgopay,R.drawable.bankmandiri,R.drawable.bankvisa};
        ListDetailRuangMetodePembayaran adapter = new ListDetailRuangMetodePembayaran(nama,gambar,this);
        listView.setAdapter(adapter);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    intent = new Intent(MetodePembayaran.this, KonfirmasiPembayaran.class);
                    startActivity(intent);
                } else if (position == 1) {
                    intent = new Intent(MetodePembayaran.this, KonfirmasiPembayaran.class);
                    startActivity(intent);
                } else if (position == 2) {
                    intent = new Intent(MetodePembayaran.this, KonfirmasiPembayaran.class);
                    startActivity(intent);
                } else if (position == 3) {
                    intent = new Intent(MetodePembayaran.this, KonfirmasiPembayaran.class);
                    startActivity(intent);
                }else if (position == 4) {
                    intent = new Intent(MetodePembayaran.this, KonfirmasiPembayaran.class);
                    startActivity(intent);
                }else if (position == 5) {
                    intent = new Intent(MetodePembayaran.this, KonfirmasiPembayaran.class);
                    startActivity(intent);
                }else if (position == 6) {
                    intent = new Intent(MetodePembayaran.this, KonfirmasiPembayaran.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(),"Pilih Salah Satu",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
