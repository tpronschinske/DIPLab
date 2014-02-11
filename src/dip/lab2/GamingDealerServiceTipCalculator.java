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
public class GamingDealerServiceTipCalculator implements TipCalculator {
        
    private double playerWinningsEntry = 0.0;
    private double tip = 0.0;
    private final double goodRate = 0.20;
    private final double fairRate = 0.15;
    private final double poorRate = 0.10;
    

    
    @Override
    public final double getServiceTip(){
        return tip;
    }
    
    
    @Override
    public final double getCustomServiceTip(){
        return tip;
    }
    
    
    public final void setCustomServiceTip(double playerWinningsEntry, double customRate){
        tip = playerWinningsEntry * customRate;
    }
    
    
    public final void setServiceTip(double playerWinningsEntry, String Rating){
        switch (Rating) {
            case "Good":
                tip = playerWinningsEntry * goodRate;
                break;
            case "Fair":
                tip = playerWinningsEntry * fairRate;
                break;
            case "Poor":
                tip = playerWinningsEntry * poorRate;
                break; 
        }
    }


    public double getPlayerWinningsEntry() {
        return playerWinningsEntry;
    }

    public void setPlayerWinningsEntry(double playerWinningsEntry) {
        this.playerWinningsEntry = playerWinningsEntry;
    }

}
