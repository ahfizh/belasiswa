package com.ujuy.ahfizh.belasiswa;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void initBottomViewAndLoadFragments(final BottomNavigationViewEx bnve) {
        bnve.enableAnimation(false);
        bnve.enableShiftingMode(false);
        bnve.enableItemShiftingMode(false);

        // use the unchecked color for first item
        bnve.setIconTintList(0, getResources().getColorStateList(R.color.bnv_unchecked_black));
        bnve.setTextTintList(0, getResources().getColorStateList(R.color.bnv_unchecked_black));

        bnve.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            private boolean firstClick = true;
            private int lastItemId = -1;

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // restore the color when click
                if (firstClick) {
                    firstClick = false;
                    bnve.setIconTintList(0, getResources().getColorStateList(R.color.selector_bnv));
                    bnve.setTextTintList(0, getResources().getColorStateList(R.color.selector_bnv));
                }

                if (firstClick || lastItemId == -1 || lastItemId != item.getItemId()) {
                    lastItemId = item.getItemId();
                } else {
                    return false;
                }

                // do stuff
                return fillContent(item.getItemId());
            }
        });
    }
}
