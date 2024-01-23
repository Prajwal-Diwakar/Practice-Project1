package Phase3.PracticeProject3.RestAssured.UserModuleOfApplication;

import static org.hamcrest.CoreMatchers.equalTo;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class UnknownUserDetails {
	
	
		private static final String BASE_URL="https://reqres.in/api";
		final  Logger logger=Logger.getLogger(UnknownUserDetails.class);
	
		@Test(description =" Getting the unknown user details")
		
		public void TestUserDetails() {
			
			logger.info("Start::GET Unknown user details");
			try {
				logger.info("GET:: Base URL " +BASE_URL+ "/unknown");
				RestAssured.given().baseUri(BASE_URL)
				.when().get("/unknown")
				.then().statusCode(200)
				.and().assertThat().body("page",equalTo(1))
				.and().assertThat().body("per_page",equalTo(6))
				.and().assertThat().body("total",equalTo(12))
				.and().assertThat().body("total_pages",equalTo(2))
				.body("data[0].name", equalTo("cerulean"))
				.body("data[4].year", equalTo(2004));
			}
			catch(Exception e) {
				
				logger.error("Exception Object :: " + e.toString());
				logger.error("End Exception :: "+e.getLocalizedMessage());
			}
			
			String response= RestAssured.given().baseUri(BASE_URL)
					.when().contentType(ContentType.JSON).when().get("/unknown").getBody().asPrettyString();
					
					logger.info("response is" +response);
					logger.info("END::GET Unknown user details");
			

		}
}
