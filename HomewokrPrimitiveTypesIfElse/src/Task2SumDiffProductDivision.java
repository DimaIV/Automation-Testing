import java.util.Scanner;

public class Task2SumDiffProductDivision {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int numberA = scanner.nextInt();
		
		System.out.println("Enter another number different from the first one: ");
		int numberB = scanner.nextInt();
		
		int sum = numberA + numberB;
		int difference = numberA - numberB;
		long product = numberA * numberB;
		int divisionA = numberA / numberB;
		int remainderA = numberA % numberB;
		
		System.out.format("The sum of %1$s and %2$s is %3$s. The difference is %4$s. The product is  %5$s.", numberA, numberB, sum, difference, product);
		
		if (remainderA == 0) {
			System.out.println("The division is " + divisionA + ".");
		}else{
			System.out.println("The remainder is " + remainderA + ".");
		}
	}
}
