package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class flipkart {
	
	public static void main(String[] args) {
		// step1: formulate a test domain url & driver path
		
		String URL= "https://www.flipkart.com/";
		String webpath="drivers/windows/chromedriver.exe";
		
		// step2: set system properties for selenium dirver
		System.setProperty("webdriver.chrome.driver", webpath);
		
		// step3: instantiate selenium webdriver
				WebDriver launch = new ChromeDriver();
				
				// step4: launch browser
				launch.get(URL);
				
				// step5 : Evaluate the Test
				
				
				String wantedtitle= "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
				String got_title=launch.getTitle();
				
				if(wantedtitle.equals(got_title)) {
					
					System.out.println("The test case is passed");
				}
				else {
					System.out.println("The test case is failed");
				}
				
				System.out.println("wanted Title : " + wantedtitle);
				System.out.println("got_title : " + got_title);
				
				
				// step6: close driver
				launch.close();
				
				
				
		
	}
}