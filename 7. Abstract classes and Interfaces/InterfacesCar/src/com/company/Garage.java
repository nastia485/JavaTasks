package com.company;

public class Garage implements PlaceForCar {
     private double length;
     private CarType type;

    public Garage(double length, CarType type) {
        this.length = length;
        this.type = type;
    }

    @Override
    public CarType type() {
        return type();
    }

    @Override
    public double length() {
        return length();
    }

    public enum CarType{
        SMALL, HATCHBACK, SEDAN, TRUCK
    }

    public String toString(){
        return "{Garage: length = "+length+", type of car = "+ type +"}";
    }

}
