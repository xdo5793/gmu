public class cloudCustomers {

   // instance variable
   private int customerID;
   private static int lastCustomerID = 1000;
   // instance variable
   private String name;
   // instance variable
   private String phoneNumber;
   // instance variable
   private String emailAddress;
   // constant
   public static final int MAX_CUSTOMERS = 1000;
   // static variable number of customers
   public static int numCustomers;
   // instance variable
   private String corporateDiscount;
   
   // object 
   private virtualMachine virtualmachine;
    
   

   
// Method purpose : constructor, set default values for an object
//Parameter(s) passed : none 
//Return types : none
   public cloudCustomers(virtualMachine virtualmachine) {
      this.customerID = lastCustomerID++;
      this.name = "";
      this.phoneNumber = "";
      this.emailAddress = "";
      this.corporateDiscount = "";
      this.virtualmachine = virtualmachine;
      ++numCustomers;
   }

//Method purpose : accessor, gets the value of customerID from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : String 
   public int getCustomerID() { 
      return this.customerID; }

   
//Method purpose : accessor, gets the value of name from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : String 
   public String getName() { 
      return this.name; }
   
//Method purpose : accessor, gets the value of cellphone number from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : String
   public String getPhoneNumber() { 
      return this.phoneNumber; }
      
//Method purpose : accessor, gets the value of email address from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : String
   public String getEmailAddress() { 
      return this.emailAddress; }      
   
 //Method purpose : accessor, gets the value of whether or not a customer has a corporate discount from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : int 
   public String getCorporateDiscount() { 
      return corporateDiscount; }   
   
//Method purpose : accessor, gets the value of number of participants from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : int 
   public static int getNumCustomers() { 
      return numCustomers; }  
 
//Method purpose : accessor, gets the value of number of participants from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : int 
   public virtualMachine getVirtualMachine() { 
      return this.virtualmachine; }      
      
      


    
//Method purpose : mutator, sets the value of name within an object of the class based on information passed into it
//Parameter(s) passed : String name
//Return types : String
   public String setName(String name) {
      if (name == null || name.equals("")) {
         
         throw new IllegalArgumentException("A name must be provided");
         // parameters for user input
               // exception handling and error message
      }
      this.name = name;
      return name;
   }
   
//Method purpose : mutator, sets the value of cellphone number within an object of the class based on information passed into it
//Parameter(s) passed : String cellphoneNumber 
//Return types : String 
   public String setPhoneNumber(String phoneNumber) {
      if (phoneNumber == null || phoneNumber.equals("")) {
         throw new IllegalArgumentException("A phone number must be provided");
         // parameters for user input
               // exception handling and error message
      }
      this.phoneNumber = phoneNumber;
      return phoneNumber;
   }
    
  //Method purpose : mutator, sets the value of email address within an object of the class based on information passed into it
//Parameter(s) passed : String emailAddress 
//Return types : String 
   public String setEmailAddress(String emailAddress) {
      if (emailAddress == null || emailAddress.equals("")) {
         throw new IllegalArgumentException("An email address must be provided");
         // parameters for user input
               // exception handling and error message
      }
      this.emailAddress = emailAddress;
      return emailAddress;
   }    

//Method purpose : mutator, sets the value of whether or not a customer has a corporate discount within an object of the class based on information passed into it
//Parameter(s) passed : String corporate discount 
//Return types : String 
   public String setCorporateDiscount(String corporateDiscount) {
      if (corporateDiscount.equalsIgnoreCase("yes") || corporateDiscount.equals("no")) {
         this.corporateDiscount = corporateDiscount;
         return corporateDiscount;
      }
      else {
         throw new IllegalArgumentException("A yes or no must be provided");
         // parameters for user input
               // exception handling and error message
      }
   } 
   
//Method purpose : mutator, sets the value of whether or not a customer has a corporate discount within an object of the class based on information passed into it
//Parameter(s) passed : String corporate discount 
//Return types : String
   public void setVirtualMachine(virtualMachine virtualmachine) {
      this.virtualmachine = virtualmachine;
   } 
      
     
    
//Method purpose : print a receipt of the customer ID, name, phone number, email address, and whether or not the customer has a corporate discount.
//Parameter(s) passed : none
//Return types : void 
   public String toString() {
      return   " | " + this.getCustomerID()
            + " | " + this.getName()
            + " | " + this.getPhoneNumber() 
            + " | " + this.getEmailAddress() 
            + " | " + this.getCorporateDiscount();
   }    
    
    
    
    
    
    
    
      
 
   
   
}