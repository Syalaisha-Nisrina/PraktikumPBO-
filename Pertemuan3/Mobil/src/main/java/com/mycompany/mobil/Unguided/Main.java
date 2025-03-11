/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mobil.Unguided;

/**
 *
 * @author win
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Engine, Transmission, dan FuelTank
        Engine engine1 = new Engine(200);
        Transmission transmission1 = new Transmission("Automatic");
        FuelTank fuelTank1 = new FuelTank(10.0, 0.5); // 10 liter, konsumsi 0.5 liter/km

        // Membuat objek Car yang memiliki Engine, Transmission, dan FuelTank
        Car ku1 = new Car("Toyota Supra", engine1, transmission1, fuelTank1);

        // Menampilkan spesifikasi mobil
        ku1.showSpecs();

        // Menyalakan mobil dan mencoba berkendara
        ku1.startCar();
        ku1.drive(2, 15); // Coba berkendara sejauh 15 km

        // Isi ulang bahan bakar dan coba lagi
        ku1.refuel(10); // Isi ulang 10 liter
        ku1.drive(3, 10); // Berkendara sejauh 10 km

        // Cek kembali status bahan bakar
        ku1.showSpecs();
    }
}

