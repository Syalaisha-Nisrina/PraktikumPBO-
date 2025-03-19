/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author win
 */

public class Doctor {
    private String id;
    private String nama;
    private String spesialisasi;

    public Doctor(String id, String nama, String spesialisasi) {
        if (!DataChecker.isValidId(id) || !DataChecker.isValidName(nama)) {
            throw new IllegalArgumentException("Invalid ID or Name!");
        }
        this.id = id;
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (DataChecker.isValidName(nama)) {
            this.nama = nama;
        } else {
            throw new IllegalArgumentException("Invalid Name!");
        }
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }
}
