package com.example.task_vivek_prajapati;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public MyAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 1:
                OriginalsFragment originalsFragment = new OriginalsFragment();
                return originalsFragment;
            case 2:
                MoviesFragment movieFragment = new MoviesFragment();
                return movieFragment;
            case 3:
                VideoFragment videoFragment = new VideoFragment();
                return videoFragment;
            case 4:
                MusicFragment moviesFragment = new MusicFragment();
                return moviesFragment;
            case 5:
                HypeFragment hypeFragment = new HypeFragment();
                return hypeFragment;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }

}
