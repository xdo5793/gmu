
// populate an array of objects - loop 
import javax.swing.JOptionPane;

public class acPopulateArrayObjects {
   public static void main(String[] args) {
   
      participant[] array = new participant[5];
   // array of objects
   
      //array[0] = new participant();
   // object stored in an array
   
   
      for (int x = 0; x < 4 ; x++) {
         array[x] = new participant();
          // object stored in an array
          
          
         array[x].setName(JOptionPane.showInputDialog("Enter a name: "));
      // set the name of each object reference
      
      }
   
   
   
   
   }
   // end main 
   
 

}

