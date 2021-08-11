// Professor.java

public class Professor extends AssociateProfessor {
  
   private int otherAllowance;
  
   // parameterized constructor
   public Professor(String name, int basic, int DA, int medAllowance, int otherAllowance)
   {
       super(name, basic, DA, medAllowance);
       this.otherAllowance = otherAllowance;
   }
  
   // return salary
   public double getSalary()
   {
       return super.getSalary() + ((otherAllowance*super.getSalary())/100);
   }
  
   // return string representation
   public String getDetails()
   {
       return "Profesor "+ name +" RM"+ (int)getSalary() + ".00";
   }
}
//end of Professor.java