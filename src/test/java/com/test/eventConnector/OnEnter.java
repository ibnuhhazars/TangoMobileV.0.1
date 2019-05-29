package com.test.eventConnector;

import org.openqa.selenium.WebElement;

import com.test.helper.Hook;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class OnEnter {
	
	private AndroidDriver<WebElement> driverOnEnter;
	
	public OnEnter() {
		this.driverOnEnter = Hook.getDriver();
	}
	
	public void enter() {
		getDriverOnEnter().pressKey(new KeyEvent(AndroidKey.ENTER));
	}

	public AndroidDriver<WebElement> getDriverOnEnter() {
		return driverOnEnter;
	}

	public void setDriverOnEnter(AndroidDriver<WebElement> driverOnEnter) {
		this.driverOnEnter = driverOnEnter;
	}
}
