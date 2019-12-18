  /*	
Name:	Xuan Do 
Date:	11/3/2019
Course and Section: IT 206 - DL1, 2D1
Assignment Number: 6

Description	of	program: Create a data definition class that allows users to register, enroll, and track 
participants of a certain age (35-50) who are eligible to enroll in GMU Computer Basics workshops. 
The application should store personal information such as the name, age, sex, cellphone number, and 
email address as well as number of partipants involved. These participants would be allowed the option 
to enroll in various different workshops. This is the implementation class that maintains a menu that allows a user to select from options such 
as : register, enroll, remove enrolled participant, print participant record, and quit the program.  
Error messages are provided if a mistake or exception is entered. 
*/

import javax.swing.JOptionPane;

public class GMUworkshops {

   public static void main(String[] args) {
     // constant 
      final int MAX_PARTICIPANTS = 50;
      
      // create array of objects
      participant[] array = new participant[MAX_PARTICIPANTS];
      
            // copied array for linear search and removal of a participant 
      participant[] arrayEdited = array;
     
      int currentSize = participant.getNumParticipants();
     // currentSize of partially filled array
   
          // maintains a menu that allows a user to select from options such as : create flight, remove flight, sell flight ticket, display flights, and exit the program
      int menuChoice = getMenuOption();
      while (menuChoice != 5) {
         switch(menuChoice) {
            case 1: 
               if (partnered() == false) {
               // call method to create an object that will become populated with user input
               // method is called register
                  array[currentSize] = register(array, currentSize);
                  currentSize++; 
               // increment
               } else {
               // partnered option
                  array[currentSize] = registerPartnered(array, currentSize);
                  currentSize++;
               }
               
               break;    
               
               
               
               
            case 2:
                           
               enroll(array, currentSize);
               // given participant list, choose a participant to enroll in classes
               break;  
               
               
            case 3:
               // call method to remove a participant by linear search
               removeParticipant(array, arrayEdited, currentSize);
               currentSize--;
               // decrement
               JOptionPane.showMessageDialog(null, "New participant list");
               printRecord(array, currentSize);
               // print new list
               break;    
               
            case 4:
               printRecord(array, currentSize);
               break;  // call additional method to print personal information and the cost
                     
         
            
            default:
               // Program should never reach this condition if logic is correct
               throw new RuntimeException("Unknown error in menu choice");
         }
         menuChoice = getMenuOption();
         // reprompt for the menu options that are maintained 
      }
     
     // exit message
      if (menuChoice == 5) {
         JOptionPane.showMessageDialog(null, "Thank you for using the GMU workshop application.");
      }
   
        
   }
     
     
//Method purpose : ask the user whether or not the participant is employed by an organization that is partnered with GMU
//Parameter(s) passed : none 
//Return types : boolean
   public static boolean partnered() {
      String p;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         p = JOptionPane.showInputDialog("Is the participant's organization partnered with GMU? Y or N?");
         // user input for data
         
         if (!p.equalsIgnoreCase("y") && !p.equalsIgnoreCase("n")) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter Y for yes or N for no.");
         
         }
      } while(!p.equalsIgnoreCase("y") && !p.equalsIgnoreCase("n"));
     
      if (p.equalsIgnoreCase("y")) {
         return true;
      } else {
         return false;
      }
     
   }
   
 //Method purpose : find the participant the user wishes to remove from the  list
