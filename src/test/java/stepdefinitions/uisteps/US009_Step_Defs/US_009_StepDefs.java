package stepdefinitions.uisteps.US009_Step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
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

  @When("Admin navigates to the sign in page US009")
    public void admin_navigates_to_the_sign_in_page_US009() {
        homePage.loginDropDown.click();
        homePage.loginSignInButton.click();
        Driver.wait(1);
    }
    @When("Admin signs in US009")
    public void admin_signs_in_US009() {
    homePage.username.sendKeys(ConfigurationReader.getProperty("adminusername2"));
    homePage.password.sendKeys(ConfigurationReader.getProperty("adminpw2"));
    homePage.signInbutton.click();
    }
  @When("Admin clicks on Items and Titles US009")
  public void admin_clicks_on_items_and_titles_US009() throws InterruptedException {
    Thread.sleep(1000);
    homePage.itemsTitles.click();
  }
  @When("Admin clicks on Patient icon. US009")
  public void admin_clicks_on_patient_icon_US009() throws InterruptedException {
    Thread. sleep(1000);
    homePage.patient.click();
  }
  @When("Admin finds edit button and clicks it US009")
  public void admin_finds_edit_button_and_clicks_itUS009() throws InterruptedException {
    Thread.sleep(500);
    patientEditPage.editbutton.click();
  }

    @When("Admin clicks on Save button US009")
    public void admin_clicks_on_save_button_US009() throws InterruptedException {
      Thread.sleep(1000);
      patientEditPage.patientSaveButton.click();

    }

  @When("Admin performs edits to all patient information US009")
  public void admin_performs_edits_to_all_patient_information_US009() throws InterruptedException {
    Thread.sleep(1000);
    patientEditPage.patientFirstName.click();
    patientEditPage.patientFirstName.sendKeys("12");
    patientEditPage.patientLastName.sendKeys("1");
    patientEditPage.patientBirthDate.sendKeys("12");
//    Assert.assertTrue(patientEditPage.patientFirstName.isEnabled());
//    Assert.assertTrue(patientEditPage.patientLastName.isEnabled());
//    Assert.assertTrue(patientEditPage.patientBirthDate.isEnabled());
//    Assert.assertTrue(patientEditPage.patientEmail.isEnabled());
//    Assert.assertTrue(patientEditPage.patientPhoneNumber.isEnabled());
//    Assert.assertTrue(patientEditPage.patientGender.isEnabled());
//    Assert.assertTrue(patientEditPage.patientBloodGroup.isEnabled());
//    Assert.assertTrue(patientEditPage.patientAddress.isEnabled());
//    Assert.assertTrue(patientEditPage.patientDescription.isEnabled());
//    Assert.assertTrue(patientEditPage.patientUser.isEnabled());
//    Assert.assertTrue(patientEditPage.patientCountry.isEnabled());
//    Assert.assertTrue(patientEditPage.patientState.isEnabled());
  }

    @Then("close application US009")
    public void close_application_US009() {
    Driver.closeDriver();
    }

  @Given("user signs in as Staff US009")
  public void user_signs_in_as_staff_US009() {
    homePage.username.sendKeys(ConfigurationReader.getProperty("staffusername"));
    homePage.password.sendKeys(ConfigurationReader.getProperty("staffpw"));
    homePage.signInbutton.click();
  }
  @Given("user clicks on My Pageas US009")
  public void user_clicks_on_my_pageas_US009() {
  homePage.myPages.click();
  }
  @Given("user clicks on Patient icon. US009")
  public void user_clicks_on_patient_icon_US009() {
  homePage.searchPatient.click();
  }
  @Given("user clicks Search Patient Icon US009")
  public void user_clicks_search_patient_icon_US009() {
  searchPatientPage.patientSSNSearch.click();
  }

  @Given("user clicks edit box US009")
  public void user_clicks_edit_box_US009() {
  searchPatientPage.patientSearchEditButton.click();
  }
  @Given("user enters SSN from config prop US009")
  public void user_enters_ssn_from_config_prop_US009() {
  searchPatientPage.patientSSNSearch.sendKeys(ConfigurationReader.getProperty("ssn"));
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

  }
  @Given("user clicks items &And Titles Page US009")
  public void user_clicks_items_and_titles_page_US009() {

  }
  @Given("user verifies delete button is available US009")
  public void user_verifies_delete_button_is_available_US009() {

  }
  @Given("verify delete button does not exist US009")
  public void verify_delete_button_does_not_exist_us009() {

  }
  @Given("user verifies the patient page is correct US009")
  public void user_verifies_the_patient_page_is_correct_us009() {

  }
  @Given("user verifies Patient SSN Search box is NOT avalible US009")
  public void user_verifies_patient_ssn_search_box_is_not_avalible_us009() {

  }

}