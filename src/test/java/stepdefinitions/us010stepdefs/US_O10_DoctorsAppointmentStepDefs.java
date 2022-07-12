package stepdefinitions.us010stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DoctorPage;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_O10_DoctorsAppointmentStepDefs {
    HomePage homePage = new HomePage();
    DoctorPage doctorPage = new DoctorPage();
    Faker faker = new Faker();
    @Given("doctor navigates to medunna url")
    public void doctor_navigates_to_medunna_url() {
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("medunna_url"));
    }
    @Given("doctor clicks on account menu button")
    public void doctor_clicks_on_account_menu_button() {
        Driver.waitAndClick(homePage.loginDropDown);
    }
    @Given("doctor clicks on {string}")
    public void doctor_clicks_on(String string) {
        Driver.waitAndClick(homePage.loginSignInButton);
    }
    @Given("doctor provides username as {string}")
    public void doctor_provides_username_as(String string) {

        homePage.loginSignInButton.sendKeys(ConfigurationReader.getProperty("doctor79"));

    }
    @Given("doctor provides password as {string}")
    public void doctor_provides_password_as(String string) {
        homePage.password.sendKeys(ConfigurationReader.getProperty("doctor"));
    }
    @Given("doctor clicks on {string}")
    public void doctor_clicks_on_button(String string) {
        Driver.waitAndClick(homePage.signInbutton);
    }
    @Given("doctor clicks my pages")
    public void doctor_clicks_my_pages() {
        Driver.waitAndClick(doctorPage.myPages);
    }
    @When("doctor clicks my appointment")
    public void doctor_clicks_my_appointment() {
        Driver.waitAndClick(doctorPage.myAppointments);
    }
    @Then("doctor validates that appointments page opens")
    public void doctor_validates_that_appointments_page_opens() {
        Assert.assertTrue(doctorPage.entireAppointmentsPage.isDisplayed());
    }

}
