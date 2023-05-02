package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.NavMenuPage;
import utils.BaseTest;
import utils.TestNgListener;

//@Listeners(TestNgListener.class)
public class LoginTest extends BaseTest {
	
	@Parameters({"user", "pass"})
	@Test (groups = "LoginFunctionality")
	public void loginTest(String username, String parola) {
		
		app.click(app.menu.loginLink);
		app.loginPage.loginInApp(username, parola);
		assertTrue(app.loginPage.loginSucessMessageIsDisplayed());

		app.loginPage.logoutFromApp();
		
	}
	@Parameters({"invuser", "invpass"})
	@Test(priority =2, groups = "LoginFunctionality")
	public void invalidLoginTest(String user, String pass) {
		
		app.click(app.menu.loginLink);
		app.loginPage.loginInApp(user, pass);
		assertTrue(app.loginPage.loginErrorMessageIsDisplayed());

	}

}
