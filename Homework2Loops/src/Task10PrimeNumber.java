import java.util.Scanner;

public class Task10PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter number to check: ");
		int number= scanner.nextInt();
		boolean isPrime= true; 
		double sqrNumber = Math.sqrt(number);
		
		for (int divisor = 2; divisor <= sqrNumber; divisor++) {
			
			if (number % divisor == 0) {
				isPrime= false;
				break;
			}
		}
		
		System.out.printf("%d is ", number);
		System.out.println(!isPrime || number ==1 ? "NOT prime number" : "prime number");
	}
}