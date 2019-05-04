package com.ujuy.ahfizh.belasiswa.activity.fragment.TabFragmentHome;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ujuy.ahfizh.belasiswa.R;

public class ListDetailRuangBeasiswa extends BaseAdapter{
    String nama[];
    String detail[];
    int gambar[];
    Context context;
    LayoutInflater inflater;

    public ListDetailRuangBeasiswa(String[] nama, String[] detail, int[] gambar, Context context) {
        this.nama = nama;
        this.gambar = gambar;
        this.detail = detail;
        this.context = context;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.activity_list_detail_terbaru, viewGroup, false);
        TextView txtNama = view.findViewById(R.id.list_item_title_text_view1);
        TextView txtDetail = view.findViewById(R.id.list_item_brief_desc_text_view1);
        ImageView img = view.findViewById(R.id.list_item_image1);


        txtNama.setText(nama[i]);
        txtDetail.setText(detail[i]);
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

