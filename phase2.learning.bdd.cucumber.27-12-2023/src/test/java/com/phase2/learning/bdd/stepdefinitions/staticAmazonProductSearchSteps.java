package com.phase2.learning.bdd.stepdefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class staticAmazonProductSearchSteps {
	
	String driverPath="C:\\Users\\Dell\\eclipse-workspace\\phase2.learning.bdd.cucumber.27-12-2023\\src\\test\\resource\\drivers\\windows\\geckodriver.exe ";
	String siteurl= "https://www.amazon.in/";
	WebDriver driver;
	
	@Given("open the firefox and launch the amazon application")
	public void open_the_firefox_and_launch_the_amazon_application() {
		
		System.setProperty("windows.gecko.driver", driverPath);
		driver=new FirefoxDriver();
		driver.get(siteurl);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));


	}

	@When("Enter the Product search")
	public void enter_the_product_search(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class);
		 System.out.println(">>>>>>>>>>>>"+ dataList);
		 
		for(Map<String, String> data : dataList) {
			
			WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.clear();
			searchBox.sendKeys(data.get("name"));
			searchBox.submit();
			Thread.sleep(2000);
	}
	}

	@Then("Submit Search for the product")
	public void submit_search_for_the_product() {
	
	}
	    

	@Then("Clear search")
	public void clear_search() {
	   
	}




}
