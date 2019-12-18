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

public class participant {

// instance variable
   private String name;
   // instance variable
   private String sex;
   // instance variable
   private int age;
   // instance variable
   private String cellphoneNumber;
   // instance variable
   private String emailAddress;

   // constant
   public static final int MAX_PARTICIPANTS = 50;
   // static variable number of participants
   public static int numParticipants;


// Method purpose : constructor, set default values for an object
//Parameter(s) passed : none 
//Return types : none
   public participant() {
      this.name = "";
      this.sex = "";
      this.age = 0;
      this.cellphoneNumber = "";
      this.emailAddress = "";
   
      ++numParticipants;
   }

    //Method purpose : accessor, gets the value of name from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : String 
   public String getName() { 
      return this.name; }

    //Method purpose : accessor, gets the value of sex from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : String 
   public String getSex() { 
      return this.sex; }
      
 //Method purpose : accessor, gets the value of age from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : int
   public int getAge() { 
      return this.age; }
      
 //Method purpose : accessor, gets the value of cellphone number from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : String
   public String getCellphoneNumber() { 
      return this.cellphoneNumber; }
      
//Method purpose : accessor, gets the value of email address from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : String
   public String getEmailAddress() { 
      return this.emailAddress; }


 //Method purpose : accessor, gets the value of number of participants from an object of the class and returns it back to the calling method
//Parameter(s) passed : none 
//Return types : int 
   public static int getNumParticipants() { 
      return numParticipants; }
      
        


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
   
   
 //Method purpose : mutator, sets the value of sex within an object of the class based on information passed into it
//Parameter(s) passed : String sex
//Return types : boolean
   public boolean setSex(String sex) {
      if (sex.equalsIgnoreCase("F") || sex.equalsIgnoreCase("M")) {
       
         this.sex = sex;
         return true;
      } else {
         throw new IllegalArgumentException("A name must be provided");
      }
      
   }
    
//Method purpose : mutator, sets the value of age within an object of the class based on information passed into it
//Parameter(s) passed : int age
//Return types : boolean
   public boolean setAge(int age) {
      if (age < 35 || age > 50) {
      
         throw new IllegalArgumentException("Age must be between 35 and 50.");
         // parameters for user input
               // exception handling and error message
      }
      this.age = age;
      return true;
   }
    
//Method purpose : mutator, sets the value of cellphone number within an object of the class based on information passed into it
//Parameter(s) passed : String cellphoneNumber 
//Return types : boolean 
   public boolean setCellphoneNumber(String cellphoneNumber) {
      if (cellphoneNumber == null || cellphoneNumber.equals("")) {
         throw new IllegalArgumentException("A name must be provided");
         // parameters for user input
               // exception handling and error message
      }
      this.cellphoneNumber = cellphoneNumber;
      return true;
   }
    
  //Method purpose : mutator, sets the value of email address within an object of the class based on information passed into it
//Parameter(s) passed : String emailAddress 
//Return types : boolean 
   public boolean setEmailAddress(String emailAddress) {
      if (emailAddress == null || emailAddress.equals("")) {
         throw new IllegalArgumentException("A name must be provided");
         // parameters for user input
               // exception handling and error message
      }
      this.emailAddress = emailAddress;
      return true;
   }
    
    //Method purpose : compute the cost of workshop(s) participants are enrolled in 
//Parameter(s) passed : none
//Return types : double
   public double calculateTotalCost() {
      return 0.0;
   }
   
   //Method purpose : print a receipt of the name, age, sex, cellphone number, email address, bill, and workshop(s) enroll
//Parameter(s) passed : none
//Return types : void/none 
   public String toString() {
   
      return  " | " + this.getName()
            + " | " + this.getSex()
            + " | " + this.getAge()
            + " | " + this.getCellphoneNumber()
            + " | " + this.getEmailAddress()
            //+ "\n" 
            
         
            + " | " + this.calculateTotalCost()
            ;
   
   }

}

