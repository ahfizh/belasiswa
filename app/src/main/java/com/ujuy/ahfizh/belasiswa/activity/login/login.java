package com.ujuy.ahfizh.belasiswa.activity.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ujuy.ahfizh.belasiswa.activity.BottomNavigation.MainActivity;
import com.ujuy.ahfizh.belasiswa.R;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button Sign_in = (Button) findViewById(R.id.btnMasukPage);
        Sign_in.setOnClickListener( (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText Nama = (EditText) findViewById(R.id.edtUsername);
                EditText Password = (EditText) findViewById(R.id.edtPass);
                String n = Nama.getText().toString();
                String p = Password.getText().toString();

                if (p.equals("admin") && !n.equals("admin")){
                    Intent intent = new Intent(login.this, MainActivity.class);
                    intent.putExtra("nama",n);
                    startActivity(intent);
                }
                else if (n.isEmpty() || p.isEmpty()){
                    Toast toast = (Toast.makeText(getApplicationContext(),"Sorry, empty data", Toast.LENGTH_LONG));
                    toast.show();
                }
                else {
                    Toast toast = (Toast.makeText(getApplicationContext(),"Sorry, you have not registered", Toast.LENGTH_LONG));
                    toast.show();
                }
            }
        }));
    }
}
