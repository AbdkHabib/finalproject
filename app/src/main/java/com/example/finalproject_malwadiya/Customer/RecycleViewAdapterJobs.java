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
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecycleViewAdapterJobs extends RecyclerView.Adapter <RecycleViewAdapterJobs.jobsViewHolder>{


    ArrayList<Jobs> job;
    private RecycleViewOnItemClick recycleViewOnItemClick;

    public RecycleViewAdapterJobs(ArrayList<Jobs> job, RecycleViewOnItemClick recycleViewOnItemClick) {
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
        Jobs c =job.get(position);
        holder.name.setText(c.getName());
        holder.count.setText(c.getCount());
        holder.numsrtuff.setText(c.getNum_staff());
        Picasso.get().load("https/").into(holder.imageView);
    }
   
    @Override
    public int getItemCount() {
        return 0;
    }

    class jobsViewHolder extends  RecyclerView.ViewHolder{
        TextView name;
        TextView count;
        TextView numsrtuff;
        ImageView imageView;
        public jobsViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.job_tv_job_name);
            count = itemView.findViewById(R.id.job_tv_count);
            numsrtuff = itemView.findViewById(R.id.job_tv_num_staff);
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