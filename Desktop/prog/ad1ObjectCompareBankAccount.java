// return objects from methods 
// compare which account has greater balance 

public class ad1ObjectCompareBankAccount {

   private double balance;
   private int accountNumber;
   private static int lastIDNumber = 100;

   public ad1ObjectCompareBankAccount() {
      
      accountNumber = lastIDNumber++;
   
   }

   public double getBalance() {      return balance;}
      
      
   public int getAccountNumber() {      return accountNumber;}
   public int getLastIDNumber() {      return lastIDNumber;}



// void?
   public void setBalance(double balance) {
      if (balance < 0 ) {
         throw new IllegalArgumentException("Bank account must be positive");
      }
      this.balance = balance;
   
   }

}