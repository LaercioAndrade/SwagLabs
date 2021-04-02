package Steps;


import java.util.Map;

import org.junit.Assert;



import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import pages.BasePage;
import webdriver.DriverFactory;

public class LoginSteps {
	BasePage basePage = new BasePage();
	
	
	@Dado("que eu acesso a tela de login")
	public void que_eu_acesso_a_tela_de_login() {
	 Assert.assertEquals("Swag Labs", DriverFactory.getInstancia().getDriver().getTitle());
		
		
	}
	@Quando("informo os dados corretos de login")
	public void informo_os_dados_corretos_de_login(io.cucumber.datatable.DataTable dataTable) {
		for( Map<String, String> map: dataTable.asMaps()) {
		basePage.realizarLogin(map.get("usuario"), map.get("senha"));
		}
			    
	}

	@Entao("valido se o login e realizado com sucesso")
	public void valido_se_o_login_e_realizado_com_sucesso() {
		Assert.assertEquals("https://www.saucedemo.com/inventory.html", DriverFactory.getInstancia().getDriver().getCurrentUrl());
	}
}
