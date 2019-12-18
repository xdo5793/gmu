

public class aeArrayInstVarHideInfo {

   private String name;
   private double[] grades;
   private int numGrades; 
   public static final double MIN = 0;
   public static final double MAX = 100;

   private static final int MAX_NUM_GRADES = 10;



   public aeArrayInstVarHideInfo(String name) {
      if (name == null || name.equals("")) {
         throw new IllegalArgumentException("Must provide a name.");
      }
      this.name = name;
      this.grades = new double[MAX_NUM_GRADES]; // MUST instantiate the array as instance variables 
   
   }
   
   
   public aeArrayInstVarHideInfo(String name, double[] grades) {
      this(name);
   
      if (grades == null) {
         throw new IllegalArgumentException("Array must be provided.");
      }
   
      if (grades.length > MAX_NUM_GRADES) {
         throw new IllegalArgumentException("There is only room for this many grades : " + MAX_NUM_GRADES);
      }
   
      //this.grades = grades;  >> change because of violation of information hiding
   //***
      for (int x = 0 ; x < grades.length ; x++) {
         if (grades[x] < MIN || grades[x] > MAX) {
            throw new IllegalArgumentException("Must be between min and max");
         }
         this.grades[x] = grades[x];
      }// end
      // copy parameter array to object's grades array
      
      this.numGrades = grades.length;
   
   }

   public int getNumGrades() {
      return this.numGrades;}
      
      
         // get a grade from the array by passing in an index
      //***
      // no instance variable needed, value given in the implementation
   public double getGrade(int index) {
      if (index < 0 || index >= this.getNumGrades()) {
         throw new IllegalArgumentException("Grade des not exist at the given index");
      }
      return this.grades[index];
   }

      // ***
   public double[] getGrades() {
      double[] tempArray = new double[this.getNumGrades()]; // create temporary array
      
      //copy instance rray values to temporary array
      for(int x = 0; x < this.getNumGrades() ; x++) {
         tempArray[x] = this.getGrade(x);
      }
      
      return tempArray; //return reference value to copy of array
      
   }


   // checks the array's range and checks if the grade given is correct
   public void setGrade(double gradeX) {
      if(this.getNumGrades() >= MAX_NUM_GRADES) {
         throw new IllegalArgumentException("No more room for another grade");
      }
      if (gradeX < MIN || gradeX > MAX) {
         throw new IllegalArgumentException("Grade must be between MIN and MAX");
      }
      this.grades[this.numGrades++] = gradeX;
   // appends the passed in grade into the last index of the array. 
   
   }
   
   

   //***
   public void setGrades(double[] grades) {
      if (grades.length >= MAX_NUM_GRADES) {
         throw new IllegalArgumentException("There is only room for " + MAX_NUM_GRADES + "grades");
      }
   
   // copy paramenter array to object's grades array
      for(int x = 0; x < grades.length ; x++) {
         this.setGrade(grades[x]);
      }   
      this.numGrades = grades.length;
   }
   
}