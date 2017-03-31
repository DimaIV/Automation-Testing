
public class StudentGroup {
	static int numberOfStudents = 5;
	// final static int NUMBER_OF_STUDENTS = 5;
	String groupSubject;
	Student[] students;
	int freePlaces;

	public StudentGroup() {
		this.students = new Student[numberOfStudents];
		this.freePlaces = 5;
	}

	StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}

	void addStudent(Student s) {
		if ((this.groupSubject.equals(s.subject)) && (this.freePlaces > 0)) {
			for (int i = 0; i < this.students.length; i++) {
				if (students[i] == null) {
					students[i] = s;
					this.freePlaces -= 1;
					return;
				} else {
					continue;
				}
			}
		} else {
			System.out.println("No available place");
		}
	}

	void emptyGroup() {
		this.students = new Student[numberOfStudents];
		this.freePlaces = numberOfStudents;
		System.out.println("The group is empty");
	}

	String theBestStudent() {
		double maxGrade = this.students[0].grade;
		String bestName = this.students[0].name;
		for (int i = 1; i < this.students.length; i++) {
			if (this.students[i].grade > maxGrade) {
				maxGrade = this.students[i].grade;
				bestName = this.students[i].name;
			}
		}

		return bestName + " is the best student";
	}

	void printStudentsInGroup() {
		if (checkEmpty(this.students)) {
			System.out.println("The students group is empty!");
		} else {
			for (int i = 0; i < students.length; i++) {
				System.out.printf(
						"Name : %1s %n" + "Grade: %2s %n" + "Year In College: %3s %n" + "Age: %4s %n"
								+ "Graduated: %5s %n" + "Money: %6s %n" + "Subject: %7s %n",
						students[i].name, students[i].grade, students[i].yearInCollege, students[i].age,
						students[i].isDegree, students[i].money, students[i].subject);
			}
		}
	}
	
	private static boolean checkEmpty(Student[] students){
		boolean empty = true;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				empty = false;
				break;
			}
		}
		return empty;
	}
}
