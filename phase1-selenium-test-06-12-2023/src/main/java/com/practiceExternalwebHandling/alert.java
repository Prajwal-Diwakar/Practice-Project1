package com.practiceExternalwebHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alert {
	  static WebDriver driver;
	public static void main (String[] args) throws InterruptedException {
		
		alertsetup();
		
		alert1();
		
		
		alert2();
		
		alert3();
	}
	
	public static void alertsetup() {
		//step1: create the siteurl and driverpath
		
		String siteURL= "file:///C:/Users/Dell/eclipse-workspace/phase1-selenium-test-06-12-2023/static/alert.html";
		String driverpath= "drivers//windows//chromedriver.exe";
		
		//step2: set system properties for selenium driver
		System.setProperty("webdriver.chromedriver.exe" , driverpath);
		
		// step3: instantiate selenium webdriver
				driver = new ChromeDriver();
				
				// step5: launch browser
				driver.get(siteURL);
		
		}
	
	
	public static void alert1() throws InterruptedException {
		
		driver.findElement(By.cssSelector("body > p:nth-child(2) > button")).click();
		
		Alert alert = driver.switchTo().alert();  //switch to sub alert window
		
		String expText = "Do you really want to proceed ??";
		if (expText.equals(alert.getText())) {
			System.out.println("Test is passed !");
		} else {
			System.out.println("Test is failed !");
		}
		
	
		
		Thread.sleep(2000);
		
		
		alert.accept();  ///accepts the alert window information
		
	
	}
	
	public static void alert2() throws InterruptedException {
		// find alert button and click
		driver.findElement(By.xpath("/html/body/p[6]/button")).click();

		// switch to sub confirmation alert window
		Alert propmt = driver.switchTo().alert();

		String expText = "Please enter your name.";
		if (expText.equals(propmt.getText())) {
			System.out.println("Test 2 is passed !");
		} else {
			System.out.println("Test 2 is failed !");
		}

		Thread.sleep(2000);

		// cancel the alert
		propmt.accept();
	}
	public static void alert3() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/p[6]/button")).click();
		
		
	
		
		Alert prompt= driver.switchTo().alert();
		
	    String expected= "Please enter your name.";
	    Thread.sleep(2000);
	    
	    prompt.sendKeys("John Smith");		
	  
	    
		if(expected.equals(prompt.getText())) {
			
			System.out.println("Test 3 is passed !");
		} else {
			System.out.println("Test 3 is failed !");
		}
	
	
		
		
		prompt.dismiss();
		
	}

	

}
