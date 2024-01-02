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
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hooks_amazonMultipleProductSearchDatabaseSteps {
	
	String driverPath = "C:\\Users\\Dell\\eclipse-workspace\\phase2.learning.bdd.cucumber.27-12-2023\\src\\test\\resource\\drivers\\windows\\geckdriver.exe ";
	String siteURL= "https://www.amazon.in/";
	WebDriver driver;
	WebElement searchBox;
	
	
	@Before(value = "@AmazonSearchTest")
	public void setUp() {
	    driver = new FirefoxDriver();
	}
	
	@After(value = "@AmazonSearchTest")
	public void cleanUp() {
		if(driver!=null)
			driver.quit();
	}
	
	@Given("^Launch amazon application on chrome$")
	public void launch_amazon_application_on_chrome() {
		 driver.get(siteURL);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}

	@When("^Enter Product Search input \"([^\"]*)\"$")
	public void enter_product_search_input(String productName) throws InterruptedException {
		Thread.sleep(2000);
		searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys(productName);
		Thread.sleep(2000);
	}

	@Then("^Submit Product Search$")
	public void submit_product_search() throws InterruptedException {
		searchBox.submit();
		Thread.sleep(2000);
	}

	@And("^Verify page title \"([^\"]*)\"$")
	public void verify_page_title(String pageTitle) {
	   assertEquals(pageTitle, driver.getTitle());
	}

}
