package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US16_Room;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class ApiRequestUtils {
    public static Response getRequest(String token, String endPoint){
        Response response = given().headers(
"Authorization",
                "Bearer"+token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON
        ).when().get(endPoint);
        return response;


    }

    public static Response postRequest( String endPoint, US16_Room us16_room){
       Response response = given().headers(
                "Authorization",
                "Bearer " + generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).when().contentType(ContentType.JSON).body(us16_room).post(endPoint);
        return response;


    }
}
