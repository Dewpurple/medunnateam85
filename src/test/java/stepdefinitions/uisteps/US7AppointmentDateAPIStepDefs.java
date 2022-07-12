package stepdefinitions.uisteps;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Appointment;
import utilities.Authentication;
import utilities.ConfigurationReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveApptData;


public class US7AppointmentDateAPIStepDefs {
    Response response;
    Appointment [] appointments;

    @Given("user sends a get request for appointment data")
    public void user_sends_a_get_request_for_appointment_data() {
        response = given().headers(
                "Authorization",
                "Bearer " + generateToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON
        ).when().get(ConfigurationReader.getProperty("appointment_api_url"));
    }
    @Given("user deserializes the appointment data to java")
    public void user_deserializes_the_appointment_data_to_java() throws Exception {
ObjectMapper obj = new ObjectMapper();
        obj.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
appointments = obj.readValue(response.asString(),Appointment[].class);

//        System.out.println("size of elements: " +appointments.length);
//        boolean flag = false;
//        for (int i=0; i<appointments.length;i++){
//            if("Josefine".contains(appointments[i].getFirstName())){
//                flag = true;
//}
//   }
//        assertTrue(flag);

   }

    @Then("user saves the user's data to correspondent files and validates")
    public void user_saves_the_user_s_data_to_correspondent_files_and_validates() {
saveApptData(appointments);
    }
}

