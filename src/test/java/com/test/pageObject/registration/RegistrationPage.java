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
	String label_preferedProgrammingLanguage_data = "label_preferedProgrammingLanguage_data";
	
	// TODO: Test Data
	String dataUserName = "Ibnuh";
	String dataEmail = "Ibnuh.Hazar@gmail.com";
	String dataPassword = "P@ssw0rd";
	String dataInputProgrammingLanguage = "Java";
			
	public void fillRegistrationForm() throws InterruptedException {
		getSetText().setTextById(dataUserName, txtInputUsername);
		getSetText().setTextById(dataEmail, txtInputEmail);
		getSetText().setTextById(dataPassword, txtInputPassword);
		getSelectList().selectListById(dataInputProgrammingLanguage, dropDownInput_preferedProgrammingLanguage);
		getClick().clickById(checkBoxInput_adds);
		getClick().clickById(btnRegisterUser);
	}
	
	public void verifyRegistrationUserLanguage(String text) {
		getVerify().verifyById(text, label_preferedProgrammingLanguage_data);
	}
}
