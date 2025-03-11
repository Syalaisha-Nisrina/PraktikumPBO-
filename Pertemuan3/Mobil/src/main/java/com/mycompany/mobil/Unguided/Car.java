/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mobil.Unguided;

/**
 *
 * @author win
 */
public class Car {
    private String brand;
    private Engine engine;
    private Transmission transmission;
    private FuelTank fuelTank;

    public Car(String brand, Engine engine, Transmission transmission, FuelTank fuelTank) {
        this.brand = brand;
        this.engine = engine;
        this.transmission = transmission;
        this.fuelTank = fuelTank;
    }

    public void startCar() {
        System.out.println("Mobil " + brand + " dinyalakan.");
        engine.start();
    }

    public void drive(int gear, double distance) {
        if (fuelTank.useFuel(distance)) {
            System.out.println("Mobil " + brand + " berjalan sejauh " + distance + " km.");
            transmission.changeGear(gear);
        } else {
            System.out.println("Mobil tidak bisa berjalan karena bahan bakar habis.");
        }
    }

    public void refuel(double amount) {
        fuelTank.refuel(amount);
    }

    public void showSpecs() {
        System.out.println("Mobil: " + brand);
        System.out.println("Mesin: " + engine.getHorsepower() + " HP");
        System.out.println("Transmisi: " + transmission.getType());
        System.out.println("Bahan Bakar Tersisa: " + fuelTank.getFuelLevel() + " liter");
    }
}

