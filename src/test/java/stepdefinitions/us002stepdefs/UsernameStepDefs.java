package stepdefinitions.us002stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.RegistrationPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class UsernameStepDefs {
    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();
    @Given("user navigates to medunna url")
    public void user_navigates_to_medunna_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login"));
    }
    @Then("user clicks on{string} button")
    public void user_hovers_over_to_button(String string) {


    }
    @Then("user selects {string} in the dropdown")
    public void user_selects_in_the_dropdown(String string) {

    }
    @When("user types in  valid username as {string}")
    public void user_types_in_valid_username_as(String string) {
    Driver.waitAndSendText(registrationPage.usernameTextBox,string);
    }
    @Then("user continues to next {string} textbox")
    public void user_continues_to_next_textbox(String string) {

    }
}
