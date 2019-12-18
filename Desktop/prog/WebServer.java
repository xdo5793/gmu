public class WebServer extends virtualMachine {

   // instance variable
   public int addMemory;
   
   // constant
   public int DISK_STORAGE; // default addMemory?
   // constant
   public final static int MAX_MEMORY = 128; // default storage?



   // Method purpose : constructor, set default values for an object
   //Parameter(s) passed : none 
   //Return types : none
   public WebServer() {
      super();
      this.addMemory = 0; // default addMemory?
      this.DISK_STORAGE = 0; // default storage?
   }
   
   //Method purpose : accessor, gets the value of the hourly rate for service performed from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : int   
   public int getAddMemory() { 
      return this.addMemory; }
      
//Method purpose : mutator, sets the value of the hourly rate for service performed within an object of the class based on information passed into it
//Parameter(s) passed : int hourlyRate
//Return types : boolean
   public int setAddMemory(int addMemory) {
      if (addMemory != 8 && addMemory != 16 && addMemory != 24 && addMemory != 32 && addMemory != 40 && addMemory != 48 && addMemory != 56 && addMemory != 64 && addMemory != 72 && addMemory != 80 && addMemory != 88 && addMemory != 96 && addMemory != 104 && addMemory != 112 && addMemory != 120 ) {
         throw new IllegalArgumentException("A accurate amount of additional memory must be provided");
         // parameters for user input
               // exception handling and error message
      }
      this.addMemory = addMemory;
      return addMemory;
   }
      
      
      


//Method purpose : compute the cost of total amount of monthly fees incurred after the corporate discount
//Parameter(s) passed : none
//Return types : double
   public double calcMonthlyFee() {
      return (this.addMemory/8)*10;    
   }


//Method purpose : compute the cost of total amount of monthly fees incurred 
//Parameter(s) passed : none
//Return types : double
   public double calcDiscountedFee() {
      return ((this.addMemory/8)*10)*0.8;    
   }
   
//Method purpose : print a receipt of the customer ID, name, phone number, email address, and whether or not the customer has a corporate discount.
//Parameter(s) passed : none
//Return types : void 
   public String toString() {
      return  super.toString() + " | " + this.getAddMemory()
            + " | " + this.DISK_STORAGE;
   }  
   
   
}