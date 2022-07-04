package stepdefinitions.uisteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegistrationPage;
import pojos.Registrant;
import utilities.Driver;

import static utilities.WriteToTxt.saveRegistrantData;

public class RegistrationSteps {

    RegistrationPage registrationPage = new RegistrationPage();

    Faker faker = new Faker();

    Registrant registrant = new Registrant();

    @Given("user provides ssn as {string}")
    public void user_provides_ssn_as(String ssn) {

        ssn = faker.idNumber().ssnValid();

        Driver.waitAndSendText(registrationPage.ssnTextBox,ssn );
        registrant.setSsn(ssn);
    }
    @Given("user types in first name as {string}")
    public void user_types_in_first_name_as(String firstname) {

        firstname = faker.name().firstName();

        Driver.waitAndSendText(registrationPage.firstnameTextBox, firstname);

        registrant.setFirstName(firstname);

    }
    @Given("user also types in lastname as {string}")
    public void user_also_types_in_lastname_as(String lastname) {

        lastname = faker.name().lastName();

        Driver.waitAndSendText(registrationPage.lastnameTextBox, lastname);

        registrant.setLangKey(lastname);
    }
    @Given("user provides username as {string}")
    public void user_provides_username_as(String username) {
        Driver.waitAndSendText(registrationPage.usernameTextBox, username);
    }
    @Given("user types in email as {string}")
    public void user_types_in_email_as(String email) {
        Driver.waitAndSendText(registrationPage.emailTextbox,email);
    }

    @When("user provides a valid password as {string}")
    public void user_provides_a_valid_password_as(String password) {

        password = faker.internet().password(8, 20, true, true);

      Driver.waitAndSendText(registrationPage.firstPasswordTextBox, password);

      registrant.setPassword(password);
    }
    @When("user confirms valid password as {string}")
    public void user_confirms_valid_password_as(String confirmpassword) {


        confirmpassword = registrant.getPassword();
        Driver.waitAndSendText(registrationPage.confirmPasswordTextBox, confirmpassword);

    }
    @Then("user rgisters and saves the data")
    public void user_rgisters_and_saves_the_data() {

    Driver.waitAndClick(registrationPage.registerButton);


        Driver.waitAndClick(registrationPage.registerButton);
        saveRegistrantData(registrant);
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
