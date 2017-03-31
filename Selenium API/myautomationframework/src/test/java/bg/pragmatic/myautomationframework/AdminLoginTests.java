package bg.pragmatic.myautomationframework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bg.pragmatic.myautomationframework.backend.AdminDashboard;
import bg.pragmatic.myautomationframework.backend.AdminLogin;
import bg.pragmatic.myautomationframework.utils.Browser;
import bg.pragmatic.myautomationframework.utils.enums.Password;
import bg.pragmatic.myautomationframework.utils.enums.Username;

public class AdminLoginTests {

	@Before
	public void init(){
		Browser.setup();
	}
	
	@Test
	public void successfulLogin(){
		AdminLogin.open();
		AdminLogin.login(Username.ADMIN, Password.ADMINPASS);
	
		AdminDashboard.verifyIsAt("You were unable to login successfully.");
	}
	
	@Test
	public void unsuccessfulLogin(){
		AdminLogin.open();
		AdminLogin.login(Username.NON_EXISTING_USER, Password.NON_EXISTIN_PASS);
		
		AdminLogin.verifyValidationMessage("The validatio messaage is not as expected", "No match for Username and/or Password.");
	}
	@After
	public void tearDown() {
		Browser.quit();
	}
}