//Parameter(s) passed : none 
//Return types : void/none 
   public static void removeParticipant (participant[] array, participant[] arrayEdited, int currentSize) {
      int index =	0;
      boolean found = false;
      printRecord(array, currentSize);
                  // priming read to remove a flight from the flight list 
      int searchValue =	Integer.parseInt(JOptionPane.showInputDialog("Enter participant number"));
      
               // linear search to loop through partially filled array to remove a flight that is in the array, and the parameters for user input to prevent out of bounds error or return of null
      while	(!found && index <=currentSize+1)  {
               // parameters to search each index of the partially filled array for flight user wishes to remove
         if	(searchValue > 0 || searchValue <= array.length) {
            found	= true;
         }
         else {         // increment counter to search next index of array
            index++;
         }        
      }
            
            // parameters when course the user wishes to remove is found
      if	(found) {
               // loop to adjust the courses schedule and remove the course the user wishes
         array[(searchValue-1)] = array[currentSize-1];
                     // array copies to print out the adjusted and shortened arrays after the arrays have been shortened
         arrayEdited = array;   
         found = false;
                  // decrement the partially filled array size to the adjusted sized array after a course has been removed   
      }         // error message when the flight a user wishes to remove is not on the list 
      else {
         JOptionPane.showMessageDialog(null,	"Error. Participant not on the list.");
      }
        
   }
     
     
     
     
  // enroll method 
  
   public static void enroll(participant[] array, int currentSize) {
   
      enrollment(array, currentSize);
      
      
      
      
      
      
      
   }   
     
     
     
     
    //Method purpose : ask the user which participant they wish to enroll in classes from a list
//Parameter(s) passed : none 
//Return types : boolean    
   public static int enrollment(participant[] array, int currentSize) {
      printRecord(array, currentSize);
      int participantChoice = 0;
      
      if (participant.getNumParticipants() > 0) {
         do {
            try {
               participantChoice = Integer.parseInt(JOptionPane.showInputDialog("Which participant would you like to enroll? "));
            } catch(NumberFormatException x) {
               participantChoice = -1;
            }
         
            if (participantChoice < 0 || participantChoice > array.length) {
               JOptionPane.showMessageDialog(null, "Invalid participant number. Try again.");         
            }
            
         } while(participantChoice < 0 || participantChoice > array.length);
      
      
      }
    
      return participantChoice;
   }
     
        
     
     
   //Method purpose : to print a receipt of all participant infomration 
//Parameter(s) passed : none 
//Return types : void/none     
   public static void printRecord(participant[] arrayEdited, int currentSize) {
   
      if (currentSize < 1) {
         JOptionPane.showMessageDialog(null,"There are no participants created.");
      }
      // error message 
      
      
      else {
         String output = "";
         output += "P# | Name | Sex | Age | Cellphone # | Email Address | Total Bill \n";
         for (int x = 0; x < currentSize; x++) {
            output += (x+1) + " . " + arrayEdited[x].toString() + "\n";
         }
         // append the array of objects to a string 
         JOptionPane.showMessageDialog(null, output);
        
      }   
         
      
   }  
      
     
     
  //Method purpose : create a participant for the participant list
//Parameter(s) passed : none 
//Return types : an object    
   public static participant register(participant[] array, int currentSize) {
     
      participant oneParticipant = new participant();
     
     // establish object and now populate their personal info
     
     // aName
      boolean aName;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         aName = oneParticipant.setName(JOptionPane.showInputDialog("Enter the name of the participant : "));
         // user input for data
         
         if (!aName) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter a name.");         
         }
      } while(!aName);
     
     
     // aSex
      boolean aSex;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         aSex = oneParticipant.setSex(JOptionPane.showInputDialog("Enter the sex of the participant : "));
         // user input for data
         
         if (!aSex) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter a sex.");         
         }
      } while(!aSex);
     
     
     // aAge
      boolean aAge;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         aAge = oneParticipant.setAge(Integer.parseInt(JOptionPane.showInputDialog("Enter the age of the participant : ")));
         // user input for data
         
         if (!aAge) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter an age.");         
         }
      } while(!aAge);
   
     
     // aCellphoneNumber
      boolean aCellphoneNumber;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         aCellphoneNumber = oneParticipant.setCellphoneNumber(validateCellphoneNumber());            // user input for data
         
         if (!aCellphoneNumber) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter a cellphone number.");         
         }
         
      } while(!aCellphoneNumber);
      
      
     // aEmailAddress
      boolean aEmailAddress;
      do {
         aEmailAddress = oneParticipant.setEmailAddress(validateEmailAddress());
         // user input for data
         
         if (!aEmailAddress) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter an email address.");         
         }
      } while(!aEmailAddress);
     
     // return the object of a participant 
     
      return oneParticipant;
   }
   
   
     //Method purpose : create a participant for the participant list
