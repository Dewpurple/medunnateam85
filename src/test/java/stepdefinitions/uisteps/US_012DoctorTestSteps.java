
package stepdefinitions.uisteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DoctorPage;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_012DoctorTestSteps {
    HomePage homePage = new HomePage();
    DoctorPage doctorPage = new DoctorPage();


    @Given("user navitages to Medunna url US009")
    public void user_navitages_to_medunna_url_US009() {
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("medunna_url"));
    }
    @When("Doctor logs in US009")
    public void doctor_logs_in_US009() {
        Driver.waitAndClick(homePage.loginDropDown);
        Driver.waitAndClick(homePage.loginSignInButton);
        Driver.waitAndSendText(homePage.username, ConfigurationReader.getProperty("doctorusername"));
        Driver.waitAndSendText(homePage.password,ConfigurationReader.getProperty("doctorpw"));
        Driver.waitAndClick(homePage.signInbutton);
    }
    @When("doctor clicks my pages US009")
    public void doctor_clicks_my_pages_US009() {
        Driver.waitAndClick(doctorPage.myPages);
        Driver.waitAndClick(doctorPage.myAppointments);
    }
    @When("doctor clicks my appointment US009")
    public void doctor_clicks_my_appointment_US009() {

    }
    @When("doctor clicks edit button from my appointments page US009")
    public void doctor_clicks_edit_button_from_my_appointments_page_US009() {

    }
    @Given("verify new test contains the expected information US009")
    public void verify_new_test_contains_the_expected_information_US009() {

    }

    @When("doctor clicks a button to fill test US009")
    public void doctor_clicks_a_button_to_fill_test_US009() {

    }
    @When("doctor clicks save on test US009")
    public void doctor_clicks_save_on_test_US009() {

    }
    @When("verify new test created message appears US009")
    public void verify_new_test_created_message_appears_US009() {

    }
    @Then("close the application US009")
    public void close_the_application_US009() {
    Driver.closeDriver();
    }



}

