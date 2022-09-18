package com.trax.testCases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TC_AndroidAppium {

	@Test()
	public void AndroidAppium() throws MalformedURLException, InterruptedException {

		AndroidDriver driver;

		// Sauce capabilities
		MutableCapabilities sauceOptions = new MutableCapabilities();
		sauceOptions.setCapability("username", System.getenv("oauth-sharma.atulkumar29-3deed"));
		sauceOptions.setCapability("access_key", System.getenv("7daa122c-0473-443b-8763-beeadddfc4f9"));
		sauceOptions.setCapability("name", "Appium- Android TCs");
		sauceOptions.setCapability("build", "Atul Appium-Build");
		sauceOptions.setCapability("resigningEnabled", true);
		sauceOptions.setCapability("sauceLabsNetworkCaptureEnabled", true);
		sauceOptions.setCapability("sauceLabsImageInjectionEnabled", true);

		// find a device in the cloud
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "android");
		capabilities.setCapability("automationName", "UiAutomator2");
		// Allocate any available samsung device with Android version 12
		capabilities.setCapability("appium:deviceName", "Samsung.*");
		capabilities.setCapability("appium:platformVersion", "10");
		capabilities.setCapability("appPackage", "com.samsung.android.dialer");
		capabilities.setCapability("appActivity", "com.samsung.android.dialer.DialtactsActivity");
		// String appName = "Android.MyDemoAppRN.apk";
		// capabilities.setCapability("app", "storage:filename=" +appName);
		// capabilities.setCapability("appium:appWaitActivity","com.saucelabs.mydemoapp.rn.MainActivity");
		capabilities.setCapability("autoGrantPermissions", true);
		capabilities.setCapability("sauce:options", sauceOptions);

		System.out.println("before remoteUrl ");

		URL remoteUrl = new URL(
				"https://oauth-sharma.atulkumar29-3deed:7daa122c-0473-443b-8763-beeadddfc4f9@ondemand.us-west-1.saucelabs.com:443/wd/hub");
		// driver = new RemoteWebDriver(url, chromeOptions);

		driver = new AndroidDriver(remoteUrl, capabilities);
		System.out.println("AndroidDriver driver");
		Thread.sleep(10000);
		
		// File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\\\"4\\\"]/android.widget.TextView"))
				.click();
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\\\"3\\\"]/android.widget.TextView"))
				.click();
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\\\"7\\\"]/android.widget.TextView"))
				.click();
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\\\"6\\\"]/android.widget.TextView"))
				.click();
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\\\"8\\\"]/android.widget.TextView"))
				.click();
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\\\"8\\\"]/android.widget.TextView"))
				.click();
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\\\"6\\\"]/android.widget.TextView"))
				.click();
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\\\"1\\\"]/android.widget.TextView"))
				.click();
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\\\"9\\\"]/android.widget.TextView"))
				.click();
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\\\"6\\\"]/android.widget.TextView"))
				.click();

		driver.findElement(By.id("com.samsung.android.incallui:id/voice_disconnect_button")).click();
		System.out.println("hey ...eh oh");

	}
}
