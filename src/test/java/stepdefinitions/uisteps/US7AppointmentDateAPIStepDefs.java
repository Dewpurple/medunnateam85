package stepdefinitions.uisteps;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Appointment;
import pojos.Appointment1;
import pojos.User;
import utilities.ConfigurationReader;
import java.util.HashMap;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.ApiRequestUtils.getRequest;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveApptData;


public class US7AppointmentDateAPIStepDefs {
    String token = "";
    String endPoint = ConfigurationReader.getProperty("appointment_api_url");
    Response response;
    Appointment1[] appointments;
    Appointment1 appointment1;
    Appointment appointment;
    User user;

    @Given("US7_user generates token")
    public void US7_user_generates_token() {
       token = generateToken();

    }
    @Given("US7_user sends a get request for appointment data")
    public void US7_user_sends_a_get_request_for_appointment_data() throws Exception {
       response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON
        ).when().get(endPoint);
//        response = getRequest(token,endPoint);
 //       response.prettyPrint();
//        boolean flag = false;
//        for (int i=0; i<appointments.length;i++){
//            if("Josefine".contains(appointments[i].getFirstName())){
//                flag = true;
//}
//   }
//        assertTrue(flag);

   }
    @Then("US7_user deserializes the appointment data to java")
    public void US7_user_deserializes_the_appointment_data_to_java() throws Exception{
        ObjectMapper obj = new ObjectMapper();
        appointments  = obj.readValue(response.asString(), Appointment1[].class );

    System.out.println("size of elements: " +appointments.length);
    }
    @Then("US7_user saves the user's data to correspondent files")
    public void US7_user_saves_the_user_s_data_to_correspondent_files() {
        saveApptData(appointments);//actual data
    }
    @And("US7_user makes assertions")
    public void US7_UserMakesAssertions(){
//assertTrue(appointment.getLastName(),appointments[].g)
    }
}

