package com.example.finalproject_malwadiya.Customer;

import android.widget.ImageView;
import android.widget.TextView;

public class Requests {
    private String name;
    private String date;
    private String time;
    private String adress;
    private String Status;
    private int imageView;

    public Requests(String name, String date, String time, String adress, String status, int imageView) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.adress = adress;
        Status = status;
        this.imageView = imageView;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }
}
