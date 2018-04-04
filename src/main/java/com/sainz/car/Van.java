package com.sainz.car;

public class Van extends Vehicle {

    private int passengers;
    private int doors;

    public Van() {

    }


    public Van (int passengers, int doors) {
        this.passengers = passengers;
        this.doors = doors;
    }

    @Override
    public String start() {
        return "A van starts.";
    }

    @Override
    public String go() {
        return super.go();
    }

    @Override
    public String stop() {
        return "A van stops...";
    }
    public String transport(){
        return "A van transports stuff...";
    }
    public String pickup(){
        return "Van picks up passengers!";
    }
    public String gas() {
        return "Van driver stops for gas!";
    }
}
