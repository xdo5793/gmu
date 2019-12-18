import javax.swing.JOptionPane;
public class equalsImplement {
   public static void main(String[] args) {
   
   akStamp2 s1 = new akStamp2("blue", 2.00);
   akStamp2 s2 = new akStamp2("blue", 2.00);
   
   JOptionPane.showMessageDialog(null, s2.equals(s2));
   
   
   }
}