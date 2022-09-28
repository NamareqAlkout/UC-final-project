package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivityEntertainment extends AppCompatActivity {

    ArrayList<Places2> mylist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_entertainment);

        Places2 ent1 = new Places2("The Scientific Center", "The Scientific Center is a cultural achievement and educational facility enriched with knowledge, which portrays fascinating architectural design that reflects Islamic art and culture. The walls contain ceramic depictions of stories that tell of Kuwait's history. The main building is comprised of 3 main attractions: the Aquarium, Discovery Place and IMAX Theater.", "Ras Salmiya, PB 3504 Gulf Road, 22036", R.drawable.scientificcenter, "");
        Places2 ent2 = new Places2("Pro kart", "The Pro Kart is a big karting arena ,1500merers long, it’s good for all family Kids from 5 years old can ride the karts Pets allowed I. The circuit Challenging Fun safe", "On The 6th Ring Between Road 55 And 50 (airport Road New road entrance is on airport road 55 in front of Kuwait airways headquarters Kuwait Dhajeej, 22001", R.drawable.prokart, "");
        Places2 ent3 = new Places2("Escape Land", "Escape Land is a fun, new, team building real-life escape game entertainment concept, designed for small groups of 2-8 people with a variety of 14 different themes and considered one of the biggest in the industry world wide. Your goal is simple: work together as a team and test your skills, to escape from a locked room.", "82W6+JMH, Hawally", R.drawable.escapeland, "");
        Places2 ent4 = new Places2("Cinescape", "Cinescape - Kuwait National Cinema Company, formerly known Kuwait Cinema Company, is a movie theater chain and film distributor in Kuwait. There are many rooms, 2D, 3D, 4Dx.", "The Avenues mall Al, Jassem Mohammad Al-Kharafi Road 360 mall Zahra, Al-Bairaq Mall, Al Fanar Complex, Salem Al Mubarak St, Salmiya, Beirut street Muhallab Commercial Complex، Hawally, Marina Mall، Salem Al Mubarak St, Salmiya", R.drawable.cinescape, "");
        Places2 ent5 = new Places2("BowlStation", "BowlStation is not your average bowling Alley, we offer Arcade games suitable for all ages for Families and Friends, Beverages and Drinks, Computer Zone and a Pro Shop Specifically for your bowling Balls. What Differentiates us between the rest is we Offer the Best Prices and the Most friendliest Vibes. Don't Forget to Follow us to see Bowlstation_KW and to see our Great Offers.", "Fahaheel, 63 St", R.drawable.bowlstation, "");
        Places2 ent6 = new Places2("KidZania", "KidZania is a safe and interactive edutainment center where children can experience over 100 role playing activities in a replica of a real city. The various playful activities of KidZania are specifically designed to aid physical and intellectual growth, and contribute to the development of skills and attitudes.", "The Mall - The Avenues, 1st Floor Al", R.drawable.kiidzania, "");


        mylist.add(ent1);
        mylist.add(ent2);
        mylist.add(ent3);
        mylist.add(ent4);
        mylist.add(ent5);
        mylist.add(ent6);


        RecyclerView recycler = findViewById(R.id.rv3);
        recycler.setHasFixedSize(true);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);

        ItemAdapter3 adapter3 = new ItemAdapter3(mylist, this);
        recycler.setAdapter(adapter3);
    }
}