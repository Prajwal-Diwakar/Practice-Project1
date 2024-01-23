package Phase3.Assignment03_RestAssured;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static org.hamcrest.CoreMatchers.equalTo;
import org.apache.log4j.Logger;

public class GetRequestUserName {
	private static final String base_url ="https://petstore.swagger.io/v2/user/Uname001"; 
	 static final Logger logger= Logger.getLogger(GetRequestUserName.class);
	
	
	@Test(description=" Get request method with rest assured")
	
	public void TestGetMethod() {
		
		logger.info("START::GET method for the PET test");
		logger.info("POST: URL" +base_url);
		try {
			
			RestAssured.given()
			.when().get(base_url)
			.then().statusCode(200)
			.and().assertThat()
			.body("username", equalTo("Uname001"))
			.and().body("email", equalTo("Positive@Attitude.com"))
			.and().body("userStatus", equalTo(1));
		}
		catch(Exception e) {
        	
        	logger.error("Exception Object :: " + e.toString());
			logger.error("End Exception :: "+e.getLocalizedMessage());
        }
		
		
		
			String response= RestAssured.given().baseUri(base_url)
				.when().get("/user/Uname001")
			.getBody().asPrettyString();
		
		logger.info("Response is " +response);
		logger.info("END:: GET method for the PET test");
        	
	}

}
