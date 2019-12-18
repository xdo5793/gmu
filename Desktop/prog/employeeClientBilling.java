  /*	
Name:	Xuan Do 
Date:	11/16/2019
Course and Section: IT 206 - DL1, 2D1
Assignment Number: 8

Description	of	program: Create an implementation class that allows a client to create a weeky 
summary of consultant's billable hours, and any travel expenses such as Personal Car Mileage
or Ride Services. This application should store appropriate information about employees, the 
day of their expense, the cost, as well as supporting details of the expense. This is the 
implementation class that maintains a menu that allows a user to select from options such 
as : quit, add a billable item, display all billable items, display the total for billable 
service and display employees who have carpooled. Error messages are provided if a mistake 
or exception is entered. 
*/  
import javax.swing.JOptionPane;

public class employeeClientBilling {

   public static void main(String[] args) {
     // constant 
      final int MAX_EMPLOYEES = 5;
      
      // create array of objects
      expense[] array = new expense[MAX_EMPLOYEES];
      
      // create array strictly to total the service expenses
      int[] total = new int[MAX_EMPLOYEES];
      // create array for names of carpoolers
      String[] carpoolers = new String[MAX_EMPLOYEES];
      
      // currentSize of partially filled array
      int currentSize = expense.getNumEmployees();
   
    // maintains a menu that allows a user to select from options such as : quit, add a billable item, display 
    //all billable items, display the total for billable service and display employees who have carpooled
      int menuChoice = getMenuOption();
      while (menuChoice != 0) {
         switch(menuChoice) {
         
            case 1:  // call methods to demostrate polymorphism of inherited classes and increment within array of objects
               if (billable().equalsIgnoreCase("service hours")) { // summary of service hours
                  array[currentSize] = addService(array, currentSize, total);
                  currentSize++;
               } 
               else if (billable().equalsIgnoreCase("personal car mileage")) { // summary of mileage
                  array[currentSize] = addMileage(array, currentSize, carpoolers);
                  currentSize++;
               } 
               else if (billable().equalsIgnoreCase("ride service")) { // summary of ride services
                  array[currentSize] = addTravel(array, currentSize);
                  currentSize++;
               }
               break;    
         
            case 2:  // call method to print summary of all billable items and their corresponding details       
               displayAllBillable(array, currentSize);
               break;  
                  
            case 3: // call method to print the total of all billable services
               displayTotalService(array, currentSize, total);
               break;    
               
            case 4: // call method to print the names of carpoolers
               displayCarpoolers(array, currentSize, carpoolers);
               break;   
         
            default:
               // Program should never reach this condition if logic is correct
               throw new RuntimeException("Unknown error in menu choice");
         }
         menuChoice = getMenuOption();
         // reprompt for the menu options that are maintained 
      }
     
     // exit message
      if (menuChoice == 0) {
         JOptionPane.showMessageDialog(null, "Thank you for using the Client Billing Application.");
      }
    
   }


  //Method purpose : create a rideshare or taxi expense for the expense summary
//Parameter(s) passed : none 
//Return types : an object
   public static rideshareOrTaxi addTravel(expense[] array, int currentSize) {
      rideshareOrTaxi aRideshareOrTaxi = new rideshareOrTaxi();
   
      // aName
      boolean aName;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         aName = aRideshareOrTaxi.setName(JOptionPane.showInputDialog("Enter the name of the employee : "));
         // user input for data
         
         if (!aName) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter a name.");         
         }
      } while(!aName);
      
      // aDay
      String aDay;
      
      // call method
      aDay = aRideshareOrTaxi.setDay(day());
      
      // set expense type stated initially
      boolean aBillableItem = aRideshareOrTaxi.setItemBillable("ride service");
         
   // aTravelExpense
      boolean aTravelExpense;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         aTravelExpense = aRideshareOrTaxi.setTravelExpense(Integer.parseInt(JOptionPane.showInputDialog("Enter the travel expense : ")));
         // user input for data
         
         if (!aTravelExpense) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter a travel expense.");         
         }
      } while(!aTravelExpense);
      
      //  aTravelName
      boolean aTravelName;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         aTravelName = aRideshareOrTaxi.setTravelName(JOptionPane.showInputDialog("Enter the name of the rideshare or taxi company : "));
         // user input for data
         
         if (!aTravelName) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter a rideshare or taxi company name.");         
         }
      } while(!aTravelName);
   
      return aRideshareOrTaxi;
   }

     //Method purpose : create a mileage expense for the expense summary
