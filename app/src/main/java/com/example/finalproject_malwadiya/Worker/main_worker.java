package com.example.finalproject_malwadiya.Worker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.finalproject_malwadiya.Customer.Fragment_Jobs;
import com.example.finalproject_malwadiya.R;
import com.example.finalproject_malwadiya.Customer.fragment_Requests;
import com.example.finalproject_malwadiya.my_tab;
import com.example.finalproject_malwadiya.pagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class main_worker extends AppCompatActivity {
  TabLayout TabLayout;
    ViewPager ViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_worker);
        TabLayout=findViewById(R.id.main_tablayout);
        ViewPager =findViewById(R.id.main_pager);

        //fragment
        pagerAdapter adapter=new pagerAdapter(getSupportFragmentManager());
        adapter .addTab(new my_tab("home", Fragment_Requests_Works.newInstance(1,"home")));
        adapter.addTab(new my_tab("Processes",  Fragment_Tasks.newInstance(2,"Processes")));


        ViewPager.setAdapter(adapter);
        TabLayout.setupWithViewPager(ViewPager);

        TabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        ViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}