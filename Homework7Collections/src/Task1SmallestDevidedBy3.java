import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Task1SmallestDevidedBy3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = scanner.nextInt();

		Collection<Integer> intSet = new TreeSet<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter " + (i + 1) + " element: ");
			intSet.add(scanner.nextInt());
		}

		Iterator<Integer> iterator = intSet.iterator();
		boolean isDividedBy3 = false;
		int min = 0;

		while (iterator.hasNext()) {
			int currentInt = iterator.next();
			if (currentInt % 3 == 0) {
				isDividedBy3 = true;
				min = currentInt;
				break;
			}
		}

		System.out.println(
				isDividedBy3 ? "The smallest number divisible by 3 is " + min : "There is no number divisible by 3");
	}

}
