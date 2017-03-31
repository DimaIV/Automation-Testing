package bg.pragmatic.myautomationframework.backend;

import org.junit.Assert;
import org.openqa.selenium.By;

import bg.pragmatic.myautomationframework.utils.Browser;
import bg.pragmatic.myautomationframework.utils.enums.Password;
import bg.pragmatic.myautomationframework.utils.enums.Username;

public class AdminLogin {

	public static void open() {
		Browser.driver.get("http://shop.pragmatic.bg/admin");
	}

	public static void login(Username username, Password password) {
		Browser.driver.findElement(By.name("username")).sendKeys(username.getUsername());
		Browser.driver.findElement(By.name("password")).sendKeys(password.getPassword());
		Browser.driver.findElement(By.linkText("Login")).click();
		
	}

	public static void verifyValidationMessage(String failureMessage, String expectedValidationMessage) {
		String actualValidationMessage = Browser.driver.findElement(By.className("warning")).getText();
	
		Assert.assertEquals(failureMessage, expectedValidationMessage, actualValidationMessage);
	}

}
