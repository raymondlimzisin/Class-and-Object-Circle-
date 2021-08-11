import java.util.*;
import java.text.DecimalFormat;
public class SavingAccountApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int N = sc.nextInt();
		
		for (int i=0;i<N;i++) {
			SavingAccount mySavingAccount = new SavingAccount(sc.nextDouble());
			
			mySavingAccount.addInterest();
			
			System.out.println("Case #" + (i+1) + ": "+ df.format(mySavingAccount.getBalance()));
			
		}
		

	}

}
