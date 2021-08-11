import java.util.Scanner;

// Base Class Vehicle
class Vehicle {
   private String model ;
   private String plateNo ;
   private int speed ;
  
   // constructor of Vehicle
   Vehicle(String model, String plateNo, int speed) {
       this.model = model ;
       this.plateNo = plateNo ;
       this.speed = speed ;
   }
  
   /*getters*/
   String getModel() {return model ;}
   String getPlateNo() {return plateNo ;}
   int getSpeed() {return speed ;}
  
   void display() { // display method
       System.out.println("Vehicle Model: " + model) ;
       System.out.println("Vehicle Registration No: " + plateNo) ;
       System.out.println("Speed (km/h): " + speed) ;
   }
}// class ends here