// Stub class to demonstrate interfaces
public class Country2 implements Measureable {
   private String name;
   private double area;
   public static final double MIN_AREA = 0.0;
   
   public Country2(String name, double area) {
      if (name == null || name.equals("")) {
         throw new IllegalArgumentException("Name must be provided");
      }
      if (area < MIN_AREA) {
         throw new IllegalArgumentException(
            "Area must be at least "
            + String.format("%.1f"));
      }
      this.name = name;
      this.area = area;
   }
   
   public String getName() { return this.name; }
   public double getArea() { return this.area; } 
   
   // Inteface Method
   public double getMeasure() { return this.getArea(); }
}
