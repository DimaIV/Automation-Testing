import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Task3Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int startElement = scanner.nextInt();
		int capacity= 10;
		int secondElement = startElement;
		int thirdElement = startElement + secondElement;
		
		Collection<Integer> fibCollection = new ArrayList<>();
		
		fibCollection.add(startElement);
		fibCollection.add(secondElement);
		
		for (int i = 2; i < capacity; i++) {
			fibCollection.add(thirdElement);
			startElement = secondElement;
			secondElement = thirdElement;
			thirdElement = secondElement + startElement;
		}
		
		System.out.println(fibCollection);
	}

}
