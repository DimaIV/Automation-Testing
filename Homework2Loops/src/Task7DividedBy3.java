import java.util.Scanner;

public class Task7DividedBy3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scanner.nextInt();
		int start = 3;
		int divisor = 3;
		
		System.out.print(start);
		
		for (int i = start+1; i <= n; i++) {
			if (i % divisor != 0) {
				continue;
			}
			System.out.print("," + i);
		}	
	}
}
