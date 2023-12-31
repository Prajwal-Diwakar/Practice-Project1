package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class flipkartSearchTest {
	
	static WebDriver launch = null;
	
	public static void main(String[] args) throws InterruptedException {
		// step1: formulate a test domain url & driver path
		
		String URL= "https://www.flipkart.com/";
		String webpath="drivers/windows/chromedriver.exe";
		
		// step2: set system properties for selenium dirver
		System.setProperty("webdriver.chrome.driver", webpath);
		
		// step3: instantiate selenium webdriver
				launch = new ChromeDriver();
				
				// step4: launch browser
				launch.get(URL);
				
				// step5 : Evaluate the Test
				
				testSearch1();
				
				Thread.sleep(2000);
				testSearch2();
				
				//adding the delay 
				
				Thread.sleep(2000);
				
				launch.close();
				
	}
	
	private static void testSearch1() throws InterruptedException {

		WebElement searchBox = launch.findElement(By.name("q"));
		
		searchBox.sendKeys("Samsung Galaxy S23");
		searchBox.submit();

		// add delay 
		Thread.sleep(2000);
		
		String expectedTitle = "Samsung Galaxy S23- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
		String actualTitle = launch.getTitle();

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Test is Passed !");
		} else {
			System.out.println("Test is Failed !");
		}

		System.out.println("Expected Title : " + expectedTitle);
		System.out.println("Actual Title : " + actualTitle);
	}
	
	private static void testSearch2() throws InterruptedException {
		
		WebElement searchBox = launch.findElement(By.name("q"));
		
		searchBox.clear();
		
		searchBox.sendKeys("Dell Laptop");
		searchBox.submit();
		
		// adding the delay time to test the test condition
		Thread.sleep(2000);
		
		String expectedtitle="Dell Laptop- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
		String actualtitle= launch.getTitle();
		
		
		if (expectedtitle.equals(actualtitle)) {
			System.out.println("Test is Passed !");
		} else {
			System.out.println("Test is Failed !");
		}

		System.out.println("Expected Title : " + expectedtitle);
		System.out.println("Actual Title : " + actualtitle);
	}
	
		
		
	}
	
	
	