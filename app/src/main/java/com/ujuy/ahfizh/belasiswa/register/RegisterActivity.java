package com.ujuy.ahfizh.belasiswa.register;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ujuy.ahfizh.belasiswa.R;

public class RegisterActivity extends AppCompatActivity {

    private EditText username, password, confirmPass;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = (EditText) findViewById(R.id.edUsername);
        password = (EditText) findViewById(R.id.edPassword);
        confirmPass = (EditText) findViewById(R.id.edConfirmPassword);
        register = (Button) findViewById(R.id.btnRegister);

        onClickRegister();
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
