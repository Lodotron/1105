package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ImageView img2;
    String titlepizza[], despizzas[];
    int images[] = {R.drawable.p2izza, R.drawable.p1izza, R.drawable.p3izza, R.drawable.p4izza, R.drawable.p5izza, R.drawable.p6izza};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menue);

        img2 = (ImageView) findViewById(R.id.img2);

        recyclerView = findViewById(R.id.recyclerView);
        titlepizza = getResources().getStringArray(R.array.pizza_name);
        despizzas = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this,titlepizza,despizzas,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }

    public void next(View view) {
        Intent next = new Intent(MenuActivity.this, ProfileActivity.class);
        startActivity (next);
    }
    public void profile(View view){
        Intent profile = new Intent(MenuActivity.this, ProfileActivity.class);
        startActivity(profile);
    }
}



