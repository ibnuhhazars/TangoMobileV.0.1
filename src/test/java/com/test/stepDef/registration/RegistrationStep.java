package com.test.stepDef.registration;

import com.test.pageObject.registration.RegistrationPage;

import cucumber.api.java.en.Then;

public class RegistrationStep extends RegistrationPage {
	
	@Then("^i fill registration requirement$")
	public void i_fill_registration_requirement() {
		fillRegistrationForm();
	}
}
