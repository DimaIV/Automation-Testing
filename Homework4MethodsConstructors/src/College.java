import java.util.Arrays;

public class College {

	public static void main(String[] args) {
		Student pesho = new Student("Petar", "Literature", 6, 3, 21, false, 20);
		pesho.grade = 6;
		Student gosho = new Student("George", "Literature", 5, 2, 22, false, 50);
		Student maria = new Student("Maria", "Literature", 5, 2, 22, false, 50);
		Student ivan = new Student("Ivan", "Literature", 5.0, 2, 22, false, 50);
		Student milena = new Student("Milena", "Literature", 5, 2, 22, false, 50);
		Student irena = new Student("Irena", "Literature", 5, 2, 22, false, 50);
		StudentGroup literatureGroup = new StudentGroup("Literature");
		System.out.println("Group subject " + literatureGroup.groupSubject + System.lineSeparator()+ "Free places " +literatureGroup.freePlaces);

		ivan.receiveScholarship(3, 50);
		System.out.println("Ivan's money after scholarship " + ivan.money);
		
		milena.upYear();
		System.out.println("Milena year in College " + milena.yearInCollege);
		
		literatureGroup.addStudent(gosho);
		literatureGroup.addStudent(pesho);
		literatureGroup.addStudent(maria);
		literatureGroup.addStudent(ivan);
		literatureGroup.addStudent(milena);
		literatureGroup.addStudent(irena);
		
		literatureGroup.printStudentsInGroup();
		
		
		System.out.println(literatureGroup.theBestStudent());
		
		literatureGroup.emptyGroup();
		literatureGroup.printStudentsInGroup();
	}

}
