package stepdefinitions.uisteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;
import utilities.Driver;
import utilities.ReusableMethods;

public class US24_PatientSeeTestResults_Defs {

    US_024_PatientSeeTestResultsPage us024PatientSeeTestResultsPage = new US_024_PatientSeeTestResultsPage();

    @Given("user should entered a valid password   {string} on the sign in page")
    public void user_should_entered_a_valid_password_on_the_sign_in_page(String password) {
        us024PatientSeeTestResultsPage.passwordBox.sendKeys(password);
    }
    @When("user  clicks  to icon on top right corner US002")
    public void user_clicks_to_icon_on_top_right_corner_US002() {
        us024PatientSeeTestResultsPage.icon.click();

    }
    @Given("user clicks signInLocation button")
    public void user_clicks_sign_in_location_button() {
        us024PatientSeeTestResultsPage.signInLocation.click();
    }
    @Given("user should entered a valid username {string} on the sign in page")
    public void user_should_entered_a_valid_username_on_the_sign_in_page(String username) {
        us024PatientSeeTestResultsPage.usernameBox.sendKeys(username);
    }
    @When("user should click sign in box")
    public void user_should_click_sign_in_box() {
        // Driver.waitForVisibility(homePage.signInButton, 10);
        us024PatientSeeTestResultsPage.signInBox.submit();
    }
    @Then("user should verify signed in {string} successful")
    public void user_should_verify_signed_in_successful(String signedin_confirm) {
        Assert.assertTrue(us024PatientSeeTestResultsPage.signedInUserName.isDisplayed());
    }
    @Then("patient should click on mypages")
    public void patient_should_click_on_mypages() {
        Driver.waitForVisibility(us024PatientSeeTestResultsPage.myPagesPatientButton, 10);
        us024PatientSeeTestResultsPage.myPagesPatientButton.click();
    }
    @Then("patient should click on My Appointments")
    public void patient_should_click_on_my_appointments() {
        us024PatientSeeTestResultsPage.myAppointmentsButton.click();
    }
    @Then("patient should click on Show Test button")
    public void patient_should_click_on_show_test_button() throws InterruptedException {
        Driver.doubleClick(us024PatientSeeTestResultsPage.showTestsButton);
        Thread.sleep(2000);
        //s024PatientSeeTestResultsPage.showTestsButton.click();

    }
    @Then("patient should click on View Results button")
    public void patient_should_click_on_view_results_button() {
        Driver.doubleClick(us024PatientSeeTestResultsPage.viewResultsButton);
        //us024PatientSeeTestResultsPage.viewResultsButton.click();
    }
    @And("Patient should verify id")
    public void patientShouldVerifyId() {
        Driver.waitAndClick(us024PatientSeeTestResultsPage.idButton,3);
        Assert.assertTrue(us024PatientSeeTestResultsPage.idButton.isDisplayed());
    }
    @Then("Patient should verify name")
    public void patient_should_verify_name() {
        Driver.waitAndClick(us024PatientSeeTestResultsPage.nameButton,3);
        Assert.assertTrue(us024PatientSeeTestResultsPage.nameButton.isDisplayed());
    }
    @Then("Patient should verify default max value")
    public void patient_should_verify_default_max_value() {
        Driver.waitAndClick(us024PatientSeeTestResultsPage.defaultMaxValueButton,3);
        Assert.assertTrue(us024PatientSeeTestResultsPage.defaultMaxValueButton.isDisplayed());
    }
    @Then("Patient should verify default min value")
    public void patient_should_verify_default_min_value() {
        Driver.waitAndClick(us024PatientSeeTestResultsPage.defaultMinValueButton,3);
        Assert.assertTrue(us024PatientSeeTestResultsPage.defaultMinValueButton.isDisplayed());
    }
    @Then("Patient should verify description")
    public void patient_should_verify_description() {
        Driver.waitAndClick(us024PatientSeeTestResultsPage.descriptionButton,3);
        Assert.assertTrue(us024PatientSeeTestResultsPage.descriptionButton.isDisplayed());
    }
    @Then("Patient should verify date")
    public void patient_should_verify_date() {
        Driver.waitAndClick(us024PatientSeeTestResultsPage.dateButton,3);
        Assert.assertTrue(us024PatientSeeTestResultsPage.dateButton.isDisplayed());
    }
    @And("patient should verify No Appointments found message")
    public void patientShouldVerifyNoAppointmentsFoundMessage() {
        Driver.waitAndClick(us024PatientSeeTestResultsPage.noAppointmentsFoundMessage,3);
       Assert.assertTrue(us024PatientSeeTestResultsPage.noAppointmentsFoundMessage.isDisplayed());
    }
    @And("patient should verify No Test Found message")
    public void patientShouldVerifyNoTestFoundMessage() {
        Driver.waitAndClick(us024PatientSeeTestResultsPage.noTestFoundMessage,3);
        Assert.assertTrue(us024PatientSeeTestResultsPage.noTestFoundMessage.isDisplayed());
    }
    @And("patient should click on Show Invoice button")
    public void patientShouldClickOnShowInvoiceButton() {
        ReusableMethods.waitForClickablility(us024PatientSeeTestResultsPage.showInvoiceButton, 5).click();

    }
    @And("patient should verify INVOICE page")
    public void patientShouldVerifyINVOICEPage() {
        Assert.assertTrue(us024PatientSeeTestResultsPage.invoice.isDisplayed());
    }
}
