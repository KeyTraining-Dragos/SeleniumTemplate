package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import utils.SeleniumWrappers;

public class LoginPage extends SeleniumWrappers {
	
	
	public LoginPage(WebDriver driver) {
		super(driver);

	}

	public By usernameField = By.cssSelector("ul input[id='log']"); 
	public By passwordField = By.cssSelector("ul input[id='password']");
	public By submitButton = By.cssSelector("ul input[class='submit_button']");
	
	public By loginErrorMessage = By.cssSelector("div[class*='sc_infobox_style_error']");
	public By loginSuccessMessage = By.cssSelector("div[class*='sc_infobox_style_success']");
	
	public By logoutButton = By.cssSelector("li[class='menu_user_logout']");
	
	public By closePopUpButton =  By.cssSelector("a[class='popup_close']");
	
	
	public void closeLoginPopUp() {
		click(closePopUpButton);
	}
	
	
	public void loginInApp(String username, String password) {	
		sendKeys(usernameField, username);
		sendKeys(passwordField, password);
		click(submitButton);
	
	}
	
	public void logoutFromApp() {		
		click(logoutButton);
	}
	
	
	
	public boolean  loginSucessMessageIsDisplayed() {
		return driver.findElement(loginSuccessMessage).isDisplayed();
	}

	
	public boolean  loginErrorMessageIsDisplayed() {
		
		return driver.findElement(loginErrorMessage).isDisplayed();
	}
	
	
	public boolean loginMessageIsDisplayed(By locator) {
		
		return driver.findElement(locator).isDisplayed();

	}

}
