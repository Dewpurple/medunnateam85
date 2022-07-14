package stepdefinitions.uisteps.US009_Step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.ItemsAndTitlesPage;
import pages.PatientEditPage;
import pages.SearchPatientPage;
import pojos.PojoPatientEditInformation;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_009_API_StepDefs extends PojoPatientEditInformation {
    HomePage homePage = new HomePage();
    ItemsAndTitlesPage itemsAndTitlesPage = new ItemsAndTitlesPage();
    PatientEditPage patientEditPage = new PatientEditPage();
    SearchPatientPage searchPatientPage = new SearchPatientPage();

    public US_009_API_StepDefs(String id, String ssn, String patientFirstName, String patientLastname, String patientBirthDate, String patientEmail, String patientPhoneNumber, String patientGender, String patientBloodGroup, String patientAddress, String patientDescription, String patientUser, String patientCountry, String patientState) {
        super(id, ssn, patientFirstName, patientLastname, patientBirthDate, patientEmail, patientPhoneNumber, patientGender, patientBloodGroup, patientAddress, patientDescription, patientUser, patientCountry, patientState);
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

    @Given("user verifies Patient SSN Search box is avalible US009")
    public void user_verifies_patient_ssn_search_box_is_avalible_US009() {
        Assert.assertTrue(searchPatientPage.patientSSNSearch.isEnabled());
    }


}
