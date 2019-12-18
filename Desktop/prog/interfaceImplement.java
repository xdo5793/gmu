import javax.swing.JOptionPane;
public class interfaceImplement {
   public static void main(String[] args) {
   
      Measureable[] bankArray = new Measureable[Measureable.MAX_NUM_OBJECTS];
   
      bankArray[0] = new BankAccount2(100.00);
      bankArray[1] = new BankAccount2(200.00);
      bankArray[2] = new BankAccount2(200.00);
   
      JOptionPane.showMessageDialog(null, "Average balance: " + String.format("$%.2f", average(bankArray)));
   
      Measureable[] countryArray = new Measureable[Measureable.MAX_NUM_OBJECTS];
      
      countryArray[0] = new Country2("island", 1000);
      countryArray[1] = new Country2("rock", 2000);
      countryArray[2] = new Country2("nation", 4000);
      
      JOptionPane.showMessageDialog(null, "Average area: " + String.format("%.1f", average(countryArray)));
   
   }
   
   public static double average(Measureable[] arrayObjects) {
   
      if (arrayObjects.length == 0) {
         return 0;
      }
      else {
         double sum = 0.0;
         for (int x = 0 ; x < arrayObjects.length ; x++) {
            sum += arrayObjects[x].getMeasure();
         }
         return sum/arrayObjects.length;
      }
   
   
   }
   
   
   
}