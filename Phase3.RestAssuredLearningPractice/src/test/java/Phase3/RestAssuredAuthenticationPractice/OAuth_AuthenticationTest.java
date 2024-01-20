package Phase3.RestAssuredAuthenticationPractice;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

import org.testng.annotations.Test;


import Phase3.RestAssured.DataModel.UserInformation;

public class OAuth_AuthenticationTest {
	
	private static final String BASE_URL = "https://dummyjson.com/auth";
	

	@Test(description = "Test Authentication with username and password")
	public void testAuthenticationwithUserCredentials() {
		
		// create user post data
		UserInformation user = new UserInformation("kminchelle", "0lelplR");
				
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
	
	@Test(description = "Test Authentication with token")
	public void testAuthenticationwithToken() {
		
		// create user post data
		UserInformation user = new UserInformation("kminchelle", "0lelplR");
		
				// trigger the url and get the response
				String response = RestAssured.given().baseUri(BASE_URL)
				.when().contentType(ContentType.JSON)
				.body(user)
				.post("/login").getBody().asPrettyString();

					JsonPath jsonObj = new JsonPath(response);
					String token = jsonObj.getString("token");
					
					System.out.println("The token got is");
					System.out.println(token);
				
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
	
	@Test(description = "Get current auth user from token")
	public void testAuthenticationCurrentauthUserFromToken() {
		
		// create user post data
		UserInformation user = new UserInformation("kminchelle", "0lelplR");

					 String response = RestAssured.given().baseUri(BASE_URL)
							.when().contentType(ContentType.JSON)
							.body(user)
							.post("/login").getBody().asPrettyString();

					JsonPath jsonObj = new JsonPath(response);
					String token = jsonObj.getString("token");


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
							
	}



}
