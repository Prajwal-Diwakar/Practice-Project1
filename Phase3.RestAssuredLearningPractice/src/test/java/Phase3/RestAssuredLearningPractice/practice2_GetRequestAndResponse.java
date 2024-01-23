package Phase3.RestAssuredLearningPractice;

import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
/**
 * Practice exercise of GET request reponse
 *
 */
public class practice2_GetRequestAndResponse 
{
private static final String BASE_URL = "https://reqres.in/api";
	
	@Test(description = "Test for executing GET request using rest assured")
	public void getRequestTest() {
		// paginated response params
		int page = 2 , total_pages =2, per_page=6,  total=12;
		
		RestAssured.given().baseUri(BASE_URL)
		.when().get("/users?page="+page).then().statusCode(200)
		.and()
		.assertThat()
		.body("page", equalTo(page)).and()
		.body("total", equalTo(total)).and()
		.body("per_page", equalTo(per_page)).and()
		.body("total_pages", equalTo(total_pages)).and()
		.body("data[0].first_name", equalTo("Michael"));
		
		
	}
}
