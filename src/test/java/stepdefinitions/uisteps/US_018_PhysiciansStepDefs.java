package stepdefinitions.uisteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.RegistrationPage;
import pages.US_018_PhysiciansPage;
import utilities.Driver;


public class US_018_PhysiciansStepDefs {

    US_018_PhysiciansPage physicians = new US_018_PhysiciansPage();
    HomePage homePage = new HomePage();
    RegistrationPage registration = new RegistrationPage();
    Select select;
    Faker faker = new Faker();

    @Given("user 18 clicks on physician")
    public void user_clicks_on_physician() {
        physicians.physician.click();
    }
    @When("user 18 clicks on Create a new Physician")
    public void user_clicks_on_create_a_new_physician() {
        physicians.createNewPhyscian.click();
    }
    @Then("user 18 enters valid SSN")
    public void user_enters_valid_ssn() {
        physicians.ssnbox.sendKeys("606-06-0606");
    }
    @Then("user 18 clicks on Use Search and Search User button")
    public void user_clicks_on_use_search_and_search_user_button() {
        physicians.userSearchCheckbox.click();
        physicians.searchUser.click();
    }
    @Then("user 18 validates User found with search SSN message appears on the screen")
    public void user_validates_user_found_with_search_ssn_message_appears_on_the_screen() {
        Driver.waitForVisibility(physicians.userFoundMessage,10);
        Assert.assertTrue(physicians.userFoundMessage.isDisplayed());
    }
    @Then("user 18 verifies physician information")
    public void user_verifies_physician_information() {
        Assert.assertTrue(physicians.firstnameTeam85.isDisplayed());
        Assert.assertTrue(physicians.lastnamePhysician.isDisplayed());
        Assert.assertTrue(physicians.specialityBox.isDisplayed());
    }
    @When("user enters non-existing SSN")
    public void user_enters_non_existing_ssn() {
        physicians.ssnbox.sendKeys("877-34-7734");
    }
    @Then("user verifies Not found message appeared on the screen")
    public void user_verifies_not_found_message_appeared_on_the_screen() {
        Driver.waitForVisibility(physicians.notFoundMessage, 10);
        Assert.assertTrue(physicians.notFoundMessage.isDisplayed());
    }
    @When("user enters SSN without dashes")
    public void user_enters_ssn_without_dashes() {
        physicians.ssnbox.sendKeys("606060606");
    }
    @When("user enters first name on SSN box")
    public void user_enters_first_name_on_ssn_box() {
        physicians.ssnbox.sendKeys("Team83");
    }
    @Then("user clicks on Specialty box and chooses Surgery")
    public void user_clicks_on_specialty_box_and_chooses_surgery() {
        select = new Select(physicians.specialityBox);
        select.selectByVisibleText("Surgery");
    }
    @Then("user enters valid date on date box, valid phone number, valid exam fee")
    public void user_enters_valid_date_on_date_box_valid_phone_number_valid_exam_fee() {
        physicians.birthDateBox.sendKeys("03121995");
        String phone = faker.numerify("###-###-####");
        physicians.phoneBox.sendKeys(phone);
        physicians.examfeeBox.sendKeys("500");
    }
    @Then("user clicks save button")
    public void user_clicks_save_button() {
        physicians.saveButton.submit();
    }
    @Then("user verifies A Physician is updated with identifier message appears on screen")
    public void userVerifiesAPhysicianIsUpdatedWithIdentifierMessageAppearsOnScreen() {
        Driver.waitForVisibility(physicians.physicianDeletedMessage, 10);
        Assert.assertTrue(physicians.physicianDeletedMessage.isDisplayed());
    }
    @And("user verifies that error appears in phone, date, and exam fee box")
    public void userVerifiesThatErrorAppearsInPhoneDateAndExamFeeBox() {
        Assert.assertTrue(physicians.birthDateError.isDisplayed());
        Assert.assertTrue(physicians.phoneError.isDisplayed());
        Assert.assertTrue(physicians.examFeeError.isDisplayed());
    }
    @When("user 18 enters valid 568 SSN")
    public void userEntersValidSSN() {
        physicians.ssnbox.sendKeys("777-03-0303");
    }
    @And("user sees updated exam fee")
    public void userShouldSeesUpdatedExamFee() {
        Assert.assertTrue(physicians.updatedExamFeeTeam83.isDisplayed());
    }
    @Given("user clicks edit button physician name Daqar Werr")
    public void userClicksEditButtonPhysicianNameDaqarWerr() {
        Driver.waitAndClick(physicians.editDaqarWerr, 5);
        //physicians.editDaqarWerr.click();
//        try {
//            for (int i = 1; i < 20; i++) {
//                String xpath = "//tbody//tr[" + i + "]//td[3]";
//                WebElement status = Driver.getDriver().findElement(By.xpath(xpath));
//                String xpathEdit = "//tbody//tr[" + i + "]//td[18]//a[@class='btn btn-primary btn-sm']";
//                Thread.sleep(2000);
//                if (status.getText().equals("Daqar")) {
//                    Driver.getDriver().findElement(By.xpath(xpathEdit)).click();
//                    Thread.sleep(2000);
//                    break;
//                }
//            }
//        } catch (Exception e){
//
//            System.out.println("There is physician name Team85!");
//        }
    }
    @When("user uploads a picture")
    public void userUploadsAPicture() {
        String filePath = "/Users/VG/Desktop/Views/Doctor-2.webp";
        physicians.uploadPicture.sendKeys(filePath);
    }
    @When("user enters physician Daqar Werr's SSN")
    public void userEntersPhysicianDaqarWerrSSSN() {
        physicians.ssnbox.sendKeys("789-45-6988");
    }
    @And("user validates that photo is uploaded and visible")
    public void userValidatesThatPhotoIsUploadedAndVisible() {
        Assert.assertTrue(physicians.pictureVerify.isDisplayed());
    }
    @Given("user verifies that profile picture is updated")
    public void userVerifiesThatProfilePictureIsUpdated() {
        Driver.waitForVisibility(physicians.pictureVerify, 4);
        Assert.assertTrue(physicians.pictureVerify.isDisplayed());
    }
    @Given("user locates physician name Team85 Physician and click on edit button")
    public void userLocatesPhysicianNameTeamPhysicianAndClickOnEditButton() {
        Driver.waitAndClick(physicians.firstNameButton, 5);
        Driver.waitAndClick(physicians.firstNameButton, 5);
        Driver.waitForVisibility(physicians.editTeam85, 4);
        Driver.clickWithJS(physicians.editTeam85);
        //physicians.editTom.click();
//        physicians.page14.click();
//        physicians.editTeam85.click();
//        try {
//            for (int i = 1; i < 20; i++) {
//                String xpath = "//tbody//tr[" + i + "]//td[3]";
//                WebElement status = Driver.getDriver().findElement(By.xpath(xpath));
//                String xpathEdit = "//tbody//tr[" + i + "]//td[18]//a[@class='btn btn-primary btn-sm']";
//                Thread.sleep(2000);
//                if (status.getText().equals("Team85")) {
//                    Driver.getDriver().findElement(By.xpath(xpathEdit)).click();
//                    Thread.sleep(2000);
//                    break;
//                }
//            }
//        } catch (Exception e){
//
//            System.out.println("There is no physician name Team85!");
//        }
    }
    @When("user enter 0 in exam fee box")
    public void userEnterInExamFeeBox() {
        Driver.waitForClickablility(physicians.examfeeBox, 3);
        physicians.examfeeBox.sendKeys("0");
    }
    @When("user enter negative number in exam fee box")
    public void userEnterNegativeNumberInExamFeeBox() {
        Driver.waitForClickablility(physicians.examfeeBox, 4);
        physicians.examfeeBox.sendKeys("-123");
    }
    @And("user verifies This field should be at least 0 message appears under exam fee")
    public void userVerifiesThisFieldShouldBeAtLeastMessageAppearsUnderExamFee() {
        Assert.assertTrue(physicians.examFeeError.isDisplayed());
    }
    @When("user enter positive decimal number in exam fee box")
    public void userEnterPositiveDecimalNumberInExamFeeBox() {
        Driver.waitForClickablility(physicians.examfeeBox, 4);
        physicians.examfeeBox.sendKeys("365.43");
    }
    @When("user enter 1000000000 in exam fee box")
    public void userEnter100000000InExamFeeBox() {
        Driver.waitForClickablility(physicians.examfeeBox, 4);
        physicians.examfeeBox.sendKeys("1000000000");
    }
    @When("user enters letter in exam fee box")
    public void userEntersLetterInExamFeeBox() {
        Driver.waitForClickablility(physicians.examfeeBox, 4);
        physicians.examfeeBox.clear();
        physicians.examfeeBox.sendKeys("asfsdg");
    }
    @When("user updates phone number, address, description of physician")
    public void userUpdatesPhoneNumberAddressDescriptionOfPhysician() {
        Driver.waitForClickablility(physicians.phoneBox, 4);
        physicians.phoneBox.clear();
        physicians.phoneBox.sendKeys("555-348-3333");
        physicians.addressBox.clear();
        physicians.addressBox.sendKeys("100 Union Street");
        physicians.descriptionBox.clear();
        physicians.descriptionBox.sendKeys("Best doctor in USA");
    }

