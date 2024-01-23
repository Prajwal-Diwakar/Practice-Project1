package Phase3.Assignment04_RestAssured;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GetRequestAuthentication {
	
	
		private static final String BASE_URL = "https://petstore.swagger.io/v2";
		
		
		@Test(description = "Test Authentication with rest assured")
		public void testAuthenticationToken() { 

			
			
			// create user post data
			User user = new User("Uname001" ," @tt!tude"); 
			
			
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
			
			String response = RestAssured.given().baseUri(BASE_URL).when()
			.contentType(ContentType.JSON)
			.body(user)
			.post("/register").getBody().asString();		
			/**  System.out.println(response);  **/
			
			
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

//		@Override
//		public String toString() {
//			return "User [email=" + email + ", password=" + password + "]";
//		}
		
	}





