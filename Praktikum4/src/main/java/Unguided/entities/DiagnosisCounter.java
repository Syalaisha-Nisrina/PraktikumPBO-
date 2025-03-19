/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author win
 */
import java.util.HashMap;
import java.util.Map;

public class DiagnosisCounter {
    private static Map<String, Integer> diagnosisCount = new HashMap<>();

    public static void addDiagnosis(String diagnosis) {
        diagnosisCount.put(diagnosis, diagnosisCount.getOrDefault(diagnosis, 0) + 1);
    }

    public static void printDiagnosisStats() {
        System.out.println("\nDiagnosis Count:");
        for (Map.Entry<String, Integer> entry : diagnosisCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
