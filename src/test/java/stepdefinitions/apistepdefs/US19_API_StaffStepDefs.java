package stepdefinitions.apistepdefs;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.TestItem;
import pojos.US19_API_Staff_Pojo;
import pojos.us002pojo.US_002_RegistrantPojo;
import utilities.ConfigurationReader;
import utilities.WriteToTxt;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static utilities.Authentication.generateToken;

public class US19_API_StaffStepDefs {


    String token = "";
    Response response;
   US19_API_Staff_Pojo[] userRequest;
    Faker faker= new Faker();



    @Given("as a us19, I generate the token")
    public void asAUserIGenerateTheToken() {
        token = generateToken();
    }


    @Given("us19 sends a get request for staff data")
    public void us19_sends_a_get_request_for_staffs_data() {
        response= given().headers(
                "Authorization","Bearer "+ generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON
        ).when().get(ConfigurationReader.getProperty("api_US19_medunna_url"));
        response.prettyPrint();
    }



    @Given("us19 deserializes the staff data to java")
    public void us19_deserializes_the_staff_data_t_java() throws IOException {
        ObjectMapper obj=new ObjectMapper();
    userRequest = obj.readValue(response.asString(),US19_API_Staff_Pojo [].class);
        System.out.println("Size: " + userRequest.length);//Size: 38
        //System.out.println(userRequest[7].getFirstName());
       // System.out.println(userRequest[7].getLastName());
       // System.out.println(userRequest[7].getEmail());

        for(int i=0; i<userRequest.length; i++ ){
            System.out.println("firstName" + " : " + userRequest[i].getFirstName());
            //System.out.println("lastName" + " : " + userRequest[i].getLastName());

        }





    }


    @Given("us19 saves the staff data into correspondent files")
    public void us19_saves_the_staff_data_into_correspondent_files() {

        WriteToTxt.saveUS19_API_StaffData(userRequest);

    }



    @Then("us19 Status code should be {int}")
    public void us19_status_code_should_be(Integer statusCode) {
        response.then().assertThat().statusCode(statusCode);
    }





}
