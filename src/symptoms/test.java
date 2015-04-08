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
        int temp[] = new int[] {5,3,3,0,0,0,0,0,1,3};
        int n = temp.length;
        double mean, variance, sum;
        mean = variance = sum = 0;
        
        for (int i = 0; i < n; i++) {
            mean += temp[i];
        }
        mean /= n;
        
        for(int i = 0; i < n; i++) {
            variance = temp[i] - mean;
            sum += variance * variance;
        }
        
        double severity = Math.sqrt(sum / n);
        
        System.out.println("Mean: " + mean + "\n" + "Variance: " 
                + variance + "\n" + "Severity: " + severity);
    }
}
