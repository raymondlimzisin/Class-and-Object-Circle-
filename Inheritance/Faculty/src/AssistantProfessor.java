// AssistantProfessor.java

public class AssistantProfessor extends Faculty {
  
   private int DA;
  
   // parameterized constructor
   public AssistantProfessor(String name, int basic, int DA) {
       super(name, basic);
       this.DA = DA;
   }
  
   // return the salary
   public double getSalary()
   {
       return super.getSalary() + ((double)(super.getSalary()*DA))/100;
   }
  
   // return the string representation
   public String getDetails()
   {
       return "Assistant Professor "+ name+ " RM"+ (int)getSalary() + ".00";
   }
}

//end of AssistantProfessor.java