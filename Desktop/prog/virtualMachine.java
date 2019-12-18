public abstract class virtualMachine {


   // constant
   public static final int DEFAULT_COST = 20;
      // constant
   public static final int DEFAULT_MEMORY = 8;
      // constant
   public static final int DEFAULT_STORAGE = 20;
   
   
      // Method purpose : constructor, set default values for an object
   //Parameter(s) passed : none 
   //Return types : none
   public virtualMachine() {
   
      // empty?
      
   }
      
      
//Method purpose : compute the cost of total amount of monthly fees incurred 
//Parameter(s) passed : none
//Return types : double
   public abstract double calcMonthlyFee() ;    
    
//Method purpose : compute the cost of total amount of monthly fees incurred after the corporate discount
//Parameter(s) passed : none
//Return types : double
   public abstract double calcDiscountedFee() ;     
    
//Method purpose : print a receipt of the customer ID, name, phone number, email address, and whether or not the customer has a corporate discount.
//Parameter(s) passed : none
//Return types : void 
   public String toString() {
      return "";
   }  
   }    
    
    

   
