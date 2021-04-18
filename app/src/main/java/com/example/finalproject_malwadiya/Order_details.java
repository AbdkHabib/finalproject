package com.example.finalproject_malwadiya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.finalproject_malwadiya.Customer.add_request;
import com.squareup.picasso.Picasso;

public class Order_details extends AppCompatActivity {
TextView details,job_name,customer_name,date;
Button edit;
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);
        details=findViewById(R.id.tv_details_details);
        job_name=findViewById(R.id.tv_details_jobname);
        customer_name=findViewById(R.id.tv_details_customername);
        date=findViewById(R.id.tv_details_date);
        edit=findViewById(R.id.details_btn_accept);
        img=findViewById(R.id.img_order);


        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(), add_request.class);
                intent.putExtra("details",details.getText().toString());
                intent.putExtra("customer_name",customer_name.getText().toString());
                intent.putExtra("img",img.);

                startActivity(intent);
            }
        });
    }
}