public class aj1SavingsAccount extends ajBankAccount {

   private static final double INTEREST_RATE = 1.5;

   public aj1SavingsAccount(double balance) {
      super(balance);
   }

   public String toString() {
      return super.toString() + "[interest rate = " + INTEREST_RATE + "]\n";
   
   }



}