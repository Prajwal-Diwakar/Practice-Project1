package com.screenshotandBrowsefile.practice;



	
	



	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	/**
	 * This class will demonstrate Explicit wait based Test synchronization Implicit
	 * Explicit wait : The explicit is used to tell the web driver to wait for a
	 * certain condition or maximum time to be exceeded before throwing "Element Not
	 * Visible exception".
	 * 
	 *
	 */
	public class browsefile {

		static WebDriver launch;
		static WebDriverWait wait;
		static ChromeOptions options;

		public static void main(String[] args) {

			setUp();
			
			// testFailureLogin();

			
		}

		public static void setUp() {

			// step1: formulate a test domain url & driver path
			String siteUrl = "https://www.instagram.com";
			String driverPath = "drivers/windows/chromedriver.exe";

			// step2: set system properties for selenium dirver
			System.setProperty("webdriver.chrome.driver", driverPath);
			
			options =new ChromeOptions();
			options.addArguments("--user-data-dir=C:/Users/Dell/AppData/Local/Google/Chrome/User Data");
			options.addArguments("--profile-directory=Profile 6");

			// step3: instantiate selenium webdriver
			launch = new ChromeDriver(options);
			
			

			// step4: add explicit wait (Conditional Delay)
			wait = new WebDriverWait(launch, Duration.ofSeconds(40));

			// step5: launch browser
			launch.get(siteUrl);
			
			
		}
		
	public static void testFailureLogin() {
			
			WebElement user=launch.findElement(By.xpath( "//input[@name='username']"));
			user.click();
			user.sendKeys("abc@gmail.com");
			WebElement pass= launch.findElement(By.xpath( "//input[@name='password']"));
			pass.click();
					pass.sendKeys("abc@123");
			launch.findElement(By.cssSelector("#loginForm > div > div:nth-child(3) > button > div")).submit();
			
		
			
			// evaluate a failure login test
					WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
							By.cssSelector("#loginForm > span > div")));
			
			
					String errorText = "The password that you've entered is incorrect. Forgotten password?";
					
					if (errorText.equals(errorMsg.getText())) {
						System.out.println("Test is Passed !");
					} else {
						System.out.println("Test is Failed !");
					}

					System.out.println("Expected Error Text : " + errorText);
					System.out.println("Actual Error Text : " + errorMsg.getText());
				}
	}
		
		
