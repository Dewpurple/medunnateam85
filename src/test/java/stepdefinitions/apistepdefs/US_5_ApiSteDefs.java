package stepdefinitions.apistepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.AppointmentGet;
import pojos.AppointmentPatient;
import pojos.AppointmentUser;

import static io.restassured.RestAssured.given;

public class US_5_ApiSteDefs {
    Response response;
    AppointmentGet responseBody;
    AppointmentPatient patient;
    AppointmentUser requestBody;

    @Given("US5 POST request for appointment management")
    public void us5_post_request_for_appointment_management() {
        String email = "ferrymoney3@hotmail.com";
        String firstName = "ferry";
        String lastName = "money";
        String phone = "645-334-6567";
        String ssn = "574-52-5313";
        String startDate = "2022-07-07";
        requestBody=new AppointmentUser(email,firstName,lastName,phone,ssn,startDate);
        response = given().
                when().
                contentType(ContentType.JSON).
                body(requestBody).post("https://medunna.com/api/appointments/request");
        response.prettyPrint();

    }
    @Then("US5 Assert that the email and SNN is registered to database")
    public void us5_assert_that_the_email_and_snn_is_registered_to_database() {
        Assert.assertTrue(response.asString().contains(requestBody.getEmail()));

    }

}
