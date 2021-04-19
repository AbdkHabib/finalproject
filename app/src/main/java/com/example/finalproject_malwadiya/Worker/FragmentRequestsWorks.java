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

import com.example.finalproject_malwadiya.Customer.Requests;
import com.example.finalproject_malwadiya.Customer.Jobs;
import com.example.finalproject_malwadiya.R;

import java.util.ArrayList;


public class FragmentRequestsWorks extends Fragment {

    public FragmentRequestsWorks() {
    }
    public static FragmentRequestsWorks newInstance() {
        FragmentRequestsWorks fragment = new FragmentRequestsWorks();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment__requests__works, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rv =view.findViewById(R.id.rv_request_works);
        ArrayList<RequestWorks> request_works =new ArrayList<>();
        RecyclerView.LayoutManager lm2=new LinearLayoutManager(getActivity());
        rv.setHasFixedSize(true);
        rv.setLayoutManager(lm2);
    }
}