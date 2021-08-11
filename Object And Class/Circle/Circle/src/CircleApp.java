import java.text.DecimalFormat;
import java.util.*;
public class CircleApp {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int N = sc.nextInt();

		for(int i=0;i<N;i++) {
			
			Circle myCircle = new Circle();
			
			double radius = sc.nextDouble();

			myCircle.setRadius(radius); //set radius
		
			System.out.println("Case #"+ (i+1) + ": "+ df.format(radius) + " " 
								+ df.format(myCircle.getArea())+ " " 
								+ df.format(myCircle.getCircumference()));
			
			}
}
}
