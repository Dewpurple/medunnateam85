package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_009_StepDefs {
  HomePage homePage = new HomePage();
    @When("Admin navigates to the sign in page")
    public void admin_navigates_to_the_sign_in_page() {
        homePage.loginDropDown.click();
        homePage.loginSignInButton.click();
        Driver.wait(1);
    }
    @When("Admin signs in")
    public void admin_signs_in() {
    homePage.username.sendKeys(ConfigurationReader.getProperty("adminusername2"));
    homePage.password.sendKeys(ConfigurationReader.getProperty("adminpw2"));
    homePage.signInbutton.click();
    }
    @When("Admin clicks on {string}")
    public void admin_clicks_on(String string) {

    }
    @When("Admin clicks on {string} icon.")
    public void admin_clicks_on_icon(String string) {

    }
    @When("Admin finds {string} button and clicks it")
    public void admin_finds_button_and_clicks_it(String string) {

    }
    @When("Admin performs edits to all patient information")
    public void admin_performs_edits_to_all_patient_information() {

    }
    @When("Admin clicks on Save button")
    public void admin_clicks_on_save_button() {

    }
    @When("Verify edit is saved successfully")
    public void verify_edit_is_saved_successfully() {

    }
    @Then("close application")
    public void close_application() {

    }

}
