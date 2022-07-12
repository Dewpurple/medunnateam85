package stepdefinitions.us010stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DoctorPage;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.Driver;

public class US010_Visible_Appointments {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    DoctorPage doctorPage = new DoctorPage();
    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {

        Driver.getDriver().navigate().to("https://www.medunna.com/");
    }
    @Given("I click on menu icon")
    public void i_click_on_menu_icon() {

        homePage.menuIcon.click();
    }

    @And("I select Sign in")
    public void iSelectSignIn() {
        homePage.loginSignInButton.click();
    }

    @And("I go to my pages")
    public void iGoToMyPages() {
        doctorPage.myPages.click();
    }

    @And("I select appointments")
    public void iSelectAppointments() {
        doctorPage.myAppointments.click();
    }

    @When("I select the dates as {string} and as {string}")
    public void iSelectTheDatesAsAndAs(String date1, String date2) {
        //doctorPage.
    }

    @Then("I validate that i see my appointments")
    public void iValidateThatISeeMyAppointments() {
    }
}
