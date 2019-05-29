package com.test.eventConnector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.helper.Hook;

import io.appium.java_client.MobileBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;

public class OnSetText {

	private WebDriverWait wait;
	private AndroidDriver<WebElement> driverOnSetText;

	public OnSetText() {
		this.driverOnSetText = Hook.getDriver();
		setWait(new WebDriverWait(getDriverOnSetText(), 10));
	}

	public void setTextByContentDesc(String text, String objectName) {
		getWait().until(
				ExpectedConditions.invisibilityOfElementLocated(ByAndroidUIAutomator.AccessibilityId(objectName)));
		getDriverOnSetText().findElementByAndroidUIAutomator("UiSelector().description(\"" + objectName + "\")")
				.sendKeys(text);
	}

	public void setTextById(String text, String objectName) {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(By.id(objectName)));
		getDriverOnSetText().findElement(By.id(objectName)).sendKeys(text);
	}
	
	public void setTextByXpath(String text, String objectName) {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(objectName)));
		getDriverOnSetText().findElement(By.xpath(objectName)).sendKeys(text);
	}

	public AndroidDriver<WebElement> getDriverOnSetText() {
		return driverOnSetText;
	}

	public void setDriverOnSetText(AndroidDriver<WebElement> driverOnSetText) {
		this.driverOnSetText = driverOnSetText;
	}

	public WebDriverWait getWait() {
		return wait;
	}

	public void setWait(WebDriverWait wait) {
		this.wait = wait;
	}

}
