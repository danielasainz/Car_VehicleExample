package com.sainz.car;

public class Truck extends Vehicle {

    private int torque;
    private String truckBed;

    public Truck() {
    }

    public Truck(int torque, String truckBed){
        this.torque = torque;
        this.truckBed = truckBed;
    }

    @Override
    public String start() {
        return "A truck starts...";
    }

    @Override
    public String go() {
        return "The truck goes...";
    }

    @Override
    public String stop() {
        return "A truck stops...";
    }

    public String pickup(){
        return "pick up stuff!!!";
    }
    public String dump (){
        return "Drop off stuff!";
    }
    public String cruise (){
        return "The truck cruises along";
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public String getTruckBed() {
        return truckBed;
    }

    public void setTruckBed(String truckBed) {
        this.truckBed = truckBed;
    }
}
