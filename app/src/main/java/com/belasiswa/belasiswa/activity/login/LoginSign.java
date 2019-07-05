package com.ujuy.ahfizh.belasiswa.activity.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.ujuy.ahfizh.belasiswa.R;
import com.ujuy.ahfizh.belasiswa.activity.register.RegisterActivity;

public class LoginSign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sign);
    }

    public void keLogin(View view){
        Intent intent = new Intent(LoginSign.this, login.class);
        startActivity(intent);
        finish();
    }

    public void keDaftar(View view){
        Intent intent = new Intent(LoginSign.this, RegisterActivity.class);
        startActivity(intent);
        finish();
    }
}
