package com.pragmatic.carConfig.tests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OptionalFeaturesTests {
	WebDriver driver;
	
	@Before
	public void setUp(){
//		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://pragmatic.bg/automation/lecture13/Config.html");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void optionalFeaturesCheckTest() {
		WebElement checkBoxOption = driver.findElement(By.name("airbags"));
		WebElement checkBoxOption2 = driver.findElement(By.name("parksensor"));
		
		Actions builder = new Actions(driver);
		builder.click(checkBoxOption);
		builder.click(checkBoxOption2);
		builder.build().perform();
		
		assertTrue(checkBoxOption.isSelected());
		assertTrue(checkBoxOption2.isSelected());
		
	}

}
