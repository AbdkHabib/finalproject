package com.example.finalproject_malwadiya.Customer;

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

import com.example.finalproject_malwadiya.R;

import java.util.ArrayList;


public class fragment_Requests extends Fragment {

    private static final String ARG_id= "id";
    private static final String ARG_name = "name";

    private int id;
    private String name;

    public fragment_Requests() {
    }
    public static fragment_Requests newInstance(int id, String name) {
        fragment_Requests fragment = new fragment_Requests();
        Bundle args = new Bundle();
        args.putInt(ARG_id, id);
        args.putString(ARG_name, name);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            id = getArguments().getInt(ARG_id);
            name = getArguments().getString(ARG_name);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment__requests, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        RecyclerView rv =view.findViewById(R.id.rv_request);
        ArrayList<Requests> Requests =new ArrayList<>();
        RecyclerView.LayoutManager lm2=new LinearLayoutManager(getActivity());
        rv.setHasFixedSize(true);
        rv.setLayoutManager(lm2);



    }


}