public class Circle {
	private double radius;
	
	public Circle() {
		radius = 0.0;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getCircumference() {
		return 2*Math.PI*radius;
	}
	
	}