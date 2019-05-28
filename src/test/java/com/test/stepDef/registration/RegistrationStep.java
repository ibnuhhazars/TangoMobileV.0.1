package com.test.stepDef.registration;

import com.test.pageObject.registration.RegistrationPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStep extends RegistrationPage {
	
	@When("^i fill registration requirement$")
	public void i_fill_registration_requirement() throws InterruptedException {
		fillRegistrationForm();
	}
	
	@Then("^i verify registration user language is \"([^\"]*)\"$")
	public void i_verify_registration_user_language_is(String arg1) {
		verifyRegistrationUserLanguage(arg1);
	}
}
