/*	
Name:	Xuan Do 
Date:	11/16/2019
Course and Section: IT 206 - DL1, 2D1
Assignment Number: 8

Description	of	program: Create a data definition class that allows a client to create a weeky 
summary of consultant's billable hours, and any travel expenses such as Personal Car Mileage
or Ride Services. In addition, this specific data definition class is the parent data definition 
class that the rideshareOrTaxi, personalCar, and service child classes inherit from. 
This data definition class contains the instance variables, accessors, and mutators, 
constructors, and special purpose methods that are all necessary to track a weekly summary of each 
consultant’s billable hours and any travel expenses. Additionally, it contains the computation 
for cost of billale expenses as well as the validation necessary for a user’s input of a 
participant’s: name, day of travel or service expense, and type of billable item. 
Lastly, this class should be able to print the total individual cost, name, day of travel
or service age, and type of billable item. Error messages are provided if a mistake or 
exception is entered. 
*/


public abstract class expense {

   // instance variable
   private String name;
   // instance variable
   private String day;
   // instance variable
   private String itemBillable;
   
   // constant
   public static final int MAX_EMPLOYEES = 5;
   // static variable number of participants
   public static int numEmployees;
 
   //Method purpose : constructor, set default values for an object
   //Parameter(s) passed : none 
   //Return types : none
   public expense() {
      this.name = "";
      this.day = "";
      this.itemBillable = "";
      ++numEmployees;
   }

//Method purpose : accessor, gets the value of name from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : String
   public String getName() { 
      return this.name; }

//Method purpose : accessor, gets the value of day from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : String
   public String getDay() { 
      return this.day; }

//Method purpose : accessor, gets the value of billable item from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : String
   public String getItemBillable() { 
      return this.itemBillable; }

//Method purpose : accessor, gets the value of number of employees from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : int 
   public static int getNumEmployees() { 
      return numEmployees; }



//Method purpose : mutator, sets the value of name within an object of the class based on information passed into it
//Parameter(s) passed : String name
//Return types : boolean
   public boolean setName(String name) {
      if (name == null || name.equals("")) {
         
         throw new IllegalArgumentException("A name must be provided");
         // parameters for user input
               // exception handling and error message
      }
      this.name = name;
      return true;
   }
   
//Method purpose : mutator, sets the value of day within an object of the class based on information passed into it
//Parameter(s) passed : String day
//Return types : boolean
   public String setDay(String day) {
      if (day == null || day.equals("")) {
         
         throw new IllegalArgumentException("A day must be provided");
         // parameters for user input
               // exception handling and error message
      }
     
      
      this.day = day;
      return day;
   }

//Method purpose : mutator, sets the value of billable item within an object of the class based on information passed into it
//Parameter(s) passed : String itemBillable
//Return types : boolean
   public boolean setItemBillable(String itemBillable) {
      if (itemBillable == null || itemBillable.equals("")) {
         
         throw new IllegalArgumentException("A billable item must be provided");
         // parameters for user input
               // exception handling and error message
      }
      this.itemBillable = itemBillable;
      return true;
   }


//Method purpose : compute the cost of billable expenses, this is an abstract method 
//Parameter(s) passed : none
//Return types : int
   public abstract int calculateTotalCost() ;
   
   
//Method purpose : print a receipt of the name, day of travel or service age, and type of billable item
//Parameter(s) passed : none
//Return types : void/none 
   public String toString() {
      return   " | " + this.getDay()
            + " | " + this.getName()
            + " | " + this.getItemBillable();
   }

}


