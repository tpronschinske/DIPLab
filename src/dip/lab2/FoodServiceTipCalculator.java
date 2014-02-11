package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator {
    
    private double billEntry = 0.0;
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
    
    
    public final void setCustomServiceTip(double billEntry, double customRate){
        tip = billEntry * customRate;
    }
    
    
    public final void setServiceTip(double billEntry, String Rating){
        switch (Rating) {
            case "Good":
                tip = billEntry * goodRate;
                break;
            case "Fair":
                tip = billEntry * fairRate;
                break;
            case "Poor":
                tip = billEntry * poorRate;
                break; 
        }
    }


    public double getBillEntry() {
        return billEntry;
    }

    public void setBillEntry(double billEntry) {
        this.billEntry = billEntry;
    }

   
   

}
