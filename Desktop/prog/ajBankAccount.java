public class ajBankAccount {

   private double balance;

   public ajBankAccount(double balance) {
      if (balance < 0) {
         throw new IllegalArgumentException("Balance must be positive");
      }
      this.balance = balance;
   
   }

   public double getBalance() {
      return this.balance;}

   public String toString() {
      return getClass() + "\n" + "object : " + getClass().getName() + "\n" + "[balance = " + String.format("$ %.2f", this.getBalance()) + "]\n";
   }
   // getClass references the class of the object that is made
   // getName returns the name of the type of object within the reference 





}