package bg.pragmatic.myautomationframework.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static WebDriver driver;

	public static void setup() {
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void quit() {
		driver.quit();
	}

}
