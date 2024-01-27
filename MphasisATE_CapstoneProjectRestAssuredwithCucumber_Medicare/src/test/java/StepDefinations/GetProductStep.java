package StepDefinations;

import static org.hamcrest.CoreMatchers.equalTo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetProductStep {
	
	private RequestSpecification request;
	private Response response;
	private ValidatableResponse json;
	

	private String BASE_URL = "http://localhost:9010";
	
	@Given("user wants to get the list of all products in the store")
	public void user_wants_to_get_the_list_of_all_products_in_the_store() {
		request = RestAssured.given().baseUri(BASE_URL);
	    
	}

	@When("User executes the endpoint url of the get product page")
	public void user_executes_the_endpoint_url_of_the_get_product_page() {
		response=request.when().get("/get-products");
	}

	@Then("user gets the all the products in the store.")
	public void user_gets_the_all_the_products_in_the_store() {
		
		int code=101;
		String message="12 Products Fetched Successfully.";
		
		json= response.then()
				.and().assertThat()
				.body("code", equalTo(code)).and()
				.body("message", equalTo(message));
			   
	}

	@Then("the request response has a {int} response code")
	public void the_request_response_has_a_response_code(Integer statusCode) {
		response.then().statusCode(statusCode);
	}



}
  