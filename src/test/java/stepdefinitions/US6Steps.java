package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.SignInPage;
import pages.UserPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US6Steps {
    SignInPage signInPage=new SignInPage();
    UserPage userPage=new UserPage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
    Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
    }
    @Given("user clicks the signIn button")
    public void user_clicks_the_sign_in_button() {
    Driver.waitAndClick(signInPage.accountMenu);
    Driver.waitAndClick(signInPage.signInMenuButton);
    }
    @Given("user types in username as {string}")
    public void user_types_in_username_as(String username) {
    Driver.waitAndSendText(signInPage.usernameTextBox, username);
    }
    @Given("user types in password as {string}")
    public void user_types_in_password_as(String password) {
    Driver.waitAndSendText(signInPage.passwordTextBox, password);
    }
    @Then("user clicks Sign In Button")
    public void user_clicks_sign_in_button() {
    Driver.waitAndClick(signInPage.signInSubmitButton);
    }

    @Then("user verifies user is signed on")
    public void user_verifies_user_is_signed_on() {
        Assert.assertTrue(userPage.myPagesMenu.isDisplayed());
    }
    @Given("user is on user page")
    public void user_is_on_user_page() {

    }
    @Then("user clicks settings button")
    public void user_clicks_settings_button() {

    }
    @Then("user verifies user is on settings page")
    public void user_verifies_user_is_on_settings_page() {

    }
    @Then("user verifies first name matches {string}")
    public void user_verifies_first_name_matches(String string) {

    }
    @Then("user verifies last name matches {string}")
    public void user_verifies_last_name_matches(String string) {

    }
    @Then("user verifies email matches {string}")
    public void user_verifies_email_matches(String string) {

    }
    @Then("user edits first name to {string}")
    public void user_edits_first_name_to(String string) {

    }
    @Then("user updates last name to {string}")
    public void user_updates_last_name_to(String string) {

    }
    @Then("user clicks save button")
    public void user_clicks_save_button() {

    }
    @Then("settings saved message appears")
    public void settings_saved_message_appears() {

    }
    @Then("user verifies updated first name {string} is displayed")
    public void user_verifies_updated_first_name_is_displayed(String string) {

    }
    @Then("user verifies updated last name {string} is displayed")
    public void user_verifies_updated_last_name_is_displayed(String string) {

    }

}
