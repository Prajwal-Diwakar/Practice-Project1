package MphasisATE_CapstoneProjectRestAssured_TestNG_Medicare;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;

import org.apache.log4j.Logger;

public class GetProducts {
	private static final String Base_Url ="http://localhost:9010";
	static final Logger logger= Logger.getLogger(GetProducts.class);
	
	@Test(description="Get request method to get all the product details")
	
	public void testGetProducts() {
		
		logger.info("START::GET method for the Product details");
		logger.info("GET: URL " +Base_Url+ "/get-products");
		
		int code=101;
		String message="27 Products Fetched Successfully.";
		
		try {
			RestAssured.given().baseUri(Base_Url)
			.when().get("/get-products")
			.then().assertThat().statusCode(200)
			.body("code", equalTo(code)).and()
			.body("message", equalTo(message));
		}
		catch(Exception e) {
				logger.error("Exception Object :: " + e.toString());
				logger.error("End Exception :: "+e.getLocalizedMessage());
		}
		
		String response= RestAssured.given().baseUri(Base_Url)
				.when().get("/get-products").getBody().asPrettyString();
		logger.info("Response is " +response);
		logger.info("END:: GET method for the Product details");
	}
}
