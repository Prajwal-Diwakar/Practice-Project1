package Phase3.Assignment01_RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class PostRequest {
	
	private static final String Base_Url ="https://petstore.swagger.io/v2";
   
	    @Test(description = "Post request method with the rest assured")
	    public void testPostPet() {
	        // Base URL for the API
	        

	        // JSON Body
	        String requestBody = "{ \"id\": 344, \"category\": { \"id\": 0, \"name\": \"string\" }, \"name\": \"Doggie\", " +
	                "\"photoUrls\": [ \"string\" ], \"tags\": [ { \"id\": 0, \"name\": \"string\" } ], " +
	                "\"status\": \"available\" }";

	        // PetID is parameterized
	        int petID = 344;

	        // Send POST request
	        RestAssured.given().baseUri(Base_Url)
	        .contentType(ContentType.JSON)
	        .body(requestBody)
	        .when()
	        .post("/pet")
	        .then().statusCode(200);

	        // Validate response code
//	        assertEquals(response.getStatusCode(), 200, "Unexpected status code");
//
//	        // Validate PetID from the response matches the request PetID
//	        int responsePetID = response.then().extract().path("id");
//	        assertEquals(responsePetID, petID, "PetID mismatch between request and response");
	    }
	}


