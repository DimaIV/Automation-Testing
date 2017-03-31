import java.util.Arrays;
import java.util.Scanner;

public class Task2ReadArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter even number for the length of the array: ");
		int arrayLength= scanner.nextInt();
		int[] nArray = new int[arrayLength];
		
		for (int i = 0; i < arrayLength; i++) {
			if (i < arrayLength/2) {
				System.out.println("Enter element " + (i+1));
				nArray[i] = scanner.nextInt();
			} else {
				nArray[i] = nArray[i - arrayLength/2];
			}
		}
		
		System.out.println(Arrays.toString(nArray));;
	}

}
