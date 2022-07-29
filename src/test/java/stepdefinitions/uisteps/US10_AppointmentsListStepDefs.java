package stepdefinitions.uisteps;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.US002_uipages.AdminHomePage;
import pages.US002_uipages.HomePage002;
import pages.US010_uipages.DoctorPage;
import pages.US010_uipages.LoginPage;
import pages.US010_uipages.MyPagesAppointmentPage;
import pages.US010_uipages.US_010_AppointmentsListPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US10_AppointmentsListStepDefs {
    DoctorPage doctorPage = new DoctorPage();
    LoginPage loginPage = new LoginPage();
    AdminHomePage adminHomePage = new AdminHomePage();
    MyPagesAppointmentPage myPagesAppointmentPage = new MyPagesAppointmentPage();
    US_010_AppointmentsListPage appointmentsListPage = new US_010_AppointmentsListPage();
    HomePage002 homePage002 =new HomePage002();
    Actions actions = new Actions(Driver.getDriver());
    @Given("doctor navigates to medunna.com")
    public void doctor_navigates_to_medunna_com() {
        Driver.getDriver().get(ConfigurationReader.getProperty("base_url"));
    }
    @Given("doctor clicks on the user icon button")
    public void doctor_clicks_on_the_user_icon_button() {
       homePage002.userIcon.click();
    }
    @Given("doctor clicks on the Sign in button")
    public void doctor_clicks_on_the_sign_in_button() throws InterruptedException {
        loginPage.signInLocation.click();
        Thread.sleep(2);
    }
    @Given("doctor writes a valid username")
    public void doctor_writes_a_valid_username() {
        ReusableMethods.waitFor(2);
        ReusableMethods.waitForPageToLoad(7);
        loginPage.usernameBox.sendKeys("doctor79");
    }
    @Given("doctor writes a valid password")
    public void doctor_writes_a_valid_password() {
        loginPage.passwordBox.sendKeys("doctor");
    }
    @Given("doctor clicks on Sign in button")
    public void doctor_clicks_on_sign_in_button() throws InterruptedException {
        loginPage.signInButton.click();
        Thread.sleep(2);
    }
    @Given("clicks on My Pages button")
    public void clicks_on_my_pages_button() {
        ReusableMethods.waitFor(2);
        myPagesAppointmentPage.myPages.click();
    }
    @Given("doctor clicks on Appointments button")
    public void doctor_clicks_on_appointments_button() {
        ReusableMethods.waitFor(2);
        myPagesAppointmentPage.myAppointments.click();
    }
    @Given("doctor selects Appointments startDate, endDate and status")
    public void doctor_selects_appointments_start_date_end_date_and_status() {
        Assert.assertTrue(Driver.waitForVisibility(myPagesAppointmentPage.id,1).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(myPagesAppointmentPage.startDate,1).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(myPagesAppointmentPage.endDate,1).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(myPagesAppointmentPage.status,1).isDisplayed());
    }
}
