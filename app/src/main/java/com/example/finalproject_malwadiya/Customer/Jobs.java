package com.example.finalproject_malwadiya.Customer;

public class Jobs {
    private String name;
    private String imageURL;
    private int count;
    private int num_staff;

    public Jobs(String name, String imageURL, int count, int num_staff) {
        this.name = name;
        this.imageURL = imageURL;
        this.count = count;
        this.num_staff = num_staff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getNum_staff() {
        return num_staff;
    }

    public void setNum_staff(int num_staff) {
        this.num_staff = num_staff;
    }
}
