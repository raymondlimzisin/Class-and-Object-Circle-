import java.util.*;
import java.text.DecimalFormat;
public class RectangleApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int N = sc.nextInt();
		
		for(int i=0;i<N;i++) {
			Rectangle myRectangle = new Rectangle();
			double width = sc.nextDouble();
			double height = sc.nextDouble();
			
			myRectangle.setWidth(width);
			myRectangle.setHeight(height);
			
			System.out.println("Case #" + (i+1) + ": "+ df.format(width)+" "
								+ df.format(height) +" "+ df.format(myRectangle.getArea()) +" "
								+ df.format(myRectangle.getPerimeter()));
			
		}
		

	}

}
