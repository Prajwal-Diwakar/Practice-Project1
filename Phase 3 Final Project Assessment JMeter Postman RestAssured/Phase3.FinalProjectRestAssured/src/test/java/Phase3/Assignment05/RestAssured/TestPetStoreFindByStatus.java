package Phase3.Assignment05.RestAssured;
	
	
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import org.apache.log4j.Logger;

	public class TestPetStoreFindByStatus {

	    private static final String base_url = "https://petstore.swagger.io/v2/pet/findByStatus";
	    static final Logger logger= Logger.getLogger(TestPetStoreFindByStatus.class);
	    
	    @Test
	    public void findPetsByAvailableStatus() {
	    	
	    	logger.info("START::GET method for the find PET by status=available");
			logger.info("GET: URL" +base_url);
	          // Make GET call with status=available
	        RestAssured.given()
	                .contentType(ContentType.JSON)
	                .queryParam("status", "available")
	            .when()
	                .get(base_url)
	            .then()
	                .statusCode(200)
	                .body("status", everyItem(equalTo("available")));
	        
	        String response= RestAssured.given()
	                .contentType(ContentType.JSON)
	                .queryParam("status", "pending")
	            .when()
	                .get(base_url).getBody().asPrettyString();
	        
	        logger.info("Response is " +response);
			logger.info("END:: GET method for the find PET by status=available");
	    }

	    @Test
	    public void findPetsByPendingStatus() {
	    	logger.info("START::GET method for the find PET by status=pending");
			logger.info("GET: URL" +base_url);
	        // Make GET call with status=pending
	        RestAssured.given()
	                .contentType(ContentType.JSON)
	                .queryParam("status", "pending")
	            .when()
	                .get(base_url)
	            .then()
	                .statusCode(200)
	                .body("status", everyItem(equalTo("pending")));
	        
	        String response= RestAssured.given()
	                .contentType(ContentType.JSON)
	                .queryParam("status", "pending")
	            .when()
	                .get(base_url).getBody().asPrettyString();
	        
	        logger.info("Response is " +response);
			logger.info("END:: GET method for the find PET by status=pending");
	    }

	    @Test
	    public void findPetsBySoldStatus() {
	    	logger.info("START::GET method for the find PET by status=sold");
			logger.info("GET: URL" +base_url);
	        // Make GET call with status=sold
	        RestAssured.given()
	                .contentType(ContentType.JSON)
	                .queryParam("status", "sold")
	            .when()
	                .get(base_url)
	            .then()
	                .statusCode(200)
	                .body("status", everyItem(equalTo("sold")));
	        
	        String response= RestAssured.given()
	                .contentType(ContentType.JSON)
	                .queryParam("status", "pending")
	            .when()
	                .get(base_url).getBody().asPrettyString();
	        logger.info("Response is " +response);
			logger.info("END:: GET method for the find PET by status=sold");
	    }

}

