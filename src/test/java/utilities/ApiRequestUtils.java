package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

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
}
