package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter2 extends RecyclerView.Adapter {

    ArrayList<Places1> itemlist = new ArrayList<>();
    Context context1;


    public ItemAdapter2(ArrayList<Places1> itemlist, Context context1) {
        this.itemlist = itemlist;
        this.context1 = context1;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        ViewHolder1 vh1 = new ViewHolder1(view);
        return vh1;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position1) {
        ((ViewHolder1)holder).img.setImageResource(itemlist.get(position1).getPlacepicture());
        ((ViewHolder1)holder).name.setText(itemlist.get(position1).getPlacename());
        ((ViewHolder1)holder).location.setText(itemlist.get(position1).getPlacelocation());
        ((ViewHolder1)holder).v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(context1, DetailsActivitymalls.class);
                intent1.putExtra("places1", itemlist.get(position1));
                context1.startActivity(intent1);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemlist.size();
    }

    public class ViewHolder1 extends RecyclerView.ViewHolder {

        ImageView img;
        TextView name, location;
        View v;

        public ViewHolder1(@NonNull View itemView) {
            super(itemView);
            v = itemView;
            img = v.findViewById(R.id.imageView3);
            name = v.findViewById(R.id.textViewname);
            location = v.findViewById(R.id.textViewloc);

        }
    }


}
