package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivityMuseum extends AppCompatActivity {

    ArrayList<Places> mylist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_museum);

        Places place1 = new Places("Kuwait National Museum", "The Kuwait National Museum was established in 1983 and designed by architect Michel Ecochard.", "it is located in Kuwait City, rabian Gulf Street next to the Seif Palace and Kuwait’s National Assembly، Al Kuwayt", R.drawable.nationalmus,"The museum comprises five buildings set around a central garden, their organization is parallel to the architectural plan of the vernacular Arab mud house with its central courtyard. The main buildings are connected to each other with elevated walkways." );
        Places place2 = new Places("Abdullah Al Salem Cultural Museum","The Abdullah Al Salem Cultural Museum consists of six main components: he Natural History Museum, Science Museum, Space Museum, Arabic Islamic Science Museum, Fine Arts Centre and the external spaces known as the Public Realm","It is located in Kuwait City, Baghdad St, Salmiya", R.drawable.sheikhabdullalsalem, "The museums present Kuwaiti, Islamic, and Arab culture and history. They also embrace and showcase the rich diversity of the world's finest cultural achievements. The museum is named after the late Sheikh Abdullah Al-Salem Al-Sabah who was the 11th ruler of Kuwait, the first Amir and the founder of modern Kuwait.");
        Places place3 = new Places("The Mirror House Museum", "This “House of Mirrors” belongs to the pioneer Kuwaiti Artists Khalifa and Lidia Al-Qattan and it is now considered as a Museum, as the wife of the renowned Kuwaiti artist has turned their house into a work of art using broken pieces of glass to decorate the outside and inside of the house", "House 17, Street 94, Block 9, Qadisiya, Kuwait City 35809",R.drawable.mirrorhouse,"");
        Places place4 = new Places("Qurain City", "Qurain City is an area in Kuwait, The name is also an older name of the state of Kuwait. The name itself means elevated land or hill.he suburb is renowned for three neighboring villas of historical significance. They are what make up Al-Qurain Martyrs' Museum. The symbolic thing about this house is that it represented a wide spectrum of Kuwaiti people from different sects and ancestral backgrounds.", "located in the Mubarak Al-Kabeer Governorate.", R.drawable.alqurainmartyrsmuseum, "");
        Places place5 = new Places("Dickson House", "Dickson House is the house of the first British political agent in Kuwait Colonel Dickson from 1929-1936 who later worked for the Kuwait Oil Company after he retired from the British government.The house was built in 1870 and was used and modified in 1929 by Col.", " Kuwait City, Kuwait", R.drawable.dicksonhouse, "" );

        mylist.add(place1);
        mylist.add(place2);
        mylist.add(place3);
        mylist.add(place4);
        mylist.add(place5);


        RecyclerView recycler = findViewById(R.id.rv1);
        recycler.setHasFixedSize(true);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);

        ItemAdapter1 adapter1 = new ItemAdapter1(mylist, this);
        recycler.setAdapter(adapter1);




    }
}