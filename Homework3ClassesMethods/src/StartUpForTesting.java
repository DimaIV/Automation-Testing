
public class StartUpForTesting {

	public static void main(String[] args) {
		Computer hpLaptop = new Computer();
		Computer acerPc = new Computer();
		Computer lenovo = new Computer(2015, 1000.25, true, 500, 600, "Windows 10");
		Computer sonyPc = new Computer(2014, 980.75, 1000, 250);

		hpLaptop.year = 2016;
		hpLaptop.price = 1200.95;
		hpLaptop.isNotebook = true;
		hpLaptop.hardDiskMemory = 1000;
		hpLaptop.freeMemory = 300;
		hpLaptop.operationSystem = "Windows 7";
		System.out.println("Hp Laptop: ");
		System.out.printf(
				"Year of production: %1s " + "%nPrice : %2s " + "%nIs notebook: %3s " + "%nHard Disk Memory: %4s "
						+ "%nFree Memory: %5s " + "%nOS: %6s%n",
				hpLaptop.year, hpLaptop.price, hpLaptop.isNotebook, hpLaptop.hardDiskMemory, hpLaptop.freeMemory,
				hpLaptop.operationSystem);
		hpLaptop.changeOperationSystem("Windows 10");
		hpLaptop.useMemory(301);

		acerPc.year = 2015;
		acerPc.price = 1100.25;
		acerPc.isNotebook = false;
		acerPc.hardDiskMemory = 1000;
		acerPc.freeMemory = 200;
		acerPc.operationSystem = "Windows 8";
		System.out.println(System.lineSeparator() + "Acer PC: ");
		System.out.printf(
				"Year of production: %1s " + "%nPrice : %2s " + "%nIs notebook: %3s " + "%nHard Disk Memory: %4s "
						+ "%nFree Memory: %5s " + "%nOS: %6s%n",
				acerPc.year, acerPc.price, acerPc.isNotebook, acerPc.hardDiskMemory, acerPc.freeMemory,
				acerPc.operationSystem);
		acerPc.changeOperationSystem("Windows 10");
		acerPc.useMemory(100);
		
		int priceComparison = lenovo.comparePrice(sonyPc);
		System.out.println(System.lineSeparator() + printPriceComparison("Lenovo", priceComparison)); 
		
		int priceComparisonAcerHp = acerPc.comparePrice(hpLaptop);
		System.out.println(System.lineSeparator() + printPriceComparison("Acer", priceComparisonAcerHp));
	}
	
	static String printPriceComparison(String computerName, int priceComparison){
		String result; 
		
		switch (priceComparison) {
		case 1: result = " is cheeper";
			break;
		case -1: result = " is more expensive";
		break;
		case 0: result = "Prices are the same";
		break;
		default: result = "Invalid input.";
			break;
		};
		
		return computerName + result;
	}

}
