package com.practice4.amazon;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonExtentReport {
	
	
	// step1: formulate a test domain url & driver path
			String siteUrl = "https://www.amazon.in/";
			String driverPath = "drivers/windows/geckodriver.exe";
			WebDriver driver;
			ExtentSparkReporter htmlReporter;
			ExtentReports extentReports;
			ExtentTest test1, test2, test3 ;
			
			@BeforeClass
			public void beforeClass() {

				// create the htmlReporter object
				htmlReporter = new ExtentSparkReporter("extentReport.html");

				// create ExtentReport and attach this reports
				extentReports = new ExtentReports();
				extentReports.attachReporter(htmlReporter);

				
				// initialize and start the browser
				WebDriverManager.iedriver().setup();
						
				// step2: set system properties for selenium dirver
				System.setProperty("webdriver.geckodriver.driver", driverPath);

				// step3: instantiate selenium webdriver
				driver = new FirefoxDriver();

				// step4: launch browser
				driver.get(siteUrl);
			}

			@AfterClass
			public void afterClass() {
				driver.quit();
				extentReports.flush();
			}

			@Test(description = "Search Dell Laptops")
			public void testSearch1() throws InterruptedException {
				// create a test and add logs
				test1 = extentReports.createTest("Amazon Search Dell Laptops", "Test Amazon Search  Dell Laptops");
				test1.log(Status.INFO, "Starting test case");
				
				WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
				test1.pass("Find search box on www.amazon.in");
				
				searchBox.sendKeys(" Dell Laptops");
				test1.pass("Enter input data ' Dell Laptops' ");
				
				searchBox.submit();
				test1.pass("Click Submit");
				
				// add delay
				Thread.sleep(2000);

				String expectedTitle = "Amazon.in : Dell Laptops";
				String actualTitle = driver.getTitle();

				assertEquals(actualTitle, expectedTitle);
				test1.pass("After search the title are matched");
				
				test1.log(Status.INFO, "End test case");
			}
			
			@Test(description = "Search Samsung Galaxy S24 Ultra")
			public void testSearch2() throws InterruptedException {
				// create a test and add logs
				test2 = extentReports.createTest("Amazon Search Samsung Galaxy S24 Ultra", "Test Amazon Search  Samsung Galaxy S24 Ultra");
				test2.log(Status.INFO, "Starting test case");
				
				WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
				test2.pass("Find search box on www.amazon.in");
				
				searchBox.clear();
				
				searchBox.sendKeys(" Samsung Galaxy S24 Ultra");
				test2.pass("Enter input data ' Samsung Galaxy S24 Ultra' ");
				
				searchBox.submit();
				test2.pass("Click Submit");
				
				// add delay
				Thread.sleep(2000);

				String expectedTitle = "Amazon.in : Samsung Galaxy S24 Ultra";
				String actualTitle = driver.getTitle();

				assertEquals(actualTitle, expectedTitle);
				test2.pass("After search the title are matched");
				
				test2.log(Status.INFO, "End test case");
			}
			
			@Test(description= "click on the today's deals")
			
			public void testclick() throws InterruptedException {
				
				// create a test and add logs
				
				test3= extentReports.createTest("amazon click today's deal",  "test amazon click today's deal");
				test3.log(Status.INFO, "Starting test case");
				
				WebElement click1=driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(6)"));
				click1.click();
				test3.pass("Click on the today's deal category");
				
				// add delay
				Thread.sleep(2000);
				
				String expectedTitle="Amazon.in - Deals";
				String actualTitle = driver.getTitle();
				
				assertEquals(actualTitle, expectedTitle);
				test3.pass("After click the title are matched");
				
				test3.log(Status.INFO, "End test case");
				
			}

}
