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
    
    public void calculateSeverity() {
        double severity = 0;
        
        for (int i = 0; i < 10; i++) {
            severity += illness.getPainRating(i);
        }
        double life_threating = severity / 10;
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
