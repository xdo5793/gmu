import javax.swing.JOptionPane;

public class ag2TeamIMP {
   public static void main(String [] args) {
   
      ag1Team oneTeam;
   
      do {
         try {
            oneTeam = createTeam(); // calling method
            printTeamRoster(oneTeam);
         
         } catch (IllegalArgumentException e) {   // will catch the Illegal argument exception
            JOptionPane.showMessageDialog(null, "Team could not be created 111\n "  + e.getMessage());
         
         }
      
      } while (JOptionPane.showConfirmDialog(null, "Enter another team?")== JOptionPane.YES_OPTION); // continues loop after thrown exception
   
   
   }


   public static ag1Team createTeam() {
   
      ag1Team oneTeam = new ag1Team(JOptionPane.showInputDialog("Enter contact person's email address")); // "" will throw exception to calling method 
   
      boolean nameSet = false;
   
      do{
         try {
         // setName method will throw IllegalArgumentException for "" >> returns to the setName in DDC 
            oneTeam.setName(JOptionPane.showInputDialog("Enter team name "));
            nameSet = true;
         
         } catch (IllegalArgumentException e) { // catches the thrown argument
         
            JOptionPane.showMessageDialog(null, "1111" + e.getMessage()); 
         }
      
      } while (!nameSet); // continues loop 
   
   
      do{
         try {
            oneTeam.setAPlayer(JOptionPane.showInputDialog("Enter player name "), 
               Double.parseDouble(JOptionPane.showInputDialog("Enter player GPA"))
               );
         } 
         catch (NumberFormatException e) { // when the exception is thrown and then caught here, it will default within loop and continue to loop
            JOptionPane.showMessageDialog(null, "GPAs must be numeric");
         }
         
         catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Team could not be created!!!! \n "  + e.getMessage());
         }
      
      } while(JOptionPane.showConfirmDialog(null, "Enter another player?")== JOptionPane.YES_OPTION);
   // when finished in this loop, you will get the print method, and then be given another option to create a new team 
   // object only contains the array contents for one team 
   
   
   
      return oneTeam;
   }



   public static void printTeamRoster(ag1Team aTeam) {
      JOptionPane.showMessageDialog(null, aTeam.toString());
   
   }

}