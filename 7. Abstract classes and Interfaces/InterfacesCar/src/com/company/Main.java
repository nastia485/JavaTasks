package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	Driver newDriver = new Driver(LocalDate.of(2024,8,23), Driver.LicenseCategory.B);
	Accumulator suitableAccumulator = new Accumulator(Accumulator.Dimension.MEDIUM);
	Garage greenGarage = new Garage(4, Garage.CarType.HATCHBACK);


        System.out.println(new Car(newDriver, suitableAccumulator, greenGarage));
        newDriver.startCar();
        newDriver.stopCar();
    }
}
