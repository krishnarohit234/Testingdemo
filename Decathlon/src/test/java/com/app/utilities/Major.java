package com.app.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Major {
	public static WebDriver getWebDriver(String browserType) {
		WebDriver driver=null;
		if(browserType.equalsIgnoreCase("chrome")) {
			System.out.println("chrome driver");
			System.setProperty("webdriver.chrome.driver","E:\\hkf\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else  {
			System.out.println("firefoxdriver");
			System.setProperty("webdriver.gecko.driver","E:\\AOP\\geckodriver.exe" );
			driver=new FirefoxDriver();
		} 
		return driver;
	}
	
}
