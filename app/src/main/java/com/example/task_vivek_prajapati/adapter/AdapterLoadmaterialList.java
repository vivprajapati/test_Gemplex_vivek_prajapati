package com.example.task_vivek_prajapati.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task_vivek_prajapati.R;

public class AdapterLoadmaterialList extends RecyclerView.Adapter<AdapterLoadmaterialList.HolderLoadMaterialList> {
    @NonNull
    @Override
    public HolderLoadMaterialList onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_loadlist,parent,false);
        return new HolderLoadMaterialList(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderLoadMaterialList holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    class HolderLoadMaterialList extends RecyclerView.ViewHolder {

        public HolderLoadMaterialList(@NonNull View itemView) {
            super(itemView);
        }
    }
}
