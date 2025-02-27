/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

/**
 *
 * @author rober
 */

interface Vehicle {
    void displayType();
    public String getModel();
    public String getDriver();
    public String[] getPassengers();
}

abstract class Car implements Vehicle {
    private String model;
    private String driver;
    private String[] passengers;
    private int passCount;
    
    public Car(String model, String driver) {
        this.model = model;
        this.driver = driver;
        this.passengers = new String[3];
        this.passCount = 0;
    }
    
    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getDriver() {
        return driver;
    }

    @Override
    public String[] getPassengers() {
        return passengers;
    }
    
    public void addPassenger(String passenger) {
        if (passCount < passengers.length) {
            passengers[passCount++] = passenger;
        } else {
            System.out.println("Car is full! Cannot add more passengers.");
        }
    }
    
    public void fuel (int capacity) {
        System.out.println("Fueled with " + capacity + " liters.");
    }
       
    public void fuel (String type) {
        System.out.println("Fueled with " + type + ".");
    }
}

class ElectricCar extends Car {
    private int batteryCap;
    
    public ElectricCar(String model, String driver, int capacity) {
        super(model, driver);
        this.batteryCap = capacity;
    }
    
    @Override
    public void displayType() {
        System.out.println("Electric car ");
    }
    
}

class CombustionCar extends Car {
    private int fuelCap;
    
    public CombustionCar(String model, String driver, int capacity) {
        super(model, driver);
        this.fuelCap = capacity;
    }
}


public class Lab1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
