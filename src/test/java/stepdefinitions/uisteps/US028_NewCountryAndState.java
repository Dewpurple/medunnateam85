package stepdefinitions.uisteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;
import java.io.IOException;
import static org.hamcrest.Matchers.hasItem;
import static utilities.Authentication.generateToken;
import static utilities.RobertAPIRequestUtils.getRequest;

public class US028_NewCountryAndState {

    String token = "";
    String endPoint = ConfigurationReader.getProperty("countrys_endpoint_Robert");
    Response response;
    HomePage homePage = new HomePage();
    String country;
    Faker faker = new Faker();

    @Given("user clicks on Country button US009")
    public void user_clicks_on_country_button_us009() {
        Driver.waitAndClick(homePage.countryButton);
    }
    @Given("user clicks on Create a new Country US009")
    public void user_clicks_on_create_a_new_country_us009() {
        Driver.waitAndClick(homePage.createAnewCountryButton);
    }

    @Given("user enters a new country {string} US009")
    public void user_enters_a_new_country_us009(String string) {
    Driver.waitAndSendText(homePage.nameofNewCountry, string);
    country = string;
    }
    @Given("user clicks save button US009")
    public void user_clicks_save_button_us009() {
        Driver.waitAndClick(homePage.saveButtonForCountry);
    }
    @Given("user verifies save sucessful US009")
    public void user_verifies_save_sucessful_us009() {

    }

    @Given("as a user, I generate the token US028")
    public void as_a_user_i_generate_the_token_us028() {
        token = generateToken();
    }

    @Given("user makes appointment data request US028")
    public void user_makes_appointment_data_request_us028() throws IOException {
        response = getRequest(token, endPoint);
//        response.prettyPrint();
    }
    @Given("user asserts that the created country exists")
    public void user_asserts_that_the_created_country_exists() {
        response.then().assertThat().body("name", hasItem(country));
    }
}
