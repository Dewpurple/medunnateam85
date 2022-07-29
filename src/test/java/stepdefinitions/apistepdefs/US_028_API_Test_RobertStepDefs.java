package stepdefinitions.apistepdefs;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.Robert_Apppointment_US028;
import utilities.ConfigurationReader;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.hasItem;
import static utilities.Authentication.generateToken;
import static utilities.RobertAPIRequestUtils.getRequest;
import static utilities.WriteToTxt.robertSaveApplicationData;


public class US_028_API_Test_RobertStepDefs {

    String token = "";
    String endPoint = ConfigurationReader.getProperty("countrys_endpoint_Robert");
    Response response;



//    @Given("as a user, I generate the token US028")
//    public void as_a_user_i_generate_the_token_us028() {
//        token = generateToken();
//    }
//
//    @Given("user makes appointment data request US028")
//    public void user_makes_appointment_data_request_us028() throws IOException {
//        response = getRequest(token, endPoint);
////        response.prettyPrint();
//    }
//    @Given("user asserts that the created country exists")
//    public void user_asserts_that_the_created_country_exists() {
//        response.then().assertThat().body("name", hasItem("France"));
//    }


}
