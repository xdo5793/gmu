import javax.swing.JOptionPane;

public class GMUCloudBill {

   public static void main(String[] args) {
   
      final int MAX_CUSTOMERS = 1000;
   
      cloudCustomers[] array = new cloudCustomers[MAX_CUSTOMERS];
   
      int currentSize = cloudCustomers.getNumCustomers();
      
      
      int menuChoice = getMenuOption();
      while (menuChoice != 0) {
         switch(menuChoice) {
         
            case 1: 
               addWebServer(array, currentSize);
               currentSize++; 
               break;    
         
            case 2: 
               addFileServer(array, currentSize);
               currentSize++; 
               break;  
                  
            case 3: 
               addBitcoinMiner(array, currentSize);
               currentSize++;
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
         JOptionPane.showMessageDialog(null, "Thank you for using the Cloud Billing Application.");
      }
   }
   
//Method purpose : customize a web server virtual machine’s memory with default SSD storage
//Parameter(s) passed : array, currentSize 
//Return types : an object
   public static cloudCustomers addWebServer(cloudCustomers[] array, int currentSize) {
      WebServer oneWebServer = new WebServer();
      int oneMemory = oneWebServer.setAddMemory(memory());
       

      cloudCustomers oneCustomer = new cloudCustomers(oneWebServer);
      String oneName = oneCustomer.setName(name());  
      String onePhoneNumber = oneCustomer.setPhoneNumber(phoneNumber());
      String oneEmailAddress = oneCustomer.setEmailAddress(emailAddress());
      String oneCorporateDiscount = oneCustomer.setCorporateDiscount(corporateDiscount()); 
      return oneCustomer;
   }
   
   
   
//Method purpose : customize a file server virtual machine’s type of storage, type of storage media and amount of storage
//Parameter(s) passed : array, currentSize 
//Return types : an object
   public static cloudCustomers addFileServer(cloudCustomers[] array, int currentSize) {
      FileServer oneFileServer = new FileServer(); 
      String oneTypeStorage = oneFileServer.setTypeStorage(typeStorage());
      String oneTypeStorageMedia = oneFileServer.setTypeStorageMedia(typeStorageMedia());
      int oneAmountStorage = oneFileServer.setAmountStorage(amountStorage()); 
      
      
      cloudCustomers oneCustomer = new cloudCustomers(oneFileServer);
      String oneName = oneCustomer.setName(name());  
      String onePhoneNumber = oneCustomer.setPhoneNumber(phoneNumber());
      String oneEmailAddress = oneCustomer.setEmailAddress(emailAddress());
      String oneCorporateDiscount = oneCustomer.setCorporateDiscount(corporateDiscount()); 
      return oneCustomer;
   }
   
   
   
//Method purpose : customize a bitcoin miner virtual machine’s number of and brand of GPU(s)
//Parameter(s) passed : array, currentSize 
//Return types : an object
   public static cloudCustomers addBitcoinMiner(cloudCustomers[] array, int currentSize) {
      BitcoinMiner oneBitcoinMiner = new BitcoinMiner();
      int oneNumberGPU = oneBitcoinMiner.setNumberGPU(numberGPU()); 
      String oneBrandGPU = oneBitcoinMiner.setBrandGPU(brandGPU());
       
      
      cloudCustomers oneCustomer = new cloudCustomers(oneBitcoinMiner);
      String oneName = oneCustomer.setName(name());  
      String onePhoneNumber = oneCustomer.setPhoneNumber(phoneNumber());
      String oneEmailAddress = oneCustomer.setEmailAddress(emailAddress());
      String oneCorporateDiscount = oneCustomer.setCorporateDiscount(corporateDiscount()); 
      return oneCustomer;
   }      
   
   
   
   
   
   
   
   

   
   // build individual methods of name, phone, email etc. and use the set methods correctly with the DDC 
   
   public static int memory() {
     // aMemory
      int aMemory;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         aMemory = Integer.parseInt(JOptionPane.showInputDialog("Enter the additional memory for the webserver in increments of 8GB: "));
         // user input for data
         
      if (aMemory != 8 && aMemory != 16 && aMemory != 24 && aMemory != 32 && aMemory != 40 && aMemory != 48 && aMemory != 56 && aMemory != 64 && aMemory != 72 && aMemory != 80 && aMemory != 88 && aMemory != 96 && aMemory != 104 && aMemory != 112 && aMemory != 120 ) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter accurate additional memory for the webserver.");         
         }
      } while(aMemory != 8 && aMemory != 16 && aMemory != 24 && aMemory != 32 && aMemory != 40 && aMemory != 48 && aMemory != 56 && aMemory != 64 && aMemory != 72 && aMemory != 80 && aMemory != 88 && aMemory != 96 && aMemory != 104 && aMemory != 112 && aMemory != 120 );
      
      return aMemory;
   }
   
   //Method purpose : ask the user which billable item they wish to create an entry for : service hours, personal car mileage, or ride service
//Parameter(s) passed : none 
//Return types : String
   public static String typeStorage() {
      String typeStorage;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         typeStorage = JOptionPane.showInputDialog("Choose a type of storage for the file server : 'block' or 'object' ?");
         // user input for data
         
      if (!typeStorage.equalsIgnoreCase("block") && !typeStorage.equalsIgnoreCase("object")) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter 'block' or 'object'");
         
         }
      } while(!typeStorage.equalsIgnoreCase("block") && !typeStorage.equalsIgnoreCase("object"));
     // end loop 
     
      return typeStorage; // return string
   }
   
      //Method purpose : ask the user which billable item they wish to create an entry for : service hours, personal car mileage, or ride service
