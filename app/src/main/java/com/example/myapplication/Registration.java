package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import br.com.sapereaude.maskedEditText.MaskedEditText;

public class Registration extends AppCompatActivity {
    EditText log, pas, rep, email, name;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        log = findViewById(R.id.loginRegistration);
        pas = findViewById(R.id.passwordRegistration);
        rep = findViewById(R.id.repearPasswordRegistrtion);
        email = findViewById(R.id.emailReg);
        name = findViewById(R.id.profilename);
        sharedPreferences = getSharedPreferences("main1",MODE_PRIVATE);
    }

    public void Reg(View view) {
        if (!log.getText().toString().equals("") && !pas.getText().toString().equals("") && !rep.getText().toString().equals("") && !email.getText().toString().equals("")) {
            if (pas.getText().toString().equals(rep.getText().toString())) {
                if (email.getText().toString().contains("@")) {
                    Intent menue = new Intent(Registration.this, MenuActivity.class);
                    startActivity(menue);
                } else {
                    Toast.makeText(getApplicationContext(), "Пароли не совпадают", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(getApplicationContext(), "Не все поля зполнены", Toast.LENGTH_SHORT).show();
            }
        }
        editor = sharedPreferences.edit();
        editor.putString("login",log.getText().toString());
        editor.putString("email",email.getText().toString());
        editor.putString("pas",pas.getText().toString());
        editor.putString("name",email.getText().toString());
        editor.putString("phone",email.getText().toString());
        editor.apply();
    }

    public void Back(View view) {
        Intent back = new Intent(Registration.this, AuthorizationActivity.class);
        startActivity(back);
    }
}