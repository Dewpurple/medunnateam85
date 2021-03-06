package utilities;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import java.util.HashMap;
import java.util.Map;

import static Hooks.Hooks.spec;
import static io.restassured.RestAssured.given;


public class Authentication  {
    public static String generateToken(){

        //setting the base url and path params
       // spec.pathParams("first", "api", "second", "authenticate");
        //setting the expected data since we have less data, we can use map to store the data, else use pojo
        String endpoint="https://medunna.com//api/authenticate";



        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("password", "vusalgasimov");
        expectedData.put("rememberMe", "true");
        expectedData.put("username", "vusalgasimov");
        //setting the request body and getting the response
       // Response response = given().spec(spec).contentType(ContentType.JSON).body(expectedData).when().post(endpoint);
        Response response = given().contentType(ContentType.JSON).body(expectedData).when().post(endpoint);


       // response.prettyPrint();
        JsonPath json = response.jsonPath();
        return json.getString("id_token");
    }
    public static String generateToken2(){
        //Set the base url
        //api/authenticate
        spec.pathParams("first", "api", "second", "authenticate");
        //Set the expected data
        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("username", "jo");
        expectedData.put("password", "789456123");
        expectedData.put("rememberMe","true" );
        //Send the Post request and get the data
        Response response = given().spec(spec).contentType(ContentType.JSON).
                body(expectedData).when().post("/{first}/{second}");
        response.prettyPrint();
        JsonPath json = response.jsonPath();
        return json.getString("id_token");
    }
}
