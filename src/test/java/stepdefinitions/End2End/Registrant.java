package stepdefinitions.End2End;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US001_T01;
import utilities.ConfigurationReader;
import utilities.ReadText;
import utilities.WriteToTxt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class Registrant {
        Response response;
        US001_T01[] us001_t01;

@Given("US_Registrant Api user sends a get request to get all registrants' data")
public void user_sends_a_get_request_to_get_all_registrants_data() {

        response = given().headers(
        "Authorization",
        "Bearer " + generateToken(),
        "Content-Type", ContentType.JSON,
        "Accept", ContentType.JSON

        ).when().get(ConfigurationReader.getProperty("endpoint"));

        //  response.prettyPrint();

        }

@Given("US_Registrant Api user deserializes the response")
public void user_deserializes_the_response() throws IOException {

        ObjectMapper obj = new ObjectMapper();
        us001_t01 = obj.readValue(response.asString(), US001_T01[].class);

//        for (int i = 0; i < us001_t01.length; i++)
//             System.out.println(i + 1 + ". Customer: " + us001_t01[i]);

//        for (int i = 0; i < us001_t01.length; i++);
//        //    System.out.println(i + 1 + ". Customer: " + us001_t01[i].getFirstName());
//
//        for (int i = 0; i < us001_t01.length; i++);
//        //    System.out.println(i + 1 + ". Customer: " + us001_t01[i].getLastName());
//
//        for (int i = 0; i < us001_t01.length; i++);
//        //    System.out.println(i + 1 + ". Customer: " + us001_t01[i].getSsn());
//        for (int i = 0; i < us001_t01.length; i++);
//         //   System.out.println(i + 1 + ". Customer: " + us001_t01[i].getEmail());


        }

@Then("US_Registrant Api user saves the data to the files and verify data")
public void user_saves_the_data_to_the_files_and_validates() {

        String fileName = "src/test/resources/test_data/RegistarantDataList.txt";
        WriteToTxt.saveUserData(fileName, us001_t01);




        List<String> expected = new ArrayList<>();
        expected.add("839-97-7135");
        expected.add("Kimi");
        expected.add("Koepps");
        expected.add("williemae.considine@hotmail.coms");

        List<String> actual = ReadText.readUserInformationList(fileName);
        Assert.assertTrue("SSN mismatch", actual.contains("839-97-7135"));
        Assert.assertTrue("SSN mismatch", actual.contains("Kimi"));
        Assert.assertTrue("SSN mismatch", actual.contains("Koepps"));
        Assert.assertTrue("SSN mismatch", actual.contains("williemae.considine@hotmail.coms"));


        }
        }