package com.test.helper;

import java.io.File;
import java.io.FilenameFilter;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Hook extends Drivers {

	@Before("@deviceOne")
	public void devicesOne(Scenario scenario) throws MalformedURLException {
		this.setMyScenario(scenario);
		File sourceDir = new File(System.getProperty("user.dir"), "/APK");

		String[] apkFilenames = sourceDir.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if (name.endsWith(".apk"))
					return true;
				else
					return false;
			}
		});

		// TODO: Get newest file for list of apkFilenames
		String apkFilepath = sourceDir.getAbsolutePath() + File.separator + apkFilenames[0];

		getCap().setCapability("deviceName", "192.168.56.101:5555");
		getCap().setCapability("platformVersion", "7.0");
		getCap().setCapability("platformName", "Android");
		getCap().setCapability("appWaitActivity", "io.selendroid.testapp.HomeScreenActivity");
		getCap().setCapability("appPackage", "io.selendroid.testapp");
		getCap().setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
		getCap().setCapability("automationName", "uiautomator2");
		getCap().setCapability(MobileCapabilityType.APP, apkFilepath);

		URL url = new URL("http://127.0.0.1:4750/wd/hub");
		setDriver(new AndroidDriver<WebElement>(url, getCap()));
	}

	@Before("@deviceTwo")
	public void deviceTwo(Scenario scenario) throws MalformedURLException {
		this.setMyScenario(scenario);
		File sourceDir = new File(System.getProperty("user.dir"), "/APK");

		String[] apkFilenames = sourceDir.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if (name.endsWith(".apk"))
					return true;
				else
					return false;
			}
		});

		// TODO: Get newest file for list of apkFilenames
		String apkFilepath = sourceDir.getAbsolutePath() + File.separator + apkFilenames[0];

		getCap().setCapability("deviceName", "192.168.56.102:5555");
		getCap().setCapability("platformVersion", "7.1.1");
		getCap().setCapability("platformName", "Android");
		getCap().setCapability("appWaitActivity", "io.selendroid.testapp.HomeScreenActivity");
		getCap().setCapability("appPackage", "io.selendroid.testapp");
		getCap().setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
		getCap().setCapability("automationName", "uiautomator2");
		getCap().setCapability(MobileCapabilityType.APP, apkFilepath);

		URL url = new URL("http://127.0.0.1:4751/wd/hub");
		setDriver(new AndroidDriver<WebElement>(url, getCap()));
	}

	@After
	public void afterTest() throws Exception {
		
		if (getMyScenario().isFailed()) {
			getMyScenario().embed(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES), "image/png");
			getMyScenario().write("Scenario Fail");
		} else {
			getMyScenario().write("Scenario Pass");
		}

		Thread.sleep(3000);

		getDriver().quit();
	}
}
