import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.stylesheets.LinkStyle;

public class Task5CollectionOfDouble {

	public static void main(String[] args) {
		
	int capacity= 10; 
	List<Double> doubleList= new ArrayList<>();
			
			for (int i = 0; i < capacity; i++) {
				doubleList.add((double) (i*3));
			}
			
			System.out.println(doubleList);
		}
}
