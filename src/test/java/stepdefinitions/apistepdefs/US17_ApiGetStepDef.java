package stepdefinitions.apistepdefs;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.TestItem;
import utilities.ConfigurationReader;


import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveAllTestItemsApiData;
import static utilities.WriteToTxt.saveAllTestItemsData;

public class US17_ApiGetStepDef {
    Response response;
    TestItem[]testItems;
    TestItem testItem;
    Faker faker;

    @Given("Adminuser sends the get request for test items data")
    public void adminuser_sends_the_get_request_for_test_items_data() {
        //   response=getRequestForTestItems(generateToken(ConfigurationReader.getProperty("adminusername2"),ConfigurationReader.getProperty("adminpw2")),ConfigurationReader.getProperty("testItem_endpoint"));
        response = given().headers(
                "Authorization",
                "Bearer " + generateToken(),//ConfigurationReader.getProperty("api_token"),//
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get("https://medunna.com/api/c-test-items?size=10000");
        response.prettyPrint();
//        response = given().headers(
//                        "Authorization",
//                        "Bearer " + ConfigurationReader.getProperty("api_token"),
//                        "Content-Type",
//                        ContentType.JSON,
//                        "Accept",
//                        ContentType.JSON)
//                .when().body(testItem)
//                .post("https://www.medunna.com/api/c-test-items")
//                .then()
//                .contentType(ContentType.JSON)
//                .extract()
//                .response();

    }
    @Given("Adminuser deserializes testitems data to java")
    public void adminuser_deserializes_testitems_data_to_java() throws Exception {
        ObjectMapper obj=new ObjectMapper();

        testItems=obj.readValue(response.asString(), TestItem[].class);
        response.then().statusCode(200);
/*
        System.out.println("Sizes of the actual Test Items = "+testItems.length);
        boolean flag =false;
        for(int i=0; i<testItems.length;i++){
            if("Sodium".contains(testItems[i].getName())){
                flag=true;
            }
        }

        assertTrue(flag);
     */

    }
    @Given("Adminuser saves the test items data to correspondent file")
    public void adminuser_saves_the_test_items_data_to_correspondent_file() {
        saveAllTestItemsApiData(testItems);

    }
    @Then("Adminuser validates expected test item records with Api")
    public void adminuser_validates_expected_test_item_records_with_api() {
        Assert.assertEquals(200,response.getStatusCode());




    }







}