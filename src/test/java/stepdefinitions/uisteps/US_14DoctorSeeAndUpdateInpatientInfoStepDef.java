package stepdefinitions.uisteps;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DoctorPage_13_14;
import pages.HomePage;
import pages.InpatientInfoPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_14DoctorSeeAndUpdateInpatientInfoStepDef {
    DoctorPage_13_14 doctorPage_13_14 = new DoctorPage_13_14();
    HomePage homePage = new HomePage();
    InpatientInfoPage inpatientInfoPage = new InpatientInfoPage();

    @Then("user clicks on My Inpatients")
    public void user_clicks_on_my_inpatients() {
        Driver.waitAndClick(doctorPage_13_14.myInpatientsButton);
    }

    @Then("user verifies all inpatient info")
    public void user_verifies_all_patient_info_id_start_date_and_end_date_description_created_date_appointment_id_status_room_and_patient() throws IOException {

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
    @Then("user navigates fifthInpatientEdit button and clicks")
    public void user_navigates_edit_button_and_clicks() {
        Driver.waitAndClick(inpatientInfoPage.fifthInPatientEditButton);

    }

    //user can update status to staying with giving a room
    @Then("user can update status staying and clicks save button  InPatient")
    public void user_can_update_status_staying_and_clicks_save_button_in_patient() throws IOException {
        Driver.clickWithJS(inpatientInfoPage.inpatientStatusDropBox);
        Driver.selectAnItemFromDropdown(inpatientInfoPage.inpatientStatusDropBox, "STAYING");
        Driver.selectAnItemFromDropdown(inpatientInfoPage.inpatientRoomDropBox, "5645:TWIN null");
        Driver.clickWithJS(inpatientInfoPage.inPatientStatusSaveButton);
        Driver.wait(3);
        String actualPopUpMessage = inpatientInfoPage.updatedMessage.getText();
        Assert.assertTrue(actualPopUpMessage.contains("The In Patient is updated with identifier"));
        ReusableMethods.getScreenshot("STAYING");
        ReusableMethods.getScreenshot("INPATIENTSTATUSSTAYING");


    }

    //    @Then("user navigates fifthInpatientEdit button and clicks")
//    public void user_navigates_eight_inpatient_edit_button_and_clicks() {
//        Driver.waitAndClick(inpatientInfoPage.fifthInPatientEditButton);
//    }
    //Doctor can try Change ROOM but ROOM Does'nt change
    @Then("user can update status Room and save button InPatient")
    public void user_can_update_status_room_and_save_button_in_patient() throws IOException {
        Driver.wait(2);
        Driver.waitAndClick(inpatientInfoPage.inpatientRoomDropBox);
        Driver.selectAnItemFromDropdown(inpatientInfoPage.inpatientRoomDropBox, "122:TWIN free room");
        Driver.clickWithJS(inpatientInfoPage.inPatientStatusSaveButton);
        Driver.wait(3);
        String actualPopUpMessage = inpatientInfoPage.updatedMessage.getText();
        Assert.assertTrue(actualPopUpMessage.contains("The In Patient is updated with identifier"));
        ReusableMethods.getScreenshot("INPATIENTROOMUPDATED");

    }

    //User can not update status to staying without giving a room
    @Then("user navigates sixthInpatientEdit button and clicks")
    public void user_navigates_sixth_inpatient_edit_button_and_clicks() {
        Driver.waitAndClick(inpatientInfoPage.sixthInPatientEditButton);
    }

    @Then("user  update status staying and clicks save button  InPatient")
    public void user_update_status_staying_and_clicks_save_button_in_patient() {
        Driver.clickWithJS(inpatientInfoPage.inpatientStatusDropBox);
        Driver.selectAnItemFromDropdown(inpatientInfoPage.inpatientStatusDropBox, "STAYING");
        Driver.clickWithJS(inpatientInfoPage.inPatientStatusSaveButton);
        Driver.wait(3);
    }

    //    @Then("user verifies unapdated message")
//    public void user_verifies_unapdated_message() {
//        Assert.assertTrue(inpatientInfoPage.canNotBeUpdatedMessage.isDisplayed());
//
//    }
    //User can cancelled if inpatient is unapproved
    @Then("user can update status Canceled and save button InPatient")
    public void user_can_update_status_canceled_and_save_button_in_patient() throws IOException {

        Driver.waitAndClick(inpatientInfoPage.inpatientStatusDropBox);
        Driver.waitAndClickLocationText(inpatientInfoPage.inpatientStatusDropBox, "CANCELLED");
        Driver.clickWithJS(inpatientInfoPage.inPatientStatusSaveButton);
        Driver.wait(3);
        String actualPopUpMessage = inpatientInfoPage.updatedMessage.getText();
        Assert.assertTrue(actualPopUpMessage.contains("The In Patient is updated with identifier"));
        ReusableMethods.getScreenshot("CANCELLED");

    }


    //User can discharged the patient who was previously given a room
    @Then("user can update status Discharge and save button InPatient")
    public void user_can_update_status_discharge_and_save_button_in_patient() throws IOException {
        Driver.waitAndClick(inpatientInfoPage.inpatientStatusDropBox);
        Driver.waitAndClickLocationText(inpatientInfoPage.inpatientStatusDropBox, "DISCHARGED");
        Driver.clickWithJS(inpatientInfoPage.inPatientStatusSaveButton);
        Driver.wait(3);
        String actualPopUpMessage = inpatientInfoPage.updatedMessage.getText();
        Assert.assertTrue(actualPopUpMessage.contains("The In Patient is updated with identifier"));
        ReusableMethods.getScreenshot("DISCHARGED");

    }
}
