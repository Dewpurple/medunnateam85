package stepdefinitions.apistepdefs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import junit.framework.Test;

import org.junit.Assert;
import pojos.TestItem;

import utilities.ConfigurationReader;

import java.io.IOException;

import static Hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import static utilities.Authentication.generateToken;



public class US17_ApiPostStepDefs {

    Response response;
    TestItem testItem=new TestItem();
    TestItem expectedData;
    TestItem actualData;

    @Given("Adminuser sets the path params to create test item")
    public void adminuser_sets_the_path_params_to_create_test_item() {

        spec.pathParams("first","api","second","c-test-items");

    }
    @Given("Adminuser sets expected data")
    public void adminuser_sets_expected_data() {
//        requesttestItem=new HashMap<>();
//        requesttestItem.put("createdBy","vusalgasimov");
//        requesttestItem.put("createdDate","28/07/22 13:40");
//        requesttestItem.put("defaultValMax","120");
//        requesttestItem.put("defaultValMin","50");
//        requesttestItem.put("description","mg/dl");
//        requesttestItem.put("id",0);
//        requesttestItem.put("name","Sodiummm");
//        requesttestItem.put("price",27);
//        System.out.println(requesttestItem);

        expectedData=new TestItem("29","15","mg/l","Zinco2",13);

    }
    @Given("Adminuser send Post request for test item and gets response")
    public void adminuser_send_post_request_for_test_item_and_gets_response() {

        String bodyofrequest ="{"+
                "  \"defaultValMax\": \"29\",\n" +
                "  \"defaultValMin\": \"15\",\n" +
                "  \"description\": \"mg/l\",\n" +
                "  \"name\": \"mcda\",\n" +
                "  \"price\": 13\n" +
                "}";
        //  response=given().spec(spec).contentType(ContentType.JSON).body(requesttestItem.toString()).when().post("/{first}/{second}");
        response = given().headers(
                "Authorization",
                "Bearer " +generateToken(),//ConfigurationReader.getProperty("api_token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().body(bodyofrequest).post("https://medunna.com/api/c-test-items");
        response.prettyPrint();
    }

    @Given("Adminuser saves the test item records")
    public void adminuser_saves_the_test_item_records() throws JsonProcessingException {

        //  saveAllTestItemsData(testItem);
    }

    @Then("Adminuser validates test item record with Api")
    public void adminuser_validates_test_item_record_with_api() throws IOException {
//        response.then().assertThat().statusCode(201);
//        TestItem actualData=response.as(TestItem.class);
//        Assert.assertEquals(expectedData.getName(),actualData.getName());
//        System.out.println(actualData);




    }



}