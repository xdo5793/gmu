public class FileServer extends virtualMachine {

      // instance variable
   private String typeStorage;
         // instance variable
   private String typeStorageMedia;
   // instance variable
   public int amountStorage;
   
         // constant
   public final static int MAX_STORAGE = 1024; //terabyte not the 20 GB


      // Method purpose : constructor, set default values for an object
   //Parameter(s) passed : none 
   //Return types : none
   public FileServer() {
      super();
      this.typeStorage = "";
      this.typeStorageMedia = "";
      this.amountStorage = 0;  
        
   }
   
      //Method purpose : accessor, gets the value of name from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : String
   public String getTypeStorage() { 
      return this.typeStorage; }
      
            //Method purpose : accessor, gets the value of name from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : String
   public String getTypeStorageMedia() { 
      return this.typeStorageMedia; }
      
         
      //Method purpose : accessor, gets the value of the hourly rate for service performed from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : int   
   public int getAmountStorage() { 
      return this.amountStorage; }

      //Method purpose : mutator, sets the value of day within an object of the class based on information passed into it
//Parameter(s) passed : String day
//Return types : boolean
   public String setTypeStorage(String typeStorage) {
      if (!typeStorage.equalsIgnoreCase("block") && !typeStorage.equalsIgnoreCase("object")) {
         
         throw new IllegalArgumentException("Block or object must be provided");
         // parameters for user input
               // exception handling and error message
      }
     
      
      this.typeStorage = typeStorage;
      return typeStorage;
   }
   
         //Method purpose : mutator, sets the value of day within an object of the class based on information passed into it
//Parameter(s) passed : String day
//Return types : boolean
   public String setTypeStorageMedia(String typeStorageMedia) {
      if (!typeStorageMedia.equalsIgnoreCase("SSD") && !typeStorageMedia.equalsIgnoreCase("magnetic")) {
         
         throw new IllegalArgumentException("SSD or magnetic must be provided");
         // parameters for user input
               // exception handling and error message
      }
     
      
      this.typeStorageMedia = typeStorageMedia;
      return typeStorageMedia;
   }
   
   
         
      //Method purpose : mutator, sets the value of the amount of service hours performed within an object of the class based on information passed into it
//Parameter(s) passed : int serviceHours
//Return types : boolean   
   public int setAmountStorage(int amountStorage) {
      if (amountStorage < 0 || amountStorage > 1024) {
         throw new IllegalArgumentException("Amount of storage below 1024 terabytes must be provided");
         // parameters for user input
               // exception handling and error message
      }
      this.amountStorage = amountStorage;
      return amountStorage;
   }



//Method purpose : compute the cost of total amount of monthly fees incurred after the corporate discount
//Parameter(s) passed : none
//Return types : double
   public double calcMonthlyFee() {
            double cost = 0;
      if (typeStorageMedia.equalsIgnoreCase("SSD")) {
         cost = amountStorage*5;
      } else {
         cost = amountStorage*2;
      }
      
      return cost;     
   }


//Method purpose : compute the cost of total amount of monthly fees incurred 
//Parameter(s) passed : none
//Return types : double
   public double calcDiscountedFee() {
                  double cost = 0;
      if (typeStorageMedia.equalsIgnoreCase("SSD")) {
         cost = amountStorage*5*0.8;
      } else {
         cost = amountStorage*2*0.8;
      }
      
      return cost;   
   }
   
   public String toString() {
      return super.toString() + " | " + this.getTypeStorage()
            + " | " + this.getTypeStorageMedia();
   }
   
}