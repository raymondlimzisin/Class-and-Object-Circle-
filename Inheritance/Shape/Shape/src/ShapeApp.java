import java.util.*;
public class ShapeApp {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String name;
		name = sc.nextLine();
		
		if (name.toUpperCase().equals("RECTANGLE")) {
			int width = sc.nextInt();
			int height = sc.nextInt();
			Rectangle r = new Rectangle(name, width, height);
			r.displayInfo();
		}

		if (name.toUpperCase().equals("CIRCLE")){
			int radius = sc.nextInt();
			Circle c = new Circle(name, radius);
			c.displayInfo();
		}
		
		sc.close();
	
	}

}
