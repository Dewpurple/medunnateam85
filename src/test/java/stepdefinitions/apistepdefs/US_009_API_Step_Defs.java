package stepdefinitions.apistepdefs;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
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
//    US_009_Pojo[] patient ;

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
//        ObjectMapper obj = new ObjectMapper();
//        patient = obj.readValue(response.asString(), US_009_Pojo[].class);
    }
    @When("user deserializes the acount data US028")
    public void user_deserializes_the_acount_data_us028() {

    }
    @Then("user runs assertion against expected and actual")
    public void user_runs_assertion_against_expected_and_actual() {

        US_009_Pojo patient = new US_009_Pojo (99802,"vusalgasimov", "Vusal", "Gasimov", "123-43-2343", "vusal@gmail.com"
                , "null" , true, "en", "anonymousUser", "2022-06-26T15:26:29.830340Z", "anonymousUser", "2022-07-16T02:01:54.006805Z");
        JsonPath json = response.jsonPath();
        Assert.assertEquals(json.getInt("id"), patient.getId());
        Assert.assertEquals(json.getString("login"), patient.getLogin());
        Assert.assertEquals(json.getString("firstName"), patient.getFirstname());
        Assert.assertEquals(json.getString("lastName"), patient.getLastname());
        Assert.assertEquals(json.getString("ssn"), patient.getSsn());
        Assert.assertEquals(json.getString("email"), patient.getEmail());
        Assert.assertEquals(json.getString("langKey"), patient.getLangKey());
        Assert.assertEquals(json.getString("createdBy"), patient.getCraetedBy());
        Assert.assertEquals(json.getString("createdDate"), patient.getLastModifiedBy());

    }
}
