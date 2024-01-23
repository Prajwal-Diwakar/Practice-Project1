package Phase3.Assignment01_RestAssured;

import static org.hamcrest.CoreMatchers.equalTo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class PostRequest {
	
	private static final String Base_Url ="https://petstore.swagger.io/v2";
	static final Logger logger=Logger.getLogger(PostRequest.class);
   
	    @Test(description = "Post request method with the rest assured")
	    public void testPostPet() {
	        // Base URL for the API
	        
	    	logger.info("START:: POST method to create the PET details");
	        // JSON Body
	 String requestBody = "{ \"id\": 344, \"category\": { \"id\": 0, \"name\": \"string\" }, \"name\": \"Doggie\", " +
	           "\"photoUrls\": [ \"string\" ], \"tags\": [ { \"id\": 0, \"name\": \"string\" } ], " +
	           "\"status\": \"available\" }";

	       
	       try {
	    	// Send POST request
		        RestAssured.given().baseUri(Base_Url)
		        .contentType(ContentType.JSON)
		        .body(requestBody)
		        .when()
		        .post("/pet")
		        .then().statusCode(200)
		        .and()
		        .assertThat()
		        .body("id",equalTo(344))
		        .and().body("status", equalTo("available"));
		        
		        logger.info("Request Body is " +requestBody);
	       }
	       
	       catch (Exception e) {
				logger.error("Exception Object :: " + e.toString());
				logger.error("End Exception :: "+e.getLocalizedMessage());
			
		}
	       
	       String response=  RestAssured.given().baseUri(Base_Url)
			        .contentType(ContentType.JSON)
			        .body(requestBody)
			        .when()
			        .post("/pet").getBody().asPrettyString();
	       
	       logger.info("Response is" + response);
	       logger.info("END:: POST method to create the PET details");
	        
	        
	       

	    }
	}


