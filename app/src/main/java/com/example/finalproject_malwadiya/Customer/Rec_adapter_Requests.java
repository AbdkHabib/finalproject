package com.example.finalproject_malwadiya.Customer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject_malwadiya.R;

import java.util.ArrayList;

public class Rec_adapter_Requests extends RecyclerView.Adapter <Rec_adapter_Requests.RequestsViewHolder>{


    ArrayList<Requests> Request;

    public Rec_adapter_Requests(ArrayList<Requests> Request) {
        this.Request = Request;
    }



    @NonNull
    @Override
    public RequestsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=  LayoutInflater.from(parent.getContext()).inflate(R.layout.requests_custom_item,null,false);
        RequestsViewHolder ViewHolder = new RequestsViewHolder(v);
        return ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RequestsViewHolder holder, int position) {
        Requests c =Request.get(position);
        holder.name.setText(c.getName());
        holder.date.setText(c.getDate());
        holder.adress.setText(c.getAdress());
        holder.Status.setText(c.getStatus());
        holder.imageView.setImageResource(c.getImageView());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class RequestsViewHolder extends  RecyclerView.ViewHolder{
        TextView name;
        TextView date;
        TextView adress;
        TextView Status;
        ImageView imageView;
        public RequestsViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.request_tv_name);
            date = itemView.findViewById(R.id.request_tv_date);
            adress = itemView.findViewById(R.id.request_tv_adresss);
            Status = itemView.findViewById(R.id.request_tv_Status);
            imageView = itemView.findViewById(R.id.request_imageView4);
        }
    }
}