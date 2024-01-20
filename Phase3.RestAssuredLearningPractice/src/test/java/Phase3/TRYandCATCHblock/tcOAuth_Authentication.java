package Phase3.TRYandCATCHblock;

import static org.hamcrest.CoreMatchers.notNullValue;

import org.apache.log4j.Logger;

import org.testng.annotations.Test;

import Phase3.RestAssured.DataModel.UserInformation;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class tcOAuth_Authentication {
	
private static final String BASE_URL = "https://dummyjson.com/auth";
	
	static final Logger logger=Logger.getLogger("tcOAuth_Authentication.class");

	@Test(description = "Test Authentication with username and password")
	public void testAuthenticationwithUserCredentials() {
		
		logger.info("START::POST method for the user test");
		logger.info("POST: URL" +BASE_URL+ "/login");
		
		// create user post data
		UserInformation user = new UserInformation("kminchelle", "0lelplR");
		
		try {
			logger.info("Request user" +user);
			
			RestAssured.given().baseUri(BASE_URL)
			.when().contentType(ContentType.JSON)
			.body(user)
			.log().uri() // request
			// logs
			.post("/login")
			.then().log().body() // response logs
			.assertThat().statusCode(200)
			.and().assertThat().body("id", notNullValue())
			.and().assertThat()
			.body("token", notNullValue());
		
	} catch (Exception e) {
		logger.error("Exception Object :: " + e.toString());
		logger.error("End Exception :: "+e.getLocalizedMessage());
	}
		
				
				logger.info("END:: POST POST method for the user test");
				
	}
	
	@Test(description = "Test Authentication with token")
	public void testAuthenticationwithToken() {
		
		// create user post data
		UserInformation user = new UserInformation("kminchelle", "0lelplR");
		
		logger.info("START::POST method for the user test");
		
		logger.info("POST: URL" +BASE_URL+ "/login");
		
		try {
			
			// trigger the url and get the response
			String response = RestAssured.given().baseUri(BASE_URL)
			.when().contentType(ContentType.JSON)
			.body(user)
			.post("/login").getBody().asPrettyString();

				JsonPath jsonObj = new JsonPath(response);
				String token = jsonObj.getString("token");
				
				logger.info("Request token" +token);
			
			RestAssured.given().baseUri(BASE_URL)
			.when().contentType(ContentType.JSON)
			.body(user)
			.log().uri() // request
			// logs
			.post("/login")
			.then().log().body() // response logs
			.assertThat().statusCode(200)
			.and().assertThat().body("id", notNullValue())
			.and().assertThat()
			.body("token", notNullValue());
			
		}
			catch (Exception e) {
				logger.error("Exception Object :: " + e.toString());
				logger.error("End Exception :: "+e.getLocalizedMessage());
			
		}
		
				
				
				logger.info("END:: POST POST method for the user test");
				
	}

}
