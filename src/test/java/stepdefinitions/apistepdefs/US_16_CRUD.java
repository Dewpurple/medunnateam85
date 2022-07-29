package stepdefinitions.apistepdefs;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US16_Room;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;
import static utilities.ApiRequestUtils.postRequest;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveRegistrantApiData;

public class US_16_CRUD {

        Response response;
        US16_Room us16_room[];



    @Given("US016 admin set the url and generate token")
    public void us016_admin_set_the_url_and_generate_token() throws Exception{

//
//        response = given().headers(
//                "Authorization",
//                "Bearer " + generateToken(),
//                "Content-Type", ContentType.JSON,
//                "Accept", ContentType.JSON
//        ).when().get(ConfigurationReader.getProperty("rooms_api_url"));
////        response.prettyPrint();
//
//        ObjectMapper obj = new ObjectMapper();
//
//        us16_room = obj.readValue(response.asString(), US16_Room[].class);
//
//        System.out.println(us16_room.length);
//
//        for (int i = 0; i < us16_room.length ; i++) {
//            System.out.println(us16_room[i].getRoomNumber());
//        }

    }





    @Given("US16 Admin sets the path params to create room and verify room information for inpatient")
    public void us16_admin_sets_the_path_params_to_create_room_and_verify_room_information_for_inpatient() {

        US16_Room us16_room = new US16_Room();
//        us16_room.setCreatedBy("Team90121");
        us16_room.setCreatedDate("2022-08-29T22:19:45.180Z");
//        us16_room.setId(148418);
        us16_room.setRoomNumber(483723);
        us16_room.setDescription("Merhaba Shebnem hanim");
        us16_room.setRoomType("TWIN");
        us16_room.setStatus(true);
        us16_room.setPrice(600);

        response = postRequest(ConfigurationReader.getProperty("rooms_api_url"),us16_room );

        response.prettyPrint();

        US16_Room actualData = response.as(US16_Room.class);

        System.out.println(actualData);

        Assert.assertEquals(us16_room.getRoomNumber(), actualData.getRoomNumber());
        Assert.assertEquals(us16_room.getDescription(), actualData.getDescription());
        Assert.assertEquals(us16_room.getPrice(), actualData.getPrice());


        saveRegistrantApiData(us16_room);

    }


    @Given("US16 Admin sets the path params to create room for put and verify room information for inpatient")
    public void us16_admin_sets_the_path_params_to_create_room_for_put_and_verify_room_information_for_inpatient() {

//        response = given().headers(
//                "Authorization",
//                "Bearer " + generateToken(),
//                "Content-Type", ContentType.JSON,
//                "Accept", ContentType.JSON
//        ).when().delete("https://medunna.com/api/rooms/148418");


    }



}
