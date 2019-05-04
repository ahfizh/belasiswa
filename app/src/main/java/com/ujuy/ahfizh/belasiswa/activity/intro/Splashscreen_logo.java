package com.ujuy.ahfizh.belasiswa.activity.intro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ujuy.ahfizh.belasiswa.MainActivity;
import com.ujuy.ahfizh.belasiswa.R;
import com.ujuy.ahfizh.belasiswa.activity.login.LoginSign;
import com.ujuy.ahfizh.belasiswa.activity.register.RegisterActivity;

public class Splashscreen_logo extends AppCompatActivity {

    private Button skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen_logo);

        skip = (Button) findViewById(R.id.btnSkip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toRegisterActivity = new Intent(Splashscreen_logo.this, LoginSign.class);
                startActivity(toRegisterActivity);
            }
        });
    }
}
