import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6EqualCollections {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> intSet1 = new ArrayList<>();
		List<Integer> intSet2 = new ArrayList<>();
		
		readCollection("First collection " , scanner, intSet1);
		readCollection("Second collection ", scanner, intSet2);
		
		System.out.println(intSet1);
		System.out.println(intSet2);
		System.out.println(intSet1.equals(intSet2)? "The collections are the same!" : "The collections are NOT the same!");
		System.out.println(intSet1.size() == intSet2.size() ? "The collections have the same size!" : "The collections do NOT have the same size!");
	}

	private static void readCollection(String collection, Scanner scanner, List<Integer> intSet ) {
		System.out.println(collection + System.lineSeparator() + "Enter number of elements: ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter element " + (i + 1));
			intSet.add(scanner.nextInt());
		}
	}

}
