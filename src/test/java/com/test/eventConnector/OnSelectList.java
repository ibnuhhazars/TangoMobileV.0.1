package com.test.eventConnector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.helper.Hook;

import io.appium.java_client.MobileBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;

public class OnSelectList {

	private WebDriverWait wait;
	private AndroidDriver<WebElement> driverOnSelectList;

	public OnSelectList() {
		this.driverOnSelectList = Hook.getDriver();
		setWait(new WebDriverWait(getDriverOnSelectList(), 10));
	}

	public void selectListByContentDesc(String text, String objectName) throws InterruptedException {
		getWait().until(ExpectedConditions.elementToBeClickable(ByAndroidUIAutomator.AccessibilityId(objectName)));

		getDriverOnSelectList().findElementByAndroidUIAutomator("UiSelector().description(\"" + objectName + "\")")
				.click();
		Thread.sleep(1000);
		getDriverOnSelectList().findElementByAndroidUIAutomator("UiSelector().text(\"" + text + "\")").click();
	}

	public void selectListById(String text, String objectName) throws InterruptedException {
		getWait().until(ExpectedConditions.elementToBeClickable(By.id(objectName)));

		getDriverOnSelectList().findElement(By.id(objectName)).click();
		Thread.sleep(1000);
		getDriverOnSelectList().findElementByAndroidUIAutomator("UiSelector().text(\"" + text + "\")").click();
	}

	public void selectListByXpath(String text, String objectName) throws InterruptedException {
		getWait().until(ExpectedConditions.elementToBeClickable(By.id(objectName)));
		
		getDriverOnSelectList().findElement(By.xpath(objectName)).click();
		Thread.sleep(1000);
		getDriverOnSelectList().findElementByAndroidUIAutomator("UiSelector().text(\"" + text + "\")").click();
	}

	public WebDriverWait getWait() {
		return wait;
	}

	public void setWait(WebDriverWait wait) {
		this.wait = wait;
	}

	public AndroidDriver<WebElement> getDriverOnSelectList() {
		return driverOnSelectList;
	}

	public void setDriverOnSelectList(AndroidDriver<WebElement> driverOnSelectList) {
		this.driverOnSelectList = driverOnSelectList;
	}
}
