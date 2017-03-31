import java.util.Scanner;

public class Task6Swap3Values {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three different numbers, each on new line: ");
		int a1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		int a3 = scanner.nextInt();
		int temp; 
		
		temp = a1;
		a1 = a2;
		a2 = a3;
		a3 = temp; 
		
		System.out.format("Swapped values: %1s, %2s, %3s.", a1, a2, a3);
		//simple version :)
//		//System.out.format("Swapped values: %1s, %2s, %3s.", a2, a3, a1);
	}

}
