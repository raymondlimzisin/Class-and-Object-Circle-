// Faculty.java

public class Faculty {
  
   public String name;
   public int basic;
  
   // parameterized constructor
   public Faculty(String name, int basic)
   {
       this.name = name;
       this.basic = basic;
   }
  
   // return the string representation of Faculty
   public String getDetails()
   {
       return name+" "+(int)getSalary();
   }
  
   // return the salary
   public double getSalary()
   {
       return basic;
   }
}
//end of Faculty.java