
import java.util.*;

public class Solution{

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        
        String NAME = s.nextLine();
        int ID = s.nextInt();
        int HR = s.nextInt();
        int HW = s.nextInt();
        
        HourlyEmployee payment = new HourlyEmployee(NAME, ID, HR, HW);
        
        System.out.println(payment.getId());
        System.out.println(payment.getName());
        System.out.print(payment.getGrosspay());
    }
}