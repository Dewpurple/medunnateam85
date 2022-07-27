package stepdefinitions.uisteps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.UserPage;
import pages.UserSettingsPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US6_UserSettingsStepDefs {

    HomePage homePage = new HomePage();
    UserPage userPage=new UserPage();
    UserSettingsPage userSettingsPage = new UserSettingsPage();


    @Given("US6_user is on the home page")
    public void userIsOnTheHomepage() {
    Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
    }
    @Given("US6_user clicks menu")
    public void userClicksMenu(){
    Driver.waitAndClick(homePage.loginDropDown);
    }
    @Given("US6_user clicks the signIn button on user settings")
    public void userClicksTheSignInButton() {
    Driver.waitAndClick(homePage.loginSignInButton);
    }
    @Given("US6_user types in username as {string}")
    public void userTypesInUsernameAs(String username) {
    Driver.waitAndSendText(homePage.username, username);
    }
    @Given("US6_user types in password as {string}")
    public void userTypesInPasswordAs(String password) {
    Driver.waitAndSendText(homePage.password, password);
    }
    @Then("US6_user clicks Sign In Button")
    public void userClicksSignInButton() {
    Driver.waitAndClick(homePage.signInbutton);
    }
    @Then("US6_user verifies user is signed on")
    public void userVerifiesUserIsSignedOn() {
    Assert.assertTrue(userPage.menuButton.isDisplayed());
    }
    @Given("US6_user goes to user menu")
    public void userGoesToUserMenu(){
    Driver.waitAndClick(userPage.menuButton);
    }
    @Then("US6_user clicks settings button")
    public void userClicksSettingsButton() {
    Driver.waitAndClick(userPage.settingsButton);
    }
    @Then("US6_user verifies user is on settings page")
    public void userVerifiesUserIsOnSettingsPage() {
    Assert.assertTrue(userSettingsPage.userSettingsTitle.isDisplayed());
    }
    @Then("US6_user verifies name matches name on account")
    public void userVerifiesNameMatchesNameOnAccount() {
    String actualFirstName = userSettingsPage.firstNameEditBox.getAttribute("value");
    String actualLastName = userSettingsPage.lastNameEditBox.getAttribute("value");
    String actualName = (actualFirstName + actualLastName).replaceAll(" ","");
    String expectedName = userSettingsPage.userNameText.getText().replaceAll(" ","");
    Assert.assertEquals(expectedName,actualName);
    }

    @Then("US6_user verifies email is populated")
    public void userVerifiesEmailIsPopulated() {
    String email = userSettingsPage.emailEditBox.getAttribute("value");
    Assert.assertFalse(email.isEmpty());
    }
    @Then("US6_user edits first name to {string}")
    public void userEditsFirstNameTo(String firstName) {
        userSettingsPage.firstNameEditBox.clear();
    Driver.waitAndSendText(userSettingsPage.firstNameEditBox, firstName);
    }
    @Then("US6_user updates last name to {string}")
    public void userUpdatesLastNameTo(String lastName) {
        userSettingsPage.lastNameEditBox.clear();
        Driver.waitAndSendText(userSettingsPage.lastNameEditBox, lastName);
    }
@Then("US6_user clicks save button")
    public void user_clicks_save_button() {
    Driver.waitAndClick(userSettingsPage.saveButton);
    }
 @Then("US6_settings saved message appears")
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
@Then("US6_user verifies updated last name {string} is displayed")
    public void user_verifies_updated_last_name_is_displayed(String lastName) {
        String nameDisplayed = userSettingsPage.userNameText.getAttribute("innerHTML");
        Assert.assertTrue(nameDisplayed.contains(lastName));
    }
    @Then("US6_user clicks signout")
    public void user_clicks_signout() {
Driver.waitAndClick(userSettingsPage.menuButton);
Driver.waitAndClick(userSettingsPage.signOutButton);

    }
//negative case
@Then("US6_user leaves firstname blank")
public void user_leaves_firstname_blank()  {
userSettingsPage.firstNameEditBox.clear();
    Driver.waitAndClick(userSettingsPage.saveButton);
    }
    @Then("US6_user gets error message under firstname")
    public void user_gets_error_message_under_firstname() {
Assert.assertTrue(userSettingsPage.firstNameErrorMessage.isDisplayed());
    }
    @Then("US6_user leaves lastname blank")
    public void user_leaves_lastname_blank() {
        userSettingsPage.lastNameEditBox.clear();
        Driver.waitAndClick(userSettingsPage.saveButton);
    }
    @Then("US6_user gets error message under lastname")
    public void user_gets_error_message_under_lastname() {
        Assert.assertTrue(userSettingsPage.lastNameErrorMessage.isDisplayed());
    }
    @Then("user verifies settings saved message does not appear")
    public void user_verifies_settings_saved_message_does_not_appear() {
Assert.assertFalse(userSettingsPage.savedMessage.isDisplayed());
    }
    @Then("US6_close the application")
    public void closeTheApplication() {
        Driver.closeDriver();
    }


}
