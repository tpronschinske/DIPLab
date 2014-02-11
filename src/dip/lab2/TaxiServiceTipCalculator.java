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
    private final double goodRate = 0.25;
    private final double fairRate = 0.20;
    private final double poorRate = 0.10;
    
    
    
    
    
    @Override
    public final double getServiceTip(){
        return tip;
    }
    
    
    @Override
    public final double getCustomServiceTip(){
        return tip;
    }
    
    
    public final void setCustomServiceTip(double taxiRunningMeterBill, double customRate){
        tip = taxiRunningMeterBill * customRate;
    }
    
    
    public final void setServiceTip(double taxiRunningMeterBill, String Rating){
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
    }


    public double getTaxiRunningMeterBill() {
        return taxiRunningMeterBill;
    }

    public void setTaxiRunningMeterBill(double taxiRunningMeterBill) {
        this.taxiRunningMeterBill = taxiRunningMeterBill;
    }

}
