package phase3.JmeterJunit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class amazonHomePage {

	// step1: formulate a test domain url & driver path
	String siteUrl = "https://www.amazon.in/";
	String driverPath = "C:\\Users\\Dell\\eclipse-workspace\\phase3.JmeterJunit\\drivers\\windows\\chromedriver.exe";
	WebDriver driver;

	@Before
	public void setUp() throws Exception {

		// step2: set system properties for selenium dirver
		System.setProperty("webdriver.chromedriver.driver", driverPath);

		// step3: instantiate selenium webdriver
		driver = new ChromeDriver();

		// step4: launch browser
		driver.get(siteUrl);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit(); // the quit() method closes all browser windows and ends the WebDriver session.
	}

	@Test
	public void testAmazonHomePageTitle() throws InterruptedException {
		Thread.sleep(2000);
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
		Thread.sleep(2000);
	}
	
	@Test
	public void testAmazonHomePageSourceUrl() throws InterruptedException {
		Thread.sleep(2000);
		assertEquals(siteUrl, driver.getCurrentUrl());
		Thread.sleep(2000);
	}
	
	@Test
	public void testAmazonHomePageTitle2() throws InterruptedException {
		Thread.sleep(2000);
		String expectedTitle = "OOnline SShopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		assertNotEquals(actualTitle, expectedTitle);
		Thread.sleep(2000);
	}

}