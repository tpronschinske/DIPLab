package dip.lab2;

public class Startup {
   
    public static void main(String[] args) {
        
//        TipCalculator calculateTip = new BaggageServiceTipCalculator("Good",25.00,5); 
//        TipService service = new TipService(calculateTip);
//        double tip = service.getTipFromCalculator();
//        System.out.println("Your tip amount is: " + tip);
                
 
//        TipCalculator calculateTip = new FoodServiceTipCalculator("Fair", 38.50);    
//        TipService service = new TipService(calculateTip);
//        double tip = service.getTipFromCalculator();
//        System.out.println("Your tip amount is: " + tip);
        
        
//        TipCalculator calculateTip = new BartenderServiceTipCalculator("Fair", 38.50);    
//        TipService service = new TipService(calculateTip);
//        double tip = service.getTipFromCalculator();
//        System.out.println("Your tip amount is: " + tip);
//        
        
//          TipCalculator calculateTip = new CaddieServiceTipCalculator("Good");
//          TipService service = new TipService(calculateTip);
//          double tip = service.getTipFromCalculator();
//          System.out.println("Your tip amount is: " + tip);
//        
        
//          TipCalculator calculateTip = new SalanServiceTipCalculator("HairCut","Good");
//          TipService service = new TipService(calculateTip);
//          double tip = service.getTipFromCalculator();
//          System.out.println("Your tip amount is: " + tip);
            
//          TipCalculator calculateTip = new GamingDealerServiceTipCalculator("Fair", 1000.0);
//          TipService service = new TipService(calculateTip);
//          double tip = service.getTipFromCalculator();
//          System.out.println("Your tip amount is: " + tip);
        
//          TipCalculator calculateTip = new TaxiServiceTipCalculator("Poor", 48.97);
//          TipService service = new TipService(calculateTip);
//          double tip = service.getTipFromCalculator();
//          System.out.println("Your tip amount is: " + tip);
        
            TipCalculator calculateTip = new ValetServiceTipCalculator("Poor", 25.37);
            TipService service = new TipService(calculateTip);
            double tip = service.getTipFromCalculator();
            System.out.println("Your tip amount is: " + tip);
        
            
            
    }

}
