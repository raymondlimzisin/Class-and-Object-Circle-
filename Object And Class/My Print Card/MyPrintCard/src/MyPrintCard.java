import java.text.DecimalFormat;

public class MyPrintCard {
   private double balance ;

   public MyPrintCard() {
       this.balance = 10.0 ;
   }
   public double getBalance() {
       return this.balance ;
   }
   public void topupCard(double amt) {
       this.balance += amt ;
   }
   public boolean payService(double amt) {
       if(this.balance - amt >= 5) {
           this.balance -= amt ;
           return true ;
       }
       return false ;
   }
   public String toString() {
	   DecimalFormat df = new DecimalFormat("0.00");
	   String balance=df.format(this.balance);
       return "RM" + balance ;
   }
  
}