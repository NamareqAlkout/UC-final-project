package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivitymuseum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_activitymuseum);

        ImageView img = findViewById(R.id.imageViewDetail1);
        TextView nametext = findViewById(R.id.textViewdetname);
        TextView infotext = findViewById(R.id.textViewdetinfo);
        TextView locationtext = findViewById(R.id.textViewdetloc);

        Bundle bundle = getIntent().getExtras();

        Places sentplace =(Places) bundle.getSerializable("Places");


        nametext.setText(sentplace.getPlacename());
        infotext.setText(sentplace.getPlaceinfo());
        locationtext.setText(sentplace.getLocation());
        img.setImageResource(sentplace.getPlacepicture());


    }
}