//Parameter(s) passed : none 
//Return types : an object
   public static personalCar addMileage(expense[] array, int currentSize, String[] carpoolers) {
      personalCar aPersonalCar = new personalCar();
   
      // aName
      boolean aName;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         aName = aPersonalCar.setName(JOptionPane.showInputDialog("Enter the name of the employee : "));
         // user input for data
         
         if (!aName) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter a name.");         
         }
      } while(!aName);
      
      // aDay
      String aDay;
      
      // call method
      aDay = aPersonalCar.setDay(day());
      
      // set expense type stated initially 
      boolean aBillableItem = aPersonalCar.setItemBillable("personal car mileage");
   
   // aMileage
      boolean aMileage;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         aMileage = aPersonalCar.setMileage(Integer.parseInt(JOptionPane.showInputDialog("Enter the distance traveled : ")));
         // user input for data
         
         if (!aMileage) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter an amount of mileage.");         
         }
      } while(!aMileage);
      
      // aCarpooler
      
      String aCarpooler;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         aCarpooler = aPersonalCar.setCarpooler(JOptionPane.showInputDialog("Enter the name of a carpooler(s) separated by commas : "));
         // user input for data
         
         if (aCarpooler == null || aCarpooler.equals("")) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter a carpooler.");         
         }
      } while(aCarpooler == null || aCarpooler.equals(""));
      
      // fill the carpoolers array with people
      carpoolers[currentSize] = aCarpooler;
      
      return aPersonalCar;
   }


   public static service addService(expense[] array, int currentSize, int[] total) {
      service aService = new service();
   
      // aName
      boolean aName;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         aName = aService.setName(JOptionPane.showInputDialog("Enter the name of the employee : "));
         // user input for data
         
         if (!aName) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter a name.");         
         }
      } while(!aName);
      
      // aDay
      String aDay;
      
      // call method
      aDay = aService.setDay(day());
    
      // set expense type stated initially
      boolean aBillableItem = aService.setItemBillable("service hours");
         
   // aHourlyRate
      int aHourlyRate;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         aHourlyRate = aService.setHourlyRate(Integer.parseInt(JOptionPane.showInputDialog("Enter the hourly rate for the performed service (to the nearest dollar) : ")));
         // user input for data
         
         if (aHourlyRate < 0) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter a hourly rate.");         
         }
      } while(aHourlyRate < 0);
      
      // aServiceHours
      int aServiceHours;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         aServiceHours = aService.setServiceHours(Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of service hours (to the nearest hour) : ")));
         // user input for data
         
         if (aServiceHours < 0) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter an amount of service hours.");         
         }
      } while(aServiceHours < 0);
   
      // fill total array with service expenses
      total[currentSize] = aServiceHours*aHourlyRate;
      
      return aService;
   
   }
 
//Method purpose : to print a receipt of all billable item information 
//Parameter(s) passed : none 
//Return types : void/none   
   public static void displayAllBillable(expense[] array, int currentSize) {
   
      if (currentSize < 1) {
         JOptionPane.showMessageDialog(null,"There are no employees created.");
      }
      // error message 
      
      
      else {
         String output = "";
         output += " Cost | Day | Employee | Billable Item & Details \n";
         for (int x = 0; x < currentSize; x++) {
            output +=  array[x].toString() + "\n";
         }
         // append the array of objects to a string 
         JOptionPane.showMessageDialog(null, output);  
      }   
   }
   
