package com.phase2.practiceProject5.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazonAppSteps {
	
	String driverPath = "C:\\Users\\Dell\\eclipse-workspace\\phase2.practiceProject5.CucumberAmazonApp\\src\\test\\resource\\drivers\\windows\\geckodriver.exe";
	String siteURL= "https://www.amazon.in/";
	WebDriver driver;
	WebElement searchBox;
	
	
	@Before(value = "@amazon")
	public void setUp() {
		System.setProperty("webdriver.chromedriver.driver", driverPath);
		driver =new FirefoxDriver();
		
		driver.get(siteURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@After(value = "@amazon")
	public void cleanUp() {
		if(driver!=null)
			driver.quit();
	}
	
	@Given("open the browser and launch the amazon application")
	public void open_the_browser_and_launch_the_amazon_application() {
		driver.get(siteURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	
	@When("user click on signin button")
	public void user_click_on_signin_button() {
		driver.findElement(By.linkText("Sign in")).click();
	}

	@Then("user will be on Signin Page")
	public void user_will_be_on_signin_page() {
	    assertEquals("Amazon Sign In", driver.getTitle());
	}

	@Then("^user entered email id as \"([^\"]*)\"$")
	public void user_entered_email_id_as(String emailId)  {
		driver.findElement(By.id("ap_email")).sendKeys(emailId);
		
	}

	@Then("user clicked on Continue button")
	public void user_clicked_on_continue_button() {
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		

	}

	@Then("^user enters the password as \"([^\"]*)\"$")
	public void user_enters_the_password_as(String password) {
		driver.findElement(By.id("ap_password")).sendKeys(password);
		

	}

	@Then("^user click on submit button$")
	public void user_click_on_submit_button() throws InterruptedException {
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
	}
	
	@Then("^validate the current page url$")
	public void validate_the_current_page_url() {
	    assertEquals("Amazon Sign In", driver.getTitle());
	}

	
	@Given("^Maximize the Chrome browser window$")
	public void maximize_the_chrome_browser_window() {
		driver.manage().window().maximize();
	}

	@When("^Enter Product Search input \"([^\"]*)\"$")
	public void enter_product_search_input(String product_name) throws InterruptedException {
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.clear();
		search.sendKeys(product_name);
		Thread.sleep(2000);

	    
	}

	@Then("^Submit Product Search$")
	public void submit_product_search() throws InterruptedException {
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);

	}

	@Then("^Verify page title \"([^\"]*)\"$")
	public void verify_page_title(String page_title ) throws InterruptedException {
		assertEquals(page_title, driver.getTitle());
		Thread.sleep(2000);
	}

	

	@When("^user on the home page of the amazon$")
	public void user_on_the_home_page_of_the_amazon() throws InterruptedException {
	    assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", driver.getTitle());
	    Thread.sleep(2000);
	}

	@When("^navigate to the category link$")
	public void navigate_to_the_category_link() throws InterruptedException {
		driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)")).click();
		Thread.sleep(2000);
	}

	@Then("^validate the current page of link url$")
	public void validate_the_current_page_of_link_url() throws InterruptedException {
		assertEquals("Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in", driver.getTitle());
		Thread.sleep(2000);
	}

}
