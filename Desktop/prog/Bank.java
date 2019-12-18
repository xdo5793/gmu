import javax.swing.JOptionPane;
public class Bank {
   public static void main(String[] args) {
   
      BankAccount account = new BankAccount();
            
      Object[] options = {"Get Account Information", "Deposit", "Withdraw", "Exit"};
      boolean quit = false;
      do {
      
         int option = JOptionPane.showOptionDialog(null,
            "What would you like to do?","Account Menu",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
            null,options,options[0]);
         
         switch (option) {
            case 0:
               JOptionPane.showMessageDialog(null, account.toString());
               break;
            case 1:
               deposit(account);
               break;
            case 2:
               withdraw(account);
               break;
            case 3:
               quit = true;
               break;
            default: //should never hit this point, but just in case, some code is available
               throw new RuntimeException("Unexpected Error!");
         }
      
      } while (!quit);
   }
   
   private static void deposit(BankAccount account) {
     /* Adjust this method to deposit an amount from user input to an account
       * Hint: This method should have no if statements. It should only contain try/catch blocks
       */
       
      double amount;
      try {
         amount =  Double.parseDouble(JOptionPane.showInputDialog("Enter amount to deposit: "));
      } catch (NumberFormatException x) {
         amount = -1;
      }
    

    
    
    
   }

   private static void withdraw(BankAccount account) {
      /* Adjust this method to withdraw an amount from user input from an account
       * Hint: This method should have no if statements. It should only contain try/catch blocks
       */
       
      double amount;
      try {
         amount =  Double.parseDouble(JOptionPane.showInputDialog("Enter amount to withdraw: "));
      } catch (NumberFormatException x) {
         amount = -1;
      }
      
    
    
    
   }
}