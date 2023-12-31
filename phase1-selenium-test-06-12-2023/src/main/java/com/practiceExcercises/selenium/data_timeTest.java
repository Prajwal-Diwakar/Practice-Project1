package com.practiceExcercises.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class data_timeTest {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		data_time_setup();
		data_timeExists();
		data_time();
		
		Thread.sleep(2000);
		
		driver.close();
	
		
	}
	
	public static void data_time_setup() {
		//step1: create the siteurl and driverpath
		
		String siteURL= "file:///C:/Users/Dell/eclipse-workspace/phase1-selenium-test-06-12-2023/static/webElements_practice.html";
		String driverpath= "drivers//windows//chromedriver.exe";
		
		//step2: set system properties for selenium driver
		System.setProperty("webdriver.chromedriver.exe" , driverpath);
		
		// step3: instantiate selenium webdriver
				driver = new ChromeDriver();
				
				// step5: launch browser
				driver.get(siteURL);
		
		}
	
	public static void data_timeExists() {
		
		WebElement date= driver.findElement(By.id("bdatetime"));
		
		if(date.isDisplayed()) {
			
			System.out.println("The test case 1 passed");
			
		}
		else {
			System.out.println("The test case 1 failed");

			
		}
			
	}
	
	public static void data_time() {
		
		
		WebElement timedatainput= driver.findElement(By.id("bdatetime"));
		
		//Fill date as dd/mm/yyyy as 09/25/2013
				timedatainput.sendKeys("09122023");
				
				 //Press tab to shift focus to time field
				timedatainput.sendKeys(Keys.TAB);
				
				//Fill time as 02:45 PM
				timedatainput.sendKeys("1030AM");
				
		
		if(timedatainput.isDisplayed()) {
			

			System.out.println("The test case 2 passed");
			
		}
		else {
			System.out.println("The test case 2 failed");

			
		}
		}
	}


