package com.example.finalproject_malwadiya.Customer;

public class Requests {
    private String name;
    private String date;
    private String adress;
    private String Describe;
    private String Status;
    private int imageView;

    public Requests(String name, String date, String adress, String describe, String status, int imageView) {
        this.name = name;
        this.date = date;
        this.adress = adress;
        Describe = describe;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String describe) {
        Describe = describe;
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
