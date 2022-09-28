package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivityMalls extends AppCompatActivity {

    ArrayList<Places1> itemlist = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_malls);


        Places1 mall1 = new Places1("The Avenues", "The Avenues Mall is the largest shopping mall in Kuwait.There is the Grand Avenue and the Grand Plaza. It consists from stores and resturants.", "The mall is located in the Rai area extending from Fifth Ring Road from the south and Al Ghazali Highway from the east", R.drawable.avenuse, "");
        Places1 mall2 = new Places1("Marina Mall", "Marina Mall in Kuwait is a one of the grand Mall. All leading and branded shops are here for shopping. Food court is available for Food lovers.  One can park car  at Marina beach side and cross over the sea road 25 and enter the mall. Marina beach scenarios and sea waves gives peace of mind to visitors. Clothes,  shoes, atheistic tools are available at an attractive price.  One can pass half day in this mall with family.", "Salem Al Mubarak St, Salmiya.", R.drawable.marinamall, "");
        Places1 mall3 = new Places1("360 Mall", "360 Mall is a shopping mall in Kuwait that opened on 5 July 2009. The mall has a circular design, and its name 360 is derived from the circular design of the complex, and its design follows the modern architectural design of the exterior and interior.","assem Mohamed Al Kharafi Rd Block 7, Al Zahraa South Surra، 13151", R.drawable.mall, "");
        Places1 mall4 = new Places1("Al Hamra Business Tower & Shopping Center", "The Al Hamra Tower is a skyscraper in Kuwait City, Kuwait. It is the tallest building in Kuwait. Construction of the skyscraper started in 2005. It was completed in 2011.It's have 83 floors and good enough parking lot.", "9XHV+J87, 159 St, Kuwait City", R.drawable.alhamratower, "There are to many restaurants and cafes are inside, aslo various business offices, multiplex cinema hall. It's good place to visit. We can say richest place of Kuwait.");
        Places1 mall5 = new Places1("Boulevard", "A boulevard is a type of broad avenue planted with rows of trees, or in parts of North America, any urban highway.Boulevards were originally circumferential roads following the line of former city walls.", "Salmiya", R.drawable.boulevard, "");
        Places1 mall6 = new Places1("The Gate Mall", "It's a brand new constellation to the Kuwaiti skyline and your go-to spot for enjoyment. This mall consists of six floor levels of unmatched shopping,dining, entertainment, and festive experiences", "Located in Egaila, 104 Rd", R.drawable.gatemall, "");

        itemlist.add(mall1);
        itemlist.add(mall2);
        itemlist.add(mall3);
        itemlist.add(mall4);
        itemlist.add(mall5);
        itemlist.add(mall6);

        RecyclerView recycler = findViewById(R.id.rv2);
        recycler.setHasFixedSize(true);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);


        ItemAdapter2 adapter2 = new ItemAdapter2(itemlist, this);
        recycler.setAdapter(adapter2);
    }
}