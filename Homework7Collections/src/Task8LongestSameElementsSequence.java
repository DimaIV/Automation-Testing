import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task8LongestSameElementsSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = scanner.nextInt();
		int currentSequenceLength = 1;
		int maxSequenceLength = 0;
		int maxSequenceNumber = 0;

		List<Integer> intList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter " + (i + 1) + " element: ");
			intList.add(scanner.nextInt());
		}

		for (int i = 1; i < n; i++) {
			if ((intList.get(i) == intList.get(i - 1))) {
				currentSequenceLength++;
				maxSequenceLength = currentSequenceLength > maxSequenceLength ? currentSequenceLength
						: maxSequenceLength;
				maxSequenceNumber = intList.get(i);
			} else {
				currentSequenceLength = 1;
			}
		}

		System.out.print("Max sequence: ");
		for (int i = 0; i < maxSequenceLength; i++) {
			System.out.print(maxSequenceNumber + ", ");
		}
		System.out.println("Max sequence length: " + maxSequenceLength);
	}

}
