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
    private String Rating;
    
    
    public FoodServiceTipCalculator(String Rating, double billEntry){
        this.setRating(Rating);
        this.setBillEntry(billEntry);
    }
    
    @Override
    public final double getServiceTip(){
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
        return tip;
    }

    public double getBillEntry() {
        return billEntry;
    }

    public void setBillEntry(double billEntry) {
        this.billEntry = billEntry;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }
    


   
   

}
