package com.example.finalproject_malwadiya.Worker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject_malwadiya.Customer.RecycleViewAdapterJobs;
import com.example.finalproject_malwadiya.Customer.Jobs;
import com.example.finalproject_malwadiya.R;
import com.example.finalproject_malwadiya.RecycleViewOnItemClick;

import java.util.ArrayList;

public class RecycleViewAdapterTasks extends RecyclerView.Adapter <RecycleViewAdapterTasks.tasksViewHolder>{


    ArrayList<Tasks> task;
private RecycleViewOnItemClick recycleViewOnItemClick;

    public RecycleViewAdapterTasks(ArrayList<Tasks> task, RecycleViewOnItemClick recycleViewOnItemClick) {
        this.task = task;
        this.recycleViewOnItemClick = recycleViewOnItemClick;
    }

    @NonNull
    @Override
    public RecycleViewAdapterTasks.tasksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=  LayoutInflater.from(parent.getContext()).inflate(R.layout.tasks_custom_item,null,false);
        RecycleViewAdapterTasks.tasksViewHolder ViewHolder = new RecycleViewAdapterTasks.tasksViewHolder(v);
        return ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewAdapterTasks.tasksViewHolder holder, int position) {
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
