package com.company;

import com.company.Driver;
import java.time.LocalDate;

public class Driver implements CarDriver, DriverLicense{

    private LocalDate expirationDate;
    private LicenseCategory category;
    private Driver driver;

    public Driver(LocalDate expirationDate, LicenseCategory category){
        this.expirationDate = expirationDate;
        this.category = category;
    }

    public enum LicenseCategory {
        B, C, D
    };

    @Override
    public LicenseCategory category() {
        return category;
    }

    @Override
    public LocalDate expirationDate() {
        return expirationDate;
    }


    public void startCar() {
            pushButtonToStart();
    }

    public void stopCar() {
            pushButtonToStop();
    }

    @Override
    public void pushButtonToStart() {
        System.out.println("Car is started!");
    }

    @Override
    public void pushButtonToStop() {
        System.out.println("Car is stopped!");
    }

public String toString() {
        return "{Driver:expiration date = "+expirationDate+", category = "+category+"}";
}
}
