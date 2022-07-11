package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MakeAppointmentPage;
import pages.RegistrationPage;
import pages.SignInPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class MakeAppointmentStepDefs {

    MakeAppointmentPage makeAppointmentPage=new MakeAppointmentPage();
    RegistrationPage registrationPage=new RegistrationPage();

    SignInPage signInPage=new SignInPage();
    //MAKE APPOINTMENT PAGE
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
    public void user_validates_the_appointment() throws InterruptedException {
        Driver.waitAndClick(makeAppointmentPage.sendRequestButton);
        Thread.sleep(1000);
       Assert.assertTrue(makeAppointmentPage.appointmentSuccessMessage.isDisplayed());

    }
    //REGISTRATION PAGE

    @Then("User clicks on Register Button")
    public void user_clicks_on_register_button() {
    makeAppointmentPage.preRegisterPage.click();
    makeAppointmentPage.registerLink.click();
    }

    @Then("User fill SSN Number on Registration Page  {string}")
    public void user_fill_ssn_number_on_registration_page(String ssn) {
        Driver.waitAndSendText(registrationPage.ssnTextBox,ssn);

    }

    @Then("User fill Name with on Registration Page {string}")
    public void user_fill_name_with_on_registration_page(String name) {
        Driver.waitAndSendText(registrationPage.firstnameTextBox,name);

    }

    @Then("User fill lastName with on Registration Page {string}")
    public void user_fill_last_name_with_on_registration_page(String lastName) {
        Driver.waitAndSendText(registrationPage.lastnameTextBox,lastName);

    }

    @Then("User fill Username on Registration Page {string}")
    public void user_fill_username_on_registration_page(String username) {
        Driver.waitAndSendText(registrationPage.usernameTextBox,username);

    }

    @Then("User fill email on Registration Page {string}")
    public void user_fill_email_on_registration_page(String email) {
        Driver.waitAndSendText(registrationPage.emailTextbox,email);
    }

    @Then("User fill password on Registration Page {string}")
    public void user_fill_password_on_registration_page(String password) {
       Driver.waitAndSendText(registrationPage.firstPasswordTextBox,password);
    }

    @Then("User fill confirm password on Registration Page {string}")
    public void user_fill_confirm_password_on_registration_page(String password) {
        Driver.waitAndSendText(registrationPage.confirmPasswordTextBox,password);
    }

    @Then("User click Register button.")
    public void user_click_register_button() {
        registrationPage.registerButton.click();

    }
//SIGN IN PAGE
    @Then("User click Sign In Button")
    public void user_click_sign_in_button() {
        makeAppointmentPage.preRegisterPage.click();
        signInPage.signInMenuButton.click();

    }
    @Then("User fill Username on the Sign In Page {string}")
    public void user_fill_username_on_the_sign_in_page(String username) {
        Driver.waitAndSendText(signInPage.usernameTextBox,username);
    }
    @Then("User fill Password on the Sign In page {string}")
    public void user_fill_password_on_the_sign_in_page(String password) {
        Driver.waitAndSendText(signInPage.passwordTextBox,password);

    }

    @Then("User click Sign In Submit Button")
    public void user_click_sign_in_submit_button() {
       signInPage.signInSubmitButton.click();
    }

    //PATIENT APPOINTMENT PAGE

    @When("User click My Appointments Link")
    public void user_click_my_appointments_link() throws InterruptedException {
        Thread.sleep(3000);
        makeAppointmentPage.patientLink.click();
        System.out.println( makeAppointmentPage.patientLink.getText());
        Thread.sleep(3000);
        makeAppointmentPage.myAppointmentsLink.click();
        System.out.println(makeAppointmentPage.myAppointmentsLink.getText());
        Thread.sleep(3000);
    }
    @When("User see the Appointments")
    public void user_see_the_appointments() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(makeAppointmentPage.appointmentText.isDisplayed());
        Thread.sleep(3000);
        System.out.println(makeAppointmentPage.appointmentText.getText());

    }

//NEGATIVE CASES

//TC_002
    @Then("User enter blank into First Name TextBox.")
    public void user_enter_blank_into_first_name_text_box() {
        Driver.waitAndSendText(makeAppointmentPage.firstName,"");

    }
    @Then("User should see error message Your Firstname is required.")
    public void user_should_see_error_message_your_firstname_is_required() {


    }
    @Then("Close the page.")
    public void close_the_page() {
       //Driver.closeDriver();
    }

//TC_004
    @Then("User enter blank into SSN Number TextBox.")
    public void user_enter_blank_into_ssn_number_text_box() {
       Driver.waitAndSendText(makeAppointmentPage.ssnTextBox,"");
    }
    @Then("User should see error message Your SSN is required.")
    public void user_should_see_error_message_your_ssn_is_required() {

    }




}
