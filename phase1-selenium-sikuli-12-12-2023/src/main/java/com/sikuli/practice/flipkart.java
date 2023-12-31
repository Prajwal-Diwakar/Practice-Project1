package com.sikuli.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class flipkart {
	
	
	public static void main( String[] args) throws InterruptedException, FindFailed {
		
		// seting the url and the driverpath
		String URL="https://www.flipkart.com/";
		String driverpath= "drivers/windows/chromedriver.exe";
		
		// step2: set system properties for selenium dirver
		System.setProperty("webdriver.chromedriver.driver", driverpath);
		
		// step3: instantiate selenium webdriver
				WebDriver driver = new ChromeDriver();
				Screen screen = new Screen();
				
		// step4: make browser window full screen
				
				driver.manage().window().maximize();
				
				// step4: launch browser
				driver.get(URL);
				
				Thread.sleep(3000);
				
				Pattern pattern = new Pattern("C:\\Users\\Dell\\eclipse-workspace\\phase1-selenium-sikuli-12-12-2023\\sikuli-inputs\\mobiletablets.png");
				
				Thread.sleep(3000);
				
				screen.click(pattern);
				
				driver.get(URL);
				
                 Pattern pattern2 = new Pattern("C:\\Users\\Dell\\eclipse-workspace\\phase1-selenium-sikuli-12-12-2023\\sikuli-inputs\\tvappliciance.png");
				
				Thread.sleep(3000);
				
				screen.click(pattern2);
				
				
				Thread.sleep(3000);
				// step6: close driver
				driver.close();
	}

}
