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
            
    private double salonStylistTip = 0.0;
    private final double goodRate = 0.25;
    private final double fairRate = 0.20;
    private final double poorRate = 0.10;
    
    
    
    
    @Override
    public final double getServiceTip(){
        return salonStylistTip;
    }
    
    @Override
    public final double getCustomServiceTip(){
        return salonStylistTip;
    }
    
    
    public final void setCustomServiceTip(double billEntry, double customRate){
        salonStylistTip = billEntry * customRate;
    }
       
  public final void setServiceTip(String ServiceType, String Rating){
        switch (ServiceType) {
            case "HairCut":
                switch (Rating) {
                    case "Good":
                        salonStylistTip = hairCut * goodRate;
                        break;
                    case "Fair":
                        salonStylistTip = hairCut * fairRate;
                        break;
                    case "Poor":
                        salonStylistTip = hairCut * poorRate;
                        break;
                        
                }
            case "HairCutPlusShampoo":
                switch (Rating) {
                    case "Good":
                        salonStylistTip = hairCutPlusShampoo * goodRate;
                        break;
                    case "Fair":
                        salonStylistTip = hairCutPlusShampoo * fairRate;
                        break;
                    case "Poor":
                        salonStylistTip = hairCutPlusShampoo * poorRate;
                        break;
                        
                }
            case "HairCutPlusColor":
                switch (Rating) {
                    case "Good":
                        salonStylistTip = hairCutPlusColor * goodRate;
                        break;
                    case "Fair":
                        salonStylistTip = hairCutPlusColor * fairRate;
                        break;
                    case "Poor":
                        salonStylistTip = hairCutPlusColor * poorRate;
                        break;
                }
        }
  }
}
