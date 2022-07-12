package stepdefinitions.us010stepdefs;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DoctorPage;

public class US10_InvisibleAppointments {
    DoctorPage doctorPage = new DoctorPage();
    @Then("I validate that i do not see my appointments")
    public void iValidateThatIDoNotSeeMyAppointments() {
        Assert.assertTrue(doctorPage.appointmentErrorMessage.isDisplayed());
    }
}
