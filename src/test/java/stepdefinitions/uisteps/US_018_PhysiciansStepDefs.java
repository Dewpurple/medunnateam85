package stepdefinitions.uisteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.US_018_PhysiciansPage;
import utilities.Driver;

public class US_018_PhysiciansStepDefs {

    US_018_PhysiciansPage physicians = new US_018_PhysiciansPage();
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
        Driver.waitForVisibility(physicians.physicianUpdatedMessage, 10);
        Assert.assertTrue(physicians.physicianUpdatedMessage.isDisplayed());
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
        physicians.lastPage.click();
        physicians.page14.click();
        try {
            for (int i = 1; i < 20; i++) {
                String xpath = "//tbody//tr[" + i + "]//td[3]";
                WebElement status = Driver.getDriver().findElement(By.xpath(xpath));
                String xpathEdit = "//tbody//tr[" + i + "]//td[18]//a[@class='btn btn-primary btn-sm']";
                Thread.sleep(2000);
                if (status.getText().equals("Team85")) {
                    Driver.getDriver().findElement(By.xpath(xpathEdit)).click();
                    Thread.sleep(2000);
                    break;
                }
            }
        } catch (Exception e){

            System.out.println("There is physician name Team85!");
        }
    }
    @When("user enter 0 in exam fee box")
    public void userEnterInExamFeeBox() {
        physicians.examfeeBox.sendKeys("0");
    }
    @When("user enter negative number in exam fee box")
    public void userEnterNegativeNumberInExamFeeBox() {
        physicians.examfeeBox.sendKeys("-123");
    }
    @And("user verifies This field should be at least 0 message appears under exam fee")
    public void userVerifiesThisFieldShouldBeAtLeastMessageAppearsUnderExamFee() {
        Assert.assertTrue(physicians.examFeeError.isDisplayed());
    }
    @When("user enter positive decimal number in exam fee box")
    public void userEnterPositiveDecimalNumberInExamFeeBox() {
        physicians.examfeeBox.sendKeys("365.43");
    }
    @When("user enter 1000000000 in exam fee box")
    public void userEnter100000000InExamFeeBox() {
        physicians.examfeeBox.sendKeys("1000000000");
    }
}
