package MphasisATE_CapstoneProjectRestAssured_TestNG_Medicare;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;

import org.apache.log4j.Logger;

public class GetRegisteredUser {
	private static final String Base_Url ="http://localhost:9010";
	static final Logger logger= Logger.getLogger(GetProducts.class);
	
	@Test(description="Get request method to get all the registered users ")
	
	public void testGetProducts() {
		
		logger.info("START::GET method for the Registered user details");
		logger.info("GET: URL " +Base_Url+ "/get-users");
		
		int code=101;
		String message="4 Users Fetched Successfully.";
		
		try {
			RestAssured.given().baseUri(Base_Url)
			.when().get("/get-users")
			.then().assertThat().statusCode(200)
			.body("code", equalTo(code)).and()
			.body("message", equalTo(message));
		}
		catch(Exception e) {
				logger.error("Exception Object :: " + e.toString());
				logger.error("End Exception :: "+e.getLocalizedMessage());
		}
		
		String response= RestAssured.given().baseUri(Base_Url)
				.when().get("/get-users").getBody().asPrettyString();
		logger.info("Response is " +response);
		logger.info("END:: GET method for the Registered user details");
	}

}
