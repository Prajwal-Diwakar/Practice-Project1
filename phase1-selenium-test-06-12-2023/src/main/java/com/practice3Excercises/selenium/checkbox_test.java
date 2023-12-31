package com.practice3Excercises.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox_test {
	
	static WebDriver  driver;
	
	
	public static void main(String[] args) {
		
		setup();
		checkboxexists();
		
		checkboxbutton1();
		
		testCheckboxSelectedAndDeselect();
		
	}
	
	public static void setup() {
		
		
		String siteURL= "file:///C:/Users/Dell/eclipse-workspace/phase1-selenium-test-06-12-2023/static/webElements_practice.html";
		String driverPath = "drivers/windows/chromedriver.exe";
		
		// step2: set system properties for selenium dirver
		System.setProperty("webdriver.chrome.driver", driverPath);

		// step3: instantiate selenium webdriver
		driver = new ChromeDriver();

		// step4: add implicit wait (Unconditional Delay)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		// step5: launch browser
		driver.get(siteURL);
	}
	
     public static void checkboxexists() {
		
		WebElement checkbox1= driver.findElement(By.id("vehicle1"));
		WebElement checkbox2= driver.findElement(By.id("vehicle2"));
		WebElement checkbox3= driver.findElement(By.id("vehicle3"));
		
		if(checkbox1.isDisplayed() && checkbox2.isDisplayed() && checkbox3.isDisplayed()) {
			
			System.out.println("The checkbox test case passed");
		}else {
			System.out.println("The checkbox test case failed");
				}
		}
     
     public static void checkboxbutton1() {
    	 
    	 WebElement checkbox2= driver.findElement(By.id("vehicle2"));
    	 
    	 if(checkbox2.isSelected()) {
    		 
    		 System.out.println("The checkbox button1 test case passed");
 		}else {
 			System.out.println("The checkbox button1 test case failed");
 				}
    	 }
     
     public static void testCheckboxSelectedAndDeselect() {

 		WebElement vehicle1 = driver.findElement(By.id("vehicle1"));
 		WebElement vehicle2 = driver.findElement(By.id("vehicle2"));
 		WebElement vehicle3 = driver.findElement(By.id("vehicle3"));

 		vehicle1.click();   // select vehicle 1
 		vehicle2.click();   // deselect vehicle 2
 		vehicle3.click();   // select vehicle 1
 		
 		if (vehicle1.isSelected() && !vehicle2.isSelected() && vehicle3.isSelected()) {
 			System.out.println("Test vehicle 1,3 is selected  and  vehicle 2 deselect Passed !");
 		} else {
 			System.out.println("est vehicle 1,3 is selected  and  vehicle 2 deselect is Failed !");
 		}
 	}
     }
     

	

