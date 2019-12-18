import javax.swing.JOptionPane;

public class ah4InstanceOfwithDowncasting { // Casting an object of a subclass to a subclass reference 
// Why? To call a method in a subclass that does not exist in the superclass


   public static void main(String[] args) {
   
   
      participant s1 = new partneredParticipant();
   
      if (s1 instanceof partneredParticipant) { //Since downcasting can be unsafe, confirm you can perform the downcast

         partneredParticipant u1 = (partneredParticipant)s1;
         // s1 object can hold the partneredParticipant , and then use the method present only in that subclass
      
         JOptionPane.showMessageDialog(null, u1.calculateFakeCost());
         JOptionPane.showMessageDialog(null, + ((partneredParticipant)s1).calculateFakeCost() + "true");
      
      }
   
   //In other words, check if an object reference can hold a specific object for downcast. 
   //To do this, the instanceof operator can be used. It returns a boolean to describe if the downcast can be performed or not. 
   
   //Failure to downcast will result in a syntax error
   //To summarize, downcasting must occur when there is a method that exists only in the subclass, but not in the superclass.
   
   // ClassCast Exception when the object reference is not specific enough, using a Student object and casting it to an undergraduate when  
   // the object downcast is not necessarily a undergrad but can be a graduate student
   
   
   
   }
}