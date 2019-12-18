//*********************************************************

/*
 * In this file, complete tasks as identified below, only inside of the commented areas
 */

import javax.swing.JOptionPane;
public class Purchase {
   public static void main(String[] args) {
      final int MAX_ITEMS = 3;
      
      // BEGIN: Create an array of type Sellable, called items
      Sellable[] items = new Sellable[MAX_ITEMS];
      // END

      populateItems(items);
      displayReceipt(items);
   }
   
   private static void populateItems(Sellable[] items) {
   
      // BEGIN: In the items array, hardcode the creation of one book, one DVD, and one consulting service
      Book s1 = new Book("Under the Dome by Stephen King", 9.95);
      items[0] = s1;
      DVD s2 = new DVD("Casablanca", 14.99, "Drama");
      items[1] = s2;
      ConsultingService s3 = new ConsultingService("DVD repair", 99.99, 2.5);
      items[2] = s3;
      // END
   }
   
   private static void displayReceipt(Sellable[] items) {
      String receipt = "***Bob's Retail Store***\n\n";
      double total = 0;
   
      // BEGIN: Loop through all of the items in the array of type Sellable to calculate the total, and print out the item's cost
      //        and a String representation of the item for each item
   for (int x = 0; x < items.length; x++) {
            total +=  items[x].getCost();
             
         }
         // END
      
      // BEGIN: Create one line that will calculate the sales tax based on the total (Hint: Remember SALES_TAX is stored in the interface)
      double salesTax = total*Sellable.SALES_TAX;
      // END
      
      receipt += "Total: " + String.format("$%.2f", total) + "\n";
      receipt += "Sales Tax: " + String.format("$%.2f", salesTax) + "\n";
      receipt += "Grand Total: " + String.format("$%.2f", total + salesTax) + "\n";      
      JOptionPane.showMessageDialog(null, receipt);
   }
}