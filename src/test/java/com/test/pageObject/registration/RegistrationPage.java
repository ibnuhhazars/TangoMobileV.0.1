package com.test.pageObject.registration;

import com.test.eventConnector.Main;

public class RegistrationPage extends Main {
	
	// TODO: Element
	String txtInputUsername = "inputUsername";
	String txtInputEmail = "inputEmail";
	String txtInputPassword = "inputPassword";
	String dropDownInput_preferedProgrammingLanguage = "input_preferedProgrammingLanguage";
	String checkBoxInput_adds = "input_adds";
	String btnRegisterUser = "btnRegisterUser";
	
	// TODO: Test Data
	String dataUserName = "Ibnuh";
	String dataEmail = "Ibnuh.Hazar@gmail.com";
	String dataPassword = "P@ssw0rd";
	String dataInputProgrammingLanguage = "Java";
			
	public void fillRegistrationForm() {
		getSetText().setTextById(dataUserName, txtInputUsername);
		getSetText().setTextById(dataEmail, txtInputEmail);
		getSetText().setTextById(dataPassword, txtInputPassword);
	}
}
