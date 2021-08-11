//Child class Bus that inherits the property of Vehicle
import java.util.Scanner;
class Bus extends Vehicle {
   private int noOfPassenger ;
  

//Construcutor of Bus
   Bus(String model, String plateNo, int speed, int noOfPassenger) {
       super(model, plateNo, speed) ;
       this.noOfPassenger = noOfPassenger ;
   }
  
   @Override
   void display() { // displays method
       super.display() ; // calls the parent's class(Vehicle) display method
       System.out.println("No of Passenger: " + noOfPassenger) ;
   }
}
