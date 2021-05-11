package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity2 extends AppCompatActivity {
    TextView log, pas, rep, email, name, phone;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profileactivity2);
        log = findViewById(R.id.t1);
        pas = findViewById(R.id.t2);
        email = findViewById(R.id.t3);
        name = findViewById(R.id.t4);
        phone = findViewById(R.id.t5);
        sharedPreferences = getSharedPreferences("main",MODE_PRIVATE);

        log.setText(sharedPreferences.getString("login","LOG"));
        log.setText(sharedPreferences.getString("phone","PHONE"));
        log.setText(sharedPreferences.getString("email","EMAIL"));
        log.setText(sharedPreferences.getString("name","NAME"));
        log.setText(sharedPreferences.getString("pas","PAS"));


    }
}