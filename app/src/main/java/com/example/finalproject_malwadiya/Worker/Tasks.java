package com.example.finalproject_malwadiya.Worker;

public class Tasks {
    private String address;
    private String date;
    private int image;
    private String name;
    private String accept;
    private String Describe;

    public Tasks(String address, String date, int image, String name, String accept, String describe) {
        this.address = address;
        this.date = date;
        this.image = image;
        this.name = name;
        this.accept = accept;
        Describe = describe;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getAccept() {
        return accept;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }

    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String describe) {
        Describe = describe;
    }
}