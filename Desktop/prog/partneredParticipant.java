  /*	
Name:	Xuan Do 
Date:	11/3/2019
Course and Section: IT 206 - DL1, 2D1
Assignment Number: 6

Description	of	program: Create a data definition class that allows users to register, enroll, and track 
participants of a certain age (35-50) who are eligible to enroll in GMU Computer Basics workshops. 
The application should store personal information such as the name, age, sex, cellphone number, and 
email address as well as number of partipants involved. These participants would be allowed the option 
to enroll in various different workshops. This is the data definition class that contains the instance variables, 
accessors, and mutators, constructors, and special purpose methods that are all necessary for the workshop 
program to register, enroll, and track personal information of the particiapnts. Lastly, this class should 
be able to print name, age, sex, cellphone number, email address, number of participants, workshops they are involved 
in, and the total bill. Error messages are provided if a mistake or exception is entered. 
*/

public class partneredParticipant extends participant {

// instance variable
   private String organizationName;
   // instance variable
   private double discount;

   // Method purpose : constructor, set default values for an object
//Parameter(s) passed : none 
//Return types : none
   public partneredParticipant() {
      super();
      this.organizationName = "";
      this.discount = 0.0;
   
   }

      //Method purpose : accessor, gets the value of organization name from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : String 
   public String getOrganizationName() { 
      return this.organizationName; }
      
            //Method purpose : accessor, gets the value of the discount from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : double
   public double getDiscount() {
      return this.discount; 
   }
      
         //Method purpose : mutator, sets the value of the organization name within an object of the class based on information passed into it
//Parameter(s) passed : String organizationName
//Return types : boolean 
   public boolean setOrganizationName(String organizationName) {
      if (organizationName == null || organizationName.equals("")) {
         throw new IllegalArgumentException("A organizationName must be provided");
         // parameters for user input
               // exception handling and error message
      }
      this.organizationName = organizationName;
      return true;
   }


   //Method purpose : mutator, sets the value of the discount within an object of the class based on information passed into it
//Parameter(s) passed : double discount
//Return types : boolean
   public boolean setDiscount(double discount) {
      if (discount < 0.0 || discount > 100.0) {
         throw new IllegalArgumentException("A organizationName must be provided");
         // parameters for user input
               // exception handling and error message
      }
      this.discount = discount;
      return true;
   }

       //Method purpose : compute the cost of workshop(s) participants are enrolled in 
//Parameter(s) passed : none
//Return types : double
   public double calculateTotalCost() {
      return 2.0;
      
      // incorporate the dscount array 
   }
   
      public double calculateFakeCost() {
      return 33.0; }
      
      
      //Method purpose : print a receipt of the name, age, sex, cellphone number, email address, bill, and workshop(s) enroll
//Parameter(s) passed : none
//Return types : void/none 
   public String toString() { 
            
      return  " | " + super.getName()
            + " | " + super.getSex()
            + " | " + super.getAge()
            + " | " + super.getCellphoneNumber()
            + " | " + super.getEmailAddress()
            //+ "\n" 
            
            // overriden method? to allow the add on information
            // make separate toString in order to print the other info out as a add on not repeatedly
            // + "\n\nNumber of workshop participants: " + this.getNumParticipants()
            + " | " + this.calculateTotalCost()
            ;
   
   }



}
