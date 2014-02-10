package dip.lab2;

public class Startup {
   
    public static void main(String[] args) {
        
   
       FoodServiceTipCalculator serverOne = new FoodServiceTipCalculator();
       
       serverOne.setServiceTip(127.85,"Good");
      
       System.out.println(serverOne.getServiceTip());
       
       
       BaggageServiceTipCalculator serverTwo = new BaggageServiceTipCalculator();
       
       serverTwo.setServiceTip(100.00, "Fair");
        
       System.out.println(serverTwo.getServiceTip());
        
        
       CaddieServiceTipCalculator serverThree = new CaddieServiceTipCalculator();
       
       serverThree.setServiceTip("Good");
       
       System.out.println(serverThree.getServiceTip());
        
     
        
    }

}
