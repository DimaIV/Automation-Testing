import java.util.Scanner;

public class Task1ReadInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter number A");
		double numberA = scanner.nextDouble();
		
		System.out.println("Please, enter number B");
		double numberB = scanner.nextDouble();
		
		System.out.println("Please, enter number C");
		double numberC = scanner.nextDouble();
		
		boolean isBGreater = numberB > numberA;
		boolean isAGreater = numberA > numberB;
		boolean isCEqualsA = numberC == numberA;
		boolean isCEqualsB = numberC == numberB;
		
		if (isCEqualsB || isCEqualsA) {
			System.out.format("Number %1$s is equal to %2$s or %3$s", numberC, numberA, numberB);
		}
		else if (isBGreater) {
			if ((numberC > numberA) && (numberC < numberB)) {
				System.out.format("Number %1$s is between %2$s and %3$s", numberC, numberA, numberB);
			}else{
				System.out.format("Number %1$s is NOT between %2$s and %3$s", numberC, numberA, numberB);
			}
		}
		else if (isAGreater) {
			if ((numberC < numberA) && (numberC > numberB)) {
				System.out.format("Number %0$s is between %1$s and %2$s", numberC, numberB, numberA);
			}else{
				System.out.format("Number %0$s is NOT between %1$s and %2$s", numberC, numberB, numberA);
			}
		}else {
			System.out.format("Number %0$s is equal to %1$s", numberA, numberB);
		}
	}
}
