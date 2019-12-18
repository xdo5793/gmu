import javax.swing.JOptionPane;
public class CompanyImplementation {
   public static void main(String[] args) {
   
      // Use composition to go through Job to create an Employee
      // Values are hard-coded for simplicity, but could use user input too
      Company comp1 = new Company("Taco Bello", "Sales Department", 650);
      
      JOptionPane.showMessageDialog(null, comp1.toString());
   }
}