/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author win
 */

public class Patient {
    private String id;
    private String nama;
    private int age;
    private String diagnosis;

    public Patient(String id, String nama, int age, String diagnosis) {
        if (!DataChecker.isValidId(id) || !DataChecker.isValidName(nama)) {
            throw new IllegalArgumentException("Invalid ID or Name!");
        }
        this.id = id;
        this.nama = nama;
        this.age = age;
        this.diagnosis = diagnosis;
        DiagnosisCounter.addDiagnosis(diagnosis);
    }

    public String getId() { 
        return id; 
    }

    public void setId(String id) { 
        if (DataChecker.isValidId(id)) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("Invalid ID!");
        }
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
        DiagnosisCounter.addDiagnosis(diagnosis);
    }
}
