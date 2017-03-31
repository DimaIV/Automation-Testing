
public class Task3OddNumbers {

	public static void main(String[] args) {
		int start= -10; 
		int end= 50;
		
		for (int i = start-1; i < end; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}