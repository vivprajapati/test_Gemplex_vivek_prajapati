package com.example.task_vivek_prajapati;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.View;
import android.widget.*;
import android.os.Bundle;

import com.example.task_vivek_prajapati.adapter.AdapterHome;
import com.example.task_vivek_prajapati.adapter.AdapterLoadmaterialList;
import com.example.task_vivek_prajapati.adapter.LoadMaterialPagerAdapter;
import com.example.task_vivek_prajapati.adapter.MaterialCircular;
import com.example.task_vivek_prajapati.models.PojoHomeList;
import com.example.task_vivek_prajapati.models.PojoItems;
import com.google.android.material.tabs.TabLayout;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class LoadMaterial extends AppCompatActivity {
    ImageView img,back;
    TextView name, read_less;
    String itemName, itemLink;
    TabLayout tabLayout;
    LinearLayout toggle;
    ViewPager viewPager;
    int clickCount = 0;
    RecyclerView recyclerView, recyclerView1, recyclerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_material);
        itemName = getIntent().getStringExtra("name");
        itemLink = getIntent().getStringExtra("imgLink");
        img = findViewById(R.id.item_banner);
        name = findViewById(R.id.item_name);
        toggle = findViewById(R.id.toggle);
        read_less = findViewById(R.id.read_less);
        back=findViewById(R.id.back_ic);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        read_less.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clickCount == 0) {
                    toggle.setVisibility(View.VISIBLE);
                    read_less.setText("Read Less");
                    clickCount = 1;
                } else if (clickCount == 1) {
                    toggle.setVisibility(View.GONE);
                    read_less.setText("Read More");
                    clickCount = 0;
                }
            }
        });

        Picasso.get().load(itemLink).into(img);
        name.setText(itemName);
        tabLayout = findViewById(R.id.tab_layout_mat);
        viewPager = findViewById(R.id.view_pager_mat);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView1 = findViewById(R.id.recyclerView1);
        recyclerView2 = findViewById(R.id.recyclerView2);
        setData();
        tabLayout.addTab(tabLayout.newTab().setText("Episode"));
        tabLayout.addTab(tabLayout.newTab().setText("Trailers & more"));
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        final LoadMaterialPagerAdapter adapter = new LoadMaterialPagerAdapter(this, getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
//        tabLayout.setupWithViewPager(viewPager);
    }

    private void setData() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MaterialCircular materialCircular = new MaterialCircular(this, getDummyData());
        recyclerView.setAdapter(materialCircular);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        MaterialCircular materialCircular1 = new MaterialCircular(this, getDummyData1());
        recyclerView1.setAdapter(materialCircular1);

        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        AdapterHome adapterHome = new AdapterHome(this, getDummyData2());
        recyclerView2.setAdapter(adapterHome);
    }

    private List<PojoHomeList> getDummyData() {
        List<PojoHomeList> data = new ArrayList<>();
        List<PojoItems> items = new ArrayList<>();
        items.add(new PojoItems("Tarek", "https://i.pinimg.com/originals/bb/49/a2/bb49a210b14deb1e0ffac39d79a5ed95.jpg"));
        items.add(new PojoItems("Kamal", "https://i.pinimg.com/originals/bb/49/a2/bb49a210b14deb1e0ffac39d79a5ed95.jpg"));
        items.add(new PojoItems("Amit", "https://i.pinimg.com/originals/bb/49/a2/bb49a210b14deb1e0ffac39d79a5ed95.jpg"));


        data.add(new PojoHomeList("Cast", items));
        return data;
    }

    private List<PojoHomeList> getDummyData1() {
        List<PojoHomeList> data = new ArrayList<>();
        List<PojoItems> items = new ArrayList<>();
        items.add(new PojoItems("Mazahir", "https://i.pinimg.com/originals/bb/49/a2/bb49a210b14deb1e0ffac39d79a5ed95.jpg"));
        items.add(new PojoItems("Nupur", "https://i.pinimg.com/originals/bb/49/a2/bb49a210b14deb1e0ffac39d79a5ed95.jpg"));
        items.add(new PojoItems("Sunil", "https://i.pinimg.com/originals/bb/49/a2/bb49a210b14deb1e0ffac39d79a5ed95.jpg"));


        data.add(new PojoHomeList("Crew", items));
        return data;
    }

    private List<PojoHomeList> getDummyData2() {
        List<PojoHomeList> data = new ArrayList<>();
        List<PojoItems> items = new ArrayList<>();
        items.add(new PojoItems("Z43", "https://images.unsplash.com/photo-1583059439119-5da0e881baa9?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80"));
        items.add(new PojoItems("Bhoot Bari", "https://images.unsplash.com/photo-1603081463895-e27e22259ec0?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80"));

        data.add(new PojoHomeList("Recommended", items));
        return data;
    }
}