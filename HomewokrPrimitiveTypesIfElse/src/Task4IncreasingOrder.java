import java.util.Scanner;

public class Task4IncreasingOrder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int numberA = scanner.nextInt();
		
		System.out.println("Enter another number different from the first one: ");
		int numberB = scanner.nextInt();
		
		String result = numberA > numberB ? "Numbers in ascending order " + numberA + "," + numberB : "Numbers in ascending order " + numberB  + "," + numberA;
		
		System.out.print(result);
	}

}