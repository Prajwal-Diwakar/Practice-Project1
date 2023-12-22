package com.practice15.testng.webdriver.listeners;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.practice15.testng.webdriver.listeners.SW_Listener;

public class FlipkartTest {
	
	


	

		public static void main(String[] args) {

			String siteUrl = "https://www.flipkart.com/";
			String driverPath = "drivers/windows/geckodriver.exe";
			System.setProperty("webdriver.geckodriver.driver", driverPath);

			// create a webdriver instance 
			WebDriver driver = new FirefoxDriver();

			// create instance of EventFiringWebDriver
			EventFiringWebDriver  eDriver = new EventFiringWebDriver(driver);
			
			// create instance of your event listener
			SW_Listener eListener  = new SW_Listener();
			
			// attach the lister to eDriver
			eDriver.register(eListener);
			
			eDriver.get(siteUrl);
			
			eDriver.unregister(eListener);
			
		}
	}



