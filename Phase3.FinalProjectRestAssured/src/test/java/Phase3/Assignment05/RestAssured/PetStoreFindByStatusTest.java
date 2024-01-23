package Phase3.Assignment05.RestAssured;
	
	
	import io.restassured.RestAssured;
	import io.restassured.http.ContentType;
	import org.testng.annotations.Test;
	import static org.hamcrest.Matchers.*;

	public class PetStoreFindByStatusTest {

	    private static final String base_url = "https://petstore.swagger.io/v2/pet/findByStatus";

	    @Test
	    public void findPetsByAvailableStatus() {
	          // Make GET call with status=available
	        RestAssured.given()
	                .contentType(ContentType.JSON)
	                .queryParam("status", "available")
	            .when()
	                .get(base_url)
	            .then()
	                .statusCode(200)
	                .body("status", everyItem(equalTo("available")));
	    }

	    @Test
	    public void findPetsByPendingStatus() {
	        // Make GET call with status=pending
	        RestAssured.given()
	                .contentType(ContentType.JSON)
	                .queryParam("status", "pending")
	            .when()
	                .get(base_url)
	            .then()
	                .statusCode(200)
	                .body("status", everyItem(equalTo("pending")));
	    }

	    @Test
	    public void findPetsBySoldStatus() {
	        // Make GET call with status=sold
	        RestAssured.given()
	                .contentType(ContentType.JSON)
	                .queryParam("status", "sold")
	            .when()
	                .get(base_url)
	            .then()
	                .statusCode(200)
	                .body("status", everyItem(equalTo("sold")));
	    }

}

