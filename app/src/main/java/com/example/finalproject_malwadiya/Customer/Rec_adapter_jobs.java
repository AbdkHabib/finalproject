package com.example.finalproject_malwadiya.Customer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject_malwadiya.R;
import com.example.finalproject_malwadiya.RecycleViewOnItemClick;

import java.util.ArrayList;

public class  Rec_adapter_jobs extends RecyclerView.Adapter <Rec_adapter_jobs.jobsViewHolder>{


    ArrayList<jobs> job;
    private RecycleViewOnItemClick recycleViewOnItemClick;

    public Rec_adapter_jobs(ArrayList<jobs> job, RecycleViewOnItemClick recycleViewOnItemClick) {
        this.job = job;
        this.recycleViewOnItemClick = recycleViewOnItemClick;
    }

    @NonNull
    @Override
    public jobsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=  LayoutInflater.from(parent.getContext()).inflate(R.layout.jobs_custom_item,null,false);
        jobsViewHolder ViewHolder = new jobsViewHolder(v);
        return ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull jobsViewHolder holder, int position) {
        jobs c =job.get(position);
        holder.name.setText(c.getName());
        holder.count.setText(c.getCount());
        holder.details.setText(c.getnum_staff());
        holder.imageView.setImageResource(c.getImage());
    }
   
    @Override
    public int getItemCount() {
        return 0;
    }

    class jobsViewHolder extends  RecyclerView.ViewHolder{
        TextView name;
        TextView count;
        TextView details;
        ImageView imageView;
        public jobsViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.job_tv_job_name);
            count = itemView.findViewById(R.id.job_tv_count);
            details = itemView.findViewById(R.id.job_tv_num_staff);
            imageView = itemView.findViewById(R.id.job_imageView4);
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