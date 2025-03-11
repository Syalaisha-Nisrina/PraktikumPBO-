/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mobil.Unguided;

/**
 *
 * @author win
 */
public class Engine {
    private int horsepower;
    
    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void start() {
        System.out.println("Mesin dengan " + horsepower + " HP menyala.");
    }
}

