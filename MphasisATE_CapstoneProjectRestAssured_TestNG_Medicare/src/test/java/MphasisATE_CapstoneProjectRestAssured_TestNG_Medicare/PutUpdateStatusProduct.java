package MphasisATE_CapstoneProjectRestAssured_TestNG_Medicare;

import static org.hamcrest.CoreMatchers.equalTo;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PutUpdateStatusProduct {
	private static final String Base_Url ="http://localhost:9010";
	static final Logger logger= Logger.getLogger(PutUpdateStatusProduct.class);
	
	@Test(description="PUT request method to update the status of product")
	
	public void testPostUpdateProductStatus() {
		
		logger.info("START::PUT method to update the status of product");
		logger.info("PUT: URL " +Base_Url+ "/update-product-status");
		
		String requestBody="{\"id\": 999,\"image\": \"1.png\", \"name\": \"Disprin\",\"brand\": \"BZ Medico\", " +
                "\"status\": 0, \"price\": 100}";
		
		try {
			RestAssured.given().baseUri(Base_Url)
			.contentType(ContentType.JSON).body(requestBody)
			.when().put("/update-product-status")
			.then().assertThat().statusCode(200)
			.body("product.id", equalTo(999)).and()
			.body("product.image", equalTo("2.png")).and()
			.body("product.price", equalTo(120)).and()
			.body("product.name", equalTo("Disprin")).and()
			.body("product.status", equalTo(0));
		}
		catch(Exception e) {
				logger.error("Exception Object :: " + e.toString());
				logger.error("End Exception :: "+e.getLocalizedMessage());
		}
		
		String response= RestAssured.given().baseUri(Base_Url).contentType(ContentType.JSON).body(requestBody)
				.when().put("/update-product-status").getBody().asPrettyString();
		logger.info("Response is " +response);
		logger.info("END:: PUT method to update the status of product");
	}


}
