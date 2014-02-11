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
public class CaddieServiceTipCalculator implements TipCalculator {
    
    private double billEntry;
    private double tip;
    private final double goodRate = 0.25;
    private final double fairRate = 0.20;
    private final double poorRate = 0.15;
    
    private String Rating;
    private final double caddieFee = 60.00;

    
    public CaddieServiceTipCalculator(){
        
    }
    
    
      @Override
    public final double getCustomServiceTip(){
        return tip;
    }
    
    
    public final void setCustomServiceTip(double billEntry, double customRate){
        tip = billEntry * customRate;
    }
    
    
      public final void setServiceTip(String Rating){
        switch (Rating) {
            case "Good":
                tip = caddieFee * goodRate;
                break;
            case "Fair":
                tip = caddieFee * fairRate;
                break;
            case "Poor":
                tip = caddieFee * poorRate;
                break; 
        }
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    public double getBillEntry() {
        return billEntry;
    }

    public void setBillEntry(double billEntry) {
        this.billEntry = billEntry;
    }
    
    @Override
     public final double getServiceTip(){
         return tip;
     }
}
