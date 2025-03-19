/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author win
 */
public class DataChecker {
    // Validasi ID harus terdiri dari huruf besar dan angka
    public static boolean isValidId(String id) {
        return id != null && id.matches("^[A-Z0-9]+$");
    }

    // Validasi Nama hanya boleh huruf dan spasi
    public static boolean isValidName(String name) {
        return name != null && name.matches("^[A-Za-z ]+$");
    }
}

