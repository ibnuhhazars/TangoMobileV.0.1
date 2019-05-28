package com.test.pageObject.Home;

import com.test.eventConnector.Main;

public class HomePage extends Main {
	
	String buttonRegister =  "startUserRegistrationCD";
	
	public void clickButtonRegister() {
		getClick().clickByContentdesc(buttonRegister);
	}
}
