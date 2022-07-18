package stepdefinitions.uisteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import utilities.ConfigurationReader;

import static utilities.Authentication.generateToken;
import static utilities.RobertAPIRequestUtils.getRequest;

public class US_028_API_Test_Robert {

    String token = "";
    String endPoint = ConfigurationReader.getProperty("appointments_endpoint_Robert");
    Response response;

    @Given("as a user, I generate the token US028")
    public void as_a_user_i_generate_the_token_us028() {
        token = generateToken();
    }
    @Given("user makes appointment data request US028")
    public void user_makes_appointment_data_request_us028() {
        response = getRequest(token, endPoint);
        response.prettyPrint();
    }
    @When("user deserializes the appointments data US028")
    public void user_deserializes_the_appointments_data_us028() {

    }
    @Then("user savves the appointments data into correspondent files US028")
    public void user_savves_the_appointments_data_into_correspondent_files_us028() {

    }
}
