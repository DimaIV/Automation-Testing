package bg.pragmatic.myautomationframework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import bg.pragmatic.myautomationframework.backend.AdminDashboard;
import bg.pragmatic.myautomationframework.backend.AdminLogin;
import bg.pragmatic.myautomationframework.utils.Browser;
import bg.pragmatic.myautomationframework.utils.enums.Password;
import bg.pragmatic.myautomationframework.utils.enums.StatisticsRange;
import bg.pragmatic.myautomationframework.utils.enums.Username;

@RunWith(Enclosed.class)
public class AdminDashboardTest {

	@RunWith(Parameterized.class)
	public static class ParameterizedAdminDashboardTest {
		private String selectedOption;
		private List<String> expectedXAxis;
		private List<String> expectedYAxis;
		
		@Parameters
		public static Object[][] testData() {
			Object[][] testData = { 
					{ StatisticsRange.TODAY.getStatisticsRange(), 
						Arrays.asList("00", "01", "02", "03", "04", "05", "06",	"07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"), 
						Arrays.asList("-1.0", "-0.5", "0.0", "0.5", "1.0")}, 
					{ StatisticsRange.THIS_WEEK.getStatisticsRange(), 
					    Arrays.asList("Sun", "Mon", "Tue","Wed","Thu","Fri","Sat"),
					    Arrays.asList("0", "1", "2", "3", "4", "5")},
					{ StatisticsRange.THIS_MONTH.getStatisticsRange(), 
					    Arrays.asList("1", "2", "3", "4", "5", "6",	"7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"), 
						Arrays.asList("0", "2", "4", "6", "8")}, 
					{ StatisticsRange.THIS_YEAR.getStatisticsRange(),
						Arrays.asList( "Jan", "Feb","Mar", "Apr", "May","Jun","Jul","Aug","Sep", "Oct","Nov","Dec"),
						Arrays.asList("0", "10", "20", "30", "40", "50", "60")} 
			};

			return testData;
		}

		public ParameterizedAdminDashboardTest(String selectedOption, List<String> expectedXAxis, List<String> expectedYAxis ) {
			this.selectedOption = selectedOption;
			this.expectedXAxis = expectedXAxis;
			this.expectedYAxis = expectedYAxis;
		}

	
		@BeforeClass
		public static void init() {
			Browser.setup();
			AdminLogin.open();
			AdminLogin.login(Username.ADMIN, Password.ADMINPASS);
		}

		@AfterClass
		public static void tearDown() {
			Browser.quit();
		}
		
		@Test
		public void adminStatisticsOptionsWhenSelectedReportChangeTest() {
			AdminDashboard.clickOnStatisticsOption(this.selectedOption);
			List<String> actualXAxisValues = AdminDashboard.getStatisticsOptionsXAxisValues();
			List<String> actualYAxisValues = AdminDashboard.getStatisticsOptionsYAxisValues();

			AdminDashboard.verifyAxisValues("The X axis values are not as expected.", this.expectedXAxis, actualXAxisValues);
			AdminDashboard.verifyAxisValues("The Y axis values are not as expected.", this.expectedYAxis, actualYAxisValues);
		}
	}
	
	public static class NotParameterizedAdminDashboardTests {

	@Before
	public void init() {
		Browser.setup();
		AdminLogin.open();
		AdminLogin.login(Username.ADMIN, Password.ADMINPASS);
		
	}

	@After
	public void tearDown() {
		Browser.quit();
	}

	@Test
	public void adminStatisticsSelectRangeSizeTest() {
		AdminDashboard.verifyStatisticsRangeSize("The options are not 4.");
	}

	@Test
	public void adminStatisticsSelectRangeIsMultipleTest() {
		AdminDashboard.verifyStatisticsRangeIsMultiple("The options are multiple choice.");
	}

	@Test
	public void adminStatisticsSelectOptionsTest() {
		List<String> expectedOptions = Arrays.asList(new String[] { StatisticsRange.TODAY.getStatisticsRange(),
				StatisticsRange.THIS_WEEK.getStatisticsRange(), StatisticsRange.THIS_MONTH.getStatisticsRange(),
				StatisticsRange.THIS_YEAR.getStatisticsRange() });
		AdminDashboard.verifyStatisticsRangeOptions("The options are different than expected.", expectedOptions);
	}

}
}
