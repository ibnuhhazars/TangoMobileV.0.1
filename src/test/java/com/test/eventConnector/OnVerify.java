package com.test.eventConnector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;

import com.test.helper.Hook;

import io.appium.java_client.MobileBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;

public class OnVerify {

	private WebDriverWait wait;
	private AndroidDriver<WebElement> driverOnVerify;

	public OnVerify() {
		this.driverOnVerify = Hook.getDriver();
		setWait(new WebDriverWait(getDriverOnVerify(), 10));
	}

	public void verifyByContentDesc(String text, String objectName) {
		getWait()
				.until(ExpectedConditions.visibilityOfElementLocated(ByAndroidUIAutomator.AccessibilityId(objectName)));
		String getText = getDriverOnVerify()
				.findElementByAndroidUIAutomator("UiSelector().description(\"" + objectName + "\")").getText();
		AssertJUnit.assertEquals(text, getText);
	}

	public void verifyById(String text, String objectName) {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(By.id(objectName)));
		String getText = getDriverOnVerify().findElement(By.id(objectName)).getText();
		AssertJUnit.assertEquals(text, getText);
	}

	public AndroidDriver<WebElement> getDriverOnVerify() {
		return driverOnVerify;
	}

	public void setDriverOnVerify(AndroidDriver<WebElement> driverOnVerify) {
		this.driverOnVerify = driverOnVerify;
	}

	public WebDriverWait getWait() {
		return wait;
	}

	public void setWait(WebDriverWait wait) {
		this.wait = wait;
	}
}
