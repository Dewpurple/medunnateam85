package stepdefinitions.uisteps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.SignInPage;
import pages.StaffEdit;
import pages.UserPage;
import utilities.ConfigurationReader;
import utilities.Driver;


public class US21StepDefinitions {
    HomePage homePage = new HomePage();
    UserPage userPage=new UserPage();
    SignInPage signInPage = new SignInPage();
    StaffEdit staffEdit = new StaffEdit();

    @Given("US21_user clicks menu and the signIn button")
    public void us21_user_clicks_menu_and_the_sign_in_button() {
        homePage.loginDropDown.click();
        homePage.loginSignInButton.click();
    }
    @Given("US21_user signs in with staff credentials")
    public void us21_user_enters_staff_credentials() {
        homePage.username.sendKeys(ConfigurationReader.getProperty("staffusername"));
        homePage.password.sendKeys(ConfigurationReader.getProperty("staffpw"));
        signInPage.signInSubmitButton.click();
    }
    @Then("US21_user searches for patient with {string}")
    public void us21_user_searches_for_patient_with(String ssn) {
    userPage.myPagesMenu.click();
    userPage.searchPatientButton.click();
    ssn = ConfigurationReader.getProperty("US21_patient_ssn");
    staffEdit.ssnSearchBox.sendKeys(ssn + Keys.ENTER);
    }
    @Then("US21_user clicks show appointments")
    public void us21_user_clicks_show_appointments() {
    staffEdit.showAppointmentsButton.click();
    }
    @When("US21_user clicks edit")
    public void us21_user_clicks_edit() {
        Driver.clickWithJS(staffEdit.editApptButton);
    }
    @When("US21_user changes date to ten days later")
    public void us21_user_changes_date_to_days_later() {
    Driver.waitAndSendText(staffEdit.startDateTextBox,"0924"+Keys.TAB+Keys.TAB+Keys.TAB+Keys.TAB);
    staffEdit.endDateTextBox.sendKeys("0924");
    }
    @Then("US21_clicks save and verifies it's updated")
    public void us21_clicks_save_and_verifies_it_s_updated() {
    Driver.clickWithJS(staffEdit.saveButton);
    Driver.waitForVisibility(staffEdit.apptUpdatedMessage,4);
    Assert.assertTrue(staffEdit.apptUpdatedMessage.isDisplayed());
    }

}
