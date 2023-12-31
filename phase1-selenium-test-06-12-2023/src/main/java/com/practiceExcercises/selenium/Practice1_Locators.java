package com.practiceExcercises.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1_Locators {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		 setup();
		 Thread.sleep(2000);
		 xpathFollowingSibling();
		 xpathfollowing();
		 xpathtext();
		 xpathbUsingORAND();
		 xpathcontains();
		 cssselectorInnerText();
		 cssselectorTagClassandAttribute();
		 cssselectorTagandAttribute();
		 cssselectorTagandClass();
		 cssselectorTagID();
		 absolutexpathtest();
		 relativexpathtest();
		 classtest();
		 linktest();
		 IDtest();
		 nametest();
		 
		 setup();
		}
	
	public static void setup() {
		
	
	// step1: formulate a test domain url & driver path
			String siteUrl = "https://www.amazon.in";
			String driverPath = "drivers/windows/chromedriver.exe";

			// step2: set system properties for selenium dirver
			System.setProperty("webdriver.chromedriver.driver", driverPath);

			// step3: instantiate selenium webdriver
			driver = new ChromeDriver();

			// step4: launch browser
			driver.get(siteUrl);
                }
	
	public static void IDtest() throws InterruptedException {
		
		WebElement IDtest= driver.findElement(By.id("twotabsearchtextbox"));
		
		IDtest.sendKeys("watch");
		IDtest.submit();
		
		Thread.sleep(2000);
	}
	
	private static void nametest() throws InterruptedException {
		
		WebElement nametest=driver.findElement(By.name("field-keywords"));
		
		nametest.clear();
		nametest.sendKeys("Redmi");
		nametest.submit();
		Thread.sleep(2000);
	}
	
	private static void classtest() {
		
			WebElement classtest=driver.findElement(By.className("nav-input"));
		
			classtest.clear();
			classtest.sendKeys("shoes");
			classtest.submit();
		
	}
	private static void linktest() {
		WebElement classtest=driver.findElement(By.partialLinkText("Fresh"));
		
		
		classtest.click();
		
		
		
	}
	private static void relativexpathtest() {
		
		WebElement relativexpathtest =driver.findElement(By.xpath("//*[@id='nav-xshop']/a[2]"));
		relativexpathtest.click();
		
	}
	private static void absolutexpathtest() {
		WebElement absolutexpathtest =driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div/div/a[4]"));
		absolutexpathtest.click();
	}
	
	private static void cssselectorTagID() {
		 WebElement cssselectorTagID = driver.findElement(By.cssSelector("a#nav_cs_gb"));
		 cssselectorTagID.click();
		
	}
	
	private static void cssselectorTagandClass() {
		WebElement cssselectorTagandClass = driver.findElement(By.cssSelector("a.nav-a"));
		cssselectorTagandClass.click();
	}
	
	private static void cssselectorTagandAttribute() {
		WebElement cssselectorTagandAttribute = driver.findElement(By.cssSelector("a[class='nav-a']"));
		cssselectorTagandAttribute.click();
	}
	
	private static void cssselectorTagClassandAttribute() {
		WebElement cssselectorTagclassandAttribute = driver.findElement(By.cssSelector("a.nav-a[data-csa-c-content-id='nav_cs_mobiles']"));
		cssselectorTagclassandAttribute.click();	
	}
	
	private static void cssselectorInnerText() {
		WebElement cssselectorInnerText=driver.findElement(By.cssSelector("a[href*='nav_cs_mobiles']"));
		cssselectorInnerText.click();
	}
	
	private static void xpathcontains() {
		WebElement xpathcontains=driver.findElement(By.xpath("//a[contains(@href, '/ref=nav_logo')]"));
		xpathcontains.click();
	}
	
	private static void xpathbUsingORAND(){
		WebElement xpathbUsingORAND1=driver.findElement(By.xpath("//a[contains(@href, '/ref=nav_logo') or contains(@class, 'nav-progressive-attribute')]"));
		xpathbUsingORAND1.click();
		
		WebElement xpathbUsingORAND2=driver.findElement(By.xpath("//a[contains(@href, '/ref=nav_logo') and contains(@class, 'nav-progressive-attribute')]"));
		xpathbUsingORAND2.click();
		}
	
	private static void xpathStartwithfunction() {
		
		WebElement xpathStartwithfunction= driver.findElement(By.xpath(" //a[starts-with(@href, '/ref=nav_logo')] "));
		xpathStartwithfunction.click();
	}
	
	private static void xpathtext() {
		WebElement xpathtext=driver.findElement(By.xpath(" //a[text()='Amazon miniTV']"));
		xpathtext.click();		
	}
	
	private static void xpathfollowing() {
		WebElement xpathfollowing=driver.findElement(By.xpath("//a[text()='Amazon miniTV']/following::* "));
		xpathfollowing.click();
		
	}
	private static void xpathPreceding() {
		WebElement xpathPreceding=driver.findElement(By.xpath("//a[text()='Amazon miniTV']/preceding::*"));
		xpathPreceding.click();		
	}
	
	private static void xpathFollowingSibling() {
		WebElement xpathFollowingSibling=driver.findElement(By.xpath("//a[text()='Amazon miniTV']/following-sibling::*"));
		xpathFollowingSibling.click();

	
}
}
	

