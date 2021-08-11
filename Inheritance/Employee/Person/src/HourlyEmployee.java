class HourlyEmployee extends Employee{
	private int hourlyRate;
	private int hoursWorked;
	HourlyEmployee(String sname, int id, int HR, int HW) {
		super(sname, id);
		this.hourlyRate=HR;
		this.hoursWorked=HW;
	}
	public int getGrosspay() {
		return hourlyRate*hoursWorked;
	}
}