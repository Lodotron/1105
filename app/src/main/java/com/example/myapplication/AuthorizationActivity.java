package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class AuthorizationActivity extends AppCompatActivity {
    EditText log;
    EditText pass;

    SharedPreferences sharedPreferences;
    EditText name;
    CheckBox checkBox;
    SharedPreferences.Editor editor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorization);
    }


    public void signin(View view) {
        log = (EditText) findViewById(R.id.logedittext);
        pass = (EditText) findViewById(R.id.passedittext);

        name = findViewById(R.id.editText);
        checkBox = findViewById(R.id.checkBox);
        sharedPreferences = getSharedPreferences("main", MODE_PRIVATE);
        Boolean save = sharedPreferences.getBoolean("save", false);
        if (save){
            Intent intent = new Intent (AuthorizationActivity.this, MainActivity.class);
            startActivity(intent);
        }

        final String login = log.getText().toString();
        final String password = pass.getText().toString();

        if (password.equals("admin") && login.equals("admin")) {
            Intent intent = new Intent( AuthorizationActivity.this, MenuActivity.class);
            startActivity(intent);

        }
        else {
            Toast.makeText(getApplicationContext() , "Логин или пароль введены не верно.", Toast.LENGTH_SHORT).show();
        }

    }

    public void signup(View view) {
        Intent signup = new Intent(AuthorizationActivity.this, Registration.class);
        startActivity(signup);
    }
    public void myClick(View view){
        editor = sharedPreferences.edit();
        editor.putString("name", name.getText().toString());
        editor.apply();
        if (checkBox.isChecked()){
            editor = sharedPreferences.edit();
            editor.putBoolean("save",true);
            editor.apply();
        }
        else{
            editor = sharedPreferences.edit();
            editor.putBoolean("save", false);
            editor.apply();
        }
        Intent intent = new Intent(AuthorizationActivity.this,MenuActivity.class);
        startActivity(intent);
        }
    }
