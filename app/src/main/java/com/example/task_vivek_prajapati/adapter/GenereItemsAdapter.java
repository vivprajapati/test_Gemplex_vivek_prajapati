package com.example.task_vivek_prajapati.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task_vivek_prajapati.LoadMaterial;
import com.example.task_vivek_prajapati.R;
import com.example.task_vivek_prajapati.models.PojoItems;
import com.squareup.picasso.Picasso;

import java.util.List;

public class GenereItemsAdapter extends RecyclerView.Adapter<GenereItemsAdapter.HolderItems> {
    Context context;
    List<PojoItems> list;

    public GenereItemsAdapter(Context context, List<PojoItems> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public HolderItems onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.genere_item, parent, false);
        return new HolderItems(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderItems holder, int position) {
        holder.setIsRecyclable(false);
        Picasso.get().load(list.get(position).image_url).into(holder.grid_image_view);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "genere clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class HolderItems extends RecyclerView.ViewHolder {
        ImageView grid_image_view;


        public HolderItems(@NonNull View itemView) {
            super(itemView);
            grid_image_view = itemView.findViewById(R.id.genere_img);

        }
    }
}
