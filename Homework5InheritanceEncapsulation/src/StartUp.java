
public class StartUp {

	private static final int NUMBER_OF_PEOPLE = 10;
	private static final double OVERTIME_HOURS = 2;

	public static void main(String[] args) {
		Person[] people = new Person[NUMBER_OF_PEOPLE];
		Person ivancho = new Person("Ivan", 21, true);
		Person mariika = new Person("Maria", 22, false);

		Student martin = new Student("Martin", 16, true, 5);
		Student yana = new Student("Yana", 17, false, 6);

		Employee doncho = new Employee("Doncho", 27, true, 120);
		Employee milena = new Employee("Milena", 26, false, 110);
		Employee pencho = new Employee("Steven", 17, true, 90);

		people[0] = ivancho;
		people[1] = mariika;
		people[2] = martin;
		people[3] = yana;
		people[4] = doncho;
		people[5] = milena;
		people[6] = pencho;

		for (int i = 0; i < people.length; i++) {
			if (people[i] != null) {
				if (people[i] instanceof Student) {
					((Student) people[i]).showStudentInfo();
				} else if (people[i] instanceof Employee) {
					((Employee) people[i]).showEmployeeInfo();
				}
				
				people[i].showPersonInfo();
			} else {
				System.out.println("Empty element!");
			}
		}
		
		System.out.println("Employees working overtime: ");
		for (int j = 0; j < people.length; j++) {
			if (people[j] != null) {
				if (people[j] instanceof Employee) {
					((Employee) people[j]).showEmployeeInfo();
					System.out.printf("Overtime amount: %1s%n" ,((Employee) people[j]).calculateOvertime(OVERTIME_HOURS) );
				}
			} else {
				System.out.println("Empty element!");
			}
		}
	}
}
