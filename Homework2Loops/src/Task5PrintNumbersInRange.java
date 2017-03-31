import java.util.Iterator;
import java.util.Scanner;

public class Task5PrintNumbersInRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int numberA = scanner.nextInt();
		
		System.out.println("Enter another number different from the first one: ");
		int numberB = scanner.nextInt();
		
		if (numberA > numberB) {
			for (int i = numberB; i <= numberA; i++) {
				System.out.print(i);
			}
		} else {
			for (int i = numberA; i <= numberB; i++) {
				System.out.print(i + " ");
			}
		}
	}
}
