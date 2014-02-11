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
public class ValetServiceTipCalculator implements TipCalculator {
    
    private double customerValetBill = 0.0;
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
    
    
    public final double setCustomServiceTip(double customerValetBill, double customRate){
        return tip = customerValetBill * customRate;
    }
    
    public final void setServiceTip(double customerValetBill, String Rating){
        switch (Rating) {
            case "Good":
                tip = customerValetBill * goodRate;
                break;
            case "Fair":
                tip = customerValetBill * fairRate;
                break;
            case "Poor":
                tip = customerValetBill * poorRate;
                break; 
        }
    }


    public double getCustomerValetBill() {
        return customerValetBill;
    }

    public void setCustomerValetBill(double customerValetBill) {
        this.customerValetBill = customerValetBill;
    }
    
}
