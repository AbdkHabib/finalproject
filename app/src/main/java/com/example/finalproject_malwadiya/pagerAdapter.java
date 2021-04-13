package com.example.finalproject_malwadiya;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.finalproject_malwadiya.my_tab;

import java.util.ArrayList;

public class pagerAdapter extends FragmentStatePagerAdapter {
    ArrayList<my_tab>tabs=new ArrayList<>();

    public pagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }
    public void addtab(my_tab tab){
        tabs.add(tab);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return tabs.get(position).getFragment();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTabname();
    }

    public void addTab(my_tab tab) {
        tabs.add(tab);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }
}
