package stepdefinitions.uisteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegistrationPage;
import utilities.Driver;

public class RegistrationSteps {

    RegistrationPage registrationPage = new RegistrationPage();

    @Given("user provides ssn as {string}")
    public void user_provides_ssn_as(String ssn) {

        Driver.waitAndSendText(registrationPage.ssnTextBox,ssn );
    }
    @Given("user types in first name as {string}")
    public void user_types_in_first_name_as(String firstname) {

        Driver.waitAndSendText(registrationPage.firstnameTextBox, firstname);

    }
    @Given("user also types in lastname as {string}")
    public void user_also_types_in_lastname_as(String lastname) {

        Driver.waitAndSendText(registrationPage.lastnameTextBox, lastname);
    }


    @When("user provides a valid password as {string}")
    public void user_provides_a_valid_password_as(String password) {
      Driver.waitAndSendText(registrationPage.firstPasswordTextBox, password);
    }
    @When("user confirms valid password as {string}")
    public void user_confirms_valid_password_as(String confirmpassword) {
        Driver.waitAndSendText(registrationPage.confirmPasswordTextBox, confirmpassword);

    }
    @Then("user rgisters and saves the data")
    public void user_rgisters_and_saves_the_data() {
       Driver.waitAndClick(registrationPage.registerButton);
    }
    @Given("user sends an invalid password as {string}")
    public void user_sends_an_invalid_password_as(String password) {
       Driver.waitAndSendText(registrationPage.firstPasswordTextBox, password + Keys.ENTER);
    }
    @Then("user validates the password error message")
    public void user_validates_the_password_error_message() {

        Assert.assertTrue(registrationPage.invalidPassword.isDisplayed());
    }

}
