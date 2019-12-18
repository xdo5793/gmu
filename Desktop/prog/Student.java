public class Student {
   private String nameStudent;
   private FacultyAdvisor fa1;
    
   
   public Student(String nameStudent, FacultyAdvisor fa1) {
      if (nameStudent == null || nameStudent.equals("")) {
         throw new IllegalArgumentException("Student name must be provided");
      }
      if (fa1 == null) {
         throw new IllegalArgumentException("Faculty advisor must be provided");
      }
              
   
      this.nameStudent = nameStudent;
      this.fa1 = fa1;
       
   }

   public String getStudentName() { 
      return this.nameStudent; }
   public FacultyAdvisor getFacultyAdvisor() { 
      return this.fa1; }
   

   public void setStudentName(String nameStudent) {
      if (nameStudent == null || nameStudent.equals("")) {
         throw new IllegalArgumentException("Student name must be provided");
      }
      this.nameStudent = nameStudent;
   }

   public void setFacultyAdvisor(FacultyAdvisor fa1) {
      this.fa1 = fa1;
   }   
   
   public String toString() {
      return "Student: " + this.getStudentName() + "\n"
         + "Faculty Advisor: "+ this.getFacultyAdvisor().toString() + "\n\n"
          ;
   }
}