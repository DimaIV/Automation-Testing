import java.util.Scanner;

public class Task2double {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		double numberA = scanner.nextDouble();
		
		System.out.println("Enter another decimal number different from the first one: ");
		double numberB = scanner.nextDouble();
		
		double sum = numberA + numberB;
		double difference = numberA - numberB;
		double product = numberA * numberB;
		double divisionA = numberA / numberB;
		double remainderA = numberA % numberB;
		
		System.out.format("The sum of %1$s and %2$s is %3$s. The difference is %4$s. The product is  %5$s. ", numberA, numberB, sum, difference, product);
		
		if (remainderA == 0) {
			System.out.println("The division is " + divisionA + ".");
		}else{
			System.out.println("The remainder is " + remainderA + ".");
		}

	}

}
