package com.example.finalproject_malwadiya.Worker;

import android.widget.ImageView;
import android.widget.TextView;

public class Request_Works {
    private String adriss;
    private String date;
    private int image;
    private String name;
    private String Describe;

    public Request_Works(String adriss, String date, int image, String name, String describe) {
        this.adriss = adriss;
        this.date = date;
        this.image = image;
        this.name = name;
        Describe = describe;
    }

    public String getAdriss() {
        return adriss;
    }

    public void setAdriss(String adriss) {
        this.adriss = adriss;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String describe) {
        Describe = describe;
    }
}
