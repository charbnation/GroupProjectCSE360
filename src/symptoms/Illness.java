/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package symptoms;

import java.util.Arrays;

/**
 *
 * @author Benito
 */
public class Illness {
    private final String[] illness_name;
    private final int[] pain_rating;
    private int severity;
    
    Illness() {
        this.illness_name = new String[] {"pain",
            "tiredness", "nausea", "depression",
            "anxiety", "drowsiness", "appetite",
            "wellbeing", "shortness of breath",
            "other"
        };
        this.pain_rating = new int[10];
        this.severity = 0;
        Arrays.fill(pain_rating, 0);
    }
    
    public String getIllnessName(int index) {
        return this.illness_name[index];
    }
    
    public int getPainRating(int index) {
        return this.pain_rating[index];
    }
    
    public int getSeverity() {
        return this.severity;
    }
    
    public void setPainRating(int index, int rate) {
        this.pain_rating[index] = rate;
    }
    
    public void setSeverity(int ix) {
        this.severity = ix;
    }
}
