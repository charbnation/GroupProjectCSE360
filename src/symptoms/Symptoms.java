/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package symptoms;

import java.util.Scanner;

/**
 *
 * @author Benito
 */
public class Symptoms {
    Scanner scan = new Scanner(System.in);
    Illness illness;
    
    Symptoms() {
        illness = new Illness();
    }
    
    public void newSymptoms() {
        // Which pain category the patient has chosen and the pain rating
        int index = scan.nextInt();
        int pain = scan.nextInt();
        
        illness.setPainRating(index, pain);
    }
    
    private void calculateSD() {
        double mean, variance, sum, severity;
        int n = 10;
        mean = variance = sum = severity= 0;
        
        for (int i = 0; i < n; i++) {
            mean += illness.getPainRating(i);
        }
        mean /= n;
        
        for (int i = 0; i < n; i++) {
            variance = illness.getPainRating(i) - mean;
            sum += variance * variance;
        }
        
        severity = Math.sqrt(sum / n);
        illness.setSeverity(severity);
        
        if (severity >= 1) {
            isEmergency(severity);
        }
    }
    
    public void isEmergency(double severity) {
        if (severity >= 2) {
            System.out.println("These symptoms are problematic consult" +
                    " healthcare.");
        }
        else {
            System.out.println("These symptoms are extremely severe" +
                    " consult healthcare immediately!");
        }
    }
    
    public void addToMedicalRecords() {
        String record = "";
        for (int i = 0; i < 10; i++) {
            record += illness.getIllnessName(i) + ": " 
                    + illness.getPainRating(i) + "\n";
        }
        
        // TODO: add logic to add this record into the patients DB
    }
}
