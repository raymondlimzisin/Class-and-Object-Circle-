import java.util.*;
import java.text.DecimalFormat;

public class Shape {
	DecimalFormat df = new DecimalFormat("0.000");
	private String name;
	
	public Shape(String n) {
		name = n;
	}
	
	public void displayInfo() {
		System.out.println("The Shape is " + name);
	}
}
