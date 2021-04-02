package Web;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import pages.BasePage;
import webdriver.DriverFactory;
import webdriver.DriverType;

public class LoginTests {
	
	public static final String PASSWORD = "secret_sauce";

	
	@Before
	public void abrirNavegador() {
		DriverFactory.getInstancia().setDriver(DriverType.CHROME);
	}
	
	@After public void fecharNavegador() {
		DriverFactory.getInstancia().quitDriver();
	}
	
	
	@Test 
	public void deveAbrirPaginaBase() {
		BasePage basePage = new BasePage();
		Assert.assertEquals("Swag Labs", DriverFactory.getInstancia().getDriver().getTitle());
	
}	
	@Test 
	public void realizarLoginComSucesso() {
		BasePage basepage = new BasePage();
		basepage.realizarLogin("standard_user", PASSWORD);
		Assert.assertEquals("https://www.saucedemo.com/inventory.html", DriverFactory.getInstancia().getDriver().getCurrentUrl());
	}

	@Test 
	public void realizarLoginComUsuarioInexistente() {
		BasePage basepage = new BasePage();
		basepage.realizarLogin("usuario_inexistente", PASSWORD);
		Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", basepage.msgError.getText());
	}
	
	@Test 
	public void realizarLoginComUsuarioBloqueado() {
		BasePage basepage = new BasePage();
		basepage.realizarLogin("locked_out_user", PASSWORD);
		Assert.assertEquals("Epic sadface: Sorry, this user has been locked out.", basepage.msgError.getText());
	}
}
