/*
YOUR POST : 

Create a java program that will ask a user to input the name of a 
file to write to, and will attempt to create the file if wasn't found, 
and will accept user input of the text to be added to the file. The text 
added to the file should be appended if the requested file already exists.

*/

import java.io.*;
import javax.swing.JOptionPane;
public class FileOutputNameSupplied {
   public static void main(String[] args) { 
      try {      
         PrintWriter out = new PrintWriter(new FileOutputStream(new File(
            JOptionPane.showInputDialog("Input file name to write to:"))));
            
         out.println(JOptionPane.showInputDialog("Enter input of the text to be added to the file:"));
         out.close();
      }
      catch (FileNotFoundException e) {
         JOptionPane.showMessageDialog(null, "Could not find file!");
      }
   }
}