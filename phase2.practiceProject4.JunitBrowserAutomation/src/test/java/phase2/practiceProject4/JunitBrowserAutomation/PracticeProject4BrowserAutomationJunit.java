package phase2.practiceProject4.JunitBrowserAutomation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@DisplayName("Browser Automation of Facebook authentication and Google search Engine")
public class PracticeProject4BrowserAutomationJunit {
	
	// Test class annotated with @DisplayName to provide a custom name for the test suite.
	
	// assigning the website url
	
	String FaceBookURL = "https://www.facebook.com/";
	String GoogleURL="https://www.google.co.in/";
	String driverPath1 = "drivers/windows/geckodriver.exe";
	
	WebDriver driver; // Declares a variable named driver of type WebDriver

	
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();  // the quit() method closes all browser windows and ends the WebDriver session.
	}
	
	
	@Test           //    // Test method annotated with @Test, indicating a JUnit test.

	@DisplayName("Facebook login or sign up page needs to be opened")
	public void testcase1() {
	
	            // step2: set system properties for selenium dirver
			System.setProperty("webdriver.geckodriver.driver", FaceBookURL);

			// step3: instantiate selenium webdriver
			driver = new FirefoxDriver();

			// step4: launch browser
			driver.get(FaceBookURL);
		    
			// Get the expected and actual titles and perform the assertion
			
		   String expectedResult="Facebook – log in or sign up";
		   String actualResult= driver.getTitle();
		    
		// Use JUnit's assertEquals to compare the expected and actual titles 
		   assertEquals(expectedResult, actualResult );
		
		
	}
	
	@Test
	@DisplayName("FaceBook will not allow to login when wrong credentials entered")
	public void testcase2() throws InterruptedException {
		
		// step2: set system properties for selenium dirver
				System.setProperty("webdriver.geckodriver.driver", FaceBookURL);

				// step3: instantiate selenium webdriver
				driver = new FirefoxDriver();

				// step4: launch browser
				driver.get(FaceBookURL);
		
		WebElement username= driver.findElement(By.id("email"));
		username.click();
		username.sendKeys("xxxxxx");
		
		WebElement password= driver.findElement(By.id("pass"));
		password.click();
		password.sendKeys("xxxxxx");
		
		WebElement login= driver.findElement(By.name("login"));
		login.submit();
		
		Thread.sleep(14000);
		
		String expectedResult="Log in to Facebook";
		String actualResult= driver.getTitle();
		
		assertEquals(expectedResult, actualResult );
	}
	
	@Test
	@DisplayName("Google page should be opened")
	public void testcase3() {
		
		// set up the system properties for the selenium driver
		System.setProperty("webdriver.geckodriver.driver", GoogleURL);
		 
		// step3: instantiate selenium webdriver
		driver= new FirefoxDriver();
		
		// step4: launch browser
		driver.get(GoogleURL);
		
		String expectedResult="Google";
		String actualResult= driver.getTitle();
		
		assertEquals(expectedResult, actualResult );
	}
	
	@Test
	@DisplayName("Google page should be searched as per the given input")
	public void testcase4() throws InterruptedException {
		
		// set up the system properties for the selenium driver
		System.setProperty("webdriver.geckodriver.driver", GoogleURL);
		 
		// step3: instantiate selenium webdriver
		driver= new FirefoxDriver();
		
		// step4: launch browser
		driver.get(GoogleURL);
		
		WebElement searchBar= driver.findElement(By.id("APjFqb"));
		WebElement searchIcon= driver.findElement(By.name("btnK"));
		
		searchBar.sendKeys("Junit");
		
		Thread.sleep(2000);
		searchIcon.click();
		
		String expectedResult="Junit - Google Search";
		String actualResult= driver.getTitle();
		
		assertEquals(expectedResult, actualResult );
	}
	
	@Test
	@DisplayName("Google search should not match to user input")
	public void testcase5() throws InterruptedException {
		
		// set up the system properties for the selenium driver
		System.setProperty("webdriver.geckodriver.driver", GoogleURL);
		 
		// step3: instantiate selenium webdriver
		driver= new FirefoxDriver();
		
		// step4: launch browser
		driver.get(GoogleURL);
		
		WebElement searchBar= driver.findElement(By.id("APjFqb"));
		WebElement searchIcon= driver.findElement(By.name("btnK"));
		
		searchBar.sendKeys("Maven");
		
		Thread.sleep(2000);
		searchIcon.click();
		
		String expectedResult="Gradle - Google Search";
		String actualResult= driver.getTitle();
		
		assertNotEquals(expectedResult, actualResult );
	}
	
}
