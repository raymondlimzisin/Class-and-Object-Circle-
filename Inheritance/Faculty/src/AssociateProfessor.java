// AssociateProfessor.java

public class AssociateProfessor extends AssistantProfessor {
  
   private int medAllowance;
  
   // parameterized constructor
   public AssociateProfessor(String name, int basic, int DA, int medAllowance)
   {
       super(name, basic, DA);
       this.medAllowance = medAllowance;
   }
  
   // return salary
   public double getSalary()
   {
       return super.getSalary() + medAllowance;
   }
  
   // return string representation
   public String getDetails()
   {
       return "Associate Professor "+ name+ " RM"+ (int)getSalary() + ".00";
   }
}
//end of AssociateProfessor.java