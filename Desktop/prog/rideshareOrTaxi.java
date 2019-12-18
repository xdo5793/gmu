/*	
Name:	Xuan Do 
Date:	11/16/2019
Course and Section: IT 206 - DL1, 2D1
Assignment Number: 8

Description	of	program: Create a data definition class that allows a client to create a weeky 
summary of consultant's billable hours, and any travel expenses such as Personal Car Mileage
or Ride Services. In addition, this specific data definition class will record the individual 
consultant's name of rideshare or taxi company as well as the cost of the travel expenses. 
This data definition class contains the instance variables, accessors, and mutators, 
constructors, and special purpose methods that are all necessary to track a weekly summary of each 
consultant’s billable hours and any travel expenses. Additionally, it contains the computation 
for cost of billale expenses as well as the validation necessary for a user’s input of a 
participant’s: name, day of travel or service expense, and type of billable item. 
Lastly, this class should be able to print the total individual cost, name, day of travel
or service age, type of billable item, and name of the rideshare or taxi company. 
Error messages are provided if a mistake or exception is entered. 
*/

public class rideshareOrTaxi extends expense {
   
   // instance variable
   public int travelExpense;
   // instance variable
   public String travelName;

   // Method purpose : constructor, set default values for an object
   //Parameter(s) passed : none 
   //Return types : none
   public rideshareOrTaxi() {
      super();
      this.travelExpense = 0;
      this.travelName = "";
   }

//Method purpose : accessor, gets the value of the rideshare or taxi company name from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : String
   public String getTravelName() { 
      return this.travelName; }
      
//Method purpose : accessor, gets the value of the travel expense (due to a rideshare or taxi company) from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : int      
   public int getTravelExpense() {
      return this.travelExpense; 
   }

//Method purpose : mutator, sets the value of the rideshare or taxi company name within an object of the class based on information passed into it
//Parameter(s) passed : String travelName
//Return types : boolean
   public boolean setTravelName(String travelName) {
      if (travelName == null || travelName.equals("")) {
         throw new IllegalArgumentException("A travel company name must be provided");
         // parameters for user input
               // exception handling and error message
      }
      this.travelName = travelName;
      return true;
   }
   
//Method purpose : mutator, sets the value of the travel expense (due to a rideshare or taxi company) within an object of the class based on information passed into it
//Parameter(s) passed : int travelExpense
//Return types : boolean   
   public boolean setTravelExpense(int travelExpense) {
      if (travelExpense < 0) {
         throw new IllegalArgumentException("A travel expense must be provided");
         // parameters for user input
               // exception handling and error message
      }
      this.travelExpense = travelExpense;
      return true;
   }

    //Method purpose : compute the cost of billable expenses by using the travel expense cost of the rideshare or taxi company 
//Parameter(s) passed : none
//Return types : int
   public int calculateTotalCost() {
      return this.travelExpense;
      
       
   }

//Method purpose : print a receipt of the name, day of travel or service age, and type of billable item. In addition, it will print the cost of the travel expense as well as the name of the rideshare or taxi company
//Parameter(s) passed : none
//Return types : void/none
   public String toString() { 
            
      return   "$" + this.calculateTotalCost() + super.toString() + " > Cost : $" + this.getTravelExpense() + " | Company : " + this.getTravelName();
            
   }




}