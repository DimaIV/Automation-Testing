import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Task7CellectionWithSummedElements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = scanner.nextInt();

		List<Integer> intSet = new ArrayList<>();
		List<Integer> intSetNew = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter " + (i + 1) + " element: ");
			intSet.add(scanner.nextInt());
		}

		intSetNew.add(intSet.get(1));

		for (int i = 1; i < n; i++) {
			int newElement = (i == n - 1) ? (intSet.get(i - 1)) : (intSet.get(i - 1) + intSet.get(i + 1));
			intSetNew.add(newElement);
		}

		System.out.println(intSetNew);
	}

}
