package com.UIAutomation.SeleniumTestProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BaseClass {
	
	//WebDriver driver;
	
//	public BaseClass(WebDriver driver) {
//		this.driver = driver;
//	}
	
//	public void setupDriver(String browser) {
//	 switch(browser) {
//	 case "chrome": 
//		 driver = new ChromeDriver();
//		 driver.get("https://www.amazon.com/");
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		 break;
//	 default:
//		 System.out.println("Wrong browser type");
//		 break;
//	 }		
//	}
	
//	@AfterClass(alwaysRun = true)
//	public void quit() {
//		driver.quit();
//		
//	}
}
