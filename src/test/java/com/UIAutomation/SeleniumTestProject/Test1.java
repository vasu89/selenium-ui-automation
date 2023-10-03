package com.UIAutomation.SeleniumTestProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Test1 extends BaseClass {
	
	WebDriver driver;
	BaseClass bc;
//	public Test1(WebDriver driver) {
//		super(driver);
//		// TODO Auto-generated constructor stub
//	}
	
	@BeforeTest
	public void setupDriver() {
		String browserName = "chrome";
		 switch(browserName) {
		 case "chrome": 
			 driver = new ChromeDriver();
			 driver.get("https://www.amazon.com/");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			 break;
		 default:
			 System.out.println("Wrong browser type");
			 break;
		 }		
		}
//	@BeforeTest
//	public void setup() {
//		bc = new BaseClass();
//		bc.setupDriver("chrome");
//	}

	@Test
	public void testTitle() {
		String titleName = driver.getTitle();
		Assert.assertTrue(titleName.contains("Amazon.com"));
	}
	
	@Test
	public void enterTextIntoSearchBox() {
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("christmas lights");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		WebElement search = driver.findElement(By.xpath("//input[@type = 'submit']"));
		search.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement product = driver.findElement(By.xpath("//div[@class = \"a-section a-spacing-small a-spacing-top-small\"]//span[contains(text(),\"christmas lights\")]"));
		Assert.assertTrue(product.isDisplayed());
	}

	@AfterClass(alwaysRun = true)
	public void quit() {
		driver.quit();
		
	}
}
