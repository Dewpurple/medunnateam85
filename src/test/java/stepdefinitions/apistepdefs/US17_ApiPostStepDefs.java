package stepdefinitions.apistepdefs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import static utilities.WriteToTxt.saveAllTestItemsData;

public class US17_ApiPostStepDefs {

    Response response;
    TestItem testItem;
    TestItem actualTestItemData;

    @Given("Adminuser sets the path params to create test item")
    public void adminuser_sets_the_path_params_to_create_test_item() {

        spec.pathParams("first","api","second","c-test-items");

    }
    @Given("Adminuser sets expected data")
    public void adminuser_sets_expected_data() {

        testItem=new TestItem("BernaAdmin","23/07/22 17:22 AM","120","50","mg/dl",22523,"Sodium",29);

    }
    @Given("Adminuser send Post request for test item and gets response")
    public void adminuser_send_post_request_for_test_item_and_gets_response() {
     //   response=given().spec(spec).contentType(ContentType.JSON).body(testItem).when().post("/{first}/{second}");
        response = given().headers(
                "Authorization",
                "Bearer " +generateToken(), //ConfigurationReader.getProperty("api_token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().body(testItem.toString()).post("https://medunna.com/api/c-test-items");
        response.prettyPrint();
    }

    @Given("Adminuser saves the test item records")
    public void adminuser_saves_the_test_item_records() throws JsonProcessingException {

        saveAllTestItemsData(testItem);
    }

    @Then("Adminuser validates test item record with Api")
    public void adminuser_validates_test_item_record_with_api() throws IOException {
        response.then().statusCode(201);
        response.prettyPrint();
        ObjectMapper obj=new ObjectMapper();
        actualTestItemData=obj.readValue(response.asString(), TestItem.class);
        System.out.println("Actual Data: "+actualTestItemData);
        Assert.assertEquals(testItem.getName(),actualTestItemData.getName());

        assertEquals(testItem.getPrice(),actualTestItemData.getPrice());


    }



}