import java.util.Scanner;

public class Task7ArtificialIntellect {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter the current time /hours only/:");
		int hour = scanner.nextInt();
		
		System.out.println("Please, enter the amount of money you have");
		double moneyAmount = scanner.nextDouble();
		
		scanner.nextLine(); 
		System.out.println("Are you healthy : yes/no");
		String healthyCondition = scanner.nextLine();
		boolean isHealthy = healthyCondition.equals("yes") ? true : false;
		
		//ако съм болен няма да излизам
		if (!isHealthy) {
			System.out.println("You are sick, you have to stay at home!");
			
			//ако имам пари ще си купя лекарства
			if (moneyAmount > 0) {
				System.out.println("you have money. Go buy some meds.");
			} else {
				System.out.println("Well, you are sick and poor! Stay home and drink some tea!");
			}
		}
		
		//ако съм здрав; ако имам по-малко от 10 лв ще отида на кафе и т.н
	    if (isHealthy) {
	    	if (moneyAmount <= 10) {
	    		System.out.format("It is %1s o'clock and you are healthy! Go out and have a cup of coffee or whatever you can afford.", hour);
			} else {
				System.out.println("You are healthy and rich. Go and have fun!");
			}
		}
	}

}
