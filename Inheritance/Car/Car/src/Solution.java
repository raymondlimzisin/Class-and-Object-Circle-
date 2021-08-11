//Dont ever modify these codes
import java.util.*;

public class Solution {
    static void display(Car car,int wheels){
        System.out.println(car.getModel()+" "+car.getColor()+" "+wheels);
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String line;
        String model;
        String color;
        int wheels;
        
        line = in.nextLine();
        String[] tokens = line.split(" ");
        
        model = tokens[0];
        color = tokens[1];
        wheels = Integer.parseInt(tokens[2]);
        BMW bmw=new BMW(model,color,wheels); 
        
        line = in.nextLine();
        tokens = line.split(" ");
        
        model = tokens[0];
        color = tokens[1];
        wheels = Integer.parseInt(tokens[2]);
        Honda honda=new Honda(model,color,wheels); 
        
        display(bmw,bmw.getAlloyWheelCount());
        display(honda,honda.getNormalWheelCount());
    }
}