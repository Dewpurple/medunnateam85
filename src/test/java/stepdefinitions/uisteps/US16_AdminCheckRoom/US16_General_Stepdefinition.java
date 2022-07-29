package stepdefinitions.uisteps.US16_AdminCheckRoom;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.RegistrationPage;
import pages.SignInPage;
import pages.US_16_AdminRoomPages;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class US16_General_Stepdefinition {

    SignInPage signInPage = new SignInPage();
    US_16_AdminRoomPages admin = new US_16_AdminRoomPages();
    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();
    Actions actions =new Actions(Driver.getDriver());


    @Given("US16-1 go to medunna URL and admin click sign in for OPEN MEDUNNA PAGE")
    public void us16_go_to_medunna_url_and_admin_click_sign_in_for_open_medunna_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
        Driver.wait(1);
        Driver.waitAndClick(signInPage.accountMenu);
        Driver.waitAndClick(signInPage.signInMenuButton);
        Driver.wait(2);

    }
    @Then("US16-2 write to username and password {string} and {string} for FOR OPEN THE ADMIN PAGE")
    public void us16_write_to_username_and_password_and_for_for_open_the_admin_page(String USN, String PWD) {
        Driver.waitAndSendText(admin.US16_UsernameTextbox, USN);
        Driver.waitAndSendText(admin.US16_PasswordTextbox, PWD);
        Driver.waitAndClick(admin.US16_LastSignInButton);

    }
    @Then("US16-3 click to Items&Titles and click Rooms for FOR REACH ROOMS PAGE")
    public void us16_click_to_items_titles_and_click_rooms_for_for_reach_rooms_page() {
        Driver.waitAndClick(admin.US16_itemsTitles);
        Driver.waitAndClick(admin.US16_roomButton);

    }
    @Then("US16-4 click on create a new Room and Admin provides a Room Number with sign or letter and with blank {string} for negative01")
    public void us16_click_on_create_a_new_room_and_admin_provides_a_room_number_with_sign_or_letter_and_with_blank_for_negative01(String invalidRoom) throws IOException {
        Driver.waitAndClick(admin.US16_createANewRoomButton);
        Driver.waitAndSendText(admin.US16_roomNumberBox,invalidRoom);
        Driver.waitAndClick(admin.US16_RoomTypes);

        ReusableMethods.getScreenshot("TestResultScreenShotsForUS16");
    }

    @Then("US16-5 Verify This field should be a number WITH INVALID ROOM INFORMATION")
    public void us16_verify_this_field_should_be_a_number_with_invalid_room_information() throws IOException {

        String exp_invldRM_info = "This field should be a number.";
        String act_invld_RM_info=admin.US16_invalid_RM_Feedbacks.getText();
        Assert.assertEquals(exp_invldRM_info,act_invld_RM_info);
        Driver.wait(3);


        Driver.getDriver().navigate().refresh();
        Driver.wait(3);
        Driver.waitAndClick(admin.US16_roomNumberBox);
        Driver.waitAndSendText(admin.US16_roomNumberBox,"@34 89");
        Driver.wait(3);
        ReusableMethods.getScreenshot("TestResultScreenShotsForUS16");

        Driver.waitAndClick(admin.US16_RoomTypes);
        String exp_invldRM_info2 = "This field should be a number.";
        String act_invld_RM_info2=admin.US16_invalid_RM_Feedbacks.getText();
        Assert.assertEquals(exp_invldRM_info2,act_invld_RM_info2);
        Driver.wait(3);


        Driver.getDriver().navigate().refresh();
        Driver.wait(3);
        Driver.waitAndClick(admin.US16_roomNumberBox);
        Driver.waitAndSendText(admin.US16_roomNumberBox,"   ");
        Driver.wait(3);
        ReusableMethods.getScreenshot("TestResultScreenShotsForUS16");

        Driver.waitAndClick(admin.US16_RoomTypes);
        String exp_invldRM_info3 = "This field is required.";
        String act_invld_RM_info3=admin.US16_invalid_RM_Feedbacks2.getText();
        Assert.assertEquals(exp_invldRM_info3,act_invld_RM_info3);
        Driver.wait(3);

        ReusableMethods.getScreenshot("TestResultScreenShotsForUS16");
    }
    @Then("US16-6 Admin click Room Number box again and provide VALID ROOM NUMBER info in it {string}")
    public void us16_admin_click_room_number_box_again_and_provide_valid_room_number_info_in_it(String VldRMNo) throws IOException {
        Driver.waitAndClick(admin.US16_roomNumberBox);
        Driver.waitAndSendText(admin.US16_roomNumberBox,VldRMNo);
        Driver.wait(1);

        ReusableMethods.getScreenshot("TestResultScreenShotsForUS16");
    }

    @Then("US16-7 Admin verify the room types can be selected {string},{string},{string},{string},{string} CheckTest")
    public void usAdminVerifyTheRoomTypesCanBeSelectedCheckTest(String Twin, String Dlx, String PDlx, String Suite, String DyCare) {

        Driver.waitAndClick(admin.US16_RoomTypes);

        Select select = new Select(admin.US16_RoomTypes);

        List<String> expectedData = new ArrayList<>();
        expectedData.add(Twin);
        expectedData.add(Dlx);
        expectedData.add(PDlx);
        expectedData.add(Suite);
        expectedData.add(DyCare);

        List<String> actualData = new ArrayList<>();
        for (WebElement w : select.getOptions()
        ) {
            actualData.add(w.getText());
        }

        assertTrue(actualData.containsAll(expectedData));

    }


    @And("US16-8 Admin select Room Types box CheckTest")
    public void usAdminSelectRoomTypesBoxCheckTest() {
        Driver.waitAndClick(admin.US16_RoomTypes);

        Select select1=new Select(admin.US16_RoomTypes);
        select1.selectByIndex(1);
        Driver.wait(1);

        Driver.waitAndClick(admin.US16_RoomTypes);
        select1.selectByIndex(0);
        Driver.waitAndClick(admin.US16_RoomTypes);
        Driver.wait(1);

        Driver.waitAndClick(admin.US16_RoomTypes);
        select1.selectByIndex(2);
        Driver.waitAndClick(admin.US16_RoomTypes);
        Driver.wait(1);

        Driver.waitAndClick(admin.US16_RoomTypes);
        select1.selectByIndex(3);
        Driver.waitAndClick(admin.US16_RoomTypes);
        Driver.wait(1);

    }


    @Then("US16-9 Admin click status for negative01")
    public void us16_admin_click_status_for_negative01() throws IOException {
        Driver.waitAndClick(admin.US16_clickStatusBox);
        Driver.wait(3);

        ReusableMethods.getScreenshot("TestResultScreenShotsForUS16");
        Assert.assertTrue(admin.US16_clickStatusBox.isSelected());
    }

    @Then("US16-10 Admin provides Price information with blank or letters {string}")
    public void us16_admin_provides_price_information_with_blank_or_letters(String InvldPrice) throws IOException {
        Driver.waitAndClick(admin.US16_priceTextBox);
        Driver.waitAndSendText(admin.US16_priceTextBox,InvldPrice);
        Driver.wait(1);
        Driver.waitAndClick(admin.US16_description);
        Driver.wait(1);

        ReusableMethods.getScreenshot("TestResultScreenShotsForUS16");

    }
    @Then("US16-11 Admin Verify This field should be at least 0.")
    public void us16_admin_verify_this_field_should_be_at_least() throws IOException {

        String exp_invld_prc="This field should be at least 0.";
        String act_invld_prc=admin.US16_invalid_Price_Feedbacks.getText();
        Assert.assertEquals(exp_invld_prc, act_invld_prc);

        Driver.wait(3);
        Driver.getDriver().navigate().refresh();

        Driver.waitAndClick(admin.US16_priceTextBox);
        Driver.waitAndSendText(admin.US16_priceTextBox,"1 01 01");
        Driver.wait(2);
        Driver.waitAndClick(admin.US16_description);
        ReusableMethods.getScreenshot("TestResultScreenShotsForUS16");

        String exp_invld_prc2="This field should be at least 0.";
        String act_invld_prc2=admin.US16_invalid_Price_Feedbacks.getText();
        Assert.assertEquals(exp_invld_prc2, act_invld_prc2);

        Driver.wait(3);
        Driver.getDriver().navigate().refresh();
        Driver.waitAndClick(admin.US16_priceTextBox);
        Driver.waitAndSendText(admin.US16_priceTextBox,"    ");
        Driver.wait(2);
        ReusableMethods.getScreenshot("TestResultScreenShotsForUS16");
        Driver.waitAndClick(admin.US16_description);

        String exp_invld_prc3="This field is required.";
        String act_invld_prc3=admin.US16_invalid_Price_FeedbacksEmpty.getText();
        Assert.assertEquals(exp_invld_prc3, act_invld_prc3);

    }

    @Then("US16-12 Admin provide room number and price, and Admin write valid price information in it {string}")
    public void us16_admin_click_again_price_box_and_admin_write_valid_price_information_in_it(String VldPrice) throws IOException {
        Driver.wait(3);
        Driver.getDriver().navigate().refresh();

        Driver.waitAndClick(admin.US16_roomNumberBox);
        Driver.waitAndSendText(admin.US16_roomNumberBox,String.valueOf(faker.number().numberBetween(900009,909009)));
        Driver.wait(1);



        Driver.waitAndClick(admin.US16_priceTextBox);
        Driver.waitAndSendText(admin.US16_priceTextBox,VldPrice);
        Driver.wait(1);

        Driver.waitAndClick(admin.US16_description);

        ReusableMethods.getScreenshot("TestResultScreenShotsForUS16");
    }

    @Then("US16-13 Admin click again the description box and sets unknown data in it {string}")
    public void us16_admin_click_again_the_description_box_and_sets_unknown_data_in_it(String desc) throws IOException {
        Driver.waitAndClick(admin.US16_description);
        Driver.waitAndSendText(admin.US16_description,desc);
        ReusableMethods.getScreenshot("TestResultScreenShotsForUS16");
    }
    @Then("US16-14 Admin should not receive any information about and click again description box and clean it")
    public void us16_admin_should_not_receive_any_information_about_and_click_again_description_box_and_clean_it() throws IOException {


        Driver.getDriver().navigate().refresh();

        Driver.waitAndClick(admin.US16_roomNumberBox);
        Driver.waitAndSendText(admin.US16_roomNumberBox,String.valueOf(faker.number().numberBetween(909099,919009)));
        Driver.wait(1);


        Driver.waitAndClick(admin.US16_priceTextBox);
        Driver.waitAndSendText(admin.US16_priceTextBox,"1");
        Driver.wait(1);
        Driver.waitAndClick(admin.US16_description);
        Driver.wait(1);

        ReusableMethods.getScreenshot("TestResultScreenShotsForUS16");
    }

    @Then("US16-15 Admin try to save only with earlier dates and verify the bad request toastify information on the top of the page")
    public void us16_admin_try_to_save_only_with_earlier_dates_and_verify_the_bad_request_toastify_information_on_the_top_of_the_page() throws IOException {

        Driver. waitAndClick(admin.US16_createdDateTextBoxforActions);
        Driver. waitAndSendText(admin.US16_createdDateTextBox,"07/01/2022");

        Driver.wait(5);

        ReusableMethods.getScreenshot("TestResultScreenShotsForUS16");

        Driver.waitAndClick(admin.US16_createdDateTextBoxforActions);

        Driver.waitAndClick(admin.US16_SaveButton_on_CreateRoom_Page);
        Driver.wait(1);
        ReusableMethods.getScreenshot("TestResultScreenShotsForUS16");

    }

}
