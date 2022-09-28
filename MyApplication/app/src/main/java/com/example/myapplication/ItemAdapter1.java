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


public class ItemAdapter1 extends RecyclerView.Adapter {

    ArrayList<Places> mylist = new ArrayList<>();
    Context context;

    public ItemAdapter1(ArrayList<Places> mylist, Context context) {
        this.mylist = mylist;
        this.context = context;
    }

    public ItemAdapter1(ArrayList<Places> mylist, MainActivityEntertainment context) {
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        ViewHolder vh = new ViewHolder(view);


        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        ((ViewHolder)holder).img.setImageResource(mylist.get(position).getPlacepicture());
        ((ViewHolder)holder).name.setText(mylist.get(position).getPlacename());
        ((ViewHolder)holder).location.setText(mylist.get(position).getLocation());
        ((ViewHolder)holder).v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent= new Intent(context, DetailsActivitymuseum.class);
            intent.putExtra("Places", mylist.get(position));
            context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return mylist.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView name, location;
        View v;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            v = itemView;
            img = v.findViewById(R.id.imageView3);
            name = v.findViewById(R.id.textViewname);
            location = v.findViewById(R.id.textViewloc);
        }
    }
}
