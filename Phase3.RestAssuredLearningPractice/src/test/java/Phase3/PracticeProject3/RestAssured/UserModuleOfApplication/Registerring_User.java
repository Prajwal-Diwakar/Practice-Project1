package Phase3.PracticeProject3.RestAssured.UserModuleOfApplication;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

import org.apache.log4j.Logger;

public class Registerring_User {
	
	private static final String BASE_URL="https://reqres.in/api";
	final  Logger logger=Logger.getLogger(Registerring_User.class);
	
	@Test(description= "user registration details")
	
	public void RegisterDetails() {
		
		logger.info("START:: user registration details");
		//creating the user post data
		
		PostData postdata=new PostData("eve.holt@reqres.in", "pistol");
		try {
			logger.info("POST:: Base URL " +BASE_URL+ "/register");
			
			RestAssured.given().baseUri(BASE_URL).when()
			.contentType(ContentType.JSON)
			.body(postdata)
			.log().uri()
			.post("/register")
			.then().log().body()  // response logs
			.assertThat().statusCode(200).and()
			.assertThat().body ("id", notNullValue()).and()
			.assertThat().body ("token", notNullValue());
		}
		catch(Exception e) {
			logger.error("Exception Object :: " + e.toString());
			logger.error("End Exception :: "+e.getLocalizedMessage());
		}
		
		
		
		
		String response= RestAssured.given().baseUri(BASE_URL)
				.when().contentType(ContentType.JSON).body(postdata).post("/register").getBody().asPrettyString();;
				
				logger.info("response is" +response);
				logger.info("END:: user registration details");
	}
	
	
	class PostData {
		public final String email;
	    public final String password;
	    
		public PostData(String email, String password) {
			super();
			this.email = email;
			this.password = password;
		}
	}
}
