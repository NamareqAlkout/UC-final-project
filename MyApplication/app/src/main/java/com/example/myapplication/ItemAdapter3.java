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

public class ItemAdapter3 extends RecyclerView.Adapter {

    ArrayList<Places2> itemlist = new ArrayList<>();
    Context context2;

    public ItemAdapter3(ArrayList<Places2> itemlist, Context context2) {
        this.itemlist = itemlist;
        this.context2 = context2;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        ItemAdapter3.ViewHolder vh2 = new ItemAdapter3.ViewHolder(view);
        return vh2;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        ((ViewHolder)holder).img.setImageResource(itemlist.get(position).getPlacepicture());
        ((ViewHolder)holder).name.setText(itemlist.get(position).getPlacename());
        ((ViewHolder)holder).location.setText(itemlist.get(position).getPlacelocation());
        ((ViewHolder)holder).v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context2, DetailsActivityEntertainment.class);
                intent.putExtra("places2", itemlist.get(position));
                context2.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {return itemlist.size();}

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
