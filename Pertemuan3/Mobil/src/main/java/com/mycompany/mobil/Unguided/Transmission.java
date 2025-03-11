/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mobil.Unguided;

/**
 *
 * @author win
 */
public class Transmission {
    private String type; // Jenis Mobil Manual atau Automatic
    
    public Transmission(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void changeGear(int gear) {
        System.out.println("Transmisi " + type + " berpindah ke gigi " + gear);
    }
}

