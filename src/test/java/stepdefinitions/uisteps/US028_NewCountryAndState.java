package stepdefinitions.uisteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import pages.HomePage;
import utilities.Driver;

public class US028_NewCountryAndState {
    HomePage homePage = new HomePage();
    Faker faker = new Faker();
    @Given("user clicks on Country button US009")
    public void user_clicks_on_country_button_us009() {
        Driver.waitAndClick(homePage.countryButton);
    }
    @Given("user clicks on Create a new Country US009")
    public void user_clicks_on_create_a_new_country_us009() {
        Driver.waitAndClick(homePage.createAnewCountryButton);
    }
    @Given("user enters a new country US009")
    public void user_enters_a_new_country_us009() {
        Driver.waitAndSendText(homePage.nameofNewCountry,"085" + faker.country());
    }
    @Given("user clicks save button US009")
    public void user_clicks_save_button_us009() {
    }
    @Given("user verifies save sucessful US009")
    public void user_verifies_save_sucessful_us009() {
    }
}
