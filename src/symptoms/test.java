/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package symptoms;

import java.io.Console;
import java.util.Scanner;

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
        System.out.println("Severity to life: " + illness.getSeverity());
        
        // testing random standard deviation to make sure calculation is right
        int total = 0;
        int randomArray[] = new int[] {5,5,3,0,0,0,0,0,1,3};
        
        for (int i = 0; i < randomArray.length; i++) {
            total = randomArray[i];
        }
        
        double mean = total / randomArray.length;
        double temp[] = new double[randomArray.length];
        
        for (int i = 0; i < randomArray.length; i++) {
            temp[i] = Math.pow((randomArray[i] - mean), 2);
        }
        
        double variance = 0;
        
        for (int i = 0; i < temp.length; i++) {
            variance += temp[i];
        }
        
        int severity = (int)Math.sqrt(variance);
        
        System.out.println(total + "\n" + mean + "\n" + variance + "\n" + severity);
    }
}
