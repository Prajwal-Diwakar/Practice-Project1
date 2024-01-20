package Phase3.Practice11_LogFileGeneratorWithLog4j;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

import org.apache.log4j.Logger;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

import org.testng.annotations.Test;


import Phase3.RestAssured.DataModel.UserInformation;

public class LogFile_OAuth_AuthenticationTest {
	
	private static final String BASE_URL = "https://dummyjson.com/auth";
	
	static final Logger logger=Logger.getLogger("LogFile_OAuth_AuthenticationTest.class");

	@Test(description = "Test Authentication with username and password")
	public void testAuthenticationwithUserCredentials() {
		
		logger.info("START::POST method for the user test");
		
		// create user post data
		UserInformation user = new UserInformation("kminchelle", "0lelplR");
		
		logger.info("POST: URL" +BASE_URL+ "/login");
		
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
				
				String response =RestAssured.given().baseUri(BASE_URL)
						.when().contentType(ContentType.JSON).body(user)
						.post("/login")
						.getBody().asString();
				
				logger.info("Response is" +response);
				logger.info("END:: POST POST method for the user test");
				
	}
	
	@Test(description = "Test Authentication with token")
	public void testAuthenticationwithToken() {
		
		// create user post data
		UserInformation user = new UserInformation("kminchelle", "0lelplR");
		
		logger.info("START::POST method for the user test");
		
		logger.info("POST: URL" +BASE_URL+ "/login");
		
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
				
				logger.info("END:: POST POST method for the user test");
				
	}
	
	@Test(description = "Get current auth user from token")
	public void testAuthenticationCurrentauthUserFromToken() {
		
		logger.info("START::POST method for the user test");
		
		// create user post data
		UserInformation user = new UserInformation("kminchelle", "0lelplR");
		
		logger.info("POST: URL" +BASE_URL+ "/login");

					 String response = RestAssured.given().baseUri(BASE_URL)
							.when().contentType(ContentType.JSON)
							.body(user)
							.post("/login").getBody().asPrettyString();

					JsonPath jsonObj = new JsonPath(response);
					String token = jsonObj.getString("token");
					
					logger.info("Request token" +token);


					RestAssured.given().baseUri(BASE_URL)
					.when().contentType(ContentType.JSON)
					.header("Authorization", "Bearer " + token).log().uri() // request logs
					.get("/me")
					.then().log().body() // response logs
					.assertThat().statusCode(200)
					.and().assertThat().body("id", notNullValue())
					.and().assertThat().body("username", notNullValue())
					.and().assertThat().body("username", equalTo("kminchelle"))
					.and().assertThat().body("email", equalTo("kminchelle@qq.com"));
					
					logger.info("END:: POST POST method for the user test");
							
	}



}
