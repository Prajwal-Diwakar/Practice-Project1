package com.simplilearnPractice.testng.amazon;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class AmazonSearchTest {

	// step1: formulate a test domain url & driver path
	String siteUrl = "https://www.amazon.in/";
	String driverPath = "drivers/windows/chromedriver.exe";
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		// step2: set system properties for selenium dirver
		System.setProperty("webdriver.chromedriver.driver", driverPath);

		// step3: instantiate selenium webdriver
		driver = new ChromeDriver();

		// step4: launch browser
		driver.get(siteUrl);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test  (description = "Search Iphone 15 pro max")
	public void testSearch1() throws InterruptedException {
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Iphone 15 pro max");
		searchBox.submit();

		// add delay 
		Thread.sleep(2000);
		
		String expectedTitle = "Amazon.in : Iphone 15 pro max";
		String actualTitle = driver.getTitle();
		
		assertEquals(actualTitle, expectedTitle);
	}

	
	@Test (description = "Search Iphone 15 pro max")
	public void testSearch2() throws InterruptedException {
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.clear();
		searchBox.sendKeys("Apple Mac book");
		searchBox.submit();

		// add delay 
		Thread.sleep(2000);
		
		String expectedTitle = "Amazon.in : Apple Mac book";
		String actualTitle = driver.getTitle();
		
		assertEquals(actualTitle, expectedTitle);
	}
	
	
 // TODO :  WAT for search few more products(4)
	
	@Test (description = "search for the dell laptops")
	public void testSearch3() throws InterruptedException {
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.clear();
		searchBox.sendKeys("Dell Laptops");
		searchBox.submit();

		// add delay 
		Thread.sleep(2000);
		
		String expectedTitle = "Amazon.in : Dell Laptops";
		String actualTitle = driver.getTitle();
		
		assertEquals(actualTitle, expectedTitle);
	}
	
	@Test (description=" search for the sneakers")
	
	public void testSearch4() throws InterruptedException{
		
		WebElement searchBox =driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.clear();
		searchBox.sendKeys("sneakers");
		
		// add delay 
				Thread.sleep(2000);
				
				String expectedTitle = "Amazon.in : sneakers";
				String actualTitle = driver.getTitle();
				
				assertNotEquals(actualTitle, expectedTitle);
			}
	
	
	
	@Test (description=" search for the LED Lights")
	public void testSearch5() throws InterruptedException{
		
		WebElement searchBox =driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.clear();
		searchBox.sendKeys("Philips Lights");
		
		// add delay 
				Thread.sleep(2000);
				
				String expectedTitle = "Amazon.in : Philips Lights";
				String actualTitle = driver.getTitle();
				
				assertNotEquals(actualTitle, expectedTitle);
			}

@Test (description=" search for the Fan")
	
	public void testSearch6() throws InterruptedException{
		
		WebElement searchBox =driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.clear();
		searchBox.sendKeys("Havells Fans");
		
		// add delay 
				Thread.sleep(2000);
				
				String expectedTitle = "Amazon.in : Havelles Fans";
				String actualTitle = driver.getTitle();
				
				assertNotEquals(actualTitle, expectedTitle);
			}
	
	}
	
	
	


