package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Places> mylist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView welcome, welcome2;
        Button museum, malls, entertainments;

        welcome = findViewById(R.id.textViewWelcome);
        welcome2 = findViewById(R.id.textViewWelcome2);
        museum = findViewById(R.id.buttonmuseum);
        malls = findViewById(R.id.buttonMalls);
        entertainments = findViewById(R.id.buttonResturants);

        museum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, MainActivityMuseum.class);
                startActivity(intent);
            }
        });

        malls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, MainActivityMalls.class);
                startActivity(intent);

            }
        });

        entertainments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               Intent intent = new Intent(MainActivity.this, MainActivityEntertainment.class );
                startActivity(intent);
            }
        });





    }
}