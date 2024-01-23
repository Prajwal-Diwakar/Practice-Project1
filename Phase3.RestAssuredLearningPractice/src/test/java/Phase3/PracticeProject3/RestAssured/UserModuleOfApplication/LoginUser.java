package Phase3.PracticeProject3.RestAssured.UserModuleOfApplication;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

import org.apache.log4j.Logger;

public class LoginUser {
	
	private static final String BASE_URL="https://reqres.in/api";
	final  Logger logger=Logger.getLogger(LoginUser.class);
	
	@Test(description= "user Login details")
	
	public void TestLoginUsers() {
		
		logger.info("START:: Login test with rest assured");
		//creating the user post data
		logger.info("POST:: Base URL " +BASE_URL+ "/login");
		
		PostData postdata=new PostData("eve.holt@reqres.in","cityslicka");
		
		try {
			logger.info("Request Object" +postdata);
			RestAssured.given().baseUri(BASE_URL)
			
			.when().contentType(ContentType.JSON)
			.body(postdata)
			.post("/login")
			.then().statusCode(200).and()
			.assertThat().body ("token", notNullValue());
		}
		catch(Exception e) {
			
			logger.error("Exception Object :: " + e.toString());
			logger.error("End Exception :: "+e.getLocalizedMessage());
		}
		
		String response= RestAssured.given().baseUri(BASE_URL)
				.when().contentType(ContentType.JSON).body(postdata).post("/login").getBody().asPrettyString();;
				
				logger.info("response is" +response);
				logger.info("END:: Login test with rest assured");
	}
}
	
class PostData{      // constructor
		
		public final  String email;
		public final  String password;
		
		public PostData(String email, String password) {
		super();
		this.email=email;
		this.password=password;
		
	}

}
