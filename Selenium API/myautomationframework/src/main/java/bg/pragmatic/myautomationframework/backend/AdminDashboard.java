package bg.pragmatic.myautomationframework.backend;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import bg.pragmatic.myautomationframework.utils.Browser;
import bg.pragmatic.myautomationframework.utils.WaitTool;
import bg.pragmatic.myautomationframework.utils.enums.StatisticsRange;


public class AdminDashboard {
	private static final int RANGE_NUMBER_OF_OPTIONS = 4;
	
//	@FindBy(id= "range")
//	private WebElement dropdown; 
	
	public static void verifyTitle(String failureMessage, String expectedTitle) {
		String actualTitle = Browser.driver.getTitle();
		
		Assert.assertEquals(failureMessage, expectedTitle, actualTitle);
	}

	public static void verifyIsAt(String failingMessage) {
		
		WebElement logoutElement = WaitTool.waitForElementPresent(Browser.driver, By.linkText("Logout"), 10);
		Assert.assertNotNull(failingMessage, logoutElement);
	}
	
	public static void verifyStatisticsRangeIsMultiple(String failingMessage){
		WebElement select = WaitTool.waitForElementPresent(Browser.driver, By.id("range"), 10);
		Select dropDownRange = new Select(select);
		Assert.assertFalse(dropDownRange.isMultiple());
	}
	
	public static void verifyStatisticsRangeSize(String failingMessage){		
		Select dropDownRange = new Select(Browser.driver.findElement(By.id("range")));
		int rangeSize= dropDownRange.getOptions().size(); 
		Assert.assertTrue(rangeSize == RANGE_NUMBER_OF_OPTIONS);
	}

	public static void verifyStatisticsRangeOptions(String failingMessage, List<String> expectedOptions){
		Select dropDownRange = new Select(Browser.driver.findElement(By.id("range")));
		
    	List<String> actualOptions = new ArrayList<String>();
    	
    	for (int i = 0; i < dropDownRange.getOptions().size(); i++) {
			actualOptions.add(dropDownRange.getOptions().get(i).getText());
		}
    	
    	Assert.assertArrayEquals(expectedOptions.toArray(), actualOptions.toArray());
	}

	public static void clickOnStatisticsOption(String statisticsOption) {
		WebElement select = WaitTool.waitForElementPresent(Browser.driver, By.id("range"), 10);
		Select dropDownRange = new Select(select);
		dropDownRange.selectByVisibleText(statisticsOption);
		WaitTool.waitForElementPresent(Browser.driver, By.id("report"), 10);
	}

	public static List<String> getStatisticsOptionsXAxisValues() {
		List<WebElement> statisticsOptionXAxisValues= WaitTool.waitForListElementsPresent(Browser.driver, By.xpath("//div[contains(@class, 'xAxis')]/div[@class = 'tickLabel'] "), 10);
		return getStatisticsOptionsAxisValues(statisticsOptionXAxisValues);
	}

	public static List<String> getStatisticsOptionsYAxisValues() {
		List<WebElement> statisticsOptionYAxisValues= WaitTool.waitForListElementsPresent(Browser.driver, By.xpath("//div[contains(@class, 'yAxis')]/div[@class = 'tickLabel'] "), 10);
		return getStatisticsOptionsAxisValues(statisticsOptionYAxisValues);
	}

	private static List<String> getStatisticsOptionsAxisValues(List<WebElement> statisticsOptionAxisValues) {
		WaitTool.waitForElementPresent(Browser.driver, By.id("report"), 10);
		List<String> axisValues = new ArrayList<String>();
		for (WebElement webElement : statisticsOptionAxisValues) {
			axisValues.add(webElement.getText());
		}
		return axisValues;
	}

	public static void verifyAxisValues(String failingMessage, List<String> expectedAxisValues, List<String> actualAxisValues) {
		Assert.assertArrayEquals(failingMessage, expectedAxisValues.toArray(), actualAxisValues.toArray());
		
	}

}
