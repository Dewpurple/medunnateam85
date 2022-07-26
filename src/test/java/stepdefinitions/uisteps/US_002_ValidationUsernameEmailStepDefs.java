package stepdefinitions.uisteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.US002_uipages.AdminHomePage;
import pages.US002_uipages.HomePage002;
import pages.US002_uipages.US002_RegistrationPage;
import pojos.us002pojo.US_002_RegistrantPojo;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_002_ValidationUsernameEmailStepDefs {
    HomePage homePage = new HomePage();
    US002_RegistrationPage registrationPage = new US002_RegistrationPage();
    US_002_RegistrantPojo registrant = new US_002_RegistrantPojo();
    Faker faker = new Faker();
    HomePage002 homePage002 = new HomePage002();
    AdminHomePage adminHomePage = new AdminHomePage();
    @Given("user navigates to url")
    public void user_navigates_to_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
        try {
            adminHomePage.adminAdminLast.click();
            adminHomePage.signOut.click();
        }catch (Exception e){

        }
    }
    @When("user clicks on icon on top right corner")
    public void user_clicks_on_icon_on_top_right_corner() {
        homePage002.icon.click();
    }
    @When("user clicks on register button US002")
    public void user_clicks_on_register_button_us002() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user verifies registration page")
    public void user_verifies_registration_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters a valid SSN number")
    public void user_enters_a_valid_ssn_number() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters valid first name and last name")
    public void user_enters_valid_first_name_and_last_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters a valid username")
    public void user_enters_a_valid_username() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters a valid email")
    public void user_enters_a_valid_email() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters new password and password confirmation")
    public void user_enters_new_password_and_password_confirmation() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks on register button for registration")
    public void user_clicks_on_register_button_for_registration() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user verifies that registration saved message is displayed")
    public void user_verifies_that_registration_saved_message_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user saves the records into a file")
    public void user_saves_the_records_into_a_file() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user clicks on home button")
    public void user_clicks_on_home_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user verifies to land to homepage successfully")
    public void user_verifies_to_land_to_homepage_successfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user closes the browser")
    public void user_closes_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
