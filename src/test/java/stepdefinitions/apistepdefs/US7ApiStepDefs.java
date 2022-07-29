package stepdefinitions.apistepdefs;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Appointment1;
import pojos.Patient;
import pojos.User;
import utilities.ConfigurationReader;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static Hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertTrue;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveApptData;

public class US7ApiStepDefs {
    Response response;
    Appointment1 appointment1;
    Appointment1 actualAppointment1;
    String token = generateToken();

    @Given("US7_user generates token")
    public void US7_user_generates_token() {
        System.out.println(token);
    }

    @Then("US7_user deserializes the appointment data to java")
    public void US7_user_deserializes_the_appointment_data_to_java() throws Exception {
        spec.pathParams("first","api","second","appointments");
//        ObjectMapper obj = new ObjectMapper();
//        appointment1 = obj.readValue(response.asString(), Appointment1.class);

        //    System.out.println("size of elements: " + appointments.length);
    }
    @Then("US7_user enters the expected data")
    public void us7_user_enters_the_expected_data() {
        appointment1=new Appointment1(23456, "08/01/2022","08/02/2022","activated","anamnesis","treatment","diagnosis","prescription","vusalgasimov","7/29/22",new Patient("vusalgasimov","07/29/2022",23456,"Mads","Mikkelsen","04/25/1985","4536573445","male","","madsmikkelsen@gmail.com",new User("","",23456,"","Mads","Mikkelsen","madsmikkelsen@gmail.com",true,"","324-35-3424")));

    }
    @Given("US7_user sends a post request for appointment data")
    public void US7_user_sends_a_post_request_for_appointment_data() throws Exception {
        response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON
        ).when().body(appointment1.toString()).post("https://medunna.com/api/appointments");
        // response = getRequest(token,endPoint);
//        response.prettyPrint();
//        boolean flag = false;
//        for (int i=0; i<appointments.length;i++){
//            if("Josefine".contains(appointments[i].getFirstName())){
//                flag = true;
//}
//   }
//        assertTrue(flag);
    }
    @Then("US7_user saves the user's data to correspondent files")
    public void US7_user_saves_the_user_s_data_to_correspondent_files() {
        saveApptData(appointment1);//actual data
    }
    @And("US7_user makes assertions")
    public void US7_UserMakesAssertions() throws IOException {
        response.then().statusCode(201);
        response.prettyPrint();

        ObjectMapper obj = new ObjectMapper();
        actualAppointment1 = obj.readValue(response.asString(), Appointment1.class);
        System.out.println("Actual appointment: " + actualAppointment1);
        Assert.assertEquals(appointment1.getId(),actualAppointment1.getId());
        Assert.assertEquals(appointment1.getPatient().getEmail(),actualAppointment1.getPatient().getEmail());


    }


}