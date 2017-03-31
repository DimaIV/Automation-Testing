import java.util.Scanner;

public class Task4Symetric {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int arrayLength = scanner.nextInt();
		int[] nArray = new int[arrayLength];
		boolean isSymetric= false;

		for (int i = 0; i < arrayLength; i++) {
			System.out.println("Enter element " + (i + 1));
			nArray[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < (arrayLength + 1)/2; i++) {
			if ((nArray[i] == nArray[arrayLength - 1 - i])) {
				isSymetric= true;
			} else {
				isSymetric= false;
			}
		}
		
		System.out.println(!isSymetric ? "The array is NOT symetric" : "The array is symetric");
	}
}
