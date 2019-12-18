import javax.swing.JOptionPane;

public class aiOverloadingMethods {
   public static void main(String[] args) {
   
      hello();
      hello("Xuan");
      hello("Xuan", "IT 206");
   
   // overload with different parameters
   
   }
   public static void hello() {
      JOptionPane.showMessageDialog(null, "Hello, human");
   }

   public static void hello(String name) {
      JOptionPane.showMessageDialog(null, "Hello, " + name + " !");
   } 

   public static void hello(String name, String course) {
      JOptionPane.showMessageDialog(null, "Hello " + name + ". How are you doing in " + course + "?");
   }

}