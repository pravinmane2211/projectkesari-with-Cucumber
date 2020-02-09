package com.webutility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class webutility {
	
	private static WebDriver driver=null;
	
	static {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	public static WebDriver getDriver() {
		return driver;
		
	}
	
	 public static void driverQuit() {
		 if (driver != null) {
				driver.close();
				driver.quit();
		 }
	 }
public static webutility getWebutility() {
	return new webutility();
}
	
}
