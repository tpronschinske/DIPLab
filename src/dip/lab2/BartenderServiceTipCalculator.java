/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2;

/**
 *
 * @author Celeste
 */
public class BartenderServiceTipCalculator implements TipCalculator {
        
    private double billEntry = 0.0;
    private double tip = 0.0;
    private String Rating;
    private final double goodRate = 0.25;
    private final double fairRate = 0.20;
    private final double poorRate = 0.10;
    
    public BartenderServiceTipCalculator(String rating, double billEntry){
        this.setRating(rating);
        this.setBillEntry(billEntry);
    }
    

    @Override
    public final double getServiceTip(){
           switch (Rating) {
            case "Good":
                tip = billEntry * goodRate;
                break;
            case "Fair":
                tip = billEntry * fairRate;
                break;
            case "Poor":
                tip = billEntry * poorRate;
                break; 
        }
        return tip;
    
    }
    

    public String getRating() {
        return Rating;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }

    public double getBillEntry() {
        return billEntry;
    }

    public void setBillEntry(double billEntry) {
        this.billEntry = billEntry;
    }

   


}
