package stepdefinitions.apistepdefs;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US_002_RegistrantPojo;
import pojos.US_018_GetPhysiciansPojo;
import utilities.ConfigurationReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.*;
import static utilities.Authentication.generateToken;

public class US_018_ApiGetPhysicianSetpDefs {

    Response response;
    @Given("user sends a get request for users data us018")
    public void user_sends_a_get_request_for_users_data() {
        response= given().headers(
                "Authorization","Bearer "+ generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON
        ).when().get(ConfigurationReader.getProperty("api_get_physician"));
    }
    @Then("Status code should be {int} us018")
    public void status_code_should_be(Integer statusCode) {
        response.then().assertThat().statusCode(statusCode);
    }
    @Then("{string} should be validated by api us018")
    public void should_be_validated_by_api(String string) throws IOException {
        response.then().assertThat().body("firstName", hasItem(string));

    }
}
