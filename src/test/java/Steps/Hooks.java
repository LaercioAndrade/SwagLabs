package Steps;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import webdriver.DriverFactory;
import webdriver.DriverType;

public class Hooks {

	@Before
	public void abrirNavegador() {
		DriverFactory.getInstancia().setDriver(DriverType.CHROME);
	}
	
	@After public void fecharNavegador() {
		DriverFactory.getInstancia().quitDriver();
	}
}
