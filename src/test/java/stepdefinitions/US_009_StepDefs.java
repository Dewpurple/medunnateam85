package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.ItemsAndTitlesPage;
import pages.PatientEditPage;
import pages.SearchPatientPage;
import pojos.Registrant;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_009_StepDefs extends Registrant {
  HomePage homePage = new HomePage();
  ItemsAndTitlesPage itemsAndTitlesPage = new ItemsAndTitlesPage();
  PatientEditPage patientEditPage = new PatientEditPage();
  SearchPatientPage searchPatientPage = new SearchPatientPage();
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

  @Given("User sets the expected data for patient info")
  public void user_sets_the_expected_data_for_patient_info() {

  }
  @Given("User validates Patient Info using API")
  public void user_validates_patient_info_using_api() {

  }
}
