/*	
Name:	Xuan Do 
Date:	11/16/2019
Course and Section: IT 206 - DL1, 2D1
Assignment Number: 8

Description	of	program: Create a data definition class that allows a client to create a weeky 
summary of consultant's billable hours, and any travel expenses such as Personal Car Mileage
or Ride Services. In addition, this specific data definition class will record the individual 
consultant's name of carpoolers as well as the distance traveled using a personal car. 
This data definition class contains the instance variables, accessors, and mutators, 
constructors, and special purpose methods that are all necessary to track a weekly summary of each 
consultant’s billable hours and any travel expenses. Additionally, it contains the computation 
for cost of billale expenses as well as the validation necessary for a user’s input of a 
participant’s: name, day of travel or service expense, and type of billable item. 
Lastly, this class should be able to print the total individual cost, name, day of travel
or service age, type of billable item, the distance traveled using a personal car, and the 
name of the carpoolers who ride along. Error messages are provided if a mistake or 
exception is entered. 
*/

public class personalCar extends expense {
   
   // instance variable
   public int mileage;
   // instance variable
   public String carpooler;

   // Method purpose : constructor, set default values for an object
   //Parameter(s) passed : none 
   //Return types : none
   public personalCar() {
      super();
      this.mileage = 0;
      this.carpooler = "";
   }

//Method purpose : accessor, gets the value of the name(s) of carpoolers from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : String   
   public String getCarpooler() { 
      return this.carpooler; }
      
//Method purpose : accessor, gets the value of the distance traveled by a personal car from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : String      
   public int getMileage() {
      return this.mileage; 
   }

//Method purpose : mutator, sets the value of the name(s) of carpoolers within an object of the class based on information passed into it
//Parameter(s) passed : String carpooler
//Return types : String
   public String setCarpooler(String carpooler) {
      if (carpooler == null || carpooler.equals("")) {
         throw new IllegalArgumentException("A carpooler must be provided");
         // parameters for user input
               // exception handling and error message
      }
      this.carpooler = carpooler;
      return carpooler;
   }
   
//Method purpose : mutator, sets the value of the distance traveled by a personal car within an object of the class based on information passed into it
//Parameter(s) passed : int mileage
//Return types : boolean    
   public boolean setMileage(int mileage) {
      if (mileage < 0) {
         throw new IllegalArgumentException("A mileage must be provided");
         // parameters for user input
               // exception handling and error message
      }
      this.mileage = mileage;
      return true;
   }

    //Method purpose : compute the cost of billable expenses by using the mileage multiplied by $1 per mile 
//Parameter(s) passed : none
//Return types : int
   public int calculateTotalCost() {
      return this.mileage*1;
      
       
   }

//Method purpose : print a receipt of the name, day of travel or service age, and type of billable item. In addition, it will print the cost of the travel expense due to mileage as well as the name of the carpoolers
//Parameter(s) passed : none
//Return types : void/none
   public String toString() { 
            
      return  "$" + this.calculateTotalCost() + super.toString() + " > " + this.getMileage() + "mile(s) | Carpoolers : " + this.getCarpooler();
            
   }







}