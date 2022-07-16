package stepdefinitions.us010stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DoctorPage;
import pages.HomePage;
import pages.SignInPage;

public class AppointmentsNotVisible {
    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    DoctorPage doctorPage = new DoctorPage();
    @When("I type in the date in from as {string}")
    public void iTypeInTheDateInFromAs(String arg0) {
    doctorPage.fromDate.sendKeys(arg0);
    }

    @And("I type in the date in to as {string}")
    public void iTypeInTheDateInToAs(String arg0) {
        doctorPage.toDate.sendKeys(arg0);
    }
    @Then("I validate that i do not see my appointments")
    public void iValidateThatIDoNotSeeMyAppointments() {
        Assert.assertTrue(doctorPage.appointmentErrorMessage.isDisplayed());

    }


}
