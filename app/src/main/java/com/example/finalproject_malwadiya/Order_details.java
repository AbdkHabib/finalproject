package com.example.finalproject_malwadiya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.finalproject_malwadiya.Customer.add_request;

public class Order_details extends AppCompatActivity {
TextView name,details,jobname,customername,date;
Button edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);
        name=findViewById(R.id.tv_details_name);
        details=findViewById(R.id.tv_details_details);
        jobname=findViewById(R.id.tv_details_jobname);
        customername=findViewById(R.id.tv_details_customername);
        date=findViewById(R.id.tv_details_date);
        edit=findViewById(R.id.details_btn_accept);


        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add_res=new Intent(getBaseContext(), add_request.class);
                startActivity(add_res);
            }
        });
    }
}