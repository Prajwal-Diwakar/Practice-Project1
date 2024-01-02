package com.phase2.learning.bdd.stepdefinitions;

import java.time.Duration;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class hooks_facebookLoginSteps {
	
	String driverPath = "C:\\Users\\Dell\\eclipse-workspace\\phase2.learning.bdd.cucumber.27-12-2023\\src\\test\\resource\\drivers\\windows\\geckodriver.exe ";
	String siteURL= "https://www.facebook.com/";
	WebDriver driver;
	
	@Before
	public void setUp() {
	System.setProperty("webdriver.geckodriver.driver", driverPath);
	driver =new FirefoxDriver();
	
	driver.get(siteURL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	
	@After
	public void close() {
		if(driver!=null)
		
			driver.quit();
	}
	
	
	@Given("user should be on the facebook login page")
	public void user_should_be_on_the_facebook_login_page() {
		driver.get(siteURL+"login");
	}

	@Given("user enters email adress")
	public void user_enters_email_adress() {
		 WebElement email=driver.findElement(By.id("email"));
		 email.sendKeys("abc@gmail.com");
	}

	@Given("user enters password")
	public void user_enters_password() {
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("abc@1234");
	}

	@Given("user clicked on login button")
	public void user_clicked_on_login_button() throws InterruptedException {
		driver.findElement(By.name("login")).click();
		
		
	}

	@Then("error message displayed with wrong credentials")
	public void error_message_displayed_with_wrong_credentials() {
	    System.out.println("error message displayed with wrong credentials");
	}

	@Then("user returns back on the facebook login page")
	public void user_returns_back_on_the_facebook_login_page() throws InterruptedException {
		Thread.sleep(3000);
		WebElement errorEm = driver.findElement(By.cssSelector("#loginform > div:nth-child(12) > div._9ay7"));
	    assertEquals("The password that you've entered is incorrect. Forgotten password?", errorEm.getText());
	}

}
