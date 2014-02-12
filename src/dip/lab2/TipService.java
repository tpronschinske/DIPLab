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
public class TipService {
    
    private TipCalculator tipCalculator;
    
    
    public TipService(TipCalculator calculateTip){
        
        tipCalculator = calculateTip;
    }
    
    
    public double getTipFromCalculator(){
        return tipCalculator.getServiceTip();
        
    }
    
}
