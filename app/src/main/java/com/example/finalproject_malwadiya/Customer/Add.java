package com.example.finalproject_malwadiya.Customer;

public class Add {
    private String adress;
    private String Describe;
    private String jobs;
    private String date;
    private String time;
    private String imageURL;

    public Add(String adress, String describe, String jobs, String date, String time, String imageURL) {
        this.adress = adress;
        Describe = describe;
        this.jobs = jobs;
        this.date = date;
        this.time = time;
        this.imageURL = imageURL;
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

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
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

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
