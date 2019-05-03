package com.ujuy.ahfizh.belasiswa;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.ujuy.ahfizh.belasiswa.activity.fragment.FragmentHome;
import com.ujuy.ahfizh.belasiswa.activity.fragment.FragmentProfile;
import com.ujuy.ahfizh.belasiswa.activity.fragment.FragmentTask;


public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment(new FragmentHome());

        BottomNavigationView navigation = findViewById(R.id.bn_main);
        navigation.setOnNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.naviigation_home:
                fragment = new FragmentHome();
                break;

            case R.id.navigation_task:
                fragment = new FragmentTask();
                break;
            case R.id.navigation_profile:
                fragment = new FragmentProfile();
                break;

        }

        return loadFragment(fragment);
    }
    //kelas pinjam parkiran jadwal
    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fl_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
