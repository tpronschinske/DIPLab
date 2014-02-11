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
    
    private double customerFoodBill = 0.0;
    private double tip = 0.0;
    private final double goodRate = 0.25;
    private final double fairRate = 0.20;
    private final double poorRate = 0.10;
    
    
    public FoodServiceTipCalculator(){
        
    }
    
    
    @Override
    public final double getServiceTip(){
        return tip;
    }
    
    
    @Override
    public final double getCustomServiceTip(){
        return tip;
    }
    
    
    public final void setCustomServiceTip(double customerFoodBill, double customRate){
        tip = customerFoodBill * customRate;
    }
    
    
    public final void setServiceTip(double customerFoodBill, String Rating){
        switch (Rating) {
            case "Good":
                tip = customerFoodBill * goodRate;
                break;
            case "Fair":
                tip = customerFoodBill * fairRate;
                break;
            case "Poor":
                tip = customerFoodBill * poorRate;
                break; 
        }
    }


    public double getCustomerFoodBill() {
        return customerFoodBill;
    }

    public void setCustomerFoodBill(double customerFoodBill) {
        this.customerFoodBill = customerFoodBill;
    }

   
   

}
