package Phase3.Assignment01_RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import org.testng.annotations.Test;

import org.apache.log4j.Logger;

public class DeleteRequest {
	
	private static final String Base_Url ="https://petstore.swagger.io/v2";
	static final Logger logger= Logger.getLogger(DeleteRequest.class);
	
	@Test(description="Delete request method for the PET")
	public void testGetPet() {
		
		logger.info("START::Delete method for the PET test");
		int petID= 344;
		logger.info("DELETE: URL" +Base_Url+ "/pet/" +petID);
		
		try {
			RestAssured.given().baseUri(Base_Url)
			.when().delete("/pet/" +petID)
			.then().statusCode(200);
		}
		catch(Exception e) {
			logger.error("Exception Object :: " + e.toString());
			logger.error("End Exception :: "+e.getLocalizedMessage());
			
		}
		
//		String response = RestAssured.given().baseUri(Base_Url)
//				.when().delete("/pet/" +petID)
//				.getBody().asPrettyString();
		
		String response= RestAssured.given().baseUri(Base_Url)
				.when().delete("/pet/" +petID).getBody().asPrettyString();
		
	}


}
