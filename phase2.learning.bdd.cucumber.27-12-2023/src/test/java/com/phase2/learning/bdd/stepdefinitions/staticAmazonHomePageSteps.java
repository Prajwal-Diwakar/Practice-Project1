package com.phase2.learning.bdd.stepdefinitions;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class staticAmazonHomePageSteps {
	
	String driverPath="C:\\Users\\Dell\\eclipse-workspace\\phase2.learning.bdd.cucumber.27-12-2023\\src\\test\\resource\\drivers\\windows\\geckodriver.exe";
	String siteUrl = "https://www.amazon.in/";
	WebDriver driver;
	
	@Given("open the Firefox and launch the amazon application")
	public void open_the_firefox_and_launch_the_amazon_application() {
		System.setProperty("webdriver.gecko.driver", driverPath);
	    driver = new FirefoxDriver();
	    driver.get(siteUrl);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}

	@When("user on the home page")
	public void user_on_the_home_page() {
		 assertEquals(siteUrl, driver.getCurrentUrl());
	}

	@Then("verify the title of the amazon home page")
	public void verify_the_title_of_the_amazon_home_page() {
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
	}

	

	@When("User navigates to the another page of the amazon")
	public void user_navigates_to_the_another_page_of_the_amazon() {
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
	}

	@Then("verify the title of the amazon current page")
	public void verify_the_title_of_the_amazon_current_page() {
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		assertNotEquals(actualTitle, expectedTitle);
	}


}
