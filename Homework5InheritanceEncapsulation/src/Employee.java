
public class Employee extends Person {
	private static final int AGE_OF_18 = 18;
	private static final double OVERTIME_FRACTION = 1.5;
	private static final double WORKING_HOURS = 8;
	private double daySalary;

	public Employee(String name, int age, boolean isMan, double daySalary) {
		super(name, age, isMan);
		this.daySalary = daySalary;
	}
	
	public double calculateOvertime(double hours){
		double salaryOvertime;
		if (this.getAge() < this.AGE_OF_18) {
			return 0;
		} else {
			salaryOvertime = OVERTIME_FRACTION * this.daySalary/WORKING_HOURS;
			return salaryOvertime;
		}
	}
	
	public void showEmployeeInfo(){
		this.showPersonInfo();
		System.out.printf("Day Salary : %1s%n", this.daySalary);
	}
}
