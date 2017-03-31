import java.util.Scanner;

public class Task3SwapValues {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter number A");
		double numberA = scanner.nextDouble();
		
		System.out.println("Please, enter number B");
		double numberB = scanner.nextDouble();
		
		double tempNumber = 0; 
		tempNumber = numberA; 
		numberA = numberB; 
		numberB = tempNumber;
		
		System.out.format("After swaping number A is %1$s and number B is %2$s.", numberA, numberB);
		
	}

}
