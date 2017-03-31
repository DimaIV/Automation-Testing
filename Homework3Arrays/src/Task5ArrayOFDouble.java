import java.util.Arrays;

public class Task5ArrayOFDouble {

	public static void main(String[] args) {
		int arrayLength= 10; 
		double[] nArray= new double[arrayLength];
		
		for (int i = 0; i < arrayLength; i++) {
			nArray[i] = i*3;
		}
		
		System.out.println(Arrays.toString(nArray));;
	}

}
