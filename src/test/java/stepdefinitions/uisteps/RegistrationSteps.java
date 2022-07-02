package stepdefinitions.uisteps;

import io.cucumber.java.en.Given;
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


}
