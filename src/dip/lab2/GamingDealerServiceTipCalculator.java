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
    private String Rating;

    public GamingDealerServiceTipCalculator(String Rating, double playerWinningsEntry) {
        this.setRating(Rating);
        this.setPlayerWinningsEntry(playerWinningsEntry);
    }
    
    @Override
    public final double getServiceTip(){
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
        return tip;
    }
    
    public double getPlayerWinningsEntry() {
        return playerWinningsEntry;
    }

    public void setPlayerWinningsEntry(double playerWinningsEntry) {
        this.playerWinningsEntry = playerWinningsEntry;
    }

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }

    
    
}
