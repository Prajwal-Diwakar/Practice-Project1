package com.practice3Excercises.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropbox_test {
	
	static WebDriver  driver;
	
	
	public static void main(String[] args) {
		
		setup();
		dropboxexists();
		
		testSelectDropdownDefault();
		
		testSelectDropdownOption2();
		
		testSelectDropdownOption();
		
		driver.close();
		
	}
	
	public static void setup() {
		
		
		String siteURL= "file:///C:/Users/Dell/eclipse-workspace/phase1-selenium-test-06-12-2023/static/webElements_practice.html";
		String driverPath = "drivers/windows/chromedriver.exe";
		
		// step2: set system properties for selenium dirver
		System.setProperty("webdriver.chrome.driver", driverPath);

		// step3: instantiate selenium webdriver
		driver = new ChromeDriver();

		// step4: add implicit wait (Unconditional Delay)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		// step5: launch browser
		driver.get(siteURL);
	}
	
	
	public static void dropboxexists() {
		
		WebElement dropbox = driver.findElement(By.id("vehicle"));
		
		 if( dropbox.isDisplayed()) {
			 

				System.out.println("The dropbox test case passed");
			}else {
				System.out.println("The dropbox test case failed");
					}
		 }
	
		
	public static void testSelectDropdownDefault() {
		
		WebElement dropdown = driver.findElement(By.id("vehicle"));
		
		Select select = new Select(dropdown);
		
		// select bike as a selected option
				select.selectByValue("cycle");  //selectbyvalue is used to select the dropdown
				
				// get selected option 
				WebElement selectedElm = select.getFirstSelectedOption();
				
				String expectedText = "cycle";
				String actualText = selectedElm.getText();
				
				if (expectedText.equals(actualText)) {
					System.out.println("Default Select Test is Passed !");
				} else {
					System.out.println("Default Select Test is Failed !");
				}
				
	}
	
	public static void testSelectDropdownOption2() {
		
		WebElement drop= driver.findElement(By.id("vehicle"));
		
		Select make= new  Select(drop);
		
		make.selectByVisibleText("Car");
		
		WebElement selectedelement= make.getFirstSelectedOption();
		
		 String expectedText ="Car";
		 String actualText= selectedelement.getText();
		
		 if (expectedText.equals(actualText)) {
				System.out.println("Default Select Test is Passed !");
			} else {
				System.out.println("Default Select Test is Failed !");
			}
		
	}
	
	public static void testSelectDropdownOption() {
		// find select dropdown
		WebElement dropdown = driver.findElement(By.id("vehicle"));

		// Select for map web element to select option
		Select select = new Select(dropdown);
		
		// select Airplane as a selected option
		select.selectByIndex(3);
		
		// get selected option 
		WebElement selectedElm = select.getFirstSelectedOption();
		
		String expectedText = "Airplane";
		String actualText = selectedElm.getText();
		
		if (expectedText.equals(actualText) ) {
			System.out.println("Index 3 (Airplane) Select Test is Passed !");
		} else {
			System.out.println("Index 3 (Airplane) Select Test is Failed !");
		}
	}
	
				 
	
	}
		
