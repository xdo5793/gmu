import javax.swing.JOptionPane;

public class ah3Downcasting { //Casting an object of a subclass to a subclass reference 

   public static void main(String[] args) {
   
      participant s1 = new partneredParticipant();
   
      partneredParticipant u1 = (partneredParticipant)s1;
   
      JOptionPane.showMessageDialog(null, u1.calculateFakeCost());
   
   //Assume now you need to invoke a method that is within a subclass, but not in the superclass
   // To do this downcast, place the name of the class in parentheses. With a downcasted object reference it is now possible to invoke a method that is only in the subclass.
   
   //To summarize, downcasting must occur when there is a method that exists only in the subclass, but not in the superclass.
   
   
   
   
   
   
   }
}