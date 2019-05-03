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

import com.ujuy.ahfizh.belasiswa.R;
import com.ujuy.ahfizh.belasiswa.activity.fragment.TabFragmentHome.SectionsPageAdapter;

public class FragmentHome extends Fragment {
    ViewPager simpleViewPager;
    TabLayout tabLayout;
    SectionsPageAdapter pagerAdapter;

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        simpleViewPager = view.findViewById(R.id.pager);
        tabLayout = view.findViewById(R.id.tabs);
        pagerAdapter = new SectionsPageAdapter(getFragmentManager());
        simpleViewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(simpleViewPager);

        return view;
}
