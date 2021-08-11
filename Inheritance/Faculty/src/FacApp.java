// Solution.java

import java.util.Scanner;

    public class FacApp {
  
   public static void main(String[] args)
   {
       Scanner console = new Scanner(System.in);

       String name;
       int basic, DA, medAllowance, otherAllowance;
       // create a reference variable of Faculty class (since it is the super class of all Professor classes it can point to any of the objects of its subclass)
       Faculty faculty;
       // read the type of class to instantiate
       int i = console.nextInt();
       console.nextLine();
       // read the name, basic and DA
       name = console.nextLine();
       basic = console.nextInt();
       DA = console.nextInt();
       // if i =1, create an object of AssistantProfessor
       if(i == 1)
           faculty = new AssistantProfessor(name, basic, DA);
       else if(i == 2) // if i= 2, read medAllowance and create an object of AssociateProfessor
       {
           medAllowance = console.nextInt();
           faculty = new AssociateProfessor(name, basic, DA, medAllowance);
       }else // if i =3, read medAllowance and otherAllowance and create an object of Professor
       {
           medAllowance = console.nextInt();
           otherAllowance = console.nextInt();
           faculty = new Professor(name, basic, DA, medAllowance, otherAllowance);
       }
      
       System.out.println(faculty.getDetails()); // display the details
   }

}
//end of Solution.java