package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.MakeAppointmentPage;
import pages.RegistrationPage;
import pojos.Registrant;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static utilities.WriteToTxt.saveRegistrantData;

public class US7AppointmentDateStepDefinitions {
    Registrant registrant = new Registrant();
    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();
    MakeAppointmentPage makeAppointmentPage = new MakeAppointmentPage();

    @Given("user goes to Make Appointment page")
    public void user_goes_to_make_appointment_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("appointment_url"));
    }
    @Then("user enters first name {string} on MA")
    public void user_enters_first_name_on_ma(String firstname) {
firstname = faker.name().firstName();
Driver.waitAndSendText(makeAppointmentPage.firstName,firstname);
registrant.setFirstName(firstname);
    }
    @Then("user enters lastname {string} on MA")
    public void user_enters_lastname_on_ma(String lastname) {
lastname = faker.name().lastName();
Driver.waitAndSendText(makeAppointmentPage.lastName,lastname);
registrant.setLastName(lastname);
    }
    @Then("user enters ssn {string} on MA")
    public void user_enters_ssn_on_ma(String ssn) {
ssn = faker.idNumber().ssnValid();
Driver.waitAndSendText(makeAppointmentPage.ssnTextBox,ssn);
registrant.setSsn(ssn);
    }
    @Then("user enters email {string} on MA")
    public void user_enters_email_on_ma(String email) {
email = registrant.getFirstName() +registrant.getLastName()+"@gmail.com";
Driver.waitAndSendText(makeAppointmentPage.emailTextBox,email);
registrant.setEmail(email);
    }
    @Then("user enters phone number {string} on MA")
    public void user_enters_phone_number_on_ma(String phonenumber) {
Driver.waitAndSendText(makeAppointmentPage.phoneTextBox,phonenumber);
    }
    @Then("user enters future date {string} on MA")
    public void user_enters_future_date_on_ma(String futuredate) {
DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("MM/dd/yyyy");
LocalDate tenDaysLater = LocalDate.now().plusDays(10);
futuredate = newPattern.format(tenDaysLater);
Driver.waitAndSendText(makeAppointmentPage.apDate, futuredate);
    }
    @Then("user clicks Send Request on MA")
    public void user_clicks_send_request_on_ma() {
Driver.waitAndClick(makeAppointmentPage.sendRequestButton);
    }
    @Then("user verifies the saved message on MA")
    public void user_verifies_the_saved_message_on_ma() throws InterruptedException {
        Thread.sleep(5000);
Assert.assertTrue(makeAppointmentPage.registrationSavedMessage.getText().contains("registration saved"));
saveRegistrantData(registrant);
    }
//past date
@Then("user enters past date {string} on MA")
public void user_enters_past_date_on_ma(String pastdate) {
    DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    LocalDate tenDaysLater = LocalDate.now().plusDays(-10);
    pastdate = newPattern.format(tenDaysLater);
    Driver.waitAndSendText(makeAppointmentPage.apDate, pastdate);
}
    @Then("user gets an error for past date on MA")
    public void user_gets_an_error_for_past_date_on_ma() {
        Assert.assertTrue(makeAppointmentPage.apptErrorMessage.isDisplayed());
    }
//invalid date format
    @Then("user enters invalid date {string} format on MA")
    public void user_enters_invalid_format_on_ma(String invaliddate) {
Driver.waitAndSendText(makeAppointmentPage.apDate,invaliddate);
    }
    @Then("user verifies entered {string} does not appear")
    public void userVerifiesEnteredDoesNotAppear(String invaliddate) {
DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
String expected = invaliddate.format(String.valueOf(newPattern));
String actual = makeAppointmentPage.apDate.getAttribute("value");
Assert.assertNotEquals(expected, actual);
    }



}
