/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mobil;

/**
 *
 * @author win
 */
public class PhoneAction {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.brand = "Samsung";
        phone1.yearRelease = 2020;

        Phone phone2 = new Phone();
        phone2.brand = "Apple";
        phone2.yearRelease = 2021;

        System.out.println("Phone 2 brand: " + phone2.brand);
        System.out.println("Phone 2 year: " + phone2.yearRelease);
        System.out.println("Phone 1 brand: " + phone1.brand);
        System.out.println("Phone 1 year: " + phone1.yearRelease);

        phone1.TurnOn();
        phone1.Call();
        phone1.SMS();
        phone1.TurnOff();
    }
}
