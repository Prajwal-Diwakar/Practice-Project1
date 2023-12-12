package com.practiceExternalwebHandling;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

public class Iframess {  
	
	static WebDriver driver;
    public static void main (String[] args) throws InterruptedException {
    	
    	setup();
    	
    	Thread.sleep(2000);
	
    	iframe() ;
}
	public static void setup() {
		
	
			//step1: create the siteurl and driverpath
			
			String siteURL= "https://www.w3schools.com/html/html_iframe.asp";
			String driverpath= "drivers//windows//chromedriver.exe";
			
			//step2: set system properties for selenium driver
			System.setProperty("webdriver.chromedriver.exe" , driverpath);
			
			// step3: instantiate selenium webdriver
					driver = new ChromeDriver();
					
					// step5: launch browser
					driver.get(siteURL);
			
			}
		
		
		public static void iframe() throws InterruptedException {
			
		
		driver.switchTo().frame(0);
		
		Thread.sleep(2000);
		
		WebElement next=driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/a[2]"));
		next.click();
	}
}
