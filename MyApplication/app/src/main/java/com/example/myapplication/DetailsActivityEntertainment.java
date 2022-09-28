package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivityEntertainment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_entertainment);

        ImageView img = findViewById(R.id.imageViewdetailent);
        TextView name = findViewById(R.id.textViewnameent);
        TextView info = findViewById(R.id.textViewinfoent);
        TextView loc = findViewById(R.id.textViewlocent);

        Bundle bundle = getIntent().getExtras();

        Places2 sentplace2 = (Places2) bundle.getSerializable("places2");

        name.setText(sentplace2.getPlacename());
        info.setText(sentplace2.getPlaceinfo());
        loc.setText(sentplace2.getPlacelocation());
        img.setImageResource(sentplace2.getPlacepicture());

    }
}