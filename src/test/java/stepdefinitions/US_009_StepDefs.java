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


  @When("Admin navigates to the sign in page")
    public void admin_navigates_to_the_sign_in_page() {
        homePage.loginDropDown.click();
        homePage.loginSignInButton.click();
        Driver.wait(1);
    }
    @When("Admin signs in")
    public void admin_signs_in() {
    homePage.username.sendKeys(ConfigurationReader.getProperty("adminusername2"));
    homePage.password.sendKeys(ConfigurationReader.getProperty("adminpw2"));
    homePage.signInbutton.click();
    }
  @When("Admin clicks on Items and Titles")
  public void admin_clicks_on_items_and_titles() {
      homePage.itemsTitles.click();
  }
  @When("Admin clicks on Patient icon.")
  public void admin_clicks_on_patient_icon() {
      homePage.patient.click();
  }
  @When("Admin finds edit button and clicks it")
  public void admin_finds_edit_button_and_clicks_it() {
      itemsAndTitlesPage.editButtonFirstPatient.click();
  }
    @When("Admin performs edits to all patient information")
    public void admin_performs_edits_to_all_patient_information() {
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
    @When("Admin clicks on Save button")
    public void admin_clicks_on_save_button() throws InterruptedException {
    patientEditPage.patientSaveButton.click();
    Thread.sleep(1000);
    }
    @When("Verify edit is saved successfully")
    public void verify_edit_is_saved_successfully() {
    String patientEditSaveSuccessfullyText = Driver.getDriver().switchTo().alert().getText();
    String expectedAlertText = "A Patient is updated with identifier";
    Assert.assertTrue(patientEditSaveSuccessfullyText.contains(expectedAlertText));
    }
    @Then("close application")
    public void close_application() {
    Driver.closeDriver();
    }

  @Given("user signs in as Staff")
  public void user_signs_in_as_staff() {
    homePage.username.sendKeys(ConfigurationReader.getProperty("staffusername"));
    homePage.password.sendKeys(ConfigurationReader.getProperty("staffpw"));
    homePage.signInbutton.click();
  }
  @Given("user clicks on My Pageas")
  public void user_clicks_on_my_pageas() {
  homePage.myPages.click();
  }
  @Given("user clicks on Patient icon.")
  public void user_clicks_on_patient_icon() {
  homePage.searchPatient.click();
  }
  @Given("user clicks Search Patient Icon")
  public void user_clicks_search_patient_icon() {
  searchPatientPage.patientSSNSearch.click();
  }

  @Given("user verifies Patient SSN Search box is avalible")
  public void user_verifies_patient_ssn_search_box_is_avalible() {
  Assert.assertTrue(searchPatientPage.patientSSNSearch.isEnabled());
  }
  @Given("user verifies all registration information is populated")
  public void user_verifies_all_registration_information_is_populated() {
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

  @Given("User sets the expected data for patient info and Validates")
  public void user_sets_the_expected_data_for_patient_info_and_validates() {
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
  @Given("user clicks edit box")
  public void user_clicks_edit_box() {
  searchPatientPage.patientSearchEditButton.click();
  }
  @Given("user enters SSN from config prop")
  public void user_enters_ssn_from_config_prop() {
  searchPatientPage.patientSSNSearch.sendKeys(ConfigurationReader.getProperty("ssn"));
  }
  @Given("Make connection with DB")
  public void make_connection_with_db() {

  }
  @Given("Run SQL query for expected data")
  public void run_sql_query_for_expected_data() {

  }
  @Given("validate patient info from DB")
  public void validate_patient_info_from_db() {

  }
  @Given("user signs in as admin")
  public void user_signs_in_as_admin() {

  }
  @Given("user clicks items &And Titles Page")
  public void user_clicks_items_and_titles_page() {

  }
  @Given("user verifies delete button is available")
  public void user_verifies_delete_button_is_available() {

  }

}
