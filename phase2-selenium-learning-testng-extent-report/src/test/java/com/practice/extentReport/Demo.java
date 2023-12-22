package com.practice.extentReport;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	// step1: formulate a test domain url & driver path
		static String siteUrl = "https://www.flipkart.com/";
		static String driverPath = "drivers/windows/chromedriver.exe";
		static WebDriver driver;

		public static void main(String[] args) {

			// create the htmlReporter object
			ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");
			
			ExtentReports extentreport=new ExtentReports(); //created the new variable used to
			                                                //refer to the instance of the  ExtentReports 
			extentreport.attachReporter(htmlReporter);  // attach reports
			
			
			// create a test and add logs
			ExtentTest test1 = extentreport.createTest("Flipkart Title Match Test", "Test Flipkart Home Page Title Match");
			
			// initialize and start the browser
			WebDriverManager.chromedriver().setup();
			
			// set system properties for selenium dirver
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			
			test1.log(Status.INFO, "Starting test case"); 
			
			// maximize the browser window
			driver.manage().window().maximize();
			test1.pass("Maximize the browser window");
			
			// Navigate Open amazon.in
			driver.get(siteUrl);
			test1.pass("Navigate Open www.flipkart.com");
			
			String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
			String actualTitle = driver.getTitle();
			assertEquals(actualTitle, expectedTitle);
			test1.pass("The title are matched");

			driver.quit();
			test1.pass("The Browser is quited");

			test1.log(Status.INFO, "Completed test case");

			extentreport.flush();
			
 }
}
