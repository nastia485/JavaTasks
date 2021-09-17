package com.company;

public class Car {

    private Driver driver;
    private Accumulator accumulator;
    private Garage garage;

    public Car(Driver driver, Accumulator accumulator, Garage garage) {
        this.driver = driver;
        this.accumulator = accumulator;
        this.garage = garage;
    }


    @Override
    public String toString() {
        return "Car{"+"driver="+driver+", garage = "+garage+", accumulator = "+accumulator;
    }


}
