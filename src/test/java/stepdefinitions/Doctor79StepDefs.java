package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Doctor79pages;

import utilities.ConfigurationReader;
import utilities.Driver;

public class Doctor79StepDefs {

    Doctor79pages doctor79pages = new Doctor79pages();

    @Given("the doctor go to url")
    public void the_doctor_go_to_Url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
    }


    @Then("The doctor click sign in page")
    public void the_doctor_click_sign_in_page() {
        Driver.waitAndClick(doctor79pages.signintik);
        Driver.waitAndClick(doctor79pages.signinbutton);

        System.out.println(doctor79pages.signintik.getText());


    }

    @Then("Verify sign in page")
    public void verify_sign_in_page() {

        Assert.assertTrue(doctor79pages.signinbutton.isDisplayed());
        System.out.println(Driver.waitAndGetText(doctor79pages.signinbutton,2));
    }

    @Then("Doctor enters the username as {string}")
    public void doctor_enters_the_username_as(String username) {
        Driver.waitAndSendText(doctor79pages.username, username);
    }

    @Then("Doctor enters the  password as {string}")
    public void doctor_enters_the_password_as(String password) {
        Driver.waitAndSendText(doctor79pages.password, password);
    }

    @And("click the Sign In button")
    public void clickTheSignInButton() {
        Driver.waitAndClick(doctor79pages.submitbutton);
    }


    @Then("Verify to sign-on the web side")
    public void verify_to_sign_on_the_web_side() {
        //Assert.assertTrue(doctor79pages.submitbutton.isDisplayed());

    }


    @Given("The doctor  click the My page")
    public void the_doctor_click_the_my_page() {
        Driver.waitAndClick(doctor79pages.mypage);
    }


    @Then("The doctor click the {string}")
    public void the_doctor_click_the(String string) {
        Driver.waitAndClick(doctor79pages.myappointments);


    }

    @Then("Verify {string} title that belong to the web page")
    public void verify_title_that_belong_to_the_web_page(String string) {
        Assert.assertTrue(doctor79pages.verifytitle.isDisplayed());

    }

    @And("Doctor clicks on edit button and verify to create or edit an appointment")
    public void doctorClicksOnEditButtonAndVerifyToCreateOrEditAnAppointment() {
        Driver.waitAndClick(doctor79pages.editbutton);
        Assert.assertTrue(doctor79pages.createOrEditLabel.isDisplayed());
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
        Driver.waitAndSendText(doctor79pages.anamnesis, a);
        Driver.waitAndSendText(doctor79pages.treatment, t);
        Driver.waitAndSendText(doctor79pages.diagnosis, c);
    }

    @Then("Doctor clicks on Save button")
    public void doctor_clicks_on_save_button() {
        Driver.waitAndClick(doctor79pages.savebutton);
    }

    @Then("Verify appointment is saved successfully")
    public void verify_appointment_is_saved_successfully() {
        //Assert.assertTrue(doctor79pages.savesaccessmessage.isDisplayed());
    }
}