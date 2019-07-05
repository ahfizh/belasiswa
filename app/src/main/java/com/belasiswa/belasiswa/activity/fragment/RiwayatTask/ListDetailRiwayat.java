package com.ujuy.ahfizh.belasiswa.activity.fragment.RiwayatTask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ujuy.ahfizh.belasiswa.R;

public class ListDetailRiwayat extends BaseAdapter{
    String nama[];
    String detail[];
    String alamat[];
    Context context;
    LayoutInflater inflater;

    public ListDetailRiwayat(String[] nama,String[] alamat, String[] detail, Context context) {
        this.nama = nama;
        this.detail = detail;
        this.alamat = alamat;
        this.context = context;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.activity_list_detail_riwayat, viewGroup, false);
        TextView txtNama = (TextView) view.findViewById(R.id.list_item_title_text_view3);
        TextView txtAlamat = view.findViewById(R.id.list_item_title_text_view3_1);
        TextView txtDetail = (TextView) view.findViewById(R.id.list_item_brief_desc_text_view3);


        txtNama.setText(nama[i]);
        txtDetail.setText(detail[i]);
        txtAlamat.setText(alamat[i]);

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

