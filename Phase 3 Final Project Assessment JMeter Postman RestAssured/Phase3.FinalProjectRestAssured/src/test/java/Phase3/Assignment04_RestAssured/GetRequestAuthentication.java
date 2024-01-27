package Phase3.Assignment04_RestAssured;

import static org.hamcrest.CoreMatchers.notNullValue;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import Phase3.Assignment03_RestAssured.GetRequestUserName;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GetRequestAuthentication {
	
	
		private static final String BASE_URL = "https://petstore.swagger.io/v2";
		 static final Logger logger= Logger.getLogger(GetRequestUserName.class);
		
		@Test(description = "Test Authentication with rest assured")
		public void testAuthenticationToken() { 

			logger.info("START::GET method for the PET Authenticaton Login");
			logger.info("POST: URL" +BASE_URL);
			// create user post data
			User user = new User("Uname001" ," @tt!tude"); 
			
			logger.info("user object is" +user );
			try {
				RestAssured.given().baseUri(BASE_URL).when()
				.contentType(ContentType.JSON)
				.body(user)
				.log().uri()  // request logs
				.get("/user/login").then()
				.log().body()  // response logs
				.assertThat().statusCode(200).and()
				.assertThat().body ("code", notNullValue()).and()
				.assertThat().body ("type", notNullValue()).and()
				.assertThat().body ("message", notNullValue());
			}
			catch(Exception e) {
	        	
	        	logger.error("Exception Object :: " + e.toString());
				logger.error("End Exception :: "+e.getLocalizedMessage());
	        }
			
			
			
			String response = RestAssured.given().baseUri(BASE_URL).when()
			.contentType(ContentType.JSON)
			.body(user)
			.get("/user/login").getBody().asString();		
			
			logger.info("Response is " +response);
			logger.info("END::GET method for the PET Authenticaton Login");
			
			
		}
	}

	class User {
		
		public String username;
		public String password;
		
		public User(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}
	}





