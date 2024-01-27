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

public class DeleteProductStep {
	
	private RequestSpecification request;
	private Response response;
	private ValidatableResponse json;
	
	private String BASE_URL = "http://localhost:9010";
	
	@Given("user wants to delete the products")
	public void user_wants_to_delete_the_products() {
		request = RestAssured.given().baseUri(BASE_URL);
	}

	@When("User executes the endpoint url of the delete product page")
	public void user_executes_the_endpoint_url_of_the_delete_product_page() {
		response =  request
				.when().delete("delete-product?id=101");
	}

	@Then("user deletes the products.")
	public void user_deletes_the_products() {
		
		int code=101;
		String message="Product with ID 101 Deleted Successfully.";
		
		json= response.then()
				.and().assertThat()
				.body("code", equalTo(code)).and()
				.body("message", equalTo(message));
			   
	}

	@Then("user will validate the outcomes of status code is {int}")
	public void user_will_validate_the_outcomes_of_status_code_is(Integer statusCode) {
		response.then().statusCode(statusCode);
	}

}
