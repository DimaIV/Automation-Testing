
public class Person {
	private String name;
	private int age;
	private boolean isMan;

	public Person(String name, int age, boolean isMan) {
		this.name = name;
		this.age = age;
		this.isMan = isMan;
	}
	
	public int getAge() {
		return age;
	}

	public void showPersonInfo(){
		System.out.printf("Name : %1s%n"
				+ "Age: %2s%n"
				+ "Gender: %3s%n", this.name, this.age, isMan ? "male" : "female");
	}
}
