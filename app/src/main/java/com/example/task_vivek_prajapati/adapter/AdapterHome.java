package com.example.task_vivek_prajapati.adapter;
import android.widget.*;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task_vivek_prajapati.R;
import com.example.task_vivek_prajapati.models.PojoHomeList;

import java.util.List;

public class AdapterHome extends RecyclerView.Adapter<AdapterHome.HolderHome> {
    Context context;
    List<PojoHomeList> homeLists;

    public AdapterHome(Context context, List<PojoHomeList> homeLists) {
        this.context = context;
        this.homeLists = homeLists;
    }

    @NonNull
    @Override
    public HolderHome onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_home,parent,false);
        return new HolderHome(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderHome holder, int position) {
        holder.setIsRecyclable(false);
        holder.txtTitle.setText(homeLists.get(position).title);
        AdapterItems adapterItems=new AdapterItems(context,homeLists.get(position).list);
        holder.recyclerItem.setAdapter(adapterItems);
        holder.see_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "see_more", Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return homeLists.size();
    }

    public class HolderHome extends RecyclerView.ViewHolder {
        TextView txtTitle,see_more;
        RecyclerView recyclerItem;
        public HolderHome(@NonNull View itemView) {
            super(itemView);
            txtTitle=itemView.findViewById(R.id.txtTitle);
            see_more=itemView.findViewById(R.id.see_more);
            recyclerItem=itemView.findViewById(R.id.recyclerItem);
            recyclerItem.setLayoutManager(new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false));


        }
    }
}
