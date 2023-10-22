package com.dargoz.model;

public class Car {
    //variables
    private String color;
    private final int numberOfWheels;

    public Car(String color, int numberOfWheels) { //constructor
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void startEngine() { //method
        System.out.println("Engine Started");
    }

    public void stopEngine() {
        System.out.println("Engine Stopped");
    }

}
