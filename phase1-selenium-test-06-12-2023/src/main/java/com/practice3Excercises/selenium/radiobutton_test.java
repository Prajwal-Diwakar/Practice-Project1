package com.practice3Excercises.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton_test {
	
	static WebDriver driver;
	

	
	public static void main(String[] args) throws InterruptedException {   //returns the value
		
		
		  setup();
		  radiobuttontest();
		  radiobuttonselect1();
		  radiobuttonselect2();
		  radiobuttonselect3();
		  
		  Thread.sleep(2000);
		  
		  driver.close();
		  
		

		
		}
		
	public static void setup() {   //  static  method to create object to a class and doesnot return the value
		
		String siteUrl= "file:///C:/Users/Dell/eclipse-workspace/phase1-selenium-test-06-12-2023/static/webElements_practice.html";
		String driverPath = "drivers/windows/chromedriver.exe";
		
		
		// step2: set system properties for selenium dirver
				System.setProperty("webdriver.chrome.driver", driverPath);

				// step3: instantiate selenium webdriver
				driver = new ChromeDriver();

				// step4: add implicit wait (Unconditional Delay)
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

				// step5: launch browser
				driver.get(siteUrl);
			}
	
		public static void radiobuttontest() {   //method and it doesn't return any value
			
			WebElement radioBt1 = driver.findElement(By.id("male"));
			WebElement radioBt2 = driver.findElement(By.id("female"));
			WebElement radioBt3 = driver.findElement(By.id("other"));

			if (radioBt1.isDisplayed() && radioBt2.isDisplayed() && radioBt3.isDisplayed()) {
				System.out.println("Test is Passed !");
			} else {
				System.out.println("Test is Failed !");
			}
		}
		
		public static void radiobuttonselect1() throws InterruptedException{
			
			Thread.sleep(2000);
			
			WebElement radioBt1 = driver.findElement(By.id("male"));
			
			// select radio button 1
			 radioBt1.click();
			
			if (radioBt1.isSelected()) {
				
				System.out.println("The radio button 1 test case passed");
			}else {
				System.out.println("The radio button 1 test case failed");
			}
			
		}
		
	public static void radiobuttonselect2() throws InterruptedException{
		
		Thread.sleep(2000);
			
			WebElement radioBt2 = driver.findElement(By.id("female"));
			
			// select radio button 2
			 radioBt2.click();
			
			if (radioBt2.isSelected()) {
				
				System.out.println("The radio button 2 test case passed");
			}else {
				System.out.println("The radio button 2 test case failed");
			}
			
		}
	public static void radiobuttonselect3() throws InterruptedException{
		
		Thread.sleep(2000);
		
		WebElement radioBt3 = driver.findElement(By.id("other"));
		
		// select radio button 3
		 radioBt3.click();
		
		if (radioBt3.isSelected()) {
			
			System.out.println("The radio button 3 test case passed");
		}else {
			System.out.println("The radio button 3 test case failed");
		}
		
	}
	

		
		
}	
	
	


