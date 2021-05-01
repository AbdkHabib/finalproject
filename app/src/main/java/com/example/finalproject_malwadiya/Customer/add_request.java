package com.example.finalproject_malwadiya.Customer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.finalproject_malwadiya.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class add_request extends AppCompatActivity {
    private static final int RESULT = 1;
    Spinner spinner;
    EditText adress, Describe;
    ImageView img_add;
    Map<String,Object> add_newCorporation ;
    Button button_add;
    private Uri uri;
    FirebaseFirestore dp ;
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

        String c = i.getStringExtra("img");
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
                if(!adress.getText().toString().isEmpty()&& !Describe.getText().toString().isEmpty()) {
                    addtofirebase();
                }
                else {
                    Toast.makeText(add_request.this, "Fill in the fields", Toast.LENGTH_SHORT).show();

                String date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
                String time = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date());

                Add requests=new Add("",date,time,adress.getText().toString(),"","");


            }
        }
        private void addtofirebase() {
            FirebaseStorage storage = FirebaseStorage.getInstance("gs://finalproject-bd0f4.appspot.com");

            add_newCorporation = new HashMap<>();
            add_newCorporation.put("adress", adress.getText().toString());
            add_newCorporation.put("Describe", Describe.getText().toString());
            add_newCorporation.put("spinner", spinner.getSelectedItem().toString());
            add_newCorporation.put("spinner", spinner.getSelectedItem().toString());
            users.put("Image", url.toString());

            dp.collection("add_reservation").add(add_newCorporation)
                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Toast.makeText(add_request.this, " onSuccess ",
                                    Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getBaseContext(), FragmentJobs.class);
                            startActivity(intent);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(add_request.this, " onFailure ", Toast.LENGTH_SHORT).show();
                }
            });
        }
        });
    }
}
