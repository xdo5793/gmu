public class BankAccount {
   private double balance;
   private int accountNumber;
   private static int lastAccountNumber = 1000;
   public static double MIN_TRANSACTION_AMOUNT = 0.01;
   public static double MAX_TRANSACTION_AMOUNT = 1000000.00;

   public BankAccount() { 
      this.accountNumber = lastAccountNumber++;      
   }

   public double getBalance() { 
      return this.balance; }
   public int getAccountNumber() { 
      return this.accountNumber; }

   public void deposit(String amount) {
      /* This method should only check if the amount entered is a valid numeric amount. If
       * it is, it should call the overloaded deposit method. If not, it should rethrow an exception
      */
      double castAmount;
      try {
         castAmount = Double.parseDouble(amount);
      } catch (NumberFormatException x) {
         castAmount = -1;
      }
      
      
      
      if (castAmount >= 0) {
         deposit(castAmount);
      } else {
         throw new IllegalArgumentException("A number must be provided");
      }
      
   
   }

   public void deposit (double amount) { 
      /* This method should check if the amount entered is in a valid range. If it is, it should
       * perform the deposit. If not, it should throw an exception
       */
       
      if (amount > MIN_TRANSACTION_AMOUNT || amount < MAX_TRANSACTION_AMOUNT) {
         balance = getBalance() + amount;
      } else {
         throw new IllegalArgumentException("Amount must be between " + MIN_TRANSACTION_AMOUNT + " and "  + MAX_TRANSACTION_AMOUNT);
       
      }
   
              
   }

   public void withdraw(String amount) {
      /* This method should only check if the amount entered is a valid numeric amount. If
       * it is, it should call the overloaded withdraw method. If not, it should rethrow an exception
       */
      double castAmount;
      try {
         castAmount = Double.parseDouble(amount);
      } catch (NumberFormatException x) {
         castAmount = -1;
      }
      
      
      
      if (castAmount >= 0) {
         withdraw(castAmount);
      } else {
         throw new IllegalArgumentException("A number must be provided");
      }
       
   }

   public void withdraw(double amount) { 
      /* This method should check if the amount entered is in a valid range or if it would
       * overdraw the account, throwing an appropriate exception. Otherwise, it should
       * withdraw the amount requested
       */
      if (amount > MIN_TRANSACTION_AMOUNT || amount < MAX_TRANSACTION_AMOUNT) {
        
         if (amount <= balance) {
            balance = getBalance() - amount;
         } else {
            throw new IllegalArgumentException("Amount must be less than the balance");
         }
      
      } else {
         throw new IllegalArgumentException("Amount must be between " + MIN_TRANSACTION_AMOUNT + " and "  + MAX_TRANSACTION_AMOUNT);
      }
       
   }

   public String toString() { 
      return "For " + getClass().getName()
         + " #" + this.getAccountNumber()
         + ", balance is " + String.format("$%.2f", this.getBalance()); 
   }
}
