package com.selenium.practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class fliplkartLinkTest {
	
	static WebDriver launch = null;
	
	public static void main(String[] args) throws InterruptedException {
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
				
				linktest1();
				
	}
	
	private static void linktest1() throws InterruptedException{  // created a method
		
		    
				WebElement link= launch.findElement(By.cssSelector("#container > div > div.q8WwEU > div > div > div > div > div.css-1dbjc4n.r-13awgt0 > div > div.css-1dbjc4n.r-13awgt0.r-1iqfa7g.r-60vfwk > div > div.yAlKeh > div._2L0uxW > div > div:nth-child(1) > div > div > div > div > div._3sdu8W.emupdz > a:nth-child(2)"));
				
		
				link.click();
				
				// add delay
				Thread.sleep(1000);
				
				String wantedtitle= "Mobile Phones Online at Best Prices in India";
				String got_title=launch.getTitle();
				
				if(wantedtitle.equals(got_title)) {
					
					System.out.println("The test case is passed");
				}
				else {
					System.out.println("The test case is failed");
				}
				
				System.out.println("wanted Title : " + wantedtitle);
				System.out.println("got_title : " + got_title);
	}
}
				