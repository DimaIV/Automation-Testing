import java.util.Scanner;

public class Task6SumOf1ToN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scanner.nextInt();
		int sum = 0;
		
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}