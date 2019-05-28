package com.test.eventConnector;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import com.test.helper.Hook;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class OnSwipe {
	
	private AndroidDriver<WebElement> driverOnSwipe;
	
	public OnSwipe() {
		this.driverOnSwipe = Hook.getDriver();
	}
	
	@SuppressWarnings("rawtypes")
	public void swipeDown() {
		Dimension size;
		int start = 0;
		int end = 0;
		int anchor = 0;
		int timeduration = 2;

		size = getDriverOnSwipe().manage().window().getSize();
		end = (int) (size.height * 0.80);
		start = (int) (size.height * 0.20);
		anchor = size.width / 2;

		new TouchAction(getDriverOnSwipe()).press(PointOption.point(anchor, start))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(timeduration)))
				.moveTo(PointOption.point(anchor, end)).release().perform();
	}

	@SuppressWarnings("rawtypes")
	public void swipeUp() {
		Dimension size;
		int start = 0;
		int end = 0;
		int anchor = 0;
		int timeduration = 2;

		size = getDriverOnSwipe().manage().window().getSize();
		System.out.println(size);
		end = (int) (size.height * 0.20);
		start = (int) (size.height * 0.80);
		anchor = size.width / 2;

		new TouchAction(getDriverOnSwipe()).press(PointOption.point(anchor, start))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(timeduration)))
				.moveTo(PointOption.point(anchor, end)).release().perform();
	}
	
	@SuppressWarnings("rawtypes")
	public void swipeLeft() {
		Dimension size;
		int anchor = 0;
		int end = 0;
		int start = 0;
		int timeduration = 2;

		size = getDriverOnSwipe().manage().window().getSize();
		System.out.println(size);
		start = (int) (size.width * 0.80);
		end = (int) (size.width * 0.20);
		anchor = size.height / 2;

		new TouchAction(getDriverOnSwipe()).press(PointOption.point(start, anchor))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(timeduration)))
				.moveTo(PointOption.point(end, anchor)).release().perform();
	}
	
	@SuppressWarnings("rawtypes")
	public void swipeRight() {
		Dimension size;
		int anchor = 0;
		int end = 0;
		int start = 0;
		int timeduration = 2;

		size = getDriverOnSwipe().manage().window().getSize();
		System.out.println(size);
		start = (int) (size.width * 0.20);
		end = (int) (size.width * 0.80);
		anchor = size.height / 2;

		new TouchAction(getDriverOnSwipe()).press(PointOption.point(start, anchor))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(timeduration)))
				.moveTo(PointOption.point(end, anchor)).release().perform();
	}
	
	public AndroidDriver<WebElement> getDriverOnSwipe() {
		return driverOnSwipe;
	}

	public void setDriverOnSwipe(AndroidDriver<WebElement> driverOnSwipe) {
		this.driverOnSwipe = driverOnSwipe;
	}
}