    @And("user verifies that all the updates are shown on the screen")
    public void userVerifiesThatAllTheUpdatesAreShownOnTheScreen() {
        Driver.waitForVisibility(physicians.phoneNumberPhysician, 4);
        Assert.assertTrue(physicians.phoneNumberPhysician.isDisplayed());
        Assert.assertTrue(physicians.addressPhysician.isDisplayed());
        Assert.assertTrue(physicians.descriptionPhysician.isDisplayed());
    }
    @Given("create new physician on registration page")
    public void create_new_physician_on_registration_page() {
        homePage.loginDropDown.click();
        homePage.loginRegisterButton.click();
        registration.ssnTextBox.sendKeys("345-91-2840");
        registration.firstnameTextBox.sendKeys("Team85");
        registration.lastnameTextBox.sendKeys("DeleteUser");
        registration.usernameTextBox.sendKeys("team85deleteuser");
        registration.emailTextbox.sendKeys(faker.internet().emailAddress());
        registration.firstPasswordTextBox.sendKeys("deleteuser");
        registration.confirmPasswordTextBox.sendKeys("deleteuser");
        registration.registerButton.submit();
    }
    @When("sign in as admin")
    public void sign_in_as_admin() {
        Driver.waitForVisibility(homePage.loginDropDown, 5);
        homePage.loginDropDown.click();
        homePage.loginSignInButton.click();
        homePage.username.sendKeys("vusalgasimov");
        homePage.password.sendKeys("vusalgasimov");
        homePage.signInbutton.click();
    }
    @Then("go to administration and click user management")
    public void go_to_administration_and_click_user_management() {
        Driver.waitForVisibility(physicians.administrationButton, 4);
        physicians.administrationButton.click();
        physicians.userManagementButton.click();
    }
    @Then("go to last page and click edit the newly created physician")
    public void go_to_last_page_and_click_edit_the_newly_created_physician() {
        Driver.waitForVisibility(physicians.idButton, 5);
        Driver.clickWithJS(physicians.idButton);
        //physicians.lastPage.click();
        //Driver.waitForVisibility(physicians.editDeleteUser,5);
        //Driver.clickWithJS(physicians.editDeleteUser);
        Driver.waitAndClick(physicians.editDeleteUser, 5);
    }
    @Then("activate the user, assign physician role to user, and click save")
    public void activate_the_user_assign_physician_role_to_user_and_click_save() throws InterruptedException {
        Thread.sleep(4);
        Driver.waitForVisibility(physicians.activateButton,5);
        physicians.activateButton.click();
        Thread.sleep(4);
        select = new Select(physicians.profilesList);
        select.selectByVisibleText("ROLE_PHYSICIAN");
        Thread.sleep(4);
        Driver.clickWithJS(physicians.saveAdminPage);
    }
    @Then("user locates the DeleteUser physician and clicks on delete button")
    public void user_clicks_on_delete_button() {
        Driver.waitForVisibility(physicians.createdDate, 5);
        physicians.createdDate.click();
        Driver.waitForVisibility(physicians.deleteDeleteUser,10);
        physicians.deleteDeleteUser.click();
    }
    @Then("user confirms delete")
    public void user_confirms_delete() {
        physicians.confirmDelete.click();
    }
    @Then("user clicks on create new physician and search by SSN")
    public void user_clicks_on_create_new_physician_and_search_by_ssn() {
        Driver.waitAndClick(physicians.createNewPhyscian, 5);
        physicians.ssnbox.sendKeys("345-91-2840");
        physicians.userSearchCheckbox.click();
        physicians.searchUser.click();
    }
    @Then("user enters dob, phone number, exam fee, and clicks on save")
    public void user_enters_dob_phone_number_exam_fee_and_clicks_on_save() {
        Driver.waitForVisibility(physicians.birthDateBox, 5);
        physicians.birthDateBox.sendKeys("03/12/1995");
        physicians.phoneBox.sendKeys("212-470-7600");
        physicians.examfeeBox.sendKeys("500");
        physicians.saveButton.submit();
    }
}
