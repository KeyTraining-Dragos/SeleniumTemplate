package utils;

import org.openqa.selenium.WebDriver;

import pages.LoginPage;
import pages.NavMenuPage;
/**
 * Class used to instantiate all PageObject classes objects under one single object that will 
 * serve as starting point for all actions.
 * Extending Selenium Wrapper will have acces directly to wrapper methods and can call them directly without the need of an intermediary
 * page object class
 * Ex: app.click(locator)
 */
public class BasePage extends SeleniumWrappers {
	
	/**
	 * Constructor that inherits the Driver from SeleniumWrappers class
	 * @param driver
	 */
	public BasePage(WebDriver driver) {
		super(driver);
	}
	//Page object classes instatiation
	public NavMenuPage menu = new NavMenuPage(driver);
	public LoginPage loginPage = new LoginPage(driver);
	
}
