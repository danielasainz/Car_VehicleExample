package com.sainz.car;

public class Car extends Vehicle{

    private int horsePower;
    private int rimSize;
    private int speed;

    public Car() {

    }

    public Car(int horsePower, int rimSize){
        this.horsePower = horsePower;
        this.rimSize = rimSize;
    }

    @Override
    public String start() {
        return "A car starts...";
    }

    @Override
    public String go() {
        return "Now we're moving!";
    }

    @Override
    public String stop() {
        return "A car brakes...";
    }
//    3 Car Methods
    public String races(){
        return "Off to the races!!!";
    }

    public String spin(){
        return "The car spins out!";
    }
    public String wheelie(){
        return "The car does a wheelie";
    }


    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getRimSize() {
        return rimSize;
    }

    public void setRimSize(int rimSize) {
        this.rimSize = rimSize;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}