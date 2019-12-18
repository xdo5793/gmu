import javax.swing.JOptionPane;

public class ah2Upcasting { //Casting an object of a subclass to a superclass reference

   public static void main(String[] args) {
   
   
      partneredParticipant p1 = new partneredParticipant();
   
      participant s1 = p1;
      // superclass object with subclass reference
   
      JOptionPane.showMessageDialog(null, "" + s1.calculateTotalCost());
      // superclass object using a subclass method 
      
      // There may be times when you want to group subclass objects together as part of a superclass, under the umbrella as participants. 
   
   }


}