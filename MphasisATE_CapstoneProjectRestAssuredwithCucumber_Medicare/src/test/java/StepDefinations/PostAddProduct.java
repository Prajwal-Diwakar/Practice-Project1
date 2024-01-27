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

public class PostAddProduct {
	
	private RequestSpecification request;
	private Response response;
	private ValidatableResponse json;
	

	private String BASE_URL = "http://localhost:9010";

	@Given("user wants to add the products")
	public void user_wants_to_add_the_products() {
		request = RestAssured.given().baseUri(BASE_URL);
	}

	@When("User executes the endpoint url of the adding product page")
	public void user_executes_the_endpoint_url_of_the_adding_product_page() {
		
		String requestBody="{\"id\": 999,\"image\": \"1.png\", \"name\": \"Disprin\",\"brand\": \"BZ Medico\", " +
		                    "\"status\": 1, \"price\": 100}";

		response =  request.contentType(ContentType.JSON).body(requestBody)
				.when().post("/add-product");
	}

	@Then("user adds the products.")
	public void user_adds_the_products() {
		json= response.then()
				.and().assertThat()
				.body("products.id", equalTo(999)).and()
				.body("products.name", equalTo("Disprin"));
	}

	@Then("validate the outcomes of status code is {int}")
	public void validate_the_outcomes_of_status_code_is(Integer statusCode) {
		response.then().statusCode(statusCode);;
	}

}
