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
public class SalanServiceTipCalculator implements TipCalculator {
    
    private final double hairCut = 15.95;
    private final double hairCutPlusShampoo = 21.95;
    private final double hairCutPlusColor = 31.85;
        
    private String ServiceType;
    private String Rating;
    private double tip = 0.0;
    private final double goodRate = 0.25;
    private final double fairRate = 0.20;
    private final double poorRate = 0.10;
    
    public SalanServiceTipCalculator(String ServiceType, String Rating){
        this.setServiceType(ServiceType);
        this.setRating(Rating);
    }
    
    
    @Override
    public final double getServiceTip(){
        switch (ServiceType) {
            case "HairCut":
                switch (Rating) {
                    case "Good":
                        tip = hairCut * goodRate;
                        break;
                    case "Fair":
                        tip = hairCut * fairRate;
                        break;
                    case "Poor":
                        tip = hairCut * poorRate;
                        break;
                        
                }
            case "HairCutPlusShampoo":
                switch (Rating) {
                    case "Good":
                        tip = hairCutPlusShampoo * goodRate;
                        break;
                    case "Fair":
                        tip = hairCutPlusShampoo * fairRate;
                        break;
                    case "Poor":
                        tip = hairCutPlusShampoo * poorRate;
                        break;     
                }
            case "HairCutPlusColor":
                switch (Rating) {
                    case "Good":
                        tip = hairCutPlusColor * goodRate;
                        break;
                    case "Fair":
                        tip = hairCutPlusColor * fairRate;
                        break;
                    case "Poor":
                        tip = hairCutPlusColor * poorRate;
                        break;
                }
        }
        return tip;
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

    public String getServiceType() {
        return ServiceType;
    }

    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    
  }

