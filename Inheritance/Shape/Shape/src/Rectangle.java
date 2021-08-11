
public class Rectangle extends Shape{
	private int width;
	private int height;
	
	public Rectangle(String n,int w,int h) {
		super(n);
		width = w;
		height = h;
	}
	public void RectangleArea(int w,int h) {
		System.out.println(w*h);
	}
	public void RectanglePerimeter(int w,int h) {
		System.out.println(2*w+2*h);
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Width: "+width);
		System.out.println("Height: "+height);
		System.out.print("Rectangle Area: ");
		RectangleArea(width,height);
		System.out.print("Rectangle Perimeter: ");
		RectanglePerimeter(width,height);
	}

}
