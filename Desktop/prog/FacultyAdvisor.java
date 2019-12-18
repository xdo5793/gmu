public class FacultyAdvisor {
   private String nameAdvisor;
   private String department;
   private int maxAdvises;
   public static final int MIN_NUM = 0;
   
   public FacultyAdvisor(String nameAdvisor, String department, int maxAdvises) {
      if (nameAdvisor == null || nameAdvisor.equals("")) {
         throw new IllegalArgumentException("First name must be provided");
      }   
      if (department == null || department.equals("")) {
         throw new IllegalArgumentException("Last name must be provided");
      }         
      if (maxAdvises < MIN_NUM) {
         throw new IllegalArgumentException("Maximum number able to advise must be provided");
      }         
      this.nameAdvisor = nameAdvisor;
      this.department = department;
      this.maxAdvises = maxAdvises;
   }
   
   public String getNameAdvisor() { 
      return this.nameAdvisor; }
   public String getDepartment() { 
      return this.department; }
   public int getMaxAdvises() { 
      return this.maxAdvises; }   
   
   public void setNameAdvisor(String nameAdvisor) {
      if (nameAdvisor == null || nameAdvisor.equals("")) {
         throw new IllegalArgumentException("Advisor's name must be provided");
      }   
      this.nameAdvisor = nameAdvisor;
   }

   public void setDepartment(String department) {
      if (department == null || department.equals("")) {
         throw new IllegalArgumentException("Department name must be provided");
      }    
      this.department = department;
   }
   
   public void setMaxAdvises(int maxAdvises) {
      if (maxAdvises < MIN_NUM) {
         throw new IllegalArgumentException("Maximum number able to advise must be provided");
      }  
      this.maxAdvises = maxAdvises;
   }
   
   public String toString() {
      return "Name: " + this.getNameAdvisor() + "\nDepartment: " + this.getDepartment()
         + "\nMax Advised Students: " + this.getMaxAdvises();   
   }      
}
