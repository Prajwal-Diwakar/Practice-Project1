package com.phase2.learning.bdd.stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class staticAmazonLinkVerificationSteps {
	
	String driverPath="C:\\Users\\Dell\\eclipse-workspace\\phase2.learning.bdd.cucumber.27-12-2023\\src\\test\\resource\\drivers\\windows\\geckodriver.exe ";
	String siteurl= "https://www.amazon.in/";
	WebDriver driver;
	
	@Given("open the Firefox and launch the Amazon application")
	public void open_the_firefox_and_launch_the_amazon_application() {
		System.setProperty("windows.gecko.driver", driverPath);
		driver=new FirefoxDriver();
		driver.get(siteurl);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}

	@When("user on the home page of the amazon")
	public void user_on_the_home_page_of_the_amazon() {
		assertEquals(siteurl, driver.getCurrentUrl());
	}

	@When("navigate to the other category link")
	public void navigate_to_the_other_category_link() {
		driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)")).click();
	}

	@Then("validate the current page url")
	public void validate_the_current_page_url() {
		assertEquals(siteurl, driver.getCurrentUrl());
	}
	
	@When("navigate to the another category link")
	public void navigate_to_the_another_category_link() {
		driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(6)")).click();
	}
	
	@Then("validate the current another page url")
	public void validate_the_current_another_page_url() {
		assertEquals(siteurl, driver.getCurrentUrl());
	}
	


}
