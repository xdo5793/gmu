public class BitcoinMiner extends virtualMachine {

   // instance variable
   public int numberGPU;
      // instance variable
   private String brandGPU;
   
      // constant
   public final static int MAX_NUM_GPU = 8;
   
   
      // Method purpose : constructor, set default values for an object
   //Parameter(s) passed : none 
   //Return types : none
   public BitcoinMiner() {
      super();
      this.numberGPU = 0;  
      this.brandGPU = "";  
   }
   
      //Method purpose : accessor, gets the value of the hourly rate for service performed from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : int   
   public int getNumberGPU() { 
      return this.numberGPU; }
   
   
   //Method purpose : accessor, gets the value of name from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : String
   public String getBrandGPU() { 
      return this.brandGPU; }
      
      //Method purpose : mutator, sets the value of the amount of service hours performed within an object of the class based on information passed into it
//Parameter(s) passed : int serviceHours
//Return types : boolean   
   public int setNumberGPU(int numberGPU) {
      if (numberGPU < 0 || numberGPU > 8) {
         throw new IllegalArgumentException("A number of GPUs must be provided");
         // parameters for user input
               // exception handling and error message
      }
      this.numberGPU = numberGPU;
      return numberGPU;
   }
      
      
      //Method purpose : mutator, sets the value of day within an object of the class based on information passed into it
//Parameter(s) passed : String day
//Return types : boolean
   public String setBrandGPU(String brandGPU) {
      if (!brandGPU.equalsIgnoreCase("AMD") && !brandGPU.equalsIgnoreCase("nvidia")) {
         
         throw new IllegalArgumentException("A brand of GPU must be provided");
         // parameters for user input
               // exception handling and error message
      }
     
      
      this.brandGPU = brandGPU;
      return brandGPU;
   }
   



//Method purpose : compute the cost of total amount of monthly fees incurred after the corporate discount
//Parameter(s) passed : none
//Return types : double
   public double calcMonthlyFee() {
      double cost = 0;
      if (brandGPU.equalsIgnoreCase("AMD")) {
         cost = numberGPU*10;
      } else {
         cost = 15;
      }
      
      return cost;    
   }


//Method purpose : compute the cost of total amount of monthly fees incurred 
//Parameter(s) passed : none
//Return types : double
   public double calcDiscountedFee() {
            double cost = 0;
      if (brandGPU.equalsIgnoreCase("AMD")) {
         cost = numberGPU*10*0.8;
      } else {
         cost = 15*0.8;
      }
      
      return cost;    
   }
   
   public String toString() {
      return super.toString() + " | " + this.getNumberGPU()
            + " | " + this.getBrandGPU();

   }
   
}