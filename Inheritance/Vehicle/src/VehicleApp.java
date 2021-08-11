//Main class
import java.util.Scanner;

public class VehicleApp {
   /*main driving method*/
   public static void main(String[] args) {
       /*variables to store the details of the vehicle*/
       int type ;
       String model ;
       String plateNo ;
       int speed ;
       int time ;
       int passenger ;
      
       Scanner read = new Scanner(System.in) ; // to take the user input
       Vehicle vehicle ; // Vehicle class object
      
       type = read.nextInt() ;
       read.nextLine() ; // Emptying the next line charcter
       model = read.nextLine() ;
       plateNo = read.nextLine() 		;
       speed = read.nextInt() ;
       time = read.nextInt() ;
       passenger = read.nextInt() ;
      
       read.close() ; // closing the Scanner class object
      
       if(type == 1) vehicle = new Bus(model, plateNo, speed, passenger) ; // creates Bus type object if its Bus type demanded
       else vehicle = new Truck(model, plateNo, speed, passenger) ; // creates Truck type object otherwise
       vehicle.display() ; // calls the display object
      
       /*
       * Since, no member takes "time" factor hence it has to be displayed distinctly
       */
       System.out.println("Distance Covered (km) with speed " + speed + "km/h and " + time + " is " + (time*speed) + "km") ;
   } // main method ends here
} // Main class ends here