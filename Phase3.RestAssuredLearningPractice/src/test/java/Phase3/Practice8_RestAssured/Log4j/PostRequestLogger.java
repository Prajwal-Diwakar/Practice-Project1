package Phase3.Practice8_RestAssured.Log4j;

import static org.hamcrest.CoreMatchers.equalTo;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static org.hamcrest.CoreMatchers.equalTo;

public class PostRequestLogger {

private static final String BASE_URL = "https://reqres.in/api";

static final Logger logger= Logger.getLogger(PostRequestLogger.class);
	
	@Test(description = "Test for executing POST request using rest assured")
	public void postRequestTest() {
		
		logger.info("START:: POST request test using rest assured");
		// create user post data
		PostData postData = new PostData("Adaikallam" ,"Gangster");
		
		logger.info("Request object::"  +postData);
		RestAssured.given().baseUri(BASE_URL).when()
		.contentType(ContentType.JSON)
		.body(postData)
		.post("/users").then()
		.assertThat().statusCode(201).and()
		.assertThat().body ("name", equalTo (postData.name)).and()
		.assertThat().body ("job", equalTo (postData.job));
		
		logger.info("POST:: URL " +BASE_URL+ "/users");
		
		String response = RestAssured.given().baseUri(BASE_URL).when()
		.contentType(ContentType.JSON)
		.body(postData)
		.post("/users").getBody().asPrettyString();
		
		logger.info("Response Object:: "+response);
		logger.info("End :: POST request test using rest assured.");
	}
	
	@Test(description = "Test for executing POST request using rest assured")
	public void postRequestTest2() { 
		
		logger.info("Start::POST request test using rest assured");
		// create user post data
		PostData postData = new PostData("Rolex" ,"GangLeader");
		
		RestAssured.given().baseUri(BASE_URL).when()
		.contentType(ContentType.JSON)
		.body(postData)
		.post("/users").then()
		.assertThat().statusCode(201).and()
		.assertThat().body ("name", equalTo (postData.name)).and()
		.assertThat().body ("job", equalTo (postData.job));
		
		logger.info("POST:: URL " +BASE_URL+ "/users");
		
		String response = RestAssured.given().baseUri(BASE_URL).when()
		.contentType(ContentType.JSON)
		.body(postData)
		.post("/users").getBody().asPrettyString();
		
		logger.info("Response Object:: "+response);
		logger.info("End :: POST request test using rest assured.");
		}
}


	class PostData {
		public final String name;
	    public final String job;
	    
		public PostData(String name, String job) {
			super();
			this.name = name;
			this.job = job;
		}
}
