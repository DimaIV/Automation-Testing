
public class Student extends Person {
	private double score;
	
	public Student(String name, int age, boolean isMan, double score){
		super(name, age, isMan);
		this.score = score;
	}
	
	public void showStudentInfo(){
		this.showPersonInfo();
		System.out.printf("Score: %1s%n", this.score);
	}
}
