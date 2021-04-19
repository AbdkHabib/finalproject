package com.example.finalproject_malwadiya.Worker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import com.example.finalproject_malwadiya.Customer.Fragment_Jobs;
import com.example.finalproject_malwadiya.Customer.MainCustomer;
import com.example.finalproject_malwadiya.Customer.MainCustomer;
import com.example.finalproject_malwadiya.Customer.Setting;
import com.example.finalproject_malwadiya.MyTab;
import com.example.finalproject_malwadiya.PagerAdapter;
import com.example.finalproject_malwadiya.R;
import com.example.finalproject_malwadiya.Customer.fragment_Requests;
import com.example.finalproject_malwadiya.MyTab;
import com.example.finalproject_malwadiya.PagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;

public class Main_worker extends AppCompatActivity {
  TabLayout TabLayout;
    ViewPager ViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_worker);
        TabLayout=findViewById(R.id.main_tablayout);
        ViewPager =findViewById(R.id.main_pager);

        //fragment
        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager());
        adapter .addTab(new MyTab("home", FragmentRequestsWorks.newInstance()));
        adapter.addTab(new MyTab("Processes",  FragmentTasks.newInstance()));


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
                startActivity(new Intent(getApplicationContext(), MainCustomer.class));
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
                Intent About=new Intent(this, SettingWorker.class);
                startActivity(About);

                return true;


            case R.id.menu_Sign_out:
                signOut();

                return true;
        }
        return false;

    }
    private void signOut() {
        FirebaseAuth.getInstance().signOut();

    }}