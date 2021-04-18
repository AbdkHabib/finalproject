package com.example.finalproject_malwadiya.Customer;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.finalproject_malwadiya.R;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class add_request extends AppCompatActivity {
    private static final int RESULT = 1;
    Spinner spinner;
    TextView adress, Describe;
    ImageView img_add;
    Button button_add,button_edit;
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_request);
        spinner = findViewById(R.id.sp_addrequest);
        adress = findViewById(R.id.et_addrequest_adress);
        Describe = findViewById(R.id.et_addrequest_Describe);
        img_add = findViewById(R.id.img_add_request);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.Occupations,
                        android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        Intent i = getIntent();

        String a = i.getStringExtra("details");
        adress.setText(a);

        String b = i.getStringExtra("customer_name");
        Describe.setText(b);

        String c  i.getStringExtra("img");



        Picasso.get().load("").into(img_add);


        img_add.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {

                Intent intent = new Intent(
                        Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, RESULT);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case RESULT:
                if (null != data) {
                    uri = data.getData();
                    img_add.setImageURI(uri);
                }
                break;
        }


        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
                String time = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date());

                Requests requests=new Requests("",date,time,adress.getText().toString(),"",55);


            }
        });
    }

}
