package Phase3.Assignment06.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static org.hamcrest.CoreMatchers.notNullValue;

import org.apache.log4j.Logger;

public class UserLogout {
		private static final String Base_url= "https://petstore.swagger.io";
		static final Logger logger= Logger.getLogger(UserLogout.class);
		
		
		@Test(description=" userLogout get method with the rest assured")
		public void TestUserLogout() {
			logger.info("START::GET method for the PET test");
			logger.info("POST: URL" +Base_url);
			try {
				RestAssured.given().baseUri(Base_url)
				.contentType(ContentType.JSON)
				.when().get("/v2/user/logout")
				.then().assertThat().statusCode(200)
				.and().assertThat().body("code", notNullValue())
				.and().assertThat().body("message", notNullValue());
			}
			
			
			catch(Exception e) {
	        	
	        	logger.error("Exception Object :: " + e.toString());
				logger.error("End Exception :: "+e.getLocalizedMessage());
	        }
			
			String response =RestAssured.given().baseUri(Base_url)
					.contentType(ContentType.JSON)
					.when().get("/v2/user/logout").getBody().asPrettyString();
			
			logger.info("The response is" +response);
			logger.info("END::GET method for the PET test");
					
		}
}
