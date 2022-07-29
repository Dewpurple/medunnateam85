package stepdefinitions.End2End;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ConfigurationReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static utilities.Authentication.generateToken;

public class APITesting {

    Response response;
    @Given("user sends post request to create new physician e2e")
    public void user_sends_a_get_request_for_users_data() {
        response= given().headers(
                "Authorization","Bearer "+ generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON
        ).when().get(ConfigurationReader.getProperty("api_get_physician"));
    }
    @Then("Status code should be {int} e2e")
    public void status_code_should_be(Integer statusCode) {
//        response.then().assertThat().statusCode(200);
    }
    @Then("{string} should be validated by api e2e")
    public void should_be_validated_by_api(String string) throws IOException {
        response.then().assertThat().body("firstName", hasItem("team83"));

    }
}
