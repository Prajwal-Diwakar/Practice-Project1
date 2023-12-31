package com.practiceExcercises.selenium;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autoit {
	
	
	static WebDriver driver;
	static WebDriverWait wait;
				public static void main(String[] args) throws IOException, InterruptedException{
					
					setup();
					doc();
					
				}
				
				
				
		public static void setup() {

		// step1: formulate a test domain url & driver path
		String siteUrl = "https://www.ilovepdf.com/word_to_pdf";
		String driverPath = "drivers/windows/chromedriver.exe";

		// step2: set system properties for selenium dirver
		System.setProperty("webdriver.chrome.driver", driverPath);

		// step3: instantiate selenium webdriver
		driver = new ChromeDriver();

		// step4: add explicit wait (Conditional Delay)
		 wait = new WebDriverWait(driver, Duration.ofSeconds(40));

		// step5: launch browser
		driver.get(siteUrl);

	}
	
	
	
	public static void doc() throws IOException, InterruptedException {
		
		WebElement doc= driver.findElement(By.id("pickfiles"));
		doc.click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("autoIT\\upload.exe");
		Thread.sleep(3000);
		
		WebElement doc2=driver.findElement(By.id("processTask"));
		doc2.click();
	}

}
