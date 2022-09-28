package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivitymalls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_malls);

        ImageView img1 = findViewById(R.id.imageViewDetail2);
        TextView name1 = findViewById(R.id.textViewdetname2);
        TextView info1 = findViewById(R.id.textViewdetinfo2);
        TextView loc1 = findViewById(R.id.textViewdetloc2);

        Bundle bundle = getIntent().getExtras();

        Places1 sentplaces1 =(Places1) bundle.getSerializable("places1");


        name1.setText(sentplaces1.getPlacename());
        info1.setText(sentplaces1.getPlaceinfo());
        loc1.setText(sentplaces1.getPlacelocation());
        img1.setImageResource(sentplaces1.getPlacepicture());


    }
}