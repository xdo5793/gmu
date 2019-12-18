public class Department {
   private String name;
   private int ID_NUM;
   public static final int MIN_NUM = 0;
   
   public Department(String name, int ID_NUM) {
      if (name == null || name.equals("")) {
         throw new IllegalArgumentException("Name must be provided");
      }    
      if (ID_NUM < MIN_NUM) {
         throw new IllegalArgumentException("Department ID# must not be negative");
      }   
      this.name = name;
      this.ID_NUM = ID_NUM;
   }
   
   public Department(Department dept) {
      this.name = dept.getName();
      this.ID_NUM = dept.getIDnum();
   }
   
   public String getName() { return this.name; }
   public int getIDnum() { return this.ID_NUM; }

   
   public void setName(String name) {
      if (name == null || name.equals("")) {
         throw new IllegalArgumentException("Name must be provided");
      }    
      this.name = name;
   }
   
   public void setIDnum(int ID_NUM) {
      if (ID_NUM < MIN_NUM) {
         throw new IllegalArgumentException("Department ID# must not be negative");
      }    
      this.ID_NUM = ID_NUM;
   }
   
   public String toString() {
      return "\nDepartment Name: " + this.getName()
         + "\nDepartment ID#: " + this.getIDnum();
   }
}