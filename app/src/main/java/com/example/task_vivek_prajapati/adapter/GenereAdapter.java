package com.example.task_vivek_prajapati.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task_vivek_prajapati.R;
import com.example.task_vivek_prajapati.models.PojoHomeList;

import java.util.List;

public class GenereAdapter extends RecyclerView.Adapter<GenereAdapter.HolderHome> {
    Context context;
    List<PojoHomeList> homeLists;

    public GenereAdapter(Context context, List<PojoHomeList> homeLists) {
        this.context = context;
        this.homeLists = homeLists;
    }

    @NonNull
    @Override
    public GenereAdapter.HolderHome onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_home, parent, false);
        return new GenereAdapter.HolderHome(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GenereAdapter.HolderHome holder, int position) {
        holder.setIsRecyclable(false);
        holder.txtTitle.setText(homeLists.get(position).title);
        GenereItemsAdapter genereItemsAdapter = new GenereItemsAdapter(context, homeLists.get(position).list);
        holder.recyclerItem.setAdapter(genereItemsAdapter);
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
        TextView txtTitle, see_more;
        RecyclerView recyclerItem;

        public HolderHome(@NonNull View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            see_more = itemView.findViewById(R.id.see_more);
            recyclerItem = itemView.findViewById(R.id.recyclerItem);
            recyclerItem.setLayoutManager(new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false));


        }
    }
}
