package Phase3.Assignment01_RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import org.testng.annotations.Test;

import org.apache.log4j.Logger;

public class GetRequest {
	
	private static final String Base_Url ="https://petstore.swagger.io/v2";
	static final Logger logger= Logger.getLogger(GetRequest.class);
	
	@Test(description="Get request method to get PET details using the petID")
	
	public void testGetPet() {
		int petID= 344;
		logger.info("START::GET method for the PET test");
		logger.info("POST: URL" +Base_Url+ "/pet/" +petID);
		
		try {
			RestAssured.given().baseUri(Base_Url)
			.contentType(ContentType.JSON)
			.when().get("/pet/" +petID)
			.then().assertThat().statusCode(200);
		}
		catch(Exception e) {
				logger.error("Exception Object :: " + e.toString());
				logger.error("End Exception :: "+e.getLocalizedMessage());
		}
		
		String response= RestAssured.given().baseUri(Base_Url)
				.when().get("/pet/" +petID).getBody().asPrettyString();
		logger.info("Response is " +response);
		logger.info("END:: GET method for the PET test");
	}

}
