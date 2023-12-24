package com.phase2projectRedBusTicket.com;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RedBusTest {
	
	 WebDriver driver;
	    ExtentReports extent;
	    ExtentTest test;
	    @BeforeClass
	    public void beforeClass() {
	        System.out.println("Opening the browser window");

	                                            // Initializing  the ExtentReports and creating  a report
	        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("test-output/ExtentReporting.html");
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	    }

	    @AfterClass
	    public void afterClass() {
	        System.out.println("Closing the browser");

	                                        // Flush the report and close the WebDriver
	        extent.flush();
	        }
	    

	    @Test
	    public void chromeTest() throws MalformedURLException, InterruptedException {
	                                // Create a new ExtentTest instance for this test method
	        test = extent.createTest("Chrome Test", "Testing with Chrome browser");

	        DesiredCapabilities cap = new DesiredCapabilities();
	        cap.setPlatform(Platform.WINDOWS);
	        cap.setBrowserName("chrome");

	        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
	        driver.get("https://www.redbus.com/");
	        NavigatingRedBusPage nav = new NavigatingRedBusPage(driver);

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        wait.until(ExpectedConditions.visibilityOf(nav.from())).sendKeys("bangalore");
	        wait.until(ExpectedConditions.visibilityOf(nav.to())).sendKeys("Chennai");
	       
	        
	        wait.until(ExpectedConditions.elementToBeClickable(nav.submit())).click();
	        
	        
	        
	       // driver.quit();
	        
	        // Log the test status in the report
	        test.log(Status.PASS, "The Chrome test passed successfully");
	    }

	    @Test
	    public void edgeTest() throws MalformedURLException, InterruptedException {
	    	
	    	
	        // Create a new ExtentTest instance for this test method
	        test = extent.createTest("Firefox Test", "Testing with Firefox browser");

	        DesiredCapabilities cap = new DesiredCapabilities();
	        cap.setPlatform(Platform.WINDOWS);
	        cap.setBrowserName("firefox");

	        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
	        
	        
	        driver.get("https://www.redbus.com/");
	        
	        NavigatingRedBusPage nav = new NavigatingRedBusPage(driver);

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        wait.until(ExpectedConditions.visibilityOf(nav.from())).sendKeys("Mumbai");
	       
	        wait.until(ExpectedConditions.visibilityOf(nav.to())).sendKeys("Bangalore");
	        
	        wait.until(ExpectedConditions.elementToBeClickable(nav.submit())).click();
	        
	      
	        
	        Thread.sleep(3000);

	        driver.quit();

	        // Log the test status in the report
	        test.log(Status.PASS, "The Firefox test passed successfully");
	    }

}
