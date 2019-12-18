import javax.swing.JOptionPane;

public class afRosterStudentArrayIMP {
   public static void main(String[] args) {
      aeArrayInstVarStudentDDC oneStudent;
   
      do {
         try {
         // run both methods 
            oneStudent = createStudent();
            // create the student's grades after specified info 
            
            printStudentReport(oneStudent);
            // print that
            
            
         } catch (IllegalArgumentException x) {
            JOptionPane.showMessageDialog(null, "Student could not be created. \n" + x.getMessage());
         }
      
      } while (JOptionPane.showConfirmDialog(null, "Enter another student?") == JOptionPane.YES_OPTION);
      // while - loops while the condition is true
      // do while - loop until the condition is false 
      
   // run it 
   
   }

   public static aeArrayInstVarStudentDDC createStudent() {
      aeArrayInstVarStudentDDC aStudent = new aeArrayInstVarStudentDDC(JOptionPane.showInputDialog("Enter the student's name: "));
   
      do {
         try {
            aStudent.setGrade(Double.parseDouble(JOptionPane.showInputDialog("Enter a grade between " + aeArrayInstVarStudentDDC.MIN + " and " + aeArrayInstVarStudentDDC.MAX + " for " + aStudent.getName() + ":")));
         // run it 
         
         } catch (NumberFormatException x) {
            JOptionPane.showMessageDialog(null, "Grades must be numbers");
         } catch (IllegalArgumentException x) {
            JOptionPane.showMessageDialog(null, "Grade could not be added. \n" + x.getMessage());
         }
      
      
      
      } while (JOptionPane.showConfirmDialog(null, "Enter another grade for " + aStudent.getName() + "?") == JOptionPane.YES_OPTION);
     // run it 
     // loops until the condition is false
     // when the option is NO in the condition, then the loop will stop 
     
      return aStudent;
   
   } 

   public static void printStudentReport (aeArrayInstVarStudentDDC aStudent) {
   
      JOptionPane.showMessageDialog(null, aStudent.toString());
   }

}