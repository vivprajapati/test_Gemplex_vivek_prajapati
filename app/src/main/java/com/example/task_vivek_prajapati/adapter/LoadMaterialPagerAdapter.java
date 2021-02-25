package com.example.task_vivek_prajapati.adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.task_vivek_prajapati.Fragment_LoadMaterial_List;
import com.example.task_vivek_prajapati.HomeFragment;
import com.example.task_vivek_prajapati.HypeFragment;
import com.example.task_vivek_prajapati.MoviesFragment;
import com.example.task_vivek_prajapati.MusicFragment;
import com.example.task_vivek_prajapati.OriginalsFragment;
import com.example.task_vivek_prajapati.VideoFragment;

public class LoadMaterialPagerAdapter extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public LoadMaterialPagerAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
            case 1:

                Fragment_LoadMaterial_List loadMaterial_list = new Fragment_LoadMaterial_List();
                return loadMaterial_list;

            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }

}

