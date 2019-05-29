package com.test.eventConnector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.helper.Hook;

import io.appium.java_client.MobileBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;

public class OnClick {

	private WebDriverWait wait ;
	private AndroidDriver<WebElement> driversOnClick;

	public OnClick() {
		this.driversOnClick = Hook.getDriver();
		setWait(new WebDriverWait(getDriversOnClick(), 10));
	}

	public void clickByContentdesc(String objectName) {
		getWait().until(ExpectedConditions.elementToBeClickable(ByAndroidUIAutomator.AccessibilityId(objectName)));
		getDriversOnClick().findElementByAndroidUIAutomator("UiSelector().description(\"" + objectName + "\")").click();
	}

	public void clickById(String objectName) {
		getWait().until(ExpectedConditions.elementToBeClickable(By.id(objectName)));
		getDriversOnClick().findElement(By.id(objectName)).click();
	}
	
	public void clickByXpath(String objectName) {
		getWait().until(ExpectedConditions.elementToBeClickable(By.xpath(objectName)));
		getDriversOnClick().findElement(By.xpath(objectName)).click();
	}

	public WebDriverWait getWait() {
		return wait;
	}

	public void setWait(WebDriverWait wait) {
		this.wait = wait;
	}

	public AndroidDriver<WebElement> getDriversOnClick() {
		return driversOnClick;
	}

	public void setDriversOnClick(AndroidDriver<WebElement> driversOnClick) {
		this.driversOnClick = driversOnClick;
	}
}
