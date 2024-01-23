package Phase3.Assignment03_RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static org.hamcrest.CoreMatchers.equalTo;

public class GetRequest {
	
	
	private static final String base_url ="https://petstore.swagger.io/#/user/getUserByName"; 
//	https://petstore.swagger.io/#/user/getUserByName
	
	
	@Test(description=" Get request method with rest assured")
	
	public void TestGetMethod() {
		RestAssured.given().baseUri(base_url)
		.when().get("https://petstore.swagger.io/#/user/getUserByName")
		.then().statusCode(200)
		.and().assertThat()
		.body("username", equalTo("Uname001"))
		.and().body("email", equalTo("Positive@Attitude.com"))
		.and().body("userStatus", equalTo(1));
		
		
		
//		String response= RestAssured.given().baseUri(base_url)
//				.when().get("/user/Uname001")
//				.getBody().asPrettyString();
//		
//		System.out.println(response);
		
	
		
		
	}


}
