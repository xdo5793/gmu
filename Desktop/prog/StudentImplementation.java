import javax.swing.JOptionPane;
public class StudentImplementation {
   public static void main(String[] args) {
   // student name, faculty advisor name, department and max advises
   
   
   
      Student oneStudent = new Student(StudentName(), new FacultyAdvisor(AdvisorName(), DepartmentName(), numStudentsAdvise()));
         
      JOptionPane.showMessageDialog(null, oneStudent.toString());
     
   }
      
   public static String StudentName() {
     // aStudentName
      String aStudentName;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         aStudentName = JOptionPane.showInputDialog("Enter the name of the student : ");
         // user input for data
         
         if (aStudentName == null || aStudentName.equals("")) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter a student name.");         
         }
      } while(aStudentName == null || aStudentName.equals(""));
      
      return aStudentName;
   }
     
     
   public static String AdvisorName() {
     // aFacultyName
      String aFacultyName;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         aFacultyName = JOptionPane.showInputDialog("Enter the name of the faculty advisor : ");
         // user input for data
         
         if (aFacultyName == null || aFacultyName.equals("")) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter an advisor name.");         
         }
      } while(aFacultyName == null || aFacultyName.equals(""));
      return aFacultyName;
   }
     
     
   public static String DepartmentName() {
     // aDepartmentName
      String aDepartmentName;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         aDepartmentName = JOptionPane.showInputDialog("Enter the name of the department : ");
         // user input for data
         
         if (aDepartmentName == null || aDepartmentName.equals("")) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter an advisor name.");         
         }
      } while(aDepartmentName == null || aDepartmentName.equals(""));
      return aDepartmentName;
   }
     
   public static int numStudentsAdvise() {
     // aCellphoneNumber
      int maxAdvise;
      // loop to make sure that user input is valid according to data definition class validation
      do {
         try{
            maxAdvise = Integer.parseInt(JOptionPane.showInputDialog("Enter the max number of students to advise : "));            // user input for data
         } catch (NumberFormatException x) {
            maxAdvise = -1;
         }
         if (maxAdvise < 0) {
         //error message
            JOptionPane.showMessageDialog(null, "You must enter a positive number.");         
         }
         
      } while(maxAdvise < 0);
      return maxAdvise;
   }
      
     
}
