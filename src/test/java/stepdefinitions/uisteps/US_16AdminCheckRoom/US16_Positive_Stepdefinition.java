package stepdefinitions.uisteps.US_16AdminCheckRoom;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
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

public class US16_Positive_Stepdefinition {

    SignInPage signInPage = new SignInPage();
    US_16_AdminRoomPages admin = new US_16_AdminRoomPages();
    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();
    String roomNumber;
    int price;
    String createdD;


    @Given("US16-1 go to medunna URL and admin click sign in and register and verify TC01")
    public void usGoToMedunnaURLAndAdminClickSignInAndRegisterAndVerifyTCBackround() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
        Driver.wait(1);
        Driver.waitAndClick(signInPage.accountMenu);
        Driver.waitAndClick(signInPage.signInMenuButton);
        Driver.wait(3);


    }

    @Then("US16-2 click on password box and write to username and password {string} and {string} TC01")
    public void usClickOnPasswordBoxAndWriteToUsernameAndPasswordAndTCBackround(String userName, String pswrd) {
        Driver.waitAndSendText(admin.US16_UsernameTextbox, userName);
        Driver.waitAndSendText(admin.US16_PasswordTextbox, pswrd);
        Driver.waitAndClick(admin.US16_LastSignInButton);
    }

    @And("US16-3 click to Items&Titles and click Rooms TC01")
    public void usClickToItemsTitlesAndClickRoomsTCBackround() {
        Driver.waitAndClick(admin.US16_itemsTitles);
        Driver.waitAndClick(admin.US16_roomButton);

    }

    @And("US16-4 verify admin on the Rooms page click on create a new Room and Admin provides a Room Number {string} TC01")
    public void usVerifyAdminOnTheRoomsPageAndAdminProvidesARoomNumberTC(String roomNo) {
        assertTrue(admin.US16_VerifyRoomsPage.isDisplayed());

        Driver.waitAndClick(admin.US16_createANewRoomButton);
        assertTrue(admin.US16_VerifyCreateANewRoomButton.isDisplayed());
        Driver.waitAndClick(admin.US16_roomNumberBox);
        Driver.wait(3);
        roomNumber = String.valueOf(faker.number().numberBetween(900900, 900999));
        Driver.waitAndSendText(admin.US16_roomNumberBox, roomNumber);

        Assert.assertTrue(isValidRoomNumber1(roomNumber));

    }

    public static boolean isValidRoomNumber1(String roomNumber) {
        if (roomNumber.matches("[0-9]+"))
            return true;
        else
            return false;
    }


    @Then("US16-5 Admin click status TC01")
    public void usAdminClickStatusTC() {
        Driver.waitAndClick(admin.US16_clickStatusBox);
        Driver.wait(3);

        assertTrue(admin.US16_statusCheckBox.isSelected());
        Driver.wait(3);
    }

    @Then("US16-6 Admin provides a Price {string} TC01")
    public void us16_admin_provides_a_price_tc0(String prc) {
        Driver.waitAndClick(admin.US16_priceTextBox);
        Driver.wait(3);

        price = faker.number().numberBetween(109, 199);
        Driver.waitAndSendText(admin.US16_priceTextBox,  String.valueOf(price));
    }

    @Then("US16-7 Admin skip description and sets date as {string} TC01")
    public void us16_admin_skip_description_and_sets_date_as_tc02(String string) {
        Driver.waitAndSendText(admin.US16_createdDateTextBox, string);
    }

    @Then("US16-8 Admin clicks on the Save button and verify toasted information on top of the page TC01")
    public void us16_admin_clicks_on_the_save_button_tc02() {
        Driver.waitAndClick(admin.US16_SaveButton_on_CreateRoom_Page);
        Driver.wait(3);
        assertTrue(admin.US16_toasted_Saved_message_Room.isDisplayed());
    }

    @Then("US16-9 Admin click Created Date and room numbers on the page TC01")
    public void us16_admin_provides_a_room_number() {
        Driver.waitAndClick(admin.US16_CreatedDateOnRoomspage);
        Driver.waitForVisibility(admin.US16_VerifyRoomsPage, 1);
        String lastRow =
                admin.US16_allRows.get(admin.US16_allRows.size() - 1).getText();
        System.out.println("lastRow: " + lastRow);
        Driver.wait(3);

        Driver.closeDriver();

    }


    @Given("US16-1 go to medunna URL and admin click sign in and register and verify TC02")
    public void us16_go_to_medunna_url_and_admin_click_sign_in_and_register_and_verify_tc02() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
        Driver.wait(1);
        Driver.waitAndClick(signInPage.accountMenu);
        Driver.waitAndClick(signInPage.signInMenuButton);
        Driver.wait(3);
    }

    @Then("US16-2 click on password box and write to username and password {string} and {string} TC02")
    public void us16_click_on_password_box_and_write_to_username_and_password_and_tc02(String userNameForDelete, String pswrdforDelete) {
        Driver.waitAndSendText(admin.US16_UsernameTextbox, userNameForDelete);
        Driver.waitAndSendText(admin.US16_PasswordTextbox, pswrdforDelete);
        Driver.waitAndClick(admin.US16_LastSignInButton);
    }

    @Then("US16-3 click to Items&Titles and click Rooms TC02")
    public void us16_click_to_items_titles_and_click_rooms_tc02() {
        Driver.waitAndClick(admin.US16_itemsTitles);
        Driver.waitAndClick(admin.US16_roomButton);
    }

    @Then("US16-4 verify admin on the Rooms page and Admin provides a Room Number {string} TC02")
    public void us16_verify_admin_on_the_rooms_page_and_admin_provides_a_room_number_tc02(String roomNo) {
        Assert.assertTrue(admin.US16_VerifyRoomsPage.isDisplayed());
        Driver.waitAndClick(admin.US16_createANewRoomButton);
        Assert.assertTrue(admin.US16_VerifyCreateANewRoomButton.isDisplayed());
        Driver.waitAndClick(admin.US16_roomNumberBox);
        Driver.wait(3);
        roomNumber = String.valueOf(faker.number().numberBetween(900900, 900999));
        Driver.waitAndSendText(admin.US16_roomNumberBox, roomNumber);

    }

    @Then("US16-5 Admin click status TC02")
    public void us16_admin_click_status_tc02() {
        Driver.waitAndClick(admin.US16_clickStatusBox);
        Driver.wait(3);
    }

    @Then("US16-6 Admin provides a Price {string} TC02")
    public void us16_admin_provides_a_price_tc02(String prcfordelete) {
        Driver.waitAndClick(admin.US16_priceTextBox);
        Driver.wait(3);
        price = faker.number().numberBetween(1, 10);
        Driver.waitAndSendText(admin.US16_priceTextBox, prcfordelete);
    }

    @Then("US16-7 Admin skip description and sets date as {string} TC02")
    public void us16_admin_skip_description_and_sets_date_as_tc0(String string) {
        Driver.waitAndSendText(admin.US16_createdDateTextBox, string);
    }

    @Then("US16-8 Admin clicks on the Save button and verify toasted information on top of the page TC02")
    public void us16_admin_clicks_on_the_save_button_and_verify_toasted_information_on_top_of_the_page_tc02() {
        Driver.waitAndClick(admin.US16_SaveButton_on_CreateRoom_Page);
        Driver.wait(3);
        Assert.assertTrue(admin.US16_toasted_Saved_message_Room.isDisplayed());
    }

    @Then("US16-9 Admin click Created Date and click delete button TC02")
    public void us16_admin_click_created_date_and_click_delete_button_tc02() {
        Driver.waitAndClick(admin.US16_CreatedDateOnRoomspage);
        Driver.waitForVisibility(admin.US16_VerifyRoomsPage, 1);
        Driver.wait(3);
        Driver.waitForVisibility(admin.US16_deleteWebElements, 1);
        Driver.waitAndClick(admin.US16_deleteWebElements);

        Driver.wait(2);

        Driver.clickWithJS(admin.US16_confirmJS_2_deleteWebElements);

        Driver.closeDriver();

    }

    @Given("US16-1 go to medunna URL and admin click sign in and register and verify TC03")
    public void us16_go_to_medunna_url_and_admin_click_sign_in_and_register_and_verify_tc03() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
        Driver.wait(1);
        Driver.waitAndClick(signInPage.accountMenu);
        Driver.waitAndClick(signInPage.signInMenuButton);
        Driver.wait(3);

    }
    @Then("US16-2 click on password box and write to username and password {string} and {string} TC03")
    public void us16_click_on_password_box_and_write_to_username_and_password_and_tc03(String userName, String pswrd) {
        Driver.waitAndSendText(admin.US16_UsernameTextbox, userName);
        Driver.waitAndSendText(admin.US16_PasswordTextbox, pswrd);
        Driver.waitAndClick(admin.US16_LastSignInButton);

    }

    @Then("US16-3 click to Items&Titles and click Rooms TC03")
    public void us16_click_to_items_titles_and_click_rooms_tc03() {
        Driver.waitAndClick(admin.US16_itemsTitles);
        Driver.waitAndClick(admin.US16_roomButton);

        Driver.wait(3);
        Assert.assertTrue(admin.US16_VerifyRoomsPage.isDisplayed());

    }

    @And("US16-4 Verify create or edit a room page and admin provides a room number in the room number box  {string} TC03")
    public void usVerifyCreateOrEditARoomPageAndAdminProvidesARoomNumberInTheRoomNumberBoxTC(String rno) {

        Driver.waitAndClick(admin.US16_createANewRoomButton);
        Driver.wait(3);
        Assert.assertTrue(admin.US16_Create_or_edit_RoomVerify.isDisplayed());
        Driver.waitForVisibility(admin.US16_roomNumberBox, 1);

        Driver.waitAndClick(admin.US16_roomNumberBox);
        Driver.wait(3);

        roomNumber = String.valueOf(faker.number().numberBetween(919099, 939099));
        Driver.waitAndSendText(admin.US16_roomNumberBox, roomNumber);
        Assert.assertTrue(isValidRoomNumber(roomNumber));

    }

    public static boolean isValidRoomNumber(String str) {
        if (str.matches("[0-9]+"))
            return true;
        else
            return false;
    }
  @Then("US16-5 Admin verify the room types can be selected {string},{string},{string},{string},{string} TC03")
    public void us16_admin_create_a_new_room_and_verify_the_room_types_can_be_selected_daycare_tc03(String Twin, String Dlx, String PDlx, String Suite, String DyCare) {
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

    @Then("US16-6 Admin select Room Types box TC03")
    public void us16_admin_select_room_types_box_tc03() {

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

    @And("US16-7 Admin click status TC03 and verify it")
    public void usAdminClickStatusTCAndVerifyIt() {

        Driver.waitAndClick(admin.US16_clickStatusBox);
        Driver.wait(3);

        assertTrue(admin.US16_clickStatusBox.isDisplayed());
        assertTrue(admin.US16_clickStatusBox.isSelected());

    }

    @And("US16-8 Admin provide price information in the price box TC03 and verify it")
    public void usAdminProvidePriceInformationInThePriceBoxTCAndVerifyIt() throws IOException {

        Driver.waitAndClick(admin.US16_priceTextBox);
        Driver.wait(1);
        Driver.waitAndSendText(admin.US16_priceTextBox, "100");
        assertTrue(admin.US16_priceTextBox.isEnabled());

        ReusableMethods.getScreenshot("TestResultScreenShotForUS16PositiveScenario");
    }

    @And("US16-9 Admin provide description information in the Description box TC03 and verify it")
    public void andUSAdminProvideDescriptionInformationInTheDescriptionBoxTCAndVerifyIt() throws IOException {
        Driver.waitAndSendText(admin.US16_description,"Motorized Patient Beds");
        ReusableMethods.getScreenshot("TestResultScreenShotForUS16PositiveScenario");

    }


    @And("US16-10 Admin select date and save reservation TC03")
    public void usAdminSelectDateAndSaveReservationTC() throws IOException {

        Driver.waitAndSendText(admin.US16_Select_DateOnRoomspage,"08/20/2022");
        Driver.wait(3);

        ReusableMethods.getScreenshot("TestResultScreenShotForUS16PositiveScenario");
        Driver.waitAndClick(admin.US16_SaveButton_on_CreateRoom_Page);
        Driver.wait(3);
        Assert.assertTrue(admin.US16_toasted_Saved_message_Room.isDisplayed());

        ReusableMethods.getScreenshot("TestResultScreenShotForUS16PositiveScenario");

        Driver.closeDriver();
    }


    @Given("US16-1 go to medunna URL and admin click sign in and register and verify for Edit test")
    public void us16_go_to_medunna_url_and_admin_click_sign_in_and_register_and_verify_for_edit_test() throws IOException {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
        Driver.wait(1);
        Driver.waitAndClick(signInPage.accountMenu);
        Driver.waitAndClick(signInPage.signInMenuButton);
        Driver.wait(3);
        ReusableMethods.getScreenshot("TestResultScreenShotForUs16Edit");

    }
    @Then("US16-2 click on password box and write to username and password {string} and {string} for Edit test")
    public void us16_click_on_password_box_and_write_to_username_and_password_and_for_edit_test(String userName, String pswrd) throws IOException {
        Driver.waitAndSendText(admin.US16_UsernameTextbox, userName);
        Driver.waitAndSendText(admin.US16_PasswordTextbox, pswrd);
        Driver.waitAndClick(admin.US16_LastSignInButton);
        ReusableMethods.getScreenshot("TestResultScreenShotForUs16Edit");

    }
    @Then("US16-3 click to Items&Titles and click Rooms for Edit test")
    public void us16_click_to_items_titles_and_click_rooms_for_edit_test() throws IOException {
        Driver.waitAndClick(admin.US16_itemsTitles);
        Driver.waitAndClick(admin.US16_roomButton);
        ReusableMethods.getScreenshot("TestResultScreenShotForUs16Edit");

    }
    @Then("US16-4 verify admin on the Rooms page and Admin provides a Room Number {string} for Edit test")
    public void us16_verify_admin_on_the_rooms_page_and_admin_provides_a_room_number_for_edit_test(String roomNo) throws IOException {
        assertTrue(admin.US16_VerifyRoomsPage.isDisplayed());

        Driver.waitAndClick(admin.US16_createANewRoomButton);
        assertTrue(admin.US16_VerifyCreateANewRoomButton.isDisplayed());
        Driver.waitAndClick(admin.US16_roomNumberBox);
        Driver.wait(3);
        roomNumber = String.valueOf(faker.number().numberBetween(9939099, 9969999));
        Driver.waitAndSendText(admin.US16_roomNumberBox, roomNumber);


    }
    @Then("US16-5 Admin click status for Edit test")
    public void us16_admin_click_status_for_edit_test() throws IOException {
        Driver.waitAndClick(admin.US16_clickStatusBox);
        Driver.wait(3);

        assertTrue(admin.US16_statusCheckBox.isSelected());
        Driver.wait(3);



    }
    @Then("US16-6 Admin provides a Price {string} for Edit test")
    public void us16_admin_provides_a_price_for_edit_test(String string) throws IOException {
        Driver.waitAndClick(admin.US16_priceTextBox);
        Driver.wait(3);
        Driver.waitAndSendText(admin.US16_priceTextBox,"100");

        ReusableMethods.getScreenshot("TestResultScreenShotForUs16Edit");
    }
    @Then("US16-7 Admin skip description and sets date as {string} for Edit test")
    public void us16_admin_skip_description_and_sets_date_as_for_edit_test(String date) {
        Driver.waitAndSendText(admin.US16_createdDateTextBox, date);

    }
    @Then("US16-8 Admin clicks on the Save button and verify toasted information on top of the page for Edit test")
    public void us16_admin_clicks_on_the_save_button_and_verify_toasted_information_on_top_of_the_page_for_edit_test() throws IOException {
        Driver.waitAndClick(admin.US16_SaveButton_on_CreateRoom_Page);
        Driver.wait(3);

        ReusableMethods.getScreenshot("TestResultScreenShotForUs16Edit");
        assertTrue(admin.US16_toasted_Saved_message_Room.isDisplayed());
        Driver.wait(3);
        ReusableMethods.getScreenshot("TestResultScreenShotForUs16Edit");
    }
    @Then("US16-9 Admin click Created Date and click edit button for Edit test")
    public void us16_admin_click_created_date_and_click_edit_button_for_edit_test() throws IOException {
        Driver.waitAndClick(admin.US16_CreatedDateOnRoomspage);
        Driver.waitForVisibility(admin.US16_VerifyRoomsPage, 1);
        Driver.wait(3);
        ReusableMethods.getScreenshot("TestResultScreenShotForUs16Edit");
        Driver.waitAndClick(admin.US16_Edit);

        String expdata= "Create or edit a Room";
        Assert.assertTrue(admin.US16_Create_or_edit_RoomVerify.isEnabled());


    }

    @Then("US16-10 Admin change the old room number for edit test {string}")
    public void us16_admin_change_the_old_room_number_for_edit_test(String roomNo2) throws IOException {

        Driver.waitAndClick(admin.US16_Create_or_edit_Room_page_RoomNumber);
        Driver.wait(2);

        ReusableMethods.getScreenshot("TestResultScreenShotForUs16Edit");
        admin.US16_Create_or_edit_Room_page_RoomNumber.clear();

        Driver.wait(3);
        ReusableMethods.getScreenshot("TestResultScreenShotForUs16Edit");

        Driver.wait(3);
        roomNumber = String.valueOf(faker.number().numberBetween(6099000, 6099999));
        Driver.waitAndSendText(admin.US16_roomNumberBox, roomNumber);

        Driver.wait(3);
        Assert.assertTrue(isValidRoomNumber2(roomNumber));
  }


    public static boolean isValidRoomNumber2(String str) {
        if (str.matches("[0-9]+"))
            return true;
        else
            return false;
   }
    @And("US16-11 Admin save the reservation with a new room number for edit test")
    public void usAdminSaveTheReservationWithANewRoomNumberForEditTest() throws IOException {
        Driver.wait(3);
        ReusableMethods.getScreenshot("TestResultScreenShotForUs16Edit");

        Driver.wait(3);
        Driver.waitAndClick(admin.US16_SaveButton_on_CreateRoom_Page);

        Driver.wait(3);
        Assert.assertTrue(admin.US16_toasted_Saved_message_Room.isDisplayed());

        Driver.wait(3);
        ReusableMethods.getScreenshot("TestResultScreenShotForUs16Edit");

        Driver.wait(3);
        ReusableMethods.getScreenshot("TestResultScreenShotForUs16Edit");
        Driver.closeDriver();
    }

}
