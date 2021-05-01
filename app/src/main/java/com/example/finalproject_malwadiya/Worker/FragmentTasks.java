package com.example.finalproject_malwadiya.Worker;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.finalproject_malwadiya.Customer.Jobs;
import com.example.finalproject_malwadiya.Customer.RecycleViewAdapterJobs;
import com.example.finalproject_malwadiya.R;
import com.example.finalproject_malwadiya.RecycleViewOnItemClick;

import java.util.ArrayList;


public class FragmentTasks extends Fragment {

    public FragmentTasks() {
    }
    public static FragmentTasks newInstance() {
        FragmentTasks fragment = new FragmentTasks();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment__tasks, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        RecyclerView rv =view.findViewById(R.id.rv_tasks);
        ArrayList<Tasks> tasks =new ArrayList<>();
        RecyclerView.LayoutManager lm2=new LinearLayoutManager(getActivity());

        RecycleViewAdapterTasks adapter   =new RecycleViewAdapterTasks(tasks, new RecycleViewOnItemClick() {
            @Override
            public void onItemClick(int position) {

            }

            @Override
            public void onLongItemClick(int position) {
            }
        });
        rv.setHasFixedSize(true);
        rv.setLayoutManager(lm2);
    }
}