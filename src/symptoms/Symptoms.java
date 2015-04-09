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
    
    /*
     * This method will be called by the GUI. When calling this method from 
     * the GUI the first parameter will be which illness they are currently
     * suffering from such as: pain, depression, shortness of breath etc.
     * this will be passed as an int. So if the slider/textfield for depression
     * is the third one then this will be passed in as an int of 2. 
    */
    public void newSymptoms(int illnessIndex, int pain_rating) {
        illness.setPainRating(illnessIndex, pain_rating);
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
            System.out.println("These symptoms are extremely severe" +
                " consult healthcare immediately!");
        }
        else {
            
            System.out.println("These symptoms are problematic consult" +
                " healthcare.");
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
