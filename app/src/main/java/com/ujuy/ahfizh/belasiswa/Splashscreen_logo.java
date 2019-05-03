package com.ujuy.ahfizh.belasiswa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ujuy.ahfizh.belasiswa.register.RegisterActivity;

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
                Intent toRegisterActivity = new Intent(Splashscreen_logo.this, RegisterActivity.class);
                startActivity(toRegisterActivity);
            }
        });
    }
}
