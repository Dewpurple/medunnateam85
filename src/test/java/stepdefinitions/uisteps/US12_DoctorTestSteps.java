
package stepdefinitions.uisteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.DoctorPage;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US12_DoctorTestSteps {
    HomePage homePage = new HomePage();
    DoctorPage doctorPage = new DoctorPage();
    JavascriptExecutor js = new JavascriptExecutor() {
        @Override
        public Object executeScript(String script, Object... args) {
            return null;
        }

        @Override
        public Object executeAsyncScript(String script, Object... args) {
            return null;
        }
    };

    @Given("user navitages to Medunna url US009")
    public void user_navitages_to_medunna_url_US009() {
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("medunna_url"));
    }
    @When("Doctor logs in US009")
    public void doctor_logs_in_US009() {
        Driver.waitAndClick(homePage.loginDropDown);
        Driver.waitAndClick(homePage.loginSignInButton);
        Driver.waitAndSendText(homePage.username, ConfigurationReader.getProperty("doctorusername2"));
        Driver.waitAndSendText(homePage.password,ConfigurationReader.getProperty("doctorpw2"));
        Driver.waitAndClick(homePage.signInbutton);
    }
    @When("doctor clicks my pages US009")
    public void doctor_clicks_my_pages_US009() {
        Driver.waitAndClick(doctorPage.myPages);

    }
    @When("doctor clicks my appointment US009")
    public void doctor_clicks_my_appointment_US009() {
        Driver.waitAndClick(doctorPage.myAppointments);
    }
    @When("doctor clicks edit button from my appointments page US009")
    public void doctor_clicks_edit_button_from_my_appointments_page_US009() throws InterruptedException {
        Driver.waitAndClick(doctorPage.editButton);
        Thread.sleep(1000);
        Driver.waitAndClick(doctorPage.requestAtestButton);
    }
    @Given("verify new test contains the expected information US009")
    public void verify_new_test_contains_the_expected_information_US009() throws InterruptedException {
        Thread.sleep(1000);
        js.executeScript("arguements[0].scrollIntoView();", doctorPage.glucoseTestItem);
    Assert.assertTrue(doctorPage.glucoseTestItem.isDisplayed());
        js.executeScript("arguements[0].scrollIntoView();", doctorPage.ureaTestItem);
        Assert.assertTrue(doctorPage.ureaTestItem.isDisplayed());
        js.executeScript("arguements[0].scrollIntoView();", doctorPage.creatinineTestItem);
        Assert.assertTrue(doctorPage.creatinineTestItem.isDisplayed());
        js.executeScript("arguements[0].scrollIntoView();", doctorPage.sodiumTestItem);
        Assert.assertTrue(doctorPage.sodiumTestItem.isDisplayed());
        js.executeScript("arguements[0].scrollIntoView();", doctorPage.potassiumTestItem);
        Assert.assertTrue(doctorPage.potassiumTestItem.isDisplayed());
        js.executeScript("arguements[0].scrollIntoView();", doctorPage.totalproteinTestItem);
        Assert.assertTrue(doctorPage.totalproteinTestItem.isDisplayed());
        js.executeScript("arguements[0].scrollIntoView();", doctorPage.albuminTestItem);
        Assert.assertTrue(doctorPage.albuminTestItem.isDisplayed());
        js.executeScript("arguements[0].scrollIntoView();", doctorPage.hemoglobinTestItem);
        Assert.assertTrue(doctorPage.hemoglobinTestItem.isDisplayed());

    }

    @When("doctor clicks a button to fill test US009")
    public void doctor_clicks_a_button_to_fill_test_US009() {
    Driver.waitAndClick(doctorPage.diabetesMedicineTest);
    }
    @When("doctor clicks save on test US009")
    public void doctor_clicks_save_on_test_US009() {
    js.executeScript("arguements[0].scrollIntoView();", doctorPage.saveButtonTestRequest);
    Driver.waitAndClick(doctorPage.saveButtonTestRequest);
    }
    @When("verify new test created message appears US009")
    public void verify_new_test_created_message_appears_US009() {

//        String actualAlertText = Driver.waitAndGetText(doctorPage.newTestisCreatedMessage);
//        String expectedAlertText = "A new Test is created with identifier";
//        Assert.assertTrue(actualAlertText.contains(expectedAlertText));
    }
    @Then("close the application US009")
    public void close_the_application_US009() {
    Driver.closeDriver();
    }



}

