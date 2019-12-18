public class ai2OverrideChild extends ai1OverrideBase {
   private double bonus;


   public double getSalary() {
      return super.getSalary() + this.bonus;
   // child class use super.method() with addition of bonus for further specification 
   }

}