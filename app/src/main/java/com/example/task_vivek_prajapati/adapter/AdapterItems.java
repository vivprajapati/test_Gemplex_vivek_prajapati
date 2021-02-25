package com.example.task_vivek_prajapati.adapter;

import android.content.Intent;
import android.widget.*;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task_vivek_prajapati.LoadMaterial;
import com.example.task_vivek_prajapati.R;
import com.example.task_vivek_prajapati.models.PojoItems;
import com.squareup.picasso.Picasso;

import java.util.List;

public
class AdapterItems extends RecyclerView.Adapter<AdapterItems.HolderItems> {
    Context context;
    List<PojoItems> list;

    public AdapterItems(Context context, List<PojoItems> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public HolderItems onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.adapter_items,parent,false);
        return new HolderItems(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderItems holder, int position) {
        holder.setIsRecyclable(false);
        Picasso.get().load(list.get(position).image_url).into(holder.grid_image_view);
        holder.home_grid_text.setText(list.get(position).name);
        String itemName=list.get(position).name;
        String imgLink=list.get(position).image_url;
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, LoadMaterial.class);
                intent.putExtra("name",itemName);
                intent.putExtra("imgLink",imgLink);
                holder.itemView.getContext().startActivity(intent);
                Toast.makeText(context, "Item clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class HolderItems extends RecyclerView.ViewHolder {
        ImageView grid_image_view;
        TextView home_grid_text;
        public HolderItems(@NonNull View itemView) {
            super(itemView);
            grid_image_view=itemView.findViewById(R.id.grid_image_view);
            home_grid_text=itemView.findViewById(R.id.home_grid_text);
        }
    }
}
