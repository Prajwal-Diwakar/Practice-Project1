package com.phase2.learning.bdd.stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class staticLoginSampleSteps {
	
	String driverPath="C:\\Users\\Dell\\eclipse-workspace\\phase2.learning.bdd.cucumber.27-12-2023\\src\\test\\resource\\drivers\\windows\\geckodriver.exe";
	
	String siteUrl="file:///C:/Users/Dell/eclipse-workspace/phase2.learning.bdd.cucumber.27-12-2023/src/main/resource/static/LoginSample.html";
	
	WebDriver driver;
	
	@Given("^Open the chrome browser and launch the test application$")
	
	public void open_the_chrome_browser_and_launch_the_test_application() {
		
	    System.setProperty("webdriver.gecko.driver", driverPath);
	    driver = new FirefoxDriver();
	    driver.get(siteUrl);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}

	@Given("^Maximize the chrome browser page$")
	public void maximize_the_chrome_browser_page() {
		driver.manage().window().maximize();
	}

	@When("^Enter the username and password$")
	public void enter_the_username_and_password() {
		 driver.findElement(By.id("email")).sendKeys("anbu@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("anbu@123");

	}

	@Then("^click on the submit button$")
	public void click_on_the_submit_button() {
		driver.findElement(By.name("Login")).submit();

	}

	@Then("^user navigated back to login page succesfully$")
	public void user_navigated_back_to_login_page_succesfully() {
		
		WebElement outputpage = driver.findElement(By.id("outreponse"));
		assertEquals(outputpage.getText(), "Successful login");
	    
	}




}
