// demonstrate interfaces
public class MovieTimes {
   private double Time1;
   private double Time2;
   private double Time3;
   public static final int MIN_VALUE = 0;
   
   public MovieTimes(double Time1, double Time2, double Time3) {
      if (Time3 < MIN_VALUE) {
         throw new IllegalArgumentException("Time3 must be at least " + MIN_VALUE);
      }
      
      if (Time2 < MIN_VALUE) {
         throw new IllegalArgumentException("Time2 must be at least " + MIN_VALUE);
      }
      if (Time1 < MIN_VALUE) {
         throw new IllegalArgumentException("Time1 must be at least " + MIN_VALUE);
      }
      
      this.Time1 = Time1;
      this.Time2 = Time2;
      this.Time3 = Time3;
      
   }
   
   public double getTime1() { return this.Time1; }
   public double getTime2() { return this.Time2; }
   public double getTime3() { return this.Time3; }
   
   // Inteface Method
   
}