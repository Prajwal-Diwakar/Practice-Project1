package Phase3.Assignment01_RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetRequest {
	
	private static final String Base_Url ="https://petstore.swagger.io/v2";
	
	@Test(description="Get request method for the PET")
	
	public void testGetPet() {
		
		int petID= 344;
		
		RestAssured.given().baseUri(Base_Url)
		.when().get("/pet/" +petID)
		.then().statusCode(200);
	}

}
