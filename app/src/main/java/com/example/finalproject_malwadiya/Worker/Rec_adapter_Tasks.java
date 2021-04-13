package com.example.finalproject_malwadiya.Worker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject_malwadiya.Customer.Rec_adapter_jobs;
import com.example.finalproject_malwadiya.Customer.jobs;
import com.example.finalproject_malwadiya.R;

import java.util.ArrayList;

public class Rec_adapter_Tasks extends RecyclerView.Adapter <Rec_adapter_Tasks.tasksViewHolder>{


    ArrayList<Tasks> task;

    public Rec_adapter_Tasks(ArrayList<Tasks> task) {
        this.task = task;
    }


    @NonNull
    @Override
    public Rec_adapter_Tasks.tasksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=  LayoutInflater.from(parent.getContext()).inflate(R.layout.tasks_custom_item,null,false);
        Rec_adapter_Tasks.tasksViewHolder ViewHolder = new Rec_adapter_Tasks.tasksViewHolder(v);
        return ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Rec_adapter_Tasks.tasksViewHolder holder, int position) {
        Tasks c =task.get(position);
        holder.address.setText(c.getDescribe());
        holder.date.setText(c.getDate());
        holder.name.setText(c.getName());
        holder.image.setImageResource(c.getImage());
        holder.accept.setText(c.getAccept());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class tasksViewHolder extends  RecyclerView.ViewHolder{


              TextView address;
              TextView date;
              ImageView image;
              TextView name;
               TextView accept;
               TextView Describe;
        public tasksViewHolder(@NonNull View itemView) {
            super(itemView);

            address = itemView.findViewById(R.id.tasks_tv_address);
            date = itemView.findViewById(R.id.tasks_tv_date);
            image = itemView.findViewById(R.id.tasks_img_problem);
            name = itemView.findViewById(R.id.tasks_tv_customer_name);
            accept = itemView.findViewById(R.id.tasks_btn_accept);
            Describe = itemView.findViewById(R.id.tasks_tv_Describe);
        }
    }
}
