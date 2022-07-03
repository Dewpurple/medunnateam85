package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MakeAppointmentPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class MakeAppointmentStepDefs {

    MakeAppointmentPage makeAppointmentPage=new MakeAppointmentPage();

    @Given("User Go to Medunna home page")
    public void user_go_to_medunna_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
    }
    @Then("User verifies if the Make an appointment button exits.")
    public void user_verifies_if_the_make_an_appointment_button_exits() {

        Assert.assertTrue(makeAppointmentPage.makeAnAppointmentButton.isDisplayed());

    }
    @When("User clicks on the Make an Appointment button.")
    public void user_clicks_on_the_make_an_appointment_button() {
        Driver.waitAndClick(makeAppointmentPage.makeAnAppointmentButton);
    }
    @Then("User fill name with correct credential {string}")
    public void user_fill_name_with_correct_credential(String name) {
        Driver.waitAndSendText(makeAppointmentPage.firstName, name);
    }
    @Then("User fill lastname with correct credential  {string}")
    public void user_fill_lastname_with_correct_credential(String lastname) {
        Driver.waitAndSendText(makeAppointmentPage.lastName, lastname);

    }
    @Then("User fill email with correct credential {string}")
    public void user_fill_email_with_correct_credential(String email) {
        Driver.waitAndSendText(makeAppointmentPage.emailTextBox, email);

    }
    @Then("User fill phone number with correct credential {string}")
    public void user_fill_phone_number_with_correct_credential(String phoneNumber) {
        Driver.waitAndSendText(makeAppointmentPage.phoneTextBox, phoneNumber);

    }
    @Then("User fill SSN Number with correct credential {string}")
    public void user_fill_ssn_number_with_correct_credential(String ssn) {

        Driver.waitAndSendText(makeAppointmentPage.ssnTextBox, ssn);

    }


    @Then("user fills in the date as {string}")
    public void user_fills_in_the_date_as(String date) {
     Driver.waitAndSendText(makeAppointmentPage.apDate,date );
    }
    @Then("user validates the appointment")
    public void user_validates_the_appointment() {
        Driver.waitAndClick(makeAppointmentPage.sendRequestButton);
    }



    @Given("user navigates to registration page")
    public void user_navigates_to_registration_page() {

        Driver.waitAndClick(makeAppointmentPage.signInAndRegistrationPortal);
        Driver.waitAndClick(makeAppointmentPage.registerButton);
    }

}
