package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.UserPage;
import pages.UserSettingsPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US6_StepDefinitions {
    HomePage homePage = new HomePage();
    UserPage userPage=new UserPage();
    UserSettingsPage userSettingsPage = new UserSettingsPage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
    Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
    }
    @Given("user clicks menu")
    public void user_clicks_menu(){
    Driver.waitAndClick(homePage.loginDropDown);
    }
    @Given("user clicks the signIn button")
    public void user_clicks_the_sign_in_button() {
    Driver.waitAndClick(homePage.loginSignInButton);
    }
    @Given("user types in username as {string}")
    public void user_types_in_username_as(String username) {
    Driver.waitAndSendText(homePage.username, username);
    }
    @Given("user types in password as {string}")
    public void user_types_in_password_as(String password) {
    Driver.waitAndSendText(homePage.password, password);
    }
    @Then("user clicks Sign In Button")
    public void user_clicks_sign_in_button() {
    Driver.waitAndClick(homePage.signInbutton);
    }
    @Then("user verifies user is signed on")
    public void user_verifies_user_is_signed_on() {
    Assert.assertTrue(userPage.menuButton.isDisplayed());
    }
    @Given("user goes to user menu")
    public void user_goes_to_user_menu(){
    Driver.waitAndClick(userPage.menuButton);
    }
    @Then("user clicks settings button")
    public void user_clicks_settings_button() {
    Driver.waitAndClick(userPage.settingsButton);
    }
    @Then("user verifies user is on settings page")
    public void user_verifies_user_is_on_settings_page() {
    Assert.assertTrue(userSettingsPage.userSettingsTitle.isDisplayed());
    }
    @Then("user verifies name matches name on account")
    public void user_verifies_name_matches_name_on_account() {
    String actualFirstName = userSettingsPage.firstNameEditBox.getAttribute("value");
    String actualLastName = userSettingsPage.lastNameEditBox.getAttribute("value");
    String actualName = (actualFirstName + actualLastName).replaceAll(" ","");
    String expectedName = userSettingsPage.userNameText.getText().replaceAll(" ","");
    Assert.assertEquals(expectedName,actualName);
    }

    @Then("user verifies email is populated")
    public void user_verifies_email_is_populated() {
    String email = userSettingsPage.emailEditBox.getAttribute("value");
    Assert.assertFalse(email.isEmpty());
    }
    @Then("user edits first name to {string}")
    public void user_edits_first_name_to(String firstName) {
        userSettingsPage.firstNameEditBox.clear();
    Driver.waitAndSendText(userSettingsPage.firstNameEditBox, firstName);
    }
    @Then("user updates last name to {string}")
    public void user_updates_last_name_to(String lastName) {
        userSettingsPage.lastNameEditBox.clear();
        Driver.waitAndSendText(userSettingsPage.lastNameEditBox, lastName);
    }
    @Then("user clicks save button")
    public void user_clicks_save_button() {
    Driver.waitAndClick(userSettingsPage.saveButton);
    }
    @Then("settings saved message appears")
    public void settings_saved_message_appears() throws InterruptedException {
        Driver.waitForVisibility(userSettingsPage.savedMessage,10);
           String message = userSettingsPage.savedMessage.getText();
            Assert.assertEquals("Settings saved!",message);
            Thread.sleep(7000);
    }
    @Then("user verifies updated first name {string} is displayed")
    public void user_verifies_updated_first_name_is_displayed(String firstName) {
String nameDisplayed = userSettingsPage.userNameText.getAttribute("innerHTML");
Assert.assertTrue(nameDisplayed.contains(firstName));
    }
    @Then("user verifies updated last name {string} is displayed")
    public void user_verifies_updated_last_name_is_displayed(String lastName) {
        String nameDisplayed = userSettingsPage.userNameText.getAttribute("innerHTML");
        Assert.assertTrue(nameDisplayed.contains(lastName));
    }
    @Then("user clicks signout")
    public void user_clicks_signout() {
Driver.waitAndClick(userSettingsPage.menuButton);
Driver.waitAndClick(userSettingsPage.signOutButton);

    }
//negative case
@Then("user leaves firstname blank")
public void user_leaves_firstname_blank()  {
userSettingsPage.firstNameEditBox.clear();
    Driver.waitAndClick(userSettingsPage.saveButton);
    }
    @Then("user gets error message under firstname")
    public void user_gets_error_message_under_firstname() {
Assert.assertTrue(userSettingsPage.firstNameErrorMessage.isDisplayed());
    }
    @Then("user leaves lastname blank")
    public void user_leaves_lastname_blank() {
        userSettingsPage.lastNameEditBox.clear();
        Driver.waitAndClick(userSettingsPage.saveButton);
    }
    @Then("user gets error message under lastname")
    public void user_gets_error_message_under_lastname() {
        Assert.assertTrue(userSettingsPage.lastNameErrorMessage.isDisplayed());
    }
    @Then("user verifies settings saved message does not appear")
    public void user_verifies_settings_saved_message_does_not_appear() {
Assert.assertFalse(userSettingsPage.savedMessage.isDisplayed());
    }
//    @Then("close the application")
//    public void closeTheApplication() {
//        Driver.closeDriver();
//    }

}
