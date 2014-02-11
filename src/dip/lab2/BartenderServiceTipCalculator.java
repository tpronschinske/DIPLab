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
        
    private double customerBarBill = 0.0;
    private double bartenderTip = 0.0;
    private final double goodRate = 0.25;
    private final double fairRate = 0.20;
    private final double poorRate = 0.10;
    
    public BartenderServiceTipCalculator(){
        
    }
    

    @Override
    public final double getServiceTip(){
        return bartenderTip;
    }
    
    
    @Override
    public final double getCustomServiceTip(){
        return bartenderTip;
    }
    
    
    public final void setCustomServiceTip(double customerBarBill, double customRate){
        bartenderTip = customerBarBill * customRate;
    }
    
    
    public final void setServiceTip(double customerBarBill, String Rating){
        switch (Rating) {
            case "Good":
                bartenderTip = customerBarBill * goodRate;
                break;
            case "Fair":
                bartenderTip = customerBarBill * fairRate;
                break;
            case "Poor":
                bartenderTip = customerBarBill * poorRate;
                break; 
        }
    }


    public double getCustomerBarBill() {
        return customerBarBill;
    }

    public void setCustomerBarBill(double customerBarBill) {
        this.customerBarBill = customerBarBill;
    }

}
