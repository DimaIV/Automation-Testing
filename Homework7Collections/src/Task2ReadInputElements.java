import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Task2ReadInputElements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter even number of elements: ");
		int n= scanner.nextInt();
		
		Collection<Integer> intList = new ArrayList<>();
		
		for (int i = 0; i < n/2; i++) {
			if (i < n/2) {
				System.out.println("Enter element " + (i+1));
				intList.add(scanner.nextInt());
			}
		}
		
		intList.addAll(intList);
		System.out.println(intList);
	}

}
