
public class Computer {
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
	Computer(){
		isNotebook= false;
		operationSystem= "Win XP";
	}
	
	Computer(int year, double price, double hardDiskMemory, double freeMemory){
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory= freeMemory;		
	}
	
	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem){
		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory= freeMemory;
		this.operationSystem= operationSystem;
	}

	void changeOperationSystem(String newOperationSystem) {
		operationSystem = newOperationSystem;
		System.out.printf("You have successfully changed your OS to %1s!%n", operationSystem);
	}

	void useMemory(double memory) {
		if (memory > freeMemory) {
			System.out.println("Not enough free memory!");
		} else {
			freeMemory -= memory;
			System.out.printf("You have used %1s MB from your free memory. You have now free memory of %2s.%n", memory,
					freeMemory);
		}
	}
	
	int comparePrice(Computer c){
		if (this.price > c.price) {
			return -1;
		} 
		else if (this.price < c.price){
			return 1;
		}
		
		return 0;
	}
}
