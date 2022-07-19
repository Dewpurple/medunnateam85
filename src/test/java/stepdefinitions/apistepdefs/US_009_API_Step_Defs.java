package stepdefinitions.apistepdefs;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.Robert_Apppointment_US028;
import pojos.Robert_Patient_US028;
import pojos.US_009_Pojo;
import utilities.ConfigurationReader;
import java.io.IOException;
import static utilities.Authentication.generateToken;
import static utilities.RobertAPIRequestUtils.getRequest;
public class US_009_API_Step_Defs {

    String token = "";
    String endPoint = ConfigurationReader.getProperty("patient_endpoint_Robert");
    Response response;
    US_009_Pojo[] patient ;


    @Given("as a user, I generate the token US009")
    public void as_a_user_i_generate_the_token_us028() {
        token = generateToken();
    }
    @Given("user gets actual results")
    public void user_gets_actual_results() {
        response = getRequest (token,endPoint);
        response.prettyPrint();
    }
    @Given("user defines expected results")
    public void user_defines_expected_results() {

    }

    @Given("user makes account data request US028")
    public void user_makes_account_data_request_us028() throws IOException {
        ObjectMapper obj = new ObjectMapper();
        patient = obj.readValue(response.asString(), US_009_Pojo[].class);

    }
    @When("user deserializes the acount data US028")
    public void user_deserializes_the_acount_data_us028() {

    }
    @Then("user runs assertion against expected and actual")
    public void user_runs_assertion_against_expected_and_actual() {

    }
}
