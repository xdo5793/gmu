public class Company {
   private String companyName;
   private Department dept;
   
   public Company(String companyName, String name, int ID_NUM) {
      if (companyName == null || companyName.equals("")) {
         throw new IllegalArgumentException("Company name must be provided");
      }   
      this.companyName = companyName;
      this.dept = new Department(name, ID_NUM);
   }
   
   public String getCompanyName() { 
      return this.companyName; } 
      
   public Department getDepartment() { 
      return new Department(this.dept); }

   public void setDepartment(Department dept) {
      this.dept = new Department(dept);
   }
   
   public void setCompanyName(String companyName) {
      if (companyName == null || companyName.equals("")) {
         throw new IllegalArgumentException("Company name must be provided");
      }   
      this.companyName = companyName;
   }

   public String toString() {
      return "Company name : " + this.getCompanyName() + " " + this.getDepartment().toString();
   }
}
