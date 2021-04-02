package webdriver;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

	private static DriverFactory instancia = null;  
	private WebDriver driver = null;
	
	public static DriverFactory getInstancia() {
		if(instancia == null) {
			instancia = new DriverFactory();
		}
		return instancia;
	}
	
	public void setDriver(DriverType driverType) {
		if(driverType.equals(DriverType.CHROME)) {
			ChromeFactory chromeFactory = new ChromeFactory();
			driver = chromeFactory.abrirGoogleChrome();
		}else {
			FirefoxFactory firefoxFactory = new FirefoxFactory();
			driver = firefoxFactory.abrirFireFox();	
		}
		
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void quitDriver() {
		if (driver != null) {
			driver.quit();
		}
	}
		
	
}
