/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package symptoms;

/**
 *
 * @author Benito
 */
public class test {
    public static void main(String[] args) {
        // Creating a new illness instance
        Illness illness = new Illness();
        
        /* 
         * Checking default illness values
         * illness names will not be changeable
         * pain rating will be changed depending on patients pain level
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("Illness name: " + illness.getIllnessName(i));
            System.out.println("Pain rating: " + illness.getPainRating(i) + "\n");
        }
        
        // Testing changing a pain rating for a certain illness and severity
        illness.setPainRating(5, 5);
        System.out.println("Illness name: " + illness.getIllnessName(5));
        System.out.println("Pain rating: " + illness.getPainRating(5) + "\n");
        
        // Testing severity and changing severity
        System.out.println("Severity to life: " + illness.getSeverity());
        illness.setSeverity(5);
        System.out.println("Severity to life: " + illness.getSeverity() + "\n");
        
        // Testing toString method for Illness class
        System.out.println(illness.toString());
        
        // Testing Symptoms class
        Symptoms symptoms = new Symptoms();
        // Pain, tiredness, nausea, depression, anxiety, drowsiness, "appetite,
        // wellbeing, shortness of breath, other
        symptoms.newSymptoms(0, 2);
        symptoms.newSymptoms(1, 3);
        symptoms.newSymptoms(2, 1);
        symptoms.newSymptoms(3, 0);
        symptoms.newSymptoms(4, 10);
        symptoms.newSymptoms(5, 2);
        symptoms.newSymptoms(6, 1);
        symptoms.newSymptoms(7, 5);
        symptoms.newSymptoms(8, 3);
        symptoms.newSymptoms(9, 1);
        
        symptoms.addToMedicalRecords();
    }
}
