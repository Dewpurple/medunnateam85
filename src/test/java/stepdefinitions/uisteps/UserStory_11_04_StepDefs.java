package stepdefinitions.uisteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.*;
import utilities.ConfigurationReader;
import utilities.Driver;

public class UserStory_11_04_StepDefs {


    UStory_04_Pages1 uStory_04_pages1 = new UStory_04_Pages1();
    UStory_04_Pages4 uStory_04_pages4 = new UStory_04_Pages4();
    UStory_04_Pages3 uStory_04_pages3 = new UStory_04_Pages3();
    UStory_04_Pages2 uStory_04_pages2 = new UStory_04_Pages2();
    UStory_011_pages uStory_011_pages = new UStory_011_pages();




    @Given("the doctor go to url")
    public void the_doctor_go_to_Url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("app_url"));
    }


    @Then("The doctor click sign in page")
    public void the_doctor_click_sign_in_page() {
        uStory_04_pages1.signintik.click();
        uStory_04_pages1.signinbutton.click();

    }

    @Then("Verify sign in page")
    public void verify_sign_in_page() {
        // Assert.assertTrue(doctor04pages.signinbutton.isDisplayed());
    }

    @Then("Doctor enters the username as {string}")
    public void doctor_enters_the_username_as(String username) {
        Driver.waitAndSendText(uStory_04_pages1.username, username);
    }

    @Then("Doctor enters the  password as {string}")
    public void doctor_enters_the_password_as(String password) {
        Driver.waitAndSendText(uStory_04_pages1.password, password);
    }

    @And("click checkbox Remember me")
    public void clickCheckboxRememberMe() {
        Driver.waitAndClick(uStory_04_pages1.rememberme);
    }

    @And("click the Sign In button")
    public void clickTheSignInButton() {
        Driver.waitAndClick(uStory_04_pages1.submitbutton);
    }


    @Then("Verify to sign-on the web side")
    public void verify_to_sign_on_the_web_side() {
        Assert.assertTrue(uStory_04_pages1.verifypage.isDisplayed());
    }

    //----------------------------------------------

    @Then("Doctor enters the invalid password as {string}")
    public void doctorEntersTheInvalidPasswordAs(String invalid_password) {
        Driver.waitAndSendText(uStory_04_pages4.invalidpassword, invalid_password);
    }

    @And("Verify failed to sign in")
    public void verifyFailedToSignIn() {
        Assert.assertTrue(uStory_04_pages4.failedtosignin.isDisplayed());
    }


    @And("If the user forgets password, click Did you forget your password button.")
    public void ifTheUserForgetsPasswordClickDidYouForgetYourPasswordButton() {
        Driver.waitAndClick(uStory_04_pages4.didyouforgetyourpassword);
    }

    @Then("Verify Reset your password")
    public void verifyResetYourPassword() {
        Assert.assertTrue(uStory_04_pages4.resetyourpasswort.isDisplayed());
    }

    @And("enter the email adress as {string}")
    public void enterTheEmailAdressAs(String email_address) {
        Driver.waitAndSendText(uStory_04_pages4.entertheemail, email_address);
    }

    @And("Click reset password")
    public void clickResetPassword() {
        Driver.waitAndClick(uStory_04_pages4.resetpasswordbutton);
    }

    @And("Verify success message")
    public void verifySuccessMessage() {
        Assert.assertTrue(uStory_04_pages4.successmessage.isDisplayed());
    }

    //----------------------------------------------------

    @Then("Doctor enters the invalit username as {string}")
    public void doctorEntersTheInvalitUsernameAs(String invalid_usernam) {
        Driver.waitAndSendText(uStory_04_pages3.invalidusername, invalid_usernam);
    }

    @Then("click cancel button")
    public void clickCancelButton() {
        Driver.waitAndClick(uStory_04_pages3.cancelbutton);
    }
//------------------------------------------------------------------------

    @Then("click the Register a new account")
    public void clickTheRegisterANewAccount() {
        Driver.waitAndClick(uStory_04_pages2.registeranewaccount);
    }

    @And("verify the Registration")
    public void verifyTheRegistration() {
        Assert.assertTrue(uStory_04_pages2.verifyregistration.isDisplayed());
    }

    //----------------------------------------------------------------------------

    @Given("The doctor  click the My page")
    public void the_doctor_click_the_my_page() {
        Driver.waitAndClick(uStory_011_pages.mypage);
    }


    @Then("The doctor click the {string}")
    public void the_doctor_click_the(String string) {
        Driver.waitAndClick(uStory_011_pages.myappointments);


    }

    @Then("Verify {string} title that belong to the web page")
    public void verify_title_that_belong_to_the_web_page(String string) {
        Assert.assertTrue(uStory_011_pages.verifytitle.isDisplayed());

    }

    @And("Doctor clicks on edit button and verify to create or edit an appointment")
    public void doctorClicksOnEditButtonAndVerifyToCreateOrEditAnAppointment() {
        Driver.waitAndClick(uStory_011_pages.editbutton);
        Assert.assertTrue(uStory_011_pages.createOrEditLabel.isDisplayed());
    }


    @Then("Doctor verifies patient's info id, start and end date, status\"")
    public void doctor_verifies_patient_s_info_id_start_and_end_date_status() {
        //Assert.assertTrue(doctor79pages.appointmentid.isDisplayed());
        //Assert.assertTrue(doctor79pages.appointmentstartDate.isDisplayed());
        // Assert.assertTrue(doctor79pages.appointmentendDate.isDisplayed());
        // Assert.assertTrue(doctor79pages.appointmentstatus.isDisplayed());
    }


    @Then("Doctor fills in annemnesis  as {string}, {string},{string}")
    public void doctor_FillsInAnnemnesisAs(String a, String t, String c) {
        Driver.waitAndSendText(uStory_011_pages.anamnesis, a);
        Driver.waitAndSendText(uStory_011_pages.treatment, t);
        Driver.waitAndSendText(uStory_011_pages.diagnosis, c);
    }

    @Then("Doctor clicks on Save button")
    public void doctor_clicks_on_save_button() {
        Driver.waitAndClick(uStory_011_pages.savebutton);
    }

    @Then("Verify appointment is saved successfully")
    public void verify_appointment_is_saved_successfully() {
        //Assert.assertTrue(doctor79pages.savesaccessmessage.isDisplayed());
    }


}

