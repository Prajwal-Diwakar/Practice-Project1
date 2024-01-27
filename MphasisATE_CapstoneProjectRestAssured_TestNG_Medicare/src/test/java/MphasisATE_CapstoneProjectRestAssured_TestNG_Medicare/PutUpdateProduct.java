package MphasisATE_CapstoneProjectRestAssured_TestNG_Medicare;

import static org.hamcrest.CoreMatchers.equalTo;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PutUpdateProduct {
	
	private static final String Base_Url ="http://localhost:9010";
	static final Logger logger= Logger.getLogger(PutUpdateProduct.class);
	
	@Test(description="Put request method to update the product")
	
	public void testPutUpdate() {
		
		logger.info("START::PUT method to update the product details");
		logger.info("PUT: URL " +Base_Url+ "/update-product");
		
		String requestBody="{\"id\": 999,\"image\": \"2.png\", \"name\": \"Disprin\",\"brand\": \"BZ Medico\", " +
                "\"status\": 1, \"price\": 120}";
		
		try {
			RestAssured.given().baseUri(Base_Url)
			.contentType(ContentType.JSON).body(requestBody)
			.when().put("/update-product")
			.then().assertThat().statusCode(200)
			.body("product.id", equalTo(999)).and()
			.body("product.image", equalTo("2.png")).and()
			.body("product.price", equalTo(120)).and()
			.body("product.name", equalTo("Disprin"));
		}
		catch(Exception e) {
				logger.error("Exception Object :: " + e.toString());
				logger.error("End Exception :: "+e.getLocalizedMessage());
		}
		
		String response= RestAssured.given().baseUri(Base_Url).contentType(ContentType.JSON).body(requestBody)
				.when().put("/update-product").getBody().asPrettyString();
		logger.info("Response is " +response);
		logger.info("END:: PUT method to update the product details");
	}


}
