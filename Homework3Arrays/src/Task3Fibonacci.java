import java.util.Arrays;
import java.util.Scanner;

public class Task3Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int startElement = scanner.nextInt();
		int arrayLength= 10;
		int[] nArray= new int[arrayLength];
		nArray[0] = startElement;
		nArray[1] =nArray[0];
		
		for (int i = 2; i < arrayLength; i++) {
			nArray[i] = nArray[i-2] + nArray[i -1];
		}
		
		System.out.println(Arrays.toString(nArray));;
	}
}
