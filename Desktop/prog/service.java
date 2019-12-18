/*	
Name:	Xuan Do 
Date:	11/16/2019
Course and Section: IT 206 - DL1, 2D1
Assignment Number: 8

Description	of	program: Create a data definition class that allows a client to create a weeky 
summary of consultant's billable hours, and any travel expenses such as Personal Car Mileage
or Ride Services. In addition, this specific data definition class will record the individual 
consultant's amount of service hours as well as the hourly rate for the service performed. 
This data definition class contains the instance variables, accessors, and mutators, 
constructors, and special purpose methods that are all necessary to track a weekly summary of each 
consultant’s billable hours and any travel expenses. Additionally, it contains the computation 
for cost of billale expenses as well as the validation necessary for a user’s input of a 
participant’s: name, day of travel or service expense, and type of billable item. 
Lastly, this class should be able to print the total individual cost, name, day of travel
or service age, type of billable item, the amount of service hours, and the hourly rate
for the services performed. Error messages are provided if a mistake or exception is entered. 
*/

public class service extends expense {
   
   // instance variable
   public int serviceHours;
   // instance variable
   public int hourlyRate;

   // Method purpose : constructor, set default values for an object
   //Parameter(s) passed : none 
   //Return types : none
   public service() {
      super();
      this.serviceHours = 0;
      this.hourlyRate = 0;
   }
   
//Method purpose : accessor, gets the value of the hourly rate for service performed from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : int   
   public int getHourlyRate() { 
      return this.hourlyRate; }

//Method purpose : accessor, gets the value of the amount of service hours performed from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : int      
   public int getServiceHours() {
      return this.serviceHours; 
   }

//Method purpose : mutator, sets the value of the hourly rate for service performed within an object of the class based on information passed into it
//Parameter(s) passed : int hourlyRate
//Return types : boolean
   public int setHourlyRate(int hourlyRate) {
      if (serviceHours < 0) {
         throw new IllegalArgumentException("A hourly rate must be provided");
         // parameters for user input
               // exception handling and error message
      }
      this.hourlyRate = hourlyRate;
      return hourlyRate;
   }
   
//Method purpose : mutator, sets the value of the amount of service hours performed within an object of the class based on information passed into it
//Parameter(s) passed : int serviceHours
//Return types : boolean   
   public int setServiceHours(int serviceHours) {
      if (serviceHours < 0) {
         throw new IllegalArgumentException("A amount of service hours must be provided");
         // parameters for user input
               // exception handling and error message
      }
      this.serviceHours = serviceHours;
      return serviceHours;
   }


//Method purpose : compute the cost of billable expenses by using the amount of service hours multiplied by the hourly rate 
//Parameter(s) passed : none
//Return types : int
   public int calculateTotalCost() {
      return (this.serviceHours*this.hourlyRate);
      
       
   }

//Method purpose : print a receipt of the name, day of travel or service age, and type of billable item. In addition, it will print the amount of service hours as well as the hourly rate of service performed 
//Parameter(s) passed : none
//Return types : void/none
   public String toString() { 
            
      return  "$" + this.calculateTotalCost() + super.toString()
            + " > " + this.getServiceHours() + "hours * $" + this.getHourlyRate() + "per hour";
            
   }







}