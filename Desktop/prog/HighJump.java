// demonstrate interfaces
public class HighJump {
   private double Jump1;
   private double Jump2;
   public static final int MIN_VALUE = 0;
   
   public HighJump(double Jump1, double Jump2) {
      if (Jump2 < MIN_VALUE) {
         throw new IllegalArgumentException("Jump2 must be at least " + MIN_VALUE);
      }
      if (Jump1 < MIN_VALUE) {
         throw new IllegalArgumentException("Jump1 must be at least " + MIN_VALUE);
      }
      this.Jump1 = Jump1;
      this.Jump2 = Jump2;
      
   }
   
   public double getJump1() { return this.Jump1; }
   public double getJump2() { return this.Jump2; }
   
   // Inteface Method
   
}