/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mobil.Unguided;

/**
 *
 * @author win
 */
public class FuelTank {
    private double fuelLevel; // dalam liter
    private double consumptionRate; // konsumsi bahan bakar per km (liter/km)

    public FuelTank(double fuelLevel, double consumptionRate) {
        this.fuelLevel = fuelLevel;
        this.consumptionRate = consumptionRate;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public boolean useFuel(double distance) {
        double fuelNeeded = distance * consumptionRate;
        if (fuelLevel >= fuelNeeded) {
            fuelLevel -= fuelNeeded;
            System.out.println("Bahan bakar berkurang: " + fuelNeeded + " liter.");
            return true;
        } else {
            System.out.println("Bahan bakar tidak cukup! Harap isi ulang.");
            return false;
        }
    }

    public void refuel(double amount) {
        fuelLevel += amount;
        System.out.println("Tangki diisi ulang sebanyak: " + amount + " liter.");
    }
}

