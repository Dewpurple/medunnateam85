package stepdefinitions.apistepdefs;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import pojos.US001_T01;
import pojos.US16_Room;
import utilities.ConfigurationReader;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US_001_Ssn {

    US001_T01 us001_t01 [];
    Response response;
    JsonPath act;

    @Given("US_01 user set the url and get data and verify it with generate token")
    public void us_user_set_the_url_and_get_data_and_verify_it_with_generate_token() throws IOException {


        response = given().headers(
                "Authorization",
                "Bearer " + generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).when().get(ConfigurationReader.getProperty("end_point_users"));

       response.prettyPrint();


        ObjectMapper obj = new ObjectMapper();

        us001_t01 = obj.readValue(response.asString(), US001_T01[].class);

        Assert.assertEquals(200,response.statusCode());









    }
}
