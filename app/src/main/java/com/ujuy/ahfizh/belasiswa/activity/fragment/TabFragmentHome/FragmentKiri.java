package com.ujuy.ahfizh.belasiswa.activity.fragment.TabFragmentHome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.ujuy.ahfizh.belasiswa.R;
import com.ujuy.ahfizh.belasiswa.activity.Pembayaran.Pembayaran;
import com.ujuy.ahfizh.belasiswa.activity.fragment.ImageSlider.ViewPagerAdapter;
import com.ujuy.ahfizh.belasiswa.activity.login.LoginSign;
import com.ujuy.ahfizh.belasiswa.activity.register.RegisterActivity;

import java.util.Timer;
import java.util.TimerTask;


public class FragmentKiri extends Fragment {

    ViewPager viewPager;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kiri,container,false);
        return view;
    }

    @Override
    public void onViewCreated(View view,Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView donasi = view.findViewById(R.id.imagebtn_donasi);

        donasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Pembayaran.class);
                startActivity(intent);
            }
        });

        final ListView listView = (ListView) getActivity().findViewById(R.id.listView3);
        String nama [] = {"Beasiswa 3 tahun" , "Beasiswa 10.000" ,"Beasiswa Mahasiswa" , "Beasiswa 6 bulan","Beasiswa 7000","Beasiswa 5000"};
        String detail [] = {"Segera daftarkan diri anda","Segera daftarkan diri anda","Segera daftarkan diri anda","Segera daftarkan diri anda","Segera daftarkan diri anda","Segera daftarkan diri anda"};
        int gambar [] = {R.drawable.terbaru1,R.drawable.terbaru2,R.drawable.terbaru3,R.drawable.terbaru4,R.drawable.terbaru2,R.drawable.terbaru1};
        ListDetailRuangBeasiswa adapter = new ListDetailRuangBeasiswa(nama,detail,gambar,getActivity());
        listView.setAdapter(adapter);

        viewPager = getActivity().findViewById(R.id.viewPager);

        sliderDotspanel = getActivity().findViewById(R.id.SliderDots);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getActivity());

        viewPager.setAdapter(viewPagerAdapter);

        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];

        for(int i = 0; i < dotscount; i++){

            dots[i] = new ImageView(getActivity());
            dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity().getApplicationContext(), R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotspanel.addView(dots[i], params);

        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getActivity().getApplicationContext(), R.drawable.active_dot));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for(int i = 0; i< dotscount; i++){
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity().getApplicationContext(), R.drawable.nonactive_dot));
                }

                dots[position].setImageDrawable(ContextCompat.getDrawable(getActivity().getApplicationContext(), R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(), 2000, 4000);


    }

    public class MyTimerTask extends TimerTask {

        @Override
        public void run() {

            FragmentKiri.this.getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {

                    if(viewPager.getCurrentItem() == 0){
                        viewPager.setCurrentItem(1);
                    } else if(viewPager.getCurrentItem() == 1){
                        viewPager.setCurrentItem(2);
                    } else {
                        viewPager.setCurrentItem(0);
                    }

                }
            });

        }
    }
}