//Method purpose : to print a receipt of all billable service information 
//Parameter(s) passed : none 
//Return types : void/none
   public static void displayTotalService(expense[] array, int currentSize, int[] total) {
      int servicetotal = 0;
   
      for (int x = 0; x < currentSize; x++) {
         servicetotal += total[x];
      }   
      // append the array to a string 
      JOptionPane.showMessageDialog(null, "$" + servicetotal + " Total for Billable Service");
   }
   
//Method purpose : to print a receipt of all billable service information 
//Parameter(s) passed : none 
//Return types : void/none
   public static void displayCarpoolers(expense[] array, int currentSize, String[] carpoolers) {
      String output = "";
   
      for (int x = 0; x < currentSize; x++) {
         output += "Day : " + array[x].getDay() + ", Driver : " + array[x].getName() + ", Carpoolers : " + carpoolers[x] + "\n";
      }   
      // append the array to a string 
      JOptionPane.showMessageDialog(null, output);
   }


//Method purpose : ask the user which day of the week their expense occurred 
//Parameter(s) passed : none 
//Return types : String
   public static String day() {
      String D;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         D = JOptionPane.showInputDialog("What day of the week did the expense occur? 'Monday', 'Tuesday', 'Wednesday', 'Thursday', or 'Friday' ");
         // user input for data
         
         if (!D.equalsIgnoreCase("monday") && !D.equalsIgnoreCase("monday") && !D.equalsIgnoreCase("tuesday") && !D.equalsIgnoreCase("wednesday") && !D.equalsIgnoreCase("thursday") && !D.equalsIgnoreCase("friday")) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter a day of the week.");
         
         }
      } while(!D.equalsIgnoreCase("monday") && !D.equalsIgnoreCase("monday") && !D.equalsIgnoreCase("tuesday") && !D.equalsIgnoreCase("wednesday") && !D.equalsIgnoreCase("thursday") && !D.equalsIgnoreCase("friday"));
     // end loop 
     
      return D; // return string
   }
      
//Method purpose : ask the user which billable item they wish to create an entry for : service hours, personal car mileage, or ride service
//Parameter(s) passed : none 
//Return types : String
   public static String billable() {
      String b;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         b = JOptionPane.showInputDialog("What billable item do you wish to add : 'service hours', 'personal car mileage', or 'ride service?'");
         // user input for data
         
         if (!b.equalsIgnoreCase("service hours") && !b.equalsIgnoreCase("personal car mileage") && !b.equalsIgnoreCase("ride service")) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter service hours, personal car mileage, or ride service");
         
         }
      } while(!b.equalsIgnoreCase("service hours") && !b.equalsIgnoreCase("personal car mileage") && !b.equalsIgnoreCase("ride service"));
     // end loop 
     
      return b; // return string
   }


//Method purpose : maintains a menu that allows a user to select from options such as register, enroll, remove enrolled participant, print participant record, and quit the program
//Parameter(s) passed : none 
//Return types : int
   public static int getMenuOption() {
      int menuChoice;
      
      // loop to make sure that user input is valid according to data definition class validation
      do {
         try {
         // user input for data
            menuChoice = Integer.parseInt(JOptionPane.showInputDialog(
               "Enter your selection:" + "\n(0) Quit" + "\n(1) Add a Billable Item" + "\n(2) Display all Billable Items" + "\n(3) Display the Total for Billable Service (no travel)" + "\n(4) Display Employees who have carpooled (drivers included)" ));
         }
         // exception handling for alphabetic inputs
         catch (NumberFormatException e) {
            menuChoice = -1;
         }
         // error messages
         if (menuChoice < 0 || menuChoice > 4) {
            JOptionPane.showMessageDialog(null, "Invalid choice. Please enter a valid menu option.");
         }
      } while (menuChoice < 0 || menuChoice > 4); // end loop
      
      return menuChoice; // return int
   }
    
}