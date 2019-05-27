package com.test.helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.Scenario;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Drivers {

	private static AndroidDriver<WebElement> driver ;
	private DesiredCapabilities cap = new DesiredCapabilities();
	private AppiumDriverLocalService appiumLocService;
	private Scenario myScenario;
	
	public static AndroidDriver<WebElement> getDriver() {
		return driver;
	}

	@SuppressWarnings("static-access")
	public void setDriver(AndroidDriver<WebElement> driver) {
		this.driver = driver;
	}

	public DesiredCapabilities getCap() {
		return cap;
	}

	public void setCap(DesiredCapabilities cap) {
		this.cap = cap;
	}

	public AppiumDriverLocalService getAppiumLocService() {
		return appiumLocService;
	}

	public void setAppiumLocService(AppiumDriverLocalService appiumLocService) {
		this.appiumLocService = appiumLocService;
	}

	public Scenario getMyScenario() {
		return myScenario;
	}

	public void setMyScenario(Scenario myScenario) {
		this.myScenario = myScenario;
	}
}
