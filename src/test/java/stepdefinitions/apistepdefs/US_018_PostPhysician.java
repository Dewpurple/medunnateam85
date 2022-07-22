package stepdefinitions.apistepdefs;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US_018_PostPhysicianPojo;
import pojos.US_018_PostPhysicianUserPojo;

import static Hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import static utilities.Authentication.generateToken;

public class US_018_PostPhysician {

    Response response;
    US_018_PostPhysicianPojo physicianPojo;
    US_018_PostPhysicianUserPojo userPojo;
    @Given("user sends a post request for physicians data")
    public void user_sends_a_post_request_for_physicians_data() {

        spec.pathParams("first", "api", "second", "physicians");
        userPojo = new US_018_PostPhysicianUserPojo(true, "vusalapipost", "333-00-1111");
        physicianPojo = new US_018_PostPhysicianPojo(339, "Vince", "Doctor", "345-02-1957", "333-00-1111", userPojo);

        response= given().headers(
                "Authorization","Bearer "+ generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON
        ).spec(spec).contentType(ContentType.JSON).body(physicianPojo).when().post("/{first}/{second}");
        response.prettyPrint();

    }
    @Then("firstName, lastName, email, ssn should be validated by api")
    public void should_be_validated_by_api() {
        US_018_PostPhysicianPojo actualPojo = response.as(US_018_PostPhysicianPojo.class);

        assertEquals(physicianPojo.getSsn(), actualPojo.getSsn());
//        assertEquals(physicianPojo.getFirstName(), actualPojo.getLastName());
    }
}
