package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TipCalculator {
    
    private double billEntry = 0.0;
    private double tip;
    private final double goodRate = 0.25;
    private final double fairRate = 0.20;
    private final double poorRate = 0.10;
    private double baseTipPerBag = 1.00;
    private int bagCount;
    
    
    public BaggageServiceTipCalculator() {
    
    }
    
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
                tip = billEntry * goodRate + (baseTipPerBag * bagCount);
                break;
            case "Fair":
                tip = billEntry * fairRate + (baseTipPerBag * bagCount);
                break;
            case "Poor":
                tip = billEntry * poorRate + (baseTipPerBag * bagCount);
                break; 
        }
    }

  
    public double getBillEntry() {
        return billEntry;
    }

    public void setBillEntry(double billEntry) {
        this.billEntry = billEntry;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag * bagCount;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        this.baseTipPerBag = baseTipPerBag;
    }

    public int getBagCount() {
        return bagCount;
    }

    public void setBagCount(int bagCount) {
        this.bagCount = bagCount;
    }
}
