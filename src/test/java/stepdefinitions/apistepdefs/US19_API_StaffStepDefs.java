package stepdefinitions.apistepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US19_API_Staff_Pojo;
import pojos.US_002_RegistrantPojo;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static utilities.Authentication.generateToken;

public class US19_API_StaffStepDefs {


    Response response;
    US19_API_Staff_Pojo requestBody;
    Faker faker= new Faker();


    @Given("us19 sends a get request for staffs data")
    public void us19_sends_a_get_request_for_staffs_data() {
        response= given().headers(
                "Authorization","Bearer "+ generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON
        ).when().get(ConfigurationReader.getProperty("api_US19_medunna_url"));

    }



    @Then("us19 Status code should be {int}")
    public void us19_status_code_should_be(Integer statusCode) {
        response.then().assertThat().statusCode(statusCode);
    }



    @Then("us19 {string} should be validated by api")
    public void us19_should_be_validated_by_api(String string) {
        String[] staffData= string.split("'");
//        System.out.println(Arrays.toString(registrantData));
        String firstname= staffData[7];
//        System.out.println(username);
//        response.then().assertThat().body("login",hasItem(username));
        response.then().assertThat().body("name",hasItem(firstname.toLowerCase()));



    }
}
