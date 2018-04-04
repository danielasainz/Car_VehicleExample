package com.sainz.car;

import java.util.Scanner;

public class VehicleApp {

        public static void main(String[] args) {
            String answer;
            int acc;
            Scanner scan = new Scanner(System.in);

            Car a = new Car(450, 22);
            Truck t = new Truck(6000, "flatbed");
            Van v = new Van(12, 3);

            //Enter Car info
            System.out.println("Enter your car model");
            a.setModel(scan.nextLine());
            System.out.println("Enter your car year");
            a.setYear(scan.nextInt());
            scan.nextLine();
            System.out.println("Your car is a " + a.getYear() + " " + a.getModel());
            System.out.println("Your car has " + a.getHorsePower() + "HP");
            System.out.println("Enter the current speed of your car in mph");
            a.setSpeed(scan.nextInt());
            scan.nextLine();
            System.out.println("Your car has a current speed of " + a.getSpeed() + "mph");
            //Enter Truck info
            print(t.start());
            print(t.go());
            System.out.println(a.wheelie() + " around the truck - do you want to spin out? (Y/N)");
            answer = scan.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                System.out.println(a.spin());
            } else {
                System.out.println("Cops are coming - how much faster do you want the car to go?");
                acc = a.getSpeed();
                a.setSpeed(acc + scan.nextInt());
                print("You are going " + a.getSpeed() + " mph now!");
            }
            print(v.start() + " " + v.go());
        }
        private static void print(String s){
            System.out.println(s);
        }
    }


