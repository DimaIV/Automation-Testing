
public class Student {
	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;

	public Student() {
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}

	Student(String name, String subject, double grade, int yearInCollege, int age, boolean isDegree, double money) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}
	
	void upYear(){
		if (!isDegree) {
			this.yearInCollege += 1;
		} else {
			System.out.println("You have already graduated!");
		}
		if (this.yearInCollege == 4) {
			isDegree = true;
		}
	}
	
	double receiveScholarship(double min, double amount){
		if ((this.grade >= min) && (this.age < 30)) {
			this.money += amount;
		}else{
			System.out.println("Sorry, you do not match the requirements for the scholarship!");
		}
		return this.money;
	}
}
