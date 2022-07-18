package stepdefinitions.apistepdefs;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.Robert_Apppointment_US028;
import utilities.ConfigurationReader;

import static utilities.Authentication.generateToken;
import static utilities.RobertAPIRequestUtils.getRequest;


public class US_028_API_Test_RobertStepDefs {

    String token = "";
    String endPoint = ConfigurationReader.getProperty("appointments_endpoint_Robert");
    Response response;
    Robert_Apppointment_US028 [] appointments ;


    @Given("as a user, I generate the token US028")
    public void as_a_user_i_generate_the_token_us028() {
        token = generateToken();
    }

    @Given("user makes appointment data request US028")
    public void user_makes_appointment_data_request_us028() {
        response = getRequest(token, endPoint);
//        response.prettyPrint();
    }
    @When("user deserializes the appointments data US028")
    public void user_deserializes_the_appointments_data_us028() throws Exception{
        ObjectMapper obj = new ObjectMapper();
        appointments = obj.readValue(response.asString(), Robert_Apppointment_US028[].class);
        System.out.println("Size : " + appointments.length);
        System.out.println(appointments[2].getEndDate());
        System.out.println(appointments[2].getPatient().getFirstName());
        System.out.println(appointments[2].getPatient().getUser().getEmail());
    }
    @Then("user savves the appointments data into correspondent files US028")
    public void user_savves_the_appointments_data_into_correspondent_files_us028() {
//        robertSaveApplicationData(ConfigurationReader.getProperty("appointments_file_name_Robert"), appointments);
    }
}
