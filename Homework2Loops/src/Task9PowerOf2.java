import java.util.Scanner;

public class Task9PowerOf2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A:");
		int numberA = scanner.nextInt();
		
		System.out.println("Enter B:");
		int numberB = scanner.nextInt();
		
		for (int i = numberA; i <= numberB; i++) {
			if (i % 3 == 0) {
				System.out.printf("skip %d, ", i);
			} else {
				System.out.print(i != numberB ? i*i + ", " : i*i);
			}
		}
	}
}