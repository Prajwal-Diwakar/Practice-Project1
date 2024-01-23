package Phase3.Assignment02_RestAssured;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class putRequest {
	
	 private static final String BASE_URL = "https://petstore.swagger.io/v2";
	 
//	    private static final Map<String, String> statusMapping = new HashMap<>();
//
//	    static {
//	        // Populate status mapping based on environments
//	        statusMapping.put("DEV", "available_DEV");
//	        statusMapping.put("QA", "available_QA");
//	        statusMapping.put("PROD", "available_PROD");
//	    }
	 
	 @DataProvider(name = "statusValues")
		public Iterator<Object[]> statusValues() {
			final List<Object[]> statusValues = new ArrayList<Object[]> ();
			statusValues.add(new Object[] {"available_DEV"});
			statusValues.add(new Object[] {"available_QA"});
			statusValues.add(new Object[] {"available_PROD"});
			
			return statusValues.iterator();
		}
	 
	  @Test(description="put request method ",dataProvider = "statusValues")
	    public void putCallTesting(final String statusValue) {
	        // Set base URL
	       

	        // Prepare JSON request body with dynamic status field
	        String requestBody = "{ " +
	                "\"id\": 9223372016900013000, " +
	                "\"category\": {\"id\": 20021, \"name\": \"string\"}, " +
	                "\"name\": \"doggie\", " +
	                "\"photoUrls\": [\"string\"], " +
	                "\"tags\": [{\"id\": 0, \"name\": \"string\"}], " +
	                "\"status\": \"" + statusValue + "\" " +
	                "}";
	        
	        RestAssured.given().baseUri(BASE_URL)
	        .contentType(ContentType.JSON)
	        .body(requestBody)
	        .when().put("/pet")        // Send PUT request
	        .then().statusCode(200);

	       
	        

//	        // Validate response code
//	        response.then().statusCode(200);
//
//	        // Validate id in response
//	        response.then().body("category.id", equalTo(20021));
//
//	        // Validate status value in response
//	        response.then().body("status", equalTo(getStatusValue(environment)));
	    }

	    
}



