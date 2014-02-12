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
    private String Rating;
    
    
    public BaggageServiceTipCalculator(String rating, double billEntry, int bagCount) {
        this.setRating(rating);
        this.setBillEntry(billEntry);
        this.setBagCount(bagCount);
    }
    
    
    @Override
    public final double getServiceTip(){
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
        return tip;
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
