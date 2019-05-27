package com.test.stepDef.Home;

import com.test.pageObject.Home.HomePage;
import cucumber.api.java.en.When;

public class HomeStep extends HomePage {

	@When("^i click button register$")
	public void i_click_button_register() {
		clickButtonRegister();
	}
	
	@When("^i sleep$")
	public void sleep() throws InterruptedException {
		Thread.sleep(10000);
	}
}
