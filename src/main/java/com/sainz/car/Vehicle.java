package com.sainz.car;

public class Vehicle {

    private int year;
    private String model;



    public String start(){
        return "A vehicle starts...";
    }
    public String go(){
        return "Now it's moving...";
    }
    public String stop() {
        return "A vehicle brakes...";
    }
//Getters and Setter herr
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}


