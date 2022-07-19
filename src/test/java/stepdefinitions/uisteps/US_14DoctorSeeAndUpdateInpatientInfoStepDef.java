package stepdefinitions.uisteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DoctorPage_13_14;
import pages.HomePage;
import pages.InpatientInfoPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_14DoctorSeeAndUpdateInpatientInfoStepDef {
    DoctorPage_13_14 doctorPage_13_14 = new DoctorPage_13_14();
    HomePage homePage = new HomePage();
    InpatientInfoPage inpatientInfoPage = new InpatientInfoPage();
    @Given("US_14user navitages to Medunna url")
    public void US_14user_navitages_to_medunna_url() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));

    }
    @When("US_14user is on the home page")
    public void US_14user_is_on_the_home_page() {
        Driver.waitAndClick(homePage.loginDropDown);

    }
    @When("US_14user clicks the signIn button")
    public void US_14user_clicks_the_sign_in_button() {
        Driver.waitAndClick(homePage.loginSignInButton);
    }
    @When("US_14user provide valid username {string} and {string}")
    public void US_14user_provide_valid_username_and(String username, String password) {
        homePage.username.sendKeys(username);
        homePage.password.sendKeys(password);
    }
    @Then("US_14user clicks on Sign In Button")
    public void US_14user_clicks_on_sign_in_button() {
        homePage.signInbutton.click();
    }
    @Then("US_14user clicks on MY Pages")
    public void US_14user_clicks_on_my_pages() {
        Driver.wait(2);
        Driver.waitAndClick(doctorPage_13_14.myPages);
    }
    @Then("US_14user clicks on My Inpatients")
    public void US_14user_clicks_on_my_inpatients() {
        Driver.waitAndClick(doctorPage_13_14.myInpatientsButton);
    }

    @Then("US_14user verifies all inpatient info")
    public void US_14user_verifies_all_patient_info_id_start_date_and_end_date_description_created_date_appointment_id_status_room_and_patient() throws IOException {

        Assert.assertTrue(Driver.waitForVisibility(inpatientInfoPage.firstInPatientID, 3).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(inpatientInfoPage.firstInPatientStartDate, 3).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(inpatientInfoPage.firstInPatientStatus, 3).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(inpatientInfoPage.firstInPatientCreatedDate, 3).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(inpatientInfoPage.firstInPatientStartDate, 3).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(inpatientInfoPage.firstInPatientRoom, 3).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(inpatientInfoPage.firstInPatientAppointment, 3).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(inpatientInfoPage.firstInPatientNameSSN, 3).isDisplayed());
        ReusableMethods.getScreenshot("InpatientInfoScreenshot");
    }

    //
    @Then("US_14user navigates firstInpatientEdit button and clicks")
    public void US_14user_navigates_edit_button_and_clicks() {
        Driver.waitAndClick(inpatientInfoPage.firstInPatientEditButton);

    }

    //user can update status to staying with giving a room
    @Then("US_14user can update status staying and clicks save button  InPatient")
    public void US_14user_can_update_status_staying_and_clicks_save_button_in_patient() throws IOException {
        Driver.waitAndClick(inpatientInfoPage.inpatientStatusDropBox);
        Driver.selectAnItemFromDropdown(inpatientInfoPage.inpatientStatusDropBox, "STAYING");
        Driver.selectAnItemFromDropdown(inpatientInfoPage.inpatientRoomDropBox, "5645:TWIN null");
        Driver.waitAndClick(inpatientInfoPage.inPatientStatusSaveButton);
        Driver.wait(3);
  //      String actualPopUpMessage = inpatientInfoPage.updatedMessage.getText();
//        Assert.assertTrue(actualPopUpMessage.contains("The In Patient is updated with identifier"));
//        ReusableMethods.getScreenshot("STAYING");
//        ReusableMethods.getScreenshot("INPATIENTSTATUSSTAYING");


    }

    //    @Then("US_14user navigates firstInpatientEdit button and clicks")
//    public void US_14user_navigates_eight_inpatient_edit_button_and_clicks() {
//        Driver.waitAndClick(inpatientInfoPage.firstInPatientEditButton);
//    }
    //Doctor can try Change ROOM but ROOM Does'nt change
    @Then("US_14user can update status Room and save button InPatient")
    public void US_14user_can_update_status_room_and_save_button_in_patient() throws IOException {
        Driver.wait(2);
        Driver.waitAndClick(inpatientInfoPage.inpatientRoomDropBox);
        Driver.selectAnItemFromDropdown(inpatientInfoPage.inpatientRoomDropBox, "122:TWIN free room");
        Driver.clickWithJS(inpatientInfoPage.inPatientStatusSaveButton);
        Driver.wait(3);
//        String actualPopUpMessage = inpatientInfoPage.updatedMessage.getText();
//        Assert.assertTrue(actualPopUpMessage.contains("The In Patient is updated with identifier"));
//        ReusableMethods.getScreenshot("INPATIENTROOMUPDATED");

    }

    //User can not update status to staying without giving a room
    @Then("US_14user navigates secondInpatientEdit button and clicks")
    public void US_14user_navigates_second_inpatient_edit_button_and_clicks() {
        Driver.waitAndClick(inpatientInfoPage.secondInPatientEditButton);
    }

    @Then("US_14user  update status staying and clicks save button  InPatient")
    public void US_14user_update_status_staying_and_clicks_save_button_in_patient() {
        Driver.clickWithJS(inpatientInfoPage.inpatientStatusDropBox);
        Driver.selectAnItemFromDropdown(inpatientInfoPage.inpatientStatusDropBox, "STAYING");
        Driver.clickWithJS(inpatientInfoPage.inPatientStatusSaveButton);
        Driver.wait(3);
    }

//        @Then("US_14user verifies unapdated message")
//    public void US_14user_verifies_unapdated_message() {
//        Assert.assertTrue(inpatientInfoPage.canNotBeUpdatedMessage.isDisplayed());
//
//    }
    //User can cancelled if inpatient is unapproved
    @Then("US_14user can update status Canceled and save button InPatient")
    public void US_14user_can_update_status_canceled_and_save_button_in_patient() throws IOException {

        Driver.waitAndClick(inpatientInfoPage.inpatientStatusDropBox);
        Driver.waitAndClickLocationText(inpatientInfoPage.inpatientStatusDropBox, "CANCELLED");
        Driver.clickWithJS(inpatientInfoPage.inPatientStatusSaveButton);
        Driver.wait(3);
//        String actualPopUpMessage = inpatientInfoPage.updatedMessage.getText();
//        Assert.assertTrue(actualPopUpMessage.contains("The In Patient is updated with identifier"));
//        ReusableMethods.getScreenshot("CANCELLED");

    }


    //User can discharged the patient who was previously given a room
    @Then("US_14user can update status Discharge and save button InPatient")
    public void US_14user_can_update_status_discharge_and_save_button_in_patient() throws IOException {
        Driver.waitAndClick(inpatientInfoPage.inpatientStatusDropBox);
        Driver.waitAndClickLocationText(inpatientInfoPage.inpatientStatusDropBox, "DISCHARGED");
        Driver.clickWithJS(inpatientInfoPage.inPatientStatusSaveButton);
        Driver.wait(3);
//        String actualPopUpMessage = inpatientInfoPage.updatedMessage.getText();
//        Assert.assertTrue(actualPopUpMessage.contains("The In Patient is updated with identifier"));
//        ReusableMethods.getScreenshot("DISCHARGED");

    }
    @Then("US_14user close the application")
    public void US_14user_close_the_application() {
        Driver.closeDriver();
    }




}
