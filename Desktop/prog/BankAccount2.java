// Stub class to demonstrate interfaces
public class BankAccount2 implements Measureable {
   public static final double MIN_BALANCE = 0.00;
   private double balance;
   
   public BankAccount2(double balance) {
      if (balance < MIN_BALANCE) {
         throw new IllegalArgumentException(
            "Balance must be at least "
            + String.format("$%.2f"));
      }
      this.balance = balance;
   }
   
   public double getBalance() { return this.balance; }
   
   // Inteface Method
   public double getMeasure() { return this.getBalance(); }
}
