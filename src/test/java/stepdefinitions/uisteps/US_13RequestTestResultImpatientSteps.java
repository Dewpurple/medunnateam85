package stepdefinitions.uisteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DoctorPage_13_14;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_13RequestTestResultImpatientSteps {
    DoctorPage_13_14 doctorPage_13_14 = new DoctorPage_13_14();
    HomePage homePage=new HomePage();

    @Given("user navitages to Medunna url")
    public void user_navitages_to_medunna_url() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));

    }
    @When("user is on the home page")
    public void user_is_on_the_home_page() {
        Driver.waitAndClick(homePage.loginDropDown);

    }
    @When("user clicks the signIn button")
    public void user_clicks_the_sign_in_button() {
        Driver.waitAndClick(homePage.loginSignInButton);
    }
    @When("user provide valid username {string} and {string}")
    public void user_provide_valid_username_and(String username, String password) {
        homePage.username.sendKeys(username);
        homePage.password.sendKeys(password);
    }
    @Then("user clicks on Sign In Button")
    public void user_clicks_on_sign_in_button() {
        homePage.signInbutton.click();
    }
    @Then("user clicks on MY Pages")
    public void user_clicks_on_my_pages() {
        Driver.wait(2);
        Driver.waitAndClick(doctorPage_13_14.myPages);
    }
    @Then("user clicks on My Appointment button")
    public void user_clicks_on_my_appointment_button() {
        Driver.wait(2);
        Driver.waitAndClick(doctorPage_13_14.myAppointments);
    }
    @Then("user clicks on Edit button")
    public void user_clicks_on_edit_button() {
        Driver.wait(2);
        Driver.waitAndClick(doctorPage_13_14.editButton);

    }
    @When("user clicks on Show Test Results button")
    public void user_clicks_on_show_test_results_button() {
        Driver.wait(2);
        Driver.waitAndClick(doctorPage_13_14.showTestResultButton);

    }
    @When("user  clicks on View Result button")
    public void user_clicks_on_view_result_button() throws IOException {
        Driver.waitAndClick(doctorPage_13_14.viewTestResultButton);
        ReusableMethods.getScreenshot("CennetdoctorTestResultScreenshots");
        Driver.wait(2);

    }
    @Then("user verifies all test information")
    public void user_verifies_all_test_information() {
        Driver.wait(3);
        Assert.assertTrue(Driver.waitForVisibility(doctorPage_13_14.testResultId,3).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(doctorPage_13_14.testResultName,3).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(doctorPage_13_14.testResult,3).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(doctorPage_13_14.testResultDefaultMinValue,3).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(doctorPage_13_14.testResultDefaultMaxValue,3).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(doctorPage_13_14.testResultTest,3).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(doctorPage_13_14.testResultDescription,3).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(doctorPage_13_14.testResultDate,3).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(doctorPage_13_14.testResultIdColumn,3).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(doctorPage_13_14.testResultNameColumn,3).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(doctorPage_13_14.testResultDefaultMaxValueColumn,3).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(doctorPage_13_14.testResultDefaultMinValueColumn,3).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(doctorPage_13_14.testResultTestColumn,3).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(doctorPage_13_14.testResultDescriptionColumn,3).isDisplayed());
    }
    @When("user clicks on Request Inpatient button")
    public void user_clicks_on_request_inpatient_button() throws IOException  {
        Driver.wait(3);
        Driver.clickWithJS(doctorPage_13_14.requestInpatientButton);
        Driver.wait(1);
        ReusableMethods.getScreenshot("Inpatient created Succes message");
    }
    @Then("user  verifies success message is displayed")
    public void user_verifies_success_message_contains_a_new_in_patient_is_created() throws IOException {
        String inpatientRequestSuccesMessage=  doctorPage_13_14.aNewInPatientIsCreatedWithIdentifierMessage.getText();
        Assert.assertTrue(inpatientRequestSuccesMessage.contains("created"));
        ReusableMethods.getScreenshot("Inpatient created Succes message");

    }


    @Then("user clicks on Sign out button")
    public void user_clicks_on_sign_out_button() {
        Driver.waitAndClick(doctorPage_13_14.doctorSignOutButton);
    }
    @Then("user close the application")
    public void user_close_the_application() {
        Driver.closeDriver();
    }



}
