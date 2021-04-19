package com.example.finalproject_malwadiya.Customer;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.Toast;

import com.example.finalproject_malwadiya.R;
import com.example.finalproject_malwadiya.RecycleViewOnItemClick;

import java.util.ArrayList;

public class Fragment_Jobs extends Fragment implements RecycleViewOnItemClick {


    public Fragment_Jobs() {
    }
    public static Fragment_Jobs newInstance() {
        Fragment_Jobs fragment = new Fragment_Jobs();
        return fragment;
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment__jobs, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        RecyclerView rv =view.findViewById(R.id.rec_view_jobs);
        ArrayList<Jobs> jobs =new ArrayList<>();
        RecyclerView.LayoutManager lm2=new LinearLayoutManager(getActivity());
        rv.setHasFixedSize(true);
        rv.setLayoutManager(lm2);
    }

// click on rec_view to intent
    @Override
    public void onItemClick(int position) {
        Intent add_res=new Intent(getContext(),واجهة 6.class);
        startActivity(add_res);
    }

    @Override
    public void onLongItemClick(int position) {

    }
}