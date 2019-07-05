package com.ujuy.ahfizh.belasiswa.activity.fragment.TabFragmentHome;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.ujuy.ahfizh.belasiswa.R;


public class FragmentKanan extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kanan,container,false);
        final ListView listView = view.findViewById(R.id.listView2);
        String nama [] = {"Belajar Matematika" , "Belajar Biologi" ,"Belajar Fisika" , "Belajar Kimia"};
        String detail [] = {"Segera ikut belajar","Segera ikut belajar","Segera ikut belajar","Segera ikut belajar"};
        int gambar [] = {R.drawable.terbaru1,R.drawable.terbaru2,R.drawable.terbaru3,R.drawable.terbaru4};
        ListDetailRuangBelajar adapter = new ListDetailRuangBelajar(nama,detail,gambar,getActivity());
        listView.setAdapter(adapter);
        return view;
    }

}