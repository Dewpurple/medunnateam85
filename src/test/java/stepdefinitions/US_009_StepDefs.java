package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.ItemsAndTitlesPage;
import pages.PatientEditPage;
import pages.SearchPatientPage;
import pojos.PojoPatientEditInformation;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_009_StepDefs extends PojoPatientEditInformation {
  HomePage homePage = new HomePage();
  ItemsAndTitlesPage itemsAndTitlesPage = new ItemsAndTitlesPage();
  PatientEditPage patientEditPage = new PatientEditPage();
  SearchPatientPage searchPatientPage = new SearchPatientPage();

  public US_009_StepDefs(String id, String ssn, String patientFirstName, String patientLastname, String patientBirthDate, String patientEmail, String patientPhoneNumber, String patientGender, String patientBloodGroup, String patientAddress, String patientDescription, String patientUser, String patientCountry, String patientState) {
    super(id, ssn, patientFirstName, patientLastname, patientBirthDate, patientEmail, patientPhoneNumber, patientGender, patientBloodGroup, patientAddress, patientDescription, patientUser, patientCountry, patientState);
  }


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
  public void admin_clicks_on_items_and_titles_US009() {
      homePage.itemsTitles.click();
  }
  @When("Admin clicks on Patient icon. US009")
  public void admin_clicks_on_patient_icon_US009() {
      homePage.patient.click();
  }
  @When("Admin finds edit button and clicks it US009")
  public void admin_finds_edit_button_and_clicks_itUS009() {
      itemsAndTitlesPage.editButtonFirstPatient.click();
  }
    @When("Admin performs edits to all patient information US009")
    public void admin_performs_edits_to_all_patient_information_US009() {
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
    @When("Admin clicks on Save button US009")
    public void admin_clicks_on_save_button_US009() throws InterruptedException {
    patientEditPage.patientSaveButton.click();
    Thread.sleep(1000);
    }
    @When("Verify edit is saved successfully US009")
    public void verify_edit_is_saved_successfully_US009() {
    String patientEditSaveSuccessfullyText = Driver.getDriver().switchTo().alert().getText();
    String expectedAlertText = "A Patient is updated with identifier";
    Assert.assertTrue(patientEditSaveSuccessfullyText.contains(expectedAlertText));
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

  @Given("user verifies Patient SSN Search box is avalible US009")
  public void user_verifies_patient_ssn_search_box_is_avalible_US009() {
  Assert.assertTrue(searchPatientPage.patientSSNSearch.isEnabled());
  }
  @Given("user verifies all registration information is populated US009")
  public void user_verifies_all_registration_information_is_populated_US009() {
  searchPatientPage.patientSSNSearch.sendKeys(ConfigurationReader.getProperty("ssn"));
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
    Assert.assertTrue(searchPatientPage.doctor.isDisplayed());
    Assert.assertTrue(searchPatientPage.country.isDisplayed());
    Assert.assertTrue(searchPatientPage.stateCity.isDisplayed());
  }

  @Given("User sets the expected data for patient info and Validates US009")
  public void user_sets_the_expected_data_for_patient_info_and_validates_US009() {
  PojoPatientEditInformation pojoPatientEditInformation = new PojoPatientEditInformation("3353", "123-66-5555", "Vernice"
  ,"Carroll", "22/06/78 02:50", "dovie.macgyver@hotmail.com", "4165667780" , "OTHER" , "O+" , "Orchard, Port", "asthma" , "doctor84",
        "Türkye" ,  "monster/mons"  );
  Assert.assertEquals(pojoPatientEditInformation.getId(), patientEditPage.patientID.getText());
    Assert.assertEquals(pojoPatientEditInformation.getPatientFirstName(), patientEditPage.patientFirstName.getText());
    Assert.assertEquals(pojoPatientEditInformation.getPatientLastname(), patientEditPage.patientLastName.getText());
    Assert.assertEquals(pojoPatientEditInformation.getPatientBirthDate(), patientEditPage.patientBirthDate.getText());
    Assert.assertEquals(pojoPatientEditInformation.getPatientEmail(), patientEditPage.patientEmail.getText());
    Assert.assertEquals(pojoPatientEditInformation.getPatientPhoneNumber(), patientEditPage.patientPhoneNumber.getText());
    Assert.assertEquals(pojoPatientEditInformation.getPatientGender(), patientEditPage.patientGender.getText());
    Assert.assertEquals(pojoPatientEditInformation.getPatientBloodGroup(), patientEditPage.patientBloodGroup.getText());
    Assert.assertEquals(pojoPatientEditInformation.getPatientAddress(), patientEditPage.patientAddress.getText());
    Assert.assertEquals(pojoPatientEditInformation.getPatientDescription(), patientEditPage.patientDescription.getText());
    Assert.assertEquals(pojoPatientEditInformation.getPatientUser(), patientEditPage.patientUser.getText());
    Assert.assertEquals(pojoPatientEditInformation.getPatientCountry(), patientEditPage.patientCountry.getText());
    Assert.assertEquals(pojoPatientEditInformation.getPatientState(), patientEditPage.patientState.getText());
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
