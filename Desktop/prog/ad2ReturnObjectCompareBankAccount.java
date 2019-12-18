// compare via implementation 

import javax.swing.JOptionPane;

public class ad2ReturnObjectCompareBankAccount {
   public static void main (String[] args) {
   
      ad1ObjectCompareBankAccount checking = new ad1ObjectCompareBankAccount();
   
      checking.setBalance(100);
   
      ad1ObjectCompareBankAccount saving = new ad1ObjectCompareBankAccount();
   
      saving.setBalance(200);
   
   // object called largerAccount calls a method and passes two objects
   ad1ObjectCompareBankAccount largerAccount = compareBalances(checking, saving);
   
      JOptionPane.showMessageDialog(null, "The larger account has " + String.format("$%.2f", largerAccount.getBalance()));
   }


// returns an object >> know how to use parameters
   public static ad1ObjectCompareBankAccount compareBalances(ad1ObjectCompareBankAccount account1, ad1ObjectCompareBankAccount account2) {
   
      ad1ObjectCompareBankAccount largerAccount;
      // set an object to identify the larger account 
   
      if (account1.getBalance() > account2.getBalance()){
         largerAccount = account1;
      }
      else  if (account1.getBalance() < account2.getBalance()){
         largerAccount = account2;
      }
      else {
         largerAccount = account1;
      }
   return largerAccount;
   
   }


}