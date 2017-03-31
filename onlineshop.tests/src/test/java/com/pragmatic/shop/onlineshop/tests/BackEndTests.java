package com.pragmatic.shop.onlineshop.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.*;

public class BackEndTests {
	WebDriver driver;

	@Before
	public void setUp() {
		 System.setProperty("webdriver.gecko.driver",
		 "D:\\drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
		driver.get("http://shop.pragmatic.bg/admin");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void logInSuccessfullTest() {
		setUsernameAndPassLogIn("admin", "parola");
		driver.findElement(By.className("button")).click();

		WebElement logInSuccessfull = driver.findElement(By.xpath("//div[@id='header']//div[contains(@class,'div3')]"));
		String expectedText = " You are logged in as admin";
		assertTrue(expectedText.equals(logInSuccessfull.getText()));
	}

	@Test
	public void logInFailTest() {
		setUsernameAndPassLogIn("adminn", "parola");
		driver.findElement(By.className("button")).click();
		WebElement warningDiv = driver.findElement(By.className("warning"));
		assertTrue(warningDiv.isDisplayed());
	}

	@Test
	public void logedInStatisticsSelectRangeTest() {
		setUsernameAndPassLogIn("admin", "parola");
		driver.findElement(By.className("button")).click();

		Select range = new Select(driver.findElement(By.id("range")));
		assertFalse(range.isMultiple());
		
		int rangeSize= range.getOptions().size(); 
		assertTrue(rangeSize == 4);
		
		List<String> expectedOptions = Arrays.asList(new String[]{"Today", "This Week", "This Month","This Year"});
    	List<String> actualOptions = new ArrayList<String>();
    	
    	for (int i = 0; i < rangeSize; i++) {
			actualOptions.add(range.getOptions().get(i).getText());
		}
    	
    	assertArrayEquals(expectedOptions.toArray(), actualOptions.toArray());
	}

	private void setUsernameAndPassLogIn(String username, String password) {
		WebElement usernameInput = driver.findElement(By.name("username"));
		usernameInput.sendKeys(username);
		WebElement passwordInput = driver.findElement(By.name("password"));
		passwordInput.sendKeys(password);
	}
}
