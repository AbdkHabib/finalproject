package com.example.finalproject_malwadiya.Customer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

import com.example.finalproject_malwadiya.R;
import com.example.finalproject_malwadiya.my_tab;
import com.example.finalproject_malwadiya.pagerAdapter;

import com.google.android.material.tabs.TabLayout;

public class main_Customer extends AppCompatActivity {
    TabLayout TabLayout;
    ViewPager ViewPager;

    Button btn_add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_customer);
        TabLayout=findViewById(R.id.main_tablayout);
        ViewPager =findViewById(R.id.main_pager);
        btn_add=findViewById(R.id.main_btn_add);


        //fragment
        pagerAdapter adapter=new pagerAdapter(getSupportFragmentManager());
        adapter .addTab(new my_tab("home", fragment_Requests.newInstance(1,"home")));
        adapter.addTab(new my_tab("Processes",  Fragment_Jobs.newInstance(2,"Processes")));


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





        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
   // menu
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
           getMenuInflater().inflate(R.menu.main_menu,menu);
            SearchView searchView =(SearchView) menu.findItem(R.id.main_search).getActionView();
            searchView.setSubmitButtonEnabled(true);
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    return false;
                }
            });
            searchView.setOnCloseListener(new SearchView.OnCloseListener() {
                @Override
                public boolean onClose() {
                    startActivity(new Intent(getApplicationContext(), main_Customer.class));
                    finish();
                    return false;
                }
            });

            return true;
        }

        @Override
        public boolean onOptionsItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.setting:
                    Intent About=new Intent(this, setting.class);
                    startActivity(About);

                    return true;

            }
            return false;

        }

    }
