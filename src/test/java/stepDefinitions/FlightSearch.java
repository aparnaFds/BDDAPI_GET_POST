package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class FlightSearch {

	private String classname;
	public FlightSearch() {

		classname = this.getClass().getSimpleName();
		System.out.println("Class name = " + classname);
	}

	@Given("I have a request URL {string}")
	public void i_have_a_request_URL(String addURI) {
		System.out.println("Add URL :" + addURI);

	}

	@When("I send request {string} with endpiont {string}")
	public void i_send_request_with_endpiont(String url, String endpoint) throws IOException {
		System.out.println("Request url" + url);
		commonSteps.CommonAPIMethods.executeGETRequest(url, endpoint, classname);

	}

	@Then("I see response code {int}")
	public void i_see_response_code(int responsecode) {
		commonSteps.CommonAPIMethods.verifyResponseCode(responsecode);

	}

	@Then("I get the response")
	public void i_get_response() {
		commonSteps.CommonAPIMethods.printResponse();
	}

	@Then("I verify the value at {string} is {string}")
	public void i_verify_the_value_at_is(String value, String location) {
		commonSteps.CommonAPIMethods.verifyAttribute(value, location);

	}

}
