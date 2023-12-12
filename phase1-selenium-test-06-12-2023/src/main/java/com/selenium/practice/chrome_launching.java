package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class chrome_launching {
	
	public static void main(String[] args) {
		// step1: formulate a test domain url & driver path
		
		String URL= "https://www.google.com/";
		String webpath="drivers/windows/chromedriver.exe";
		
		// step2: set system properties for selenium dirver
		System.setProperty("webdriver.chrome.driver", webpath);
		
		// step3: instantiate selenium webdriver
				WebDriver launch = new ChromeDriver();
				
				// step4: launch browser
				launch.get(URL);
				
				// step5 : Evaluate the Test
				
				// step6: Close browser
				launch.close();
				
				
				
		
	}
}
