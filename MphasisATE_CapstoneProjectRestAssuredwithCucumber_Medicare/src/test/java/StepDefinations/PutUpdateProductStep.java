package StepDefinations;

import static org.hamcrest.CoreMatchers.equalTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PutUpdateProductStep {
	
	private RequestSpecification request;
	private Response response;
	private ValidatableResponse json;
	

	private String BASE_URL = "http://localhost:9010";
	
	@Given("user wants to update the products")
	public void user_wants_to_update_the_products() {
		request = RestAssured.given().baseUri(BASE_URL);
	}

	@When("User executes the endpoint url of the update product page")
	public void user_executes_the_endpoint_url_of_the_update_product_page() {
		String requestBody="{\"id\": 999,\"image\": \"2.png\", \"name\": \"Disprin\",\"brand\": \"BZ Medico\", " +
                "\"status\": 1, \"price\": 120}";

		response =  request.contentType(ContentType.JSON).body(requestBody)
				.when().put("update-product");
	}

	@Then("user updates the products.")
	public void user_updates_the_products() {
		json= response.then()
				.and().assertThat()
				.body("product.id", equalTo(999)).and()
				.body("product.image", equalTo("2.png")).and()
				.body("product.price", equalTo(120)).and()
				.body("product.name", equalTo("Disprin"));
	}

	@Then("user validates the outcomes of status code is {int}")
	public void user_validates_the_outcomes_of_status_code_is(Integer statusCode) {
		response.then().statusCode(statusCode);;
	}

}
