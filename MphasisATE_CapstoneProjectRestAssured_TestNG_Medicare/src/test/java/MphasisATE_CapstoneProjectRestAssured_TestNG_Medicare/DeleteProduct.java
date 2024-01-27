package MphasisATE_CapstoneProjectRestAssured_TestNG_Medicare;

import static org.hamcrest.CoreMatchers.equalTo;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteProduct {
	
	private static final String Base_Url ="http://localhost:9010";
	static final Logger logger= Logger.getLogger(DeleteProduct.class);
	
	@Test(description="Delete request method to delete product")
	
	public void testGetProducts() {
		
		logger.info("START::DELETE method to delete Product");
		logger.info("DELETE: URL " +Base_Url+ "/get-products");
		
		int code=101;
		String message="Product with ID 101 Deleted Successfully.";
		
		try {
			RestAssured.given().baseUri(Base_Url)
			.when().delete("/delete-product?id=101")
			.then().assertThat().statusCode(200)
			.body("code", equalTo(code)).and()
			.body("message", equalTo(message));;
		}
		catch(Exception e) {
				logger.error("Exception Object :: " + e.toString());
				logger.error("End Exception :: "+e.getLocalizedMessage());
		}
		
		String response= RestAssured.given().baseUri(Base_Url)
				.when().delete("/delete-product?id=101").getBody().asPrettyString();
		logger.info("Response is " +response);
		logger.info("END:: DELETE method to delete Product");
	}

}
