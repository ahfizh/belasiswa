package com.ujuy.ahfizh.belasiswa.activity.fragment.TabFragmentHome;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPageAdapter extends FragmentPagerAdapter {

    public SectionsPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                FragmentKiri pertamaTab = new FragmentKiri();
                return pertamaTab;
            case 1:
                FragmentKanan keduaTab = new FragmentKanan();
                return keduaTab;

            default:
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Ruang Beasiswa";
            case 1:
                return "Ruang Belajar";
        }
        return null;
    }
}
