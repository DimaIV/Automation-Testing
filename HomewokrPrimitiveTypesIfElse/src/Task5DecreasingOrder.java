import java.util.Arrays;
import java.util.Scanner;

public class Task5DecreasingOrder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrayLength = 3;
		int arr[] = new int[arrayLength];
		
		System.out.println("Enter three different numbers, each on new line: ");
		
		for (int i = 0; i < arrayLength; i++) {
			arr[i] = scanner.nextInt();
		}

		Arrays.sort(arr);
		System.out.println("Numbers in descending order: ");
		
		for (int i = arrayLength-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
