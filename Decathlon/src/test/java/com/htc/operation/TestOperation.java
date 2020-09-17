
package com.htc.operation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.app.utilities.ServiceProp;

public class TestOperation {
	public WebElement element=null;
	public WebElement element1=null;
	public WebElement element2=null;
	public WebElement element3=null;
	public WebElement element4=null;
	
	ServiceProp sps=new ServiceProp();
	
	public WebElement giveSearch(WebDriver driver) {
		WebElement element=driver.findElement(By.xpath("//*[@id=\"search\"]"));
		return element;
	}
	public WebElement giveSelect(WebDriver driver) {
		WebElement element1=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[4]/div/div[2]/div[2]/div[1]/div/div[4]/ul/li[2]/div/div/div[3]/div/a/div[2]"));
		return element1;
	}
	public WebElement giveCart(WebDriver driver) {
		WebElement element2=driver.findElement(By.xpath("//*[@id=\"democontainer\"]/div[5]/div[1]/div[2]/div[4]/button"));
		return element2;
	}
    public void scroll(WebDriver driver) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	public void screenshotone(WebDriver driver) {
		File frs=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			File risk=new File("");
			 FileHandler.copy(frs,risk);
	    
		}
		catch(Exception e) {
			System.err.println(e);
		}
	}
	public WebElement giveNews(WebDriver driver) {
		WebElement element3=driver.findElement(By.xpath("//*[@id=\"democontainer\"]/div[6]/footer/div[1]/div[2]/div[1]/div[1]/div/div[3]/div[2]/a[3]"));
		return element3;
	}
	
	public void scrollTwo(WebDriver driver) {
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  WebElement Element=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[6]/div[4]/div/div/div[2]/div[1]"));
	  	js.executeScript("arguments[0].scrollIntoView();", Element);
		}
	
	public WebElement giveMathes(WebDriver driver) {
		WebElement element4=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[6]/div[4]/div/div/div[2]/div[1]"));
		return element4;
	}
  
	public void screenShottwo(WebDriver driver) {
		File fars=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			File rbs=new File("");
			 FileHandler.copy(fars,rbs);
		}
		catch(Exception e) {
			System.err.println(e);
		}
	}
	
}