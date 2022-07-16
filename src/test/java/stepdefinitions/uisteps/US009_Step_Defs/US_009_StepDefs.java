package stepdefinitions.uisteps.US009_Step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.ItemsAndTitlesPage;
import pages.PatientEditPage;
import pages.SearchPatientPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_009_StepDefs   {
  HomePage homePage = new HomePage();
  ItemsAndTitlesPage itemsAndTitlesPage = new ItemsAndTitlesPage();
  PatientEditPage patientEditPage = new PatientEditPage();
  SearchPatientPage searchPatientPage = new SearchPatientPage();
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

  @When("Admin navigates to the sign in page US009")
    public void admin_navigates_to_the_sign_in_page_US009() throws InterruptedException {
        Driver.waitAndClick(homePage.loginDropDown);
        Driver.waitAndClick(homePage.loginSignInButton);
    }
    @When("Admin signs in US009")
    public void admin_signs_in_US009() {
    Driver.waitAndSendText(homePage.username,ConfigurationReader.getProperty("adminusername2"));
    Driver.waitAndSendText(homePage.password,ConfigurationReader.getProperty("adminpw2"));
    Driver.waitAndClick(homePage.signInbutton);
    }
  @When("Admin clicks on Items and Titles US009")
  public void admin_clicks_on_items_and_titles_US009() throws InterruptedException {
    Driver.waitAndClick(homePage.itemsTitles);
  }
  @When("Admin clicks on Patient icon. US009")
  public void admin_clicks_on_patient_icon_US009() throws InterruptedException {
    Driver.waitAndClick(homePage.patient);
  }
  @When("Admin finds edit button and clicks it US009")
  public void admin_finds_edit_button_and_clicks_itUS009() throws InterruptedException {
    Driver.waitAndClick(patientEditPage.editbutton);
  }
    @When("Admin clicks on Save button US009")
    public void admin_clicks_on_save_button_US009() throws InterruptedException {
      js.executeScript("arguments[0].scrollIntoView();", patientEditPage.patientSaveButton);
    Thread.sleep(500);
      patientEditPage.patientSaveButton.sendKeys(Keys.ENTER);
    }
  @When("Admin performs edits to all patient information US009")
  public void admin_performs_edits_to_all_patient_information_US009() throws InterruptedException {
    Thread.sleep(500);
    Assert.assertTrue(patientEditPage.patientFirstName.isEnabled());
    Assert.assertTrue(patientEditPage.patientLastName.isEnabled());
    Assert.assertTrue(patientEditPage.patientBirthDate.isEnabled());
    Assert.assertTrue(patientEditPage.patientEmail.isEnabled());
    Assert.assertTrue(patientEditPage.patientPhoneNumber.isEnabled());
    Assert.assertTrue(patientEditPage.patientGender.isEnabled());
    Assert.assertTrue(patientEditPage.patientBloodGroup.isEnabled());
    Assert.assertTrue(patientEditPage.patientAddress.isEnabled());
    Assert.assertTrue(patientEditPage.patientDescription.isEnabled());
    Assert.assertTrue(patientEditPage.patientUser.isEnabled());
    Assert.assertTrue(patientEditPage.patientCountry.isEnabled());
    Assert.assertTrue(patientEditPage.patientState.isEnabled());
  }

    @Then("close application US009")
    public void close_application_US009() {
    Driver.closeDriver();
    }

  @Given("user signs in as Staff US009")
  public void user_signs_in_as_staff_US009() {
    Driver.waitAndClick(homePage.loginDropDown);
    Driver.waitAndClick(homePage.loginSignInButton);
    Driver.waitAndSendText(homePage.username,ConfigurationReader.getProperty("staffusername"));
    Driver.waitAndSendText(homePage.password,ConfigurationReader.getProperty("staffpw"));
    Driver.waitAndClick(homePage.signInbutton);
  }
  @When("Verify edit is saved successfully US009")
  public void verify_edit_is_saved_successfully_US009() throws InterruptedException {
    String actualAlertText = Driver.waitAndGetText(patientEditPage.savebuttonconfirmation);
    String expectedAlertText = "A Patient is updated with identifier";
    Assert.assertTrue(actualAlertText.contains(expectedAlertText));
  }
  @Given("user clicks on My Pageas US009")
  public void user_clicks_on_my_pageas_US009() {
  Driver.waitAndClick(homePage.myPages);
  }
  @Given("user clicks on Patient icon. US009")
  public void user_clicks_on_patient_icon_US009() {
  Driver.waitAndClick(homePage.searchPatient);
  }
  @Given("user clicks Search Patient Icon US009")
  public void user_clicks_search_patient_icon_US009() {
  Driver.waitAndClick(searchPatientPage.patientSSNSearch);
  }
  @Given("user clicks edit box US009")
  public void user_clicks_edit_box_US009() {
  Driver.waitAndClick(searchPatientPage.patientSearchEditButton);
  }
  @Given("user enters SSN from config prop US009")
  public void user_enters_ssn_from_config_prop_US009() {
  Driver.waitAndSendText(searchPatientPage.patientSSNSearch,ConfigurationReader.getProperty("ssn"));
  }
  @Given("user verifies Patient SSN Search box is avalible US009")
  public void user_verifies_patient_ssn_search_box_is_avalible_US009() {
    Assert.assertTrue(searchPatientPage.patientSSNSearch.isEnabled());
  }
  @Given("user enters patient ssn number")
  public void user_enters_patient_ssn_number() {
    Driver.waitAndSendText(searchPatientPage.patientSSNSearch, ConfigurationReader.getProperty("ssn"));
  }
  @Given("user verifies all registration information is populated US009")
  public void user_verifies_all_registration_information_is_populated_US009() {

    Assert.assertTrue(searchPatientPage.ssn.isDisplayed());
    Assert.assertTrue(searchPatientPage.id.isDisplayed());
    Assert.assertTrue(searchPatientPage.ssn.isDisplayed());
    Assert.assertTrue(searchPatientPage.firstname.isDisplayed());
    Assert.assertTrue(searchPatientPage.lastname.isDisplayed());
    Assert.assertTrue(searchPatientPage.birthday.isDisplayed());
    Assert.assertTrue(searchPatientPage.phonenumber.isDisplayed());
    Assert.assertTrue(searchPatientPage.email.isDisplayed());
    Assert.assertTrue(searchPatientPage.gender.isDisplayed());
    Assert.assertTrue(searchPatientPage.bloodgroup.isDisplayed());
    Assert.assertTrue(searchPatientPage.address.isDisplayed());
    Assert.assertTrue(searchPatientPage.description.isDisplayed());
    Assert.assertTrue(searchPatientPage.datecreated.isDisplayed());
   // Assert.assertTrue(searchPatientPage.doctor.isDisplayed());
    Assert.assertTrue(searchPatientPage.country.isDisplayed());
    //Assert.assertTrue(searchPatientPage.stateCity.isDisplayed());
  }
  @Given("Make connection with DB US009")
  public void make_connection_with_db_US009() {

  }
  @Given("Run SQL query for expected data US009")
  public void run_sql_query_for_expected_data_US009() {

  }
  @Given("validate patient info from DB US009")
  public void validate_patient_info_from_db_US009() {

  }
  @Given("user signs in as admin US009")
  public void user_signs_in_as_admin_US009() {
    Driver.waitAndSendText(homePage.username,ConfigurationReader.getProperty("adminusername2"));
    Driver.waitAndSendText(homePage.password,ConfigurationReader.getProperty("adminpw2"));
    Driver.waitAndClick(homePage.signInbutton);
  }
  @Given("user clicks items &And Titles Page US009")
  public void user_clicks_items_and_titles_page_US009() {
  Driver.waitAndClick(homePage.itemsTitles);
  }
  @Given("user verifies delete button is available US009")
  public void user_verifies_delete_button_is_available_US009() {
  Driver.waitAndClick(patientEditPage.deleteButton);
  Assert.assertTrue(patientEditPage.deleteButtonConfirmation.isEnabled());
  }
  @Given("verify delete button does not exist US009")
  public void verify_delete_button_does_not_exist_us009() {
    boolean isdisplayed = true;
    try{
     if (patientEditPage.deleteButtonConfirmation.isDisplayed()){
       isdisplayed = false;
     }
    } catch (NoSuchElementException e){
    }
  Assert.assertTrue(isdisplayed);
  }
  @Given("user verifies Patient SSN Search box is NOT avalible US009")
  public void user_verifies_patient_ssn_search_box_is_not_avalible_us009() {

  }

}
