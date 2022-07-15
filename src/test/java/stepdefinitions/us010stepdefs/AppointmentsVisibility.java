package stepdefinitions.us010stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DoctorPage;
import pages.HomePage;
import pages.SignInPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;

public class AppointmentsVisibility {
    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    DoctorPage doctorPage = new DoctorPage();
    @Given("I am on the homepage us10")
    public void iAmOnTheHomepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
    }

    @And("I click on menu icon us10")
    public void iClickOnMenuIcon() {
        homePage.loginDropDown.click();
    }

    @And("I click on sign in button us10")
    public void iClickOnSignInButton() {
        homePage.loginSignInButton.click();
    }

    @And("I provide username and password us10")
    public void iProvideUsernameAndPassword() {
        signInPage.usernameTextBox.sendKeys("doctor79");
        signInPage.passwordTextBox.sendKeys("doctor");

    }

    @And("I click on  Sign in us10")
    public void iClickOnSignIn() {
        signInPage.signInSubmitButton.click();
    }

    @And("I go to my pages us10")
    public void iGoToMyPages() {
        doctorPage.myPages.click();
    }

    @And("I select appointments us10")
    public void iSelectAppointments() {
        doctorPage.myAppointments.click();
    }

    @When("I type in the date in from as {string} us10")
    public void iTypeInTheDateInFromAs(String arg0) {
        doctorPage.fromDate.sendKeys("7-05-2022");
    }

    @And("I type in the date in to as {string} us10")
    public void iTypeInTheDateInToAs(String arg0) {
        doctorPage.toDate.sendKeys("07-18-2022");
    }

    @Then("I validate that i see my appointments us10")
    public void iValidateThatISeeMyAppointments() {
        Assert.assertTrue(doctorPage.appointmentTable.isDisplayed());
    }

}
