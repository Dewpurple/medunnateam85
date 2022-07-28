package stepdefinitions.End2End;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegistrationPage;
import pojos.Registrant;
import utilities.Driver;

public class RegisterPage {

    RegistrationPage registrationPage = new RegistrationPage();
    Registrant registrant1 = new Registrant();
    Faker faker = new Faker();

    @Then("User types their SSN as {string} on Registration for UI for registration page")
    public void user_types_their_ssn_as_on_registration_for_api(String ssn) {
        ssn = faker.idNumber().ssnValid();
        Driver.waitAndSendText(registrationPage.US001_ssn, ssn);
        registrant1.setSsn(ssn);;


    }
    @Then("User types firstName as {string} for UI for registration page")
    public void user_types_first_name_as_for_api(String FirstName) {

        FirstName = faker.name().firstName();

        Driver.waitAndSendText(registrationPage.US001_firstnameTextBox,FirstName);

        registrant1.setFirstName(FirstName);


    }
    @Then("User types lastName as {string} for UI for registration page")
    public void user_types_last_name_as_for_api(String LastName) {

        LastName = faker.name().lastName();

        Driver.waitAndSendText(registrationPage.US001_lastnameTextBox,LastName);


        registrant1.setLastName(LastName);


    }
    @Then("User types userName as {string} email address for UI for registration page")
    public void user_types_user_name_as_email_address_for_api(String UserName) {

        UserName = registrant1.getFirstName()+registrant1.getLastName();
        Driver.waitAndSendText(registrationPage.US001_usernameTextBox,UserName);
        registrant1.setLogin(UserName);



    }
    @Then("User types email as {string} for UI for registration page")
    public void user_types_email_as_for_api(String email) {

        email=registrant1.getLogin()+"@gmail.com";

        Driver.waitAndSendText(registrationPage.US001_emailTextbox,email);

        registrant1.setEmail(email);

    }
    @Then("User types password  as {string} for UI for registration page")
    public void user_types_password_as_for_api(String password) {

        password = faker.internet().password(8, 30, true, true);
        Driver.waitAndSendText(registrationPage. US001_passwordTextbox, password);
        registrant1.setPassword(password);

    }
    @Then("User types password  confirmation as {string} on Registration for UI for registration page")
    public void user_types_password_confirmation_as_on_registration_for_api(String password_confirmation) {
        password_confirmation=registrant1.getPassword();
        Driver.waitAndSendText(registrationPage. US001_secondpasswordTextbox, password_confirmation);

    }

    @Then("User registers  and save the records on Registration page for UI for registration page")
    public void user_registers_and_save_the_records_on_registration_page_for_api() {

        Driver.waitAndClick(registrationPage.US001_second_click_button);
        Driver.sleep(1000);
        Assert.assertTrue((registrationPage.US001_toasted_Saved_message.isDisplayed()));

    }
}
