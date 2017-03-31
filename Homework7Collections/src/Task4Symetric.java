import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task4Symetric {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = scanner.nextInt();

		List<Integer> intSetAll = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter element " + (i + 1));
			intSetAll.add(scanner.nextInt());
		}
		
		List<Integer> subList1 = intSetAll.subList(0, n/2);
		List<Integer> subList2 = intSetAll.subList((n+1)/2, n);
		
		Collections.reverse(subList2);

		System.out.println("Set1" + subList1);
		System.out.println("Set2" + subList2);
		System.out.println(subList1.equals(subList2)? "Symetric" : "Not Symetric");
	}

}
