/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author win
 */
import Unguided.entities.Doctor;
import Unguided.entities.Patient;
import Unguided.entities.Appointment;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Doctor
        Doctor doctor = new Doctor("DOC001", "Dr Smith", "Cardiologist");

        // Membuat objek Patient
        Patient patient1 = new Patient("PAT001", "John Doe", 45, "Heart Disease");
        Patient patient2 = new Patient("PAT002", "Jane Doe", 30, "Heart Disease");
        Patient patient3 = new Patient("PAT003", "Alice", 25, "Diabetes");

        // Membuat objek Appointment
        Appointment appointment1 = new Appointment(doctor, patient1, "2025-04-10");
        Appointment appointment2 = new Appointment(doctor, patient2, "2025-04-11");
        Appointment appointment3 = new Appointment(doctor, patient3, "2025-04-12");

        // Menampilkan informasi janji temu
        System.out.println("Doctor: " + doctor.getNama() + " - " + doctor.getSpesialisasi());
        System.out.println("\nDaftar Appointment:");
        System.out.println("1.  " + patient1.getNama() + " - " + appointment1.getDate() + " - " + patient1.getDiagnosis());
        System.out.println("2.  " + patient2.getNama() + " - " + appointment2.getDate() + " - " + patient2.getDiagnosis());
        System.out.println("3.  " + patient3.getNama() + " - " + appointment3.getDate() + " - " + patient3.getDiagnosis());

        // Menampilkan statistik diagnosis
        DiagnosisCounter.printDiagnosisStats();
    }
}
