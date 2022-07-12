package stepdefinitions.us010stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DoctorPage;
import pages.HomePage;
import pages.RegistrationPage;
import pages.SignInPage;
import utilities.Driver;

import java.util.List;

public class US010_Visible_Appointments {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    DoctorPage doctorPage = new DoctorPage();
    SignInPage signInPage = new SignInPage();
   @Given("I am on the homepage us10")
   public void i_am_on_the_homepage() {

       Driver.getDriver().navigate().to("https://www.medunna.com/");
    }
   @Given("I click on menu icon us10")
   public void i_click_on_menu_icon() {

       homePage.loginDropDown.click();
   }
    @And("I click on sign in button us10")
    public void iClickOnSignInButtonUs() {
        homePage.loginSignInButton.click();
    }

    @And("I provide username and password")
    public void iProvideUsernameAndPassword(DataTable credentials) {
      List<String> doctorCredentials = credentials.row(1);
      signInPage.usernameTextBox.sendKeys(doctorCredentials.get(0));
      signInPage.passwordTextBox.sendKeys(doctorCredentials.get(1));

}

    @And("I click on  Sign in")
    public void iClickOnSignIn() {
       signInPage.signInSubmitButton.click();
    }

    @And("I go to my pages")
    public void iGoToMyPages() {
       doctorPage.myPages.click();
    }

    @And("I select appointments")
    public void iSelectAppointments() {
       doctorPage.myAppointments.click();
    }


    @When("I type in the date in from as {string}")
    public void iTypeInTheDateInFromAs(String arg0) {
       doctorPage.fromDate.sendKeys(arg0);
    }

    @And("I type in the date in to as {string}")
    public void iTypeInTheDateInToAs(String arg0) {
       doctorPage.toDate.sendKeys(arg0);
    }

    @Then("I validate that i see my appointments")
    public void iValidateThatISeeMyAppointments() {
       Assert.assertTrue(doctorPage.appointmentTable.isDisplayed());
    }

    @And("I click on sign in button")
    public void iClickOnSignInButton() {
       homePage.loginSignInButton.click();
    }


}
