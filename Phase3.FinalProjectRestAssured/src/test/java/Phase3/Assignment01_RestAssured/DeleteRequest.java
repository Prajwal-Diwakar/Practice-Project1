package Phase3.Assignment01_RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteRequest {
	
private static final String Base_Url ="https://petstore.swagger.io/v2";
	
	@Test(description="Delete request method for the PET")
	
	public void testGetPet() {
		
		int petID= 344;
		
		RestAssured.given().baseUri(Base_Url)
		.when().delete("/pet/" +petID)
		.then().statusCode(200);
	}


}
