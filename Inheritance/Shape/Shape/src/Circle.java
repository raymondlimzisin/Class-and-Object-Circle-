import java.text.DecimalFormat;

public class Circle extends Shape{
private int radius;
DecimalFormat df = new DecimalFormat("0.000");
	
	public Circle(String n, int r) {
		super(n);
		radius = r;
	}
	public void CircleArea(int r) {
		double area = Math.PI*r*r;
		System.out.println(df.format(area));
	}
	public void CircleCircumference(int r) {
		double circumference = 2*Math.PI*r;
		System.out.println(df.format(circumference));
	}
	public void displayInfo(){
		super.displayInfo();
		System.out.println("Radius: "+radius);
		System.out.print("Circle Area: ");
		CircleArea(radius);
		System.out.print("Circle Circumference: ");
		CircleCircumference(radius);
	}

}