//Parameter(s) passed : none 
//Return types : String
   public static String typeStorageMedia() {
      String typeStorageMedia;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         typeStorageMedia = JOptionPane.showInputDialog("Choose a type of storage media for the file server : 'SSD' or 'magnetic' ?");
         // user input for data
         
      if (!typeStorageMedia.equalsIgnoreCase("SSD") && !typeStorageMedia.equalsIgnoreCase("magnetic")) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter 'SSD' or 'magnetic'");
         
         }
      } while(!typeStorageMedia.equalsIgnoreCase("SSD") && !typeStorageMedia.equalsIgnoreCase("magnetic"));
     // end loop 
     
      return typeStorageMedia; // return string
   }
   
   public static int amountStorage() {
     // amountStorage
      int amountStorage;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         amountStorage = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of storage for the file server up to 1024 terabytes: "));
         // user input for data
         
      if (amountStorage < 0 || amountStorage > 1024 ) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter an amount of storage up to 1024 terabytes.");         
         }
      } while(amountStorage < 0 || amountStorage > 1024);
      
      return amountStorage;
   }
   
      public static int numberGPU() {
     // numberGPU
      int numberGPU;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         numberGPU = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of GPUs for the bitcoin miner up to 8 : "));
         // user input for data
         
      if (numberGPU < 0 || numberGPU > 8 ) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter an amount of GPUs up to 8.");         
         }
      } while(numberGPU < 0 || numberGPU > 8);
      
      return numberGPU;
   }
   
         //Method purpose : ask the user which billable item they wish to create an entry for : service hours, personal car mileage, or ride service
//Parameter(s) passed : none 
//Return types : String
   public static String brandGPU() {
      String brandGPU;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         brandGPU = JOptionPane.showInputDialog("Choose a type of GPU for the bitcoin miner : 'AMD' or 'Nvidia' ?");
         // user input for data
         
      if (!brandGPU.equalsIgnoreCase("AMD") && !brandGPU.equalsIgnoreCase("nvidia")) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter 'AMD' or 'Nvidia'");
         
         }
      } while(!brandGPU.equalsIgnoreCase("AMD") && !brandGPU.equalsIgnoreCase("nvidia"));
     // end loop 
     
      return brandGPU; // return string
   }
   
   
   public static String name() {
     // aName
      String aName;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         aName = JOptionPane.showInputDialog("Enter the name of the customer : ");
         // user input for data
         
         if (aName == null || aName.equals("")) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter a customer name.");         
         }
      } while(aName == null || aName.equals(""));
      
      return aName;
   }
   
//Method purpose : valid the phone number that is prompted in the register method 
//Parameter(s) passed : none 
//Return types : String
   public static String phoneNumber() {
   
      String aPhoneNumber = JOptionPane.showInputDialog("Enter your phone number with the format XXX.XXX.XXXX");
   
      String aPhoneNumber2 = aPhoneNumber.replace(".", "");
   
      boolean validaPhoneNumber = true;
   
      if (aPhoneNumber2.length() != 10 && aPhoneNumber.length() != 12) {
         validaPhoneNumber = false;
      }
      
      int y = 0;
      while (validaPhoneNumber && (y < aPhoneNumber2.length())) {
      
         if(!Character.isDigit(aPhoneNumber2.charAt(y)) ) {
            validaPhoneNumber = false;
         } else {
            ++y;
         }
      }
      
      if (!validaPhoneNumber) {
         JOptionPane.showMessageDialog(null, "You did not enter a valid phone number"); 
         throw new IllegalArgumentException("A valid phone number must be provided");
      }
      
      return aPhoneNumber2;
   
   }   
   
//Method purpose : valid the email address that is prompted in the register method 
//Parameter(s) passed : none 
//Return types : String
   public static String emailAddress() {
   
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
   
//Method purpose : ask whether or not the customer gets a corporate discount
//Parameter(s) passed : none 
//Return types : String
   public static String corporateDiscount() {
      String yesOrNo;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         yesOrNo = JOptionPane.showInputDialog("Does the customer have a corporate discount? Yes or No");
         // user input for data
         
         if (!yesOrNo.equalsIgnoreCase("yes") && !yesOrNo.equalsIgnoreCase("no")) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter yes or no.");
         
         }
      } while(!yesOrNo.equalsIgnoreCase("yes") && !yesOrNo.equalsIgnoreCase("no"));
     
      return yesOrNo;
     
   }   
   
   
   
   
   
   
   
   
   
//Method purpose : maintains a menu that allows a customer to select from options : web server, file server, and bitcoin miner 
//Parameter(s) passed : none 
//Return types : int
   public static int getMenuOption() {
      int menuChoice;
      
      // loop to make sure that user input is valid according to data definition class validation
      do {
         try {
         // user input for data
            menuChoice = Integer.parseInt(JOptionPane.showInputDialog(
               "Enter your selection:" + "\n(0) Quit" + "\n(1) Web Server" + "\n(2) File Server" + "\n(3) Bitcoin Miner"));
         }
         // exception handling for alphabetic inputs
         catch (NumberFormatException e) {
            menuChoice = -1;
         }
         // error messages
         if (menuChoice < 0 || menuChoice > 3) {
            JOptionPane.showMessageDialog(null, "Invalid choice. Please enter a valid menu option.");
         }
      } while (menuChoice < 0 || menuChoice > 3); // end loop
      
      return menuChoice; // return int
   }

}