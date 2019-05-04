package com.ujuy.ahfizh.belasiswa.activity.register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.ujuy.ahfizh.belasiswa.R;
import com.ujuy.ahfizh.belasiswa.activity.login.LoginSign;

public class RegisterActivity extends AppCompatActivity {

    private EditText username, password, email;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = (EditText) findViewById(R.id.edtUsername);
        password = (EditText) findViewById(R.id.edtPass);
        email = (EditText) findViewById(R.id.edtEmail);
        register = (Button) findViewById(R.id.btnDaftarPage);

        onClickRegister();

        //REGISTER PAGE TO LOGINSIGN
        ImageButton backArrow = (ImageButton)findViewById(R.id.tombolKembali);

        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginSign.class);
                startActivity(intent);
                finish();
            }
        });
    }

    // HOW TO HANDLE WHEN BUTTON CLICK
    private void onClickRegister(){
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Register Success", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
