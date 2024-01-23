package Phase3.Assignment06.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

public class UserLogout {
		private static final String Base_url= "https://petstore.swagger.io";
		
		
		@Test(description=" userLogout get method with the rest assured")
		public void TestUserLogout() {
			
			RestAssured.given().baseUri(Base_url)
			.contentType(ContentType.JSON)
			.when().get("/v2/user/logout")
			.then().assertThat().statusCode(200)
			.and().assertThat().body("code", notNullValue())
			.and().assertThat().body("message", notNullValue());
			
					
		}
}
