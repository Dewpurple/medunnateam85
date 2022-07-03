package stepdefinitions.uisteps;

import io.cucumber.java.en.Given;
import pages.DoctorPage;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;

import javax.print.Doc;

public class DoctorTestSteps {
    HomePage homePage = new HomePage();
    DoctorPage doctorPage = new DoctorPage();

    @Given("Admin navitages to Medunna url")
    public void admin_navitages_to_medunna_url() {
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("medunna_url"));
        Driver.wait2(2);
    }
    @Given("Admin navigates to the sign in page")
    public void admin_navigates_to_the_sign_in_page() {
        homePage.loginDropDown.click();
        homePage.loginSignInButton.click();

        Driver.wait(1);

    }
    @Given("Admin signs in")
    public void admin_signs_in() {
        homePage.username.sendKeys(ConfigurationReader.getProperty("doctorusername"));
        homePage.password.sendKeys(ConfigurationReader.getProperty("doctorpw"));
        homePage.signInbutton.click();
    }
    @Given("Admin clicks on {string}")
    public void admin_clicks_on(String string) {
        doctorPage.myPages.click();
        doctorPage.myAppointments.click();
    }
    @Given("Admin clicks on {string} icon.")
    public void admin_clicks_on_icon(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Admin finds {string} button and clicks it")
    public void admin_finds_button_and_clicks_it(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Admin performs edits to all patient information")
    public void admin_performs_edits_to_all_patient_information() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Admin clicks on Save button")
    public void admin_clicks_on_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Verify edit is saved successfully")
    public void verify_edit_is_saved_successfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
