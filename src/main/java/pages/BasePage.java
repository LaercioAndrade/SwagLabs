package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webdriver.DriverFactory;

public class BasePage {

	
	protected WebDriver driver = DriverFactory.getInstancia().getDriver();
	public static final String URL_PADRAO = "https://www.saucedemo.com/";
	
	
	@FindBy(id = "user-name")
	public WebElement inputusername;
	
	@FindBy(id = "password")
	public WebElement inputPassword;
	
	@FindBy(id = "login-button" )
	public WebElement btnLogin;
	
	@FindBy(xpath = "//h3[@data-test='error']")
	public WebElement msgError;
	
	
	public BasePage() {
		PageFactory.initElements(driver, this);
		driver.get(URL_PADRAO);
	}
	
	public void realizarLogin(String username, String password) {
		inputusername.sendKeys(username);
		inputPassword.sendKeys(password);
		btnLogin.click();
	}

	
	
		
}
