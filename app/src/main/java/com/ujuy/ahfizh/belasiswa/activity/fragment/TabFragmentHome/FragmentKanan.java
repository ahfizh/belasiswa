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
        final ListView listView = (ListView) getActivity().findViewById(R.id.listView2);
        String nama [] = {"Baju" , "Celana" ,"Jaket" , "Topi"};
        String detail [] = {"Merk Terbaru , ORIGINAL , LOCAL PRIDE","Merk baru , KW 10 , LOCAL PRIDE","Merk Terbaru , KW 5 , Luar PRIDE","Merk Terbaru , KW 2 , LOCAL PRIDE"};
        int gambar [] = {R.drawable.baju,R.drawable.celana,R.drawable.jaket,R.drawable.topi};
        ListDetailActivity adapter = new ListDetailActivity(nama,detail,gambar, this);
        listView.setAdapter(adapter);
        return view;
    }

}