//Parameter(s) passed : none 
//Return types : an object        
   public static participant registerPartnered(participant[] array, int currentSize) {
     
      partneredParticipant oneParticipant = new partneredParticipant();
     
     // establish object and now populate their personal info
     
     // aName
      boolean aName;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         aName = oneParticipant.setName(JOptionPane.showInputDialog("Enter the name of the participant : "));
         // user input for data
         
         if (!aName) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter a name.");         
         }
      } while(!aName);
     
     
     // aSex
      boolean aSex;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         aSex = oneParticipant.setSex(JOptionPane.showInputDialog("Enter the sex of the participant : "));
         // user input for data
         
         if (!aSex) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter a sex.");         
         }
      } while(!aSex);
     
     
     // aAge
      boolean aAge;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         aAge = oneParticipant.setAge(Integer.parseInt(JOptionPane.showInputDialog("Enter the age of the participant : ")));
         // user input for data
         
         if (!aAge) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter an age.");         
         }
      } while(!aAge);
   
     
     // aCellphoneNumber
      boolean aCellphoneNumber;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         aCellphoneNumber = oneParticipant.setCellphoneNumber(validateCellphoneNumber());            // user input for data
         
         if (!aCellphoneNumber) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter a cellphone number.");         
         }
         
      } while(!aCellphoneNumber);
      
      
     // aEmailAddress
      boolean aEmailAddress;
      do {
         aEmailAddress = oneParticipant.setEmailAddress(validateEmailAddress());
         // user input for data
         
         if (!aEmailAddress) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter an email address.");         
         }
      } while(!aEmailAddress);
     
     // return the object of a participant 
     
      return oneParticipant;
   }



     //Method purpose : valid the email address that is prompted in the register method 
//Parameter(s) passed : none 
//Return types : String
   public static String validateEmailAddress() {
   
      String email = JOptionPane.showInputDialog("Enter your email address : ");
      int position1 = email.indexOf('@');
      int position2 = email.indexOf('.');
      int position3 = (email.length()-(position2+1));
      
      boolean validEmailAddress = true;
      
      if ((position1 < 0) || (position2 < 0) || (position2 < position1)) {
         JOptionPane.showMessageDialog(null, "Invalid email address!");
         throw new IllegalArgumentException("A valid email address must be provided");
      } 
      
      return email;
   }


  //Method purpose : valid the cellphone number that is prompted in the register method 
//Parameter(s) passed : none 
//Return types : String
   public static String validateCellphoneNumber() {
   
      String cellphoneNumber = JOptionPane.showInputDialog("Enter your cellphone number with the format XXX.XXX.XXXX");
   
      String cellphoneNumber2 = cellphoneNumber.replace(".", "");
   
      boolean validCellphoneNumber = true;
   
      if (cellphoneNumber2.length() != 10 && cellphoneNumber.length() != 12) {
         validCellphoneNumber = false;
      }
      
      int y = 0;
      while (validCellphoneNumber && (y < cellphoneNumber2.length())) {
      
         if(!Character.isDigit(cellphoneNumber2.charAt(y)) ) {
            validCellphoneNumber = false;
         } else {
            ++y;
         }
      }
      
      if (!validCellphoneNumber) {
         JOptionPane.showMessageDialog(null, "You did not enter a valid cell phone number"); 
         throw new IllegalArgumentException("A valid cellphone number must be provided");
      }
      
      return cellphoneNumber2;
   
   }


       //Method purpose : maintains a menu that allows a user to select from options such as register, enroll, remove enrolled participant, print participant record, and quit the program
//Parameter(s) passed : none 
//Return types : int
   public static int getMenuOption() {
      int menuChoice;
      
      do {
         try {
            menuChoice = Integer.parseInt(JOptionPane.showInputDialog(
               "Enter your selection:" + "\n(1) Register" + "\n(2) Enroll" + "\n(3) Remove Enrolled Participant" + "\n(4) Print Participant Record" + "\n(5) Quit" ));
         }
         catch (NumberFormatException e) {
            menuChoice = 0;
         }
         if (menuChoice < 1 || menuChoice > 5) {
            JOptionPane.showMessageDialog(null, "Invalid choice. Please enter a valid menu option.");
         }
      } while (menuChoice < 1 || menuChoice > 5);
      
      return menuChoice;
   }
   


}
