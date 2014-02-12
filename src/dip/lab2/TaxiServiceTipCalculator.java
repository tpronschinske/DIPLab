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
public class TaxiServiceTipCalculator implements TipCalculator{
        
    private double taxiRunningMeterBill = 0.0;
    private double tip = 0.0;
    private String Rating;
    private final double goodRate = 0.25;
    private final double fairRate = 0.20;
    private final double poorRate = 0.10;
    
    
    public TaxiServiceTipCalculator(String Rating, double taxiRunningMeterBill){
        this.setRating(Rating);
        this.setTaxiRunningMeterBill(taxiRunningMeterBill);
    }
    
    
    @Override
    public final double getServiceTip(){
          switch (Rating) {
            case "Good":
                tip = taxiRunningMeterBill * goodRate;
                break;
            case "Fair":
                tip = taxiRunningMeterBill * fairRate;
                break;
            case "Poor":
                tip = taxiRunningMeterBill * poorRate;
                break; 
        }
        return tip;
    }

    public double getTaxiRunningMeterBill() {
        return taxiRunningMeterBill;
    }

    public void setTaxiRunningMeterBill(double taxiRunningMeterBill) {
        this.taxiRunningMeterBill = taxiRunningMeterBill;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }

    
}
