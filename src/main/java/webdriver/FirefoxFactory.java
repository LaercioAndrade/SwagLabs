package webdriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxFactory {

	public FirefoxDriver abrirFireFox() {
		FirefoxDriver firefoxDriver = new FirefoxDriver(setFirefoxOptions());
		return firefoxDriver;
	}
	
	private FirefoxOptions setFirefoxOptions() {
		System.setProperty("webdriver.gecko.driver", "./src/main/resources/driver/geckodriver.exe");
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.addArguments(
				"--start-maximized");
		return firefoxOptions;
		
	}
	
}
