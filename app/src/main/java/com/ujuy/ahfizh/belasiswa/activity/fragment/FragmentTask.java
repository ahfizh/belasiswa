package com.ujuy.ahfizh.belasiswa.activity.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.ujuy.ahfizh.belasiswa.R;
import com.ujuy.ahfizh.belasiswa.activity.fragment.RiwayatTask.ListDetailRiwayat;
import com.ujuy.ahfizh.belasiswa.activity.fragment.TabFragmentHome.ListDetailRuangBelajar;
import com.ujuy.ahfizh.belasiswa.activity.fragment.TabFragmentHome.SectionsPageAdapter;

public class FragmentTask extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";
    private int mPageNo;

    public static FragmentTask newInstance(int pageNo) {

        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNo);
        FragmentTask fragment = new FragmentTask();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNo = getArguments().getInt(ARG_PAGE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_task, container, false);
        final ListView listView = view.findViewById(R.id.listView4);
        String nama [] = {"Beasiswa Setahun" , "Beasiswa Australia" ,"Beasiswa Bali" , "Beasiswa Jakarta","Beasiswa Agoda","Beasiswa Go-Jek","Beasiswa Grab","Beasiswa Traveloka","Beasiswa Tiket.com"};
        String alamat [] = {"Bogor","Jakarta","Karawang","Bali" ,"Bali","Kalimantan","Bogor" , "Semarang" ,"Jakarta"};
        String detail [] = {"Besar Donasi Rp.1000.000" , "Besar Donasi Rp.100.000" ,"Besar Donasi Rp.10000" , "Besar Donasi Rp.2000.000"
                ,"Besar Donasi Rp.300.000","Besar Donasi Rp.3000.000" , "Besar Donasi Rp.1000.000" , "Besar Donasi Rp.2000.000" ,"Besar Donasi Rp.4000.000"};
        ListDetailRiwayat adapter = new ListDetailRiwayat(nama,alamat,detail,getActivity());
        listView.setAdapter(adapter);
        return view;
    }
}