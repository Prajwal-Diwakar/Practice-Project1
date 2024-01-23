package Phase3.Assignment02_RestAssured;

import static org.hamcrest.CoreMatchers.equalTo;
import java.util.HashMap;
import org.apache.log4j.Logger;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class putRequestMethod2 {
	
	 private static final String BASE_URL = "https://petstore.swagger.io/v2";
	 static final Logger logger= Logger.getLogger(putRequestMethod2.class);
	 
	 private static final HashMap<String, String> ENVIRONMENT_VALUES = new HashMap<>();

	    static {
	        ENVIRONMENT_VALUES.put("DEV", "available_DEV");
	        ENVIRONMENT_VALUES.put("QA", "available_QA");
	        ENVIRONMENT_VALUES.put("PROD", "available_PROD");
	    }
	    
	    @Parameters("environment")

	    @Test                 // (description="put request method ",dataProvider = "statusValues")
	    public void putCallTesting(String environment) {
	        
		  logger.info("START::PUT method for the PET test");
			logger.info("POST: URL" +BASE_URL+ "/pet/");
			
			 String statusValue = ENVIRONMENT_VALUES.get(environment);

	        // Prepare JSON request body with dynamic status field
	        String requestBody = "{ " +
	                "\"id\": 9223372016900013000, " +
	                "\"category\": {\"id\": 20021, \"name\": \"string\"}, " +
	                "\"name\": \"doggie\", " +
	                "\"photoUrls\": [\"string\"], " +
	                "\"tags\": [{\"id\": 0, \"name\": \"string\"}], " +
	                "\"status\": \"" + statusValue + "\" " +
	                "}";
	        try {
	        	logger.info("Request body is" +requestBody);
	        	RestAssured.given().baseUri(BASE_URL)
		        .contentType(ContentType.JSON)
		        .body(requestBody)
		        .when().put("/pet")        // Send PUT request
		        .then().statusCode(200)    // Validate response code
		        .and().assertThat()
	            .body("category.id", equalTo(20021))  	        // Validate id in response
		        .and().body("status", equalTo(statusValue));   // Validate status value in response
	      
	        }
	        catch(Exception e) {
	        	
	        	logger.error("Exception Object :: " + e.toString());
				logger.error("End Exception :: "+e.getLocalizedMessage());
	        }
	        String response= RestAssured.given().baseUri(BASE_URL)
			        .contentType(ContentType.JSON)
			        .body(requestBody)
			        .when().put("/pet").getBody().asPrettyString();
			logger.info("Response is " +response);
			logger.info("END:: PUT method for the PET test");
	        
	        
	    }

	    
}


