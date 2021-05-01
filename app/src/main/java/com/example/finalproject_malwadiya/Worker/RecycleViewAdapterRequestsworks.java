package com.example.finalproject_malwadiya.Worker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject_malwadiya.Customer.RecycleViewAdapterJobs;
import com.example.finalproject_malwadiya.Customer.Requests;
import com.example.finalproject_malwadiya.Customer.Jobs;
import com.example.finalproject_malwadiya.R;
import com.example.finalproject_malwadiya.RecycleViewOnItemClick;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecycleViewAdapterRequestsworks extends RecyclerView.Adapter <RecycleViewAdapterRequestsworks.RequestsViewHolder>{


    ArrayList<RequestWorks> Request;
    private RecycleViewOnItemClick recycleViewOnItemClick;

    public RecycleViewAdapterRequestsworks(ArrayList<RequestWorks> request, RecycleViewOnItemClick recycleViewOnItemClick) {
        Request = request;
        this.recycleViewOnItemClick = recycleViewOnItemClick;
    }

    @NonNull
    @Override
    public RecycleViewAdapterRequestsworks.RequestsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=  LayoutInflater.from(parent.getContext()).inflate(R.layout.request_works_custom_item,null,false);
        RecycleViewAdapterRequestsworks.RequestsViewHolder ViewHolder = new RecycleViewAdapterRequestsworks.RequestsViewHolder(v);
        return ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewAdapterRequestsworks.RequestsViewHolder holder, int position) {
        RequestWorks c =Request.get(position);
        holder.address.setText(c.getDescribe());
        holder.date.setText(c.getDate());
        holder.name.setText(c.getName());

        Picasso.get().load("https/").into(holder.image);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class RequestsViewHolder extends  RecyclerView.ViewHolder {

        TextView address;
        TextView date;
        ImageView image;
        TextView name;
        TextView Describe;

        public RequestsViewHolder(@NonNull View itemView) {
            super(itemView);

            address = itemView.findViewById(R.id.requestwork_tv_address);
            date = itemView.findViewById(R.id.requestwork_tv_date);
            image = itemView.findViewById(R.id.requestwork_img_problem);
            name = itemView.findViewById(R.id.requestwork_tv_customer_name);
            Describe = itemView.findViewById(R.id.requestwork_tv_Describe);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    recycleViewOnItemClick.onItemClick(getAdapterPosition());
                }
            });

            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                public boolean onLongClick(View v) {
                    recycleViewOnItemClick.onLongItemClick(getAdapterPosition());
                    return true;
                }
            });
        }
    }
}
