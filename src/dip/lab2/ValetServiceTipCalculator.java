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
    private String Rating;
    private final double goodRate = 0.25;
    private final double fairRate = 0.20;
    private final double poorRate = 0.10;
   
    public ValetServiceTipCalculator(String Rating, double customerValetBill){
        this.setRating(Rating);
        this.setCustomerValetBill(customerValetBill);
        
    }
    
    @Override
    public final double getServiceTip(){
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
        return tip;
    }


    public double getCustomerValetBill() {
        return customerValetBill;
    }

    public void setCustomerValetBill(double customerValetBill) {
        this.customerValetBill = customerValetBill;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }
    
    
    
}
