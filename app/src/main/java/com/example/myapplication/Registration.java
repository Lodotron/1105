package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }
}

    public void signin(View view){
        if (Password.equals("") && Login.equals("") && Email.equals("")) {
            Toast.makeText(getApplicationContext() , "Не все поля заполнены.", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent = new Intent (Registration.this, MainActivity.class);
        }
    }
}