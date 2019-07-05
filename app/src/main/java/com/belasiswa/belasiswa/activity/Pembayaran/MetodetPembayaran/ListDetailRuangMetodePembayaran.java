package com.ujuy.ahfizh.belasiswa.activity.Pembayaran.MetodetPembayaran;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ujuy.ahfizh.belasiswa.R;

public class ListDetailRuangMetodePembayaran extends BaseAdapter{
    String nama[];
    int gambar[];
    Context context;
    LayoutInflater inflater;

    public ListDetailRuangMetodePembayaran(String[] nama, int[] gambar, Context context) {
        this.nama = nama;
        this.gambar = gambar;
        this.context = context;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.activity_list_detail_metode, viewGroup, false);
        TextView txtNama = (TextView) view.findViewById(R.id.list_item_title_text_view4);
        ImageView img = (ImageView) view.findViewById(R.id.list_item_image4);


        txtNama.setText(nama[i]);
        img.setImageResource(gambar[i]);

        return view;
    }

    @Override
    public Object getItem(int i) {
        return nama;
    }

    @Override
    public int getCount() {
        return nama.length;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
}

