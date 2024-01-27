package MphasisATE_CapstoneProjectRestAssured_TestNG_Medicare;

import static org.hamcrest.CoreMatchers.equalTo;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostAddProduct {
	
	private static final String Base_Url ="http://localhost:9010";
	static final Logger logger= Logger.getLogger(PostAddProduct.class);
	
	@Test(description="Post request method to add the product")
	
	public void testGetProducts() {
		
		logger.info("START::POST method to add the product details");
		logger.info("POST: URL " +Base_Url+ "/add-product");
		
		String requestBody="{\"id\": 999,\"image\": \"1.png\", \"name\": \"Disprin\",\"brand\": \"BZ Medico\", " +
                "\"status\": 1, \"price\": 100}";
		
		try {
			RestAssured.given().baseUri(Base_Url)
			.contentType(ContentType.JSON).body(requestBody)
			.when().post("/add-product")
			.then().assertThat().statusCode(200)
			.body("products.id", equalTo(999)).and()
			.body("products.name", equalTo("Disprin"));;
		}
		catch(Exception e) {
				logger.error("Exception Object :: " + e.toString());
				logger.error("End Exception :: "+e.getLocalizedMessage());
		}
		
		String response= RestAssured.given().baseUri(Base_Url).contentType(ContentType.JSON).body(requestBody)
				.when().post("/add-product").getBody().asPrettyString();
		logger.info("Response is " +response);
		logger.info("END:: POST method to add the product details");
	}

}
