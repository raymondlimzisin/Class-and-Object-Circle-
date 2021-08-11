import java.util.Scanner;
class Truck extends Vehicle {
   private int cargoWeight ;
  
   // constructor
   Truck(String model, String plateNo, int speed, int cargoWeight) {
       super(model, plateNo, speed) ;
       this.cargoWeight = cargoWeight ;
   }
  
   @Override
   void display() { // displays method
       super.display() ; // calls the parent's class(Vehicle) display method
       System.out.println("Cargo Weight Limit (kg): " + cargoWeight) ;
   }
}