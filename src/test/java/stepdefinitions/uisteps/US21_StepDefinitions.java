package stepdefinitions.uisteps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.SignInPage;
import pages.StaffEdit;
import pages.UserPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;


public class US21_StepDefinitions {
    HomePage homePage = new HomePage();
    UserPage userPage = new UserPage();
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
    @Then("US21_user goes to search patient")
    public void us21_user_goes_to_search_patient(){
        Driver.waitAndClick(userPage.myPagesMenu);
        Driver.clickWithJS(userPage.searchPatientButton);
    }
    @Then("US21_user searches for patient with {string}")
    public void us21_user_searches_for_patient_with(String ssn) {
        Driver.waitAndClick(userPage.myPagesMenu);
        Driver.waitAndClick(userPage.searchPatientButton);
        ssn = ConfigurationReader.getProperty("US21_patient_ssn");
        staffEdit.ssnSearchBox.sendKeys(ssn + Keys.ENTER);
    }

    @Then("US21_user clicks show appointments")
    public void us21_user_clicks_show_appointments() {
        Driver.clickWithJS(staffEdit.showAppointmentsButton);
    }

    @When("US21_user clicks edit")
    public void us21_user_clicks_edit() {
        Driver.clickWithJS(staffEdit.editApptButton);
    }

    @When("US21_user changes date to ten days later")
    public void us21_user_changes_date_to_days_later() {
        Driver.waitAndSendText(staffEdit.startDateTextBox, "0924" + Keys.TAB + Keys.TAB + Keys.TAB + Keys.TAB);
        staffEdit.endDateTextBox.sendKeys("0924");
    }
    @Then("US21_clicks save and verifies it's updated")
    public void us21_clicks_save_and_verifies_it_s_updated() {
        Driver.clickWithJS(staffEdit.saveButton);
        Driver.waitForVisibility(staffEdit.apptUpdatedMessage, 4);
        Assert.assertTrue(staffEdit.apptUpdatedMessage.isDisplayed());
    }
    @Then("US21_user verifies UNAPPROVED is selectable")
    public void us21_user_verifies_unapproved_is_selectable() {
Driver.waitAndClick(staffEdit.apptStatusSelect);
Assert.assertTrue(staffEdit.unapprovedStatus.isDisplayed());
//        Select select = new Select(staffEdit.apptStatusSelect);
//        List<WebElement> listOptions = select.getOptions();
//        Assert.assertTrue(listOptions.contains("UNAPPROVED"));
    }
    @Then("US21_user verifies PENDING is selectable")
    public void us21_user_verifies_pending_is_selectable() {
        Assert.assertTrue(staffEdit.pendingStatus.isDisplayed());
    }
    @Then("US21_user verifies CANCELLED is selectable")
    public void us21_user_verifies_cancelled_is_selectable() {
        Assert.assertTrue(staffEdit.cancelledStatus.isDisplayed());
    }
    @When("US21_user verifies COMPLETED is not selectable")
    public void us21_user_verifies_completed_is_not_selectable() {
        Driver.waitAndClick(staffEdit.apptStatusSelect);
        Select objSelect = new Select(staffEdit.apptStatusSelect);
        List<WebElement> listOptions = objSelect.getOptions();
        Assert.assertFalse(listOptions.contains("COMPLETED"));
    }
    @When("US21_user leaves anamnesis blank")
    public void us21_user_leaves_anamnesis_blank() {
    Driver.clickWithJS(staffEdit.anamnesisTextBox);
    staffEdit.anamnesisTextBox.clear();
    }
    @When("US21_user leaves treatment blank")
    public void us21_user_leaves_treatment_blank() {
    Driver.clickWithJS(staffEdit.treatmentTextBox);
    staffEdit.treatmentTextBox.clear();
    }
    @When("US21_user leaves diagnosis blank")
    public void us21_user_leaves_diagnosis_blank() {
    Driver.clickWithJS(staffEdit.diagnosisTextBox);
    staffEdit.diagnosisTextBox.clear();
    }
    @When("US21_user selects a doctor")
    public void us21_user_selects_a_doctor() {
    Driver.clickWithJS(staffEdit.physicianSelect);
    Driver.wait(2);
    Select phy = new Select(staffEdit.physicianSelect);
    phy.selectByValue("15014");
    }
    @Given("US21_user signs in with patient credentials")
    public void us21_user_signs_in_with_patient_credentials() {
        homePage.username.sendKeys(ConfigurationReader.getProperty("patient2username"));
        homePage.password.sendKeys(ConfigurationReader.getProperty("patient2pw"));
        signInPage.signInSubmitButton.click();
    }
    @Then("US21_user verifies Search Patient is not visible")
    public void us21_user_verifies_search_patient_is_not_visible() {
        Driver.waitAndClick(userPage.myPagesMenu);
        String s = userPage.myPagesDropDown.getText();
        System.out.println(s);
Assert.assertFalse(s.contains("Search Patient"));
    }
    @When("US21_user clicks Show Tests")
    public void us21_user_clicks_show_tests() {
       Driver.clickWithJS(staffEdit.apptShowTestsButton);
    }
    @Then("US21_user clicks view results")
    public void us21_user_clicks_view_results() {
        Driver.clickWithJS(staffEdit.apptViewResultsButton);
    }
    @Then("US21_user verifies test results are available")
    public void us21_user_verifies_test_results_are_available() {
      Assert.assertTrue(staffEdit.testResultsHeading.isDisplayed());
    }
    @Then("US21_user verifies ssn search box is displayed")
    public void us21_user_verifies_ssn_search_box_is_displayed(){
        Assert.assertTrue(staffEdit.ssnSearchBox.isDisplayed());
    }
    @Then("US21_user verifies edit page is opened")
    public void us21_user_verifies_edit_page_is_opened(){
    Assert.assertTrue(staffEdit.createEditTestResultHeading.isDisplayed());
    }
    @Then("US21_user clicks edit test results")
    public void us21_user_clicks_edit_test_results(){
Driver.clickWithJS(staffEdit.editTestResults);
    }
    @Then("US21_user can see test item and test")
    public void us21_user_can_see_test_item_and_test(){
        Driver.clickWithJS(staffEdit.testItemLabel);
        staffEdit.testItemLabel.isDisplayed();
      //  staffEdit.testLabel.isDisplayed();
    }
    @And("US21_user can edit result to number")
    public void us21_user_can_edit_result(){
        Driver.clickWithJS(staffEdit.resultBox);
        staffEdit.resultBox.sendKeys("123");
    }
    @And("US21_user edits result to string")
    public void us21_user_edits_result_to_string(){
        Driver.clickWithJS(staffEdit.resultBox);
        staffEdit.resultBox.sendKeys("abc");
    }
    @And("US21_user can edit test description")
    public void us21_user_can_edit_test_description(){
        staffEdit.testResultDescription.sendKeys("aa");
    }
    @Then("US21_clicks save and verifies it's not updated")
    public void us21_user_clicks_save_and_verifies_its_not_updated(){
        Driver.clickWithJS(staffEdit.saveButton);
        Assert.assertTrue(staffEdit.testUpdatedErrorMessage.isDisplayed());
    }
    @Then("US21_user is able to view ID")
    public void us21_user_is_able_to_view_ID(){
        Assert.assertTrue(staffEdit.testResultID.isDisplayed());
    }
    @Then("US21_user is able to view date")
    public void us21_user_is_able_to_view_date(){
        Assert.assertTrue(staffEdit.testResultDate.isDisplayed());
    }
    @Then("US21_user is able to view created date")
    public void us21_user_is_able_to_view_created_date(){
        Assert.assertTrue(staffEdit.testResultCreatedDate.isDisplayed());
    }

}
