import java.util.Scanner;

public class Task8NDigitsNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = scanner.nextInt();
		int[][] matrix = new int[n][n];
		
		if (n == 1) {
			System.out.println(0);
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j]= n+2*i-1;
				System.out.printf("%d", matrix[i][j]);
			}
			System.out.println();
		}
	}

}
