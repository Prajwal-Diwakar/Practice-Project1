package com.project.phase1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;

public class Phase1_Project {
	
	static WebDriver driver;
	static WebDriverWait wait;
	
	public static void main(String[] args) throws InterruptedException {
		setup();
		
		Thread.sleep(2000);
		
		variouslocators();
		
		Thread.sleep(2000);
		
		
		
		Thread.sleep(2000);
		
		scrollPage();
		Thread.sleep(2000);
		
		setup();
		
		verifyusersignin();
		
		searchinput();
		
	
		
	}
	
	public static void setup() {
		

		// step1: formulate a test domain url & driver path
		String siteUrl = "https://amazon.in/ ";
		String driverPath = "drivers/windows/chromedriver.exe";

		// step2: set system properties for selenium dirver
		System.setProperty("webdriver.chrome.driver", driverPath);

		// step3: instantiate selenium webdriver
		driver = new ChromeDriver();
		
		Screen screen = new Screen();
		
		// step4: make browser window full screen
				
		driver.manage().window().maximize();

		// step4: add explicit wait (Conditional Delay)
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));

		// step5: launch browser
		driver.get(siteUrl);
		
	}
	
	public static void variouslocators() throws InterruptedException {
		
		WebElement click1= driver.findElement(By.id("glow-ingress-line1"));
		click1.click();
		 Thread.sleep(2000);
		WebElement click2=driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdateInput\"]"));
		click2.click();
		click2.sendKeys("110003");
		
		WebElement click3=driver.findElement(By.cssSelector("#GLUXZipUpdate > span > input"));
		click3.click();
		
		Thread.sleep(2000);
		 
		
	
	}
	public static void scrollPage() throws InterruptedException {
		
		
        
        // Create an instance of JavascriptExecutor
        JavascriptExecutor scroll = (JavascriptExecutor) driver;

        // Scroll down by 700 pixels
        scroll.executeScript("window.scrollBy(0,700)");

        // Wait for a while to observe the scroll
        Thread.sleep(2000);

        // Scroll up by 700 pixels
        scroll.executeScript("window.scrollBy(0,-700)");

        // Wait for a while to observe the scroll
        Thread.sleep(2000);
        
        driver.close();

    } 

	
	public static void verifyusersignin() throws InterruptedException {
		
		WebElement click1=driver.findElement(By.id("nav-link-accountList"));
		click1.click();
		
		WebElement click2=driver.findElement(By.id("ap_email"));
		click2.click();
		click2.sendKeys(" xxxxxxxx");
		
		WebElement click3=driver.findElement(By.id("continue"));
		click3.click();
		
	    Thread.sleep(2000);
		WebElement click4=driver.findElement(By.name("password"));
		
		click4.sendKeys("xxxxxxxxx");
		
		WebElement click5=driver.findElement(By.id("signInSubmit"));
		click5.click();
		
		String expout= "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String gotout=driver.getTitle();
		
		if (expout.equals(gotout)) {
			System.out.println("USER has  signed !");
		} else {
			System.out.println("User has not signed !");
		}

	}
	
	
	public static void searchinput() throws InterruptedException {
		
		WebElement click1=driver.findElement(By.cssSelector("#navSwmHoliday > a"));
		click1.click();
		
		String expout="Amazon.in: New Launches Store: Electronics";
		String gotout=driver.getTitle();
		
		if(expout.equals(gotout)) {
			System.out.println("Filters are used before the product search");
		}
		else {
			
			System.out.println("Filters are not being used before the product search");
		}
		
		WebElement click2=driver.findElement(By.id("twotabsearchtextbox"));
		click2.click();
		
		click2.sendKeys("iPhone 13");
		
		WebElement click3=driver.findElement(By.id("nav-search-submit-button"));
		click3.click();
		
		Thread.sleep(2000);
		//scroll down little bit
		
		  JavascriptExecutor scroll = (JavascriptExecutor) driver;
		  scroll.executeScript("window.scrollBy(0,300)");
		  
		  Thread.sleep(2000);
		
		WebElement click4=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		click4.click();
		
		Thread.sleep(2000);
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		
		 JavascriptExecutor scroll2 = (JavascriptExecutor) driver;
		  scroll2.executeScript("window.scrollBy(0,300)");
		  
		  Thread.sleep(2000);
		  
		  WebElement click5=driver.findElement(By.cssSelector("#add-to-wishlist-button-submit"));
		  click5.click();

		  Thread.sleep(2000);
		  
				
				// Check if the popup elements are present
		        try {
		  
		  
		        	WebElement click6=driver.findElement(By.cssSelector(" #huc-view-your-list-button > span > a"));
		  
		        	click6.click();
	
		           System.out.println("Confirmation window has been displayed.");
			  
		  
		        } catch (NoSuchElementException e) {
		     
		            // If any of the elements are not found, handle the case where the popup did not appear
			  System.out.println("Confirmation window has not been displayed");
		  }	
		        
		        takeScreenShot("amazon.png");
		
	}
	
	
	public static void takeScreenShot(String fileName) {
		// 1. type cast driver instance too take screen shot
		TakesScreenshot tsc = (TakesScreenshot) driver ;
		
		// 2. call take screen shot method with file type
		File src = tsc.getScreenshotAs(OutputType.FILE);
		
		// 3. create  file  with screen shot
		try {
			FileHandler.copy(src, new File("outputscreenshots\\"+fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

		
	
		

