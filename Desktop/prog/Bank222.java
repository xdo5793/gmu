import javax.swing.JOptionPane;
public class Bank222 {
   public static void main(String[] args) {
   
      String amount = JOptionPane.showInputDialog("Enter amount: ");
      depo(amount);
   
   
   
   
   
   }
   
   public static void depo(String amount) {
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
         JOptionPane.showMessageDialog(null, "True");
      } else {
         JOptionPane.showMessageDialog(null, "False");
      }
      
   
   }
   
   
   
   
}