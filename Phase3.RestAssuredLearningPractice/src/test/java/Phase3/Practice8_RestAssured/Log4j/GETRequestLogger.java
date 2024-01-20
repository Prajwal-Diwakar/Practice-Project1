package Phase3.Practice8_RestAssured.Log4j;

import static org.hamcrest.CoreMatchers.equalTo;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GETRequestLogger {
	
private static final String BASE_URL = "https://reqres.in/api";

static final Logger logger = Logger.getLogger(GETRequestLogger.class);
	
	@Test(description = "Test for executing GET request using rest assured")
	public void getRequestTest() {
		
		logger.info("Starting:: GET All users test");
		// paginated response params
		
		
		int page = 2 , total_pages =2, per_page=6,  total=12;
		
		logger.info("GET:: URL" +BASE_URL+ "/users?page="+page);
		
		RestAssured.given().baseUri(BASE_URL)
		.when().get("/users?page="+page).then().statusCode(200)
		.and()
		.assertThat()
		.body("page", equalTo(page)).and()
		.body("total", equalTo(total)).and()
		.body("per_page", equalTo(per_page)).and()
		.body("total_pages", equalTo(total_pages)).and()
		.body("data[0].first_name", equalTo("Michael"));
		
		String response=RestAssured.given().baseUri(BASE_URL).queryParam("page",page)
				.when().get("/users?page="+page)
				.getBody().asString();
		
		logger.info("Response is" +response);
		logger.info("END::GET All users test");
	}
	
	

}
