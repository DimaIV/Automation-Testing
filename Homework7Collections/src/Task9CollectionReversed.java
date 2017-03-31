import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task9CollectionReversed {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = scanner.nextInt();

		List<Integer> intList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter " + (i + 1) + " element: ");
			intList.add(scanner.nextInt());
		}

		Collections.reverse(intList);
		
		System.out.println(intList);
	}

}
