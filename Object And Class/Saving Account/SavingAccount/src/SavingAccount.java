public class SavingAccount {
	private double balance;
	
	
	public SavingAccount(double amount) {
		balance = amount;
	}
	
	public void addInterest() {
		double interest = balance*0.03;
		balance += interest;
	}
	
	public double getBalance() {
		return balance;
	}

}
