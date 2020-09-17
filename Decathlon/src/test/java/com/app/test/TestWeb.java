
package com.app.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.htc.operation.TestOperation;
import com.app.utilities.Major;
import com.app.utilities.ServiceProp;

@Test
public class TestWeb {
	public WebDriver driver=null;
	ServiceProp sars=new ServiceProp();
	TestOperation tsk=new TestOperation();
	
	@BeforeClass
	public WebDriver startUp() {
		this.driver=Major.getWebDriver("firefox");
		return driver;
	}
	
	@Test
	public void service() {
		driver.get("https://www.decathlon.in/p/8534360/outdoor-badminton/br-ad-set-discover ");
	   tsk.giveSearch(driver).sendKeys("Badminton racket");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		tsk.giveSelect(driver).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		tsk.giveCart(driver).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		tsk.scroll(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		tsk.screenshotone(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		tsk.giveNews(driver).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		tsk.scrollTwo(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		tsk.giveMathes(driver).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		tsk.screenShottwo(driver);
		
		
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}