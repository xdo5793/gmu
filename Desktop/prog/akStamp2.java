public class akStamp2 {

   private String color;
   private double value;
   
   public akStamp2 (String color, double value) {
      if (color == null || color.equals("")) {
         throw new IllegalArgumentException("Must provide color");  
      }
      if (value < 0) {
         throw new IllegalArgumentException("Value must be positive");
      }
      this.color = color;
      this.value = value;
   
   }

   public String getColor() {
      return this.color;}
   public double getValue() {
      return this.value;}
      
   public String setColor(String color) {
      if (color == null || color.equals("")) {
         throw new IllegalArgumentException("Must provide color");
      }
      this.color = color;
      return color;
   }
   
   public double setValue(double value) {
      if (value < 0) {
         throw new IllegalArgumentException("Value must be positive");
      }
      this.value = value;
      return value;
   }

   public boolean equals(Object otherObject) {
      if (otherObject == null) {
         return false;}
         // first check to see if object reference is a null value
         
      if (getClass() != otherObject.getClass()) {
         return false;}
         // second check to see if the classes are the same for the objects
   
      akStamp2 o1 = (akStamp2)otherObject;
      return this.getColor().equals(o1.getColor()) && this.getValue() == o1.getValue();
   // will return a boolean on whether or not two objects equal one another concerning the two instance variables of the objects
   
   
   }



}