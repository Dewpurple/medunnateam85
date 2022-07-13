package stepdefinitions.us010stepdefs;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DoctorPage;
import pages.HomePage;
import pages.SignInPage;

public class PatientsInfo {
    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    DoctorPage doctorPage = new DoctorPage();
    @Then("I validate that patients info are visible")
    public void iValidateThatPatientsInfoAreVisible() {
        Assert.assertTrue(doctorPage.patientId1.isDisplayed());
        Assert.assertTrue(doctorPage.patientId2.isDisplayed());
        Assert.assertTrue(doctorPage.startDateTime1.isDisplayed());
        Assert.assertTrue(doctorPage.startDateTime2.isDisplayed());
        Assert.assertTrue(doctorPage.endDateTime1.isDisplayed());
        Assert.assertTrue(doctorPage.endDateTime2.isDisplayed());
        Assert.assertTrue(doctorPage.status1.isDisplayed());
        Assert.assertTrue(doctorPage.status2.isDisplayed());
    }
}
