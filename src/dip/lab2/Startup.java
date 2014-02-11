package dip.lab2;

public class Startup {
   
    public static void main(String[] args) {
        
        //LSP
       TipCalculator golferOne = new CaddieServiceTipCalculator();
       
       golferOne.getServiceTip();
       
       System.out.println(golferOne.getServiceTip());
       

        //LSP
       TipCalculator humanOrder = new FoodServiceTipCalculator();
       
       humanOrder.getServiceTip();
       
       
       //LSP
       TipCalculator gamblerOne = new GamingDealerServiceTipCalculator();
       
       gamblerOne.getServiceTip();
       
       
       GamingDealerServiceTipCalculator humanGambler = new GamingDealerServiceTipCalculator();
       
       
       humanGambler.setServiceTip(5000.00, "Good");
       
        System.out.println(humanGambler.getServiceTip());
        
       FoodServiceTipCalculator serverOne = new FoodServiceTipCalculator();
       
       //double bill amount & String service(good/fair/poor)
       
       serverOne.setServiceTip(127.85,"Good");
      
       System.out.println(serverOne.getServiceTip());
       
       
       BaggageServiceTipCalculator serverTwo = new BaggageServiceTipCalculator();
       
       //double bill amount & String service(good/fair/poor)
       
       serverTwo.setServiceTip(100.00, "Fair");
        
       System.out.println(serverTwo.getServiceTip());
        
        
       CaddieServiceTipCalculator serverThree = new CaddieServiceTipCalculator();
       
       //pre-set caddie bag fee $60.00 & String Service (good/fair/poor)
       
       serverThree.setServiceTip("Good");
       
       System.out.println(serverThree.getServiceTip());
        
       
       SalanServiceTipCalculator customerOne = new SalanServiceTipCalculator();
       
       //salan service type (HairCut,HairCutPlusShampoo,HairCutPlusColor) & String Service (good/fair/poor)
       
       customerOne.setServiceTip("HairCut", "Good");
     
        
    }

}
