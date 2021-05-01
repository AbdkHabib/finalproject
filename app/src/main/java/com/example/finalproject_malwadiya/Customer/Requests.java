package com.example.finalproject_malwadiya.Customer;

public class Requests {
    private String name;
    private String date;
    private String adress;
    private String Describe;
    private String Status;
    private String imageURL;

    public Requests(String name, String date, String adress, String describe, String status, String imageURL) {
        this.name = name;
        this.date = date;
        this.adress = adress;
        Describe = describe;
        Status = status;
        this.imageURL = imageURL;
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

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
