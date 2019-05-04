package com.ujuy.ahfizh.belasiswa.activity.Pembayaran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.ujuy.ahfizh.belasiswa.R;
import com.ujuy.ahfizh.belasiswa.activity.Pembayaran.MetodetPembayaran.ListDetailRuangMetodePembayaran;

public class MetodePembayaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode_pembayaran3);

        final ListView listView = findViewById(R.id.listView2);
        String nama [] = {" Transfer BCA" , "Transfer BNI" ,"Transfer BRI" , "GO - PAY " ,"Transfer MANDIRI" , "Credit Card"};
        int gambar [] = {R.drawable.bankbca,R.drawable.bankbni,R.drawable.bankbri,R.drawable.bankgopay,R.drawable.bankmandiri,R.drawable.bankvisa};
        ListDetailRuangMetodePembayaran adapter = new ListDetailRuangMetodePembayaran(nama,gambar,this);
        listView.setAdapter(adapter);
    }
}
