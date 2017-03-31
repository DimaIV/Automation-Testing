import java.util.Arrays;
import java.util.Scanner;

public class Task1ArraysSmallesDividedBy3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please, enter array length: ");
		int arrayLength = scanner.nextInt();
		int[] nArray = new int[arrayLength];
		
		for (int i = 0; i < arrayLength; i++) {
			System.out.println("Please, enter element "+ (i + 1) + ":");
			nArray[i] = scanner.nextInt();
		}
		
		Arrays.sort(nArray);
		
		for (int i = 0; i < arrayLength; i++) {
			if (nArray[i] % 3 == 0) {
				System.out.println("The smallest number divisible by 3 is " + nArray[i] );
				break;
			} else {
				System.out.println("There is no number divisible by 3");
			}
		}
	}

}
