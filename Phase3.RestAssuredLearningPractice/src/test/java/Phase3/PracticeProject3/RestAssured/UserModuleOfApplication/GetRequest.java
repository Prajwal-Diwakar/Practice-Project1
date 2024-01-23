package Phase3.PracticeProject3.RestAssured.UserModuleOfApplication;
import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import io.restassured.RestAssured;
import org.apache.log4j.Logger;

public class GetRequest {                                                    
	
	private static final String BASE_URL="https://reqres.in/api";
	
	static final Logger logger = Logger.getLogger(GetRequest.class);
	
	@Test(description =" Getting the user details")
	
	public void TestUserDetails() {
		
		logger.info("Start:: Get the user details");
		
		logger.info("GET:: Base url" +BASE_URL+ "/users");
		
		try {
			
			RestAssured.given().baseUri(BASE_URL)
			.when().get("/users")
			.then().statusCode(200)
			.and().assertThat().body("page",equalTo(1))
			.and().assertThat().body("per_page",equalTo(6))
			.and().assertThat().body("total",equalTo(12))
			.and().assertThat().body("total_pages",equalTo(2));	
		}
		
		catch(Exception e) {
			
			logger.error("Exception Object :: " + e.toString());
			logger.error("End Exception :: "+e.getLocalizedMessage());
		}
		
		String response = RestAssured.given().baseUri(BASE_URL)
				.when().get("/users").getBody().asString();
				
				logger.info("Reponse :: "+response);
				logger.info("End :: GET All users test.");	
	}			
}
