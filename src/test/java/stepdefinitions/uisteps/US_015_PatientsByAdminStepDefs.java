package stepdefinitions.uisteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_015_PatientsByAdminStepDefs {

    HomePage homePage = new HomePage();
    US_015_PatientsPage patients = new US_015_PatientsPage();
    Select select;
    Faker faker = new Faker();

    @Given("user is on the home page US_015")
    public void userIsOnTheHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
    }
    @When("user clicks on the user icon US_015")
    public void userClicksOnTheUserIcon() {
        homePage.loginDropDown.click();
    }
    @And("user clicks on the sign in link US_015")
    public void userClicksOnTheSignInLink() {
        homePage.loginSignInButton.click();
    }
    @And("user enters valid username and password US_015")
    public void userEntersValidUsernameAndPassword() {
        //wrire down your own credentials(admin or staff or physician)
        homePage.username.sendKeys("vusalgasimov");
        homePage.password.sendKeys("vusalgasimov");
    }
    @Then("user clicks on sign in button US_015")
    public void userClicksOnSignInButton() {
        homePage.signInbutton.click();
    }
    @Given("user clicks on Items&Titles button US_015")
    public void userClicksOnItemsTitlesButton() {
        Driver.waitForVisibility(patients.itemsAndTitlesButton, 5);
        Driver.clickWithJS(patients.itemsAndTitlesButton);
    }
    @Then("user clicks on Patients button US_015")
    public void userClicksOnPatientsButton() {
//        Driver.waitForVisibility(us015_Patients.patientButton, 3).click();
        patients.patientButton.click();
    }
    @Given("user clicks on create new patient button US_015")
    public void userClicksOnCreateNewPatientButton() {
        ReusableMethods.waitForClickablility(patients.createNewPatientButton, 15);
        patients.createNewPatientButton.click();
    }
    @And("user enters valid patient credential and clicks save button US_015")
    public void userEntersValidPatientCredentialAndClicksSaveButton() throws InterruptedException {
        patients.firstNameBox.sendKeys("Team83_"+ faker.name().firstName());
        patients.lastNameBox.sendKeys(faker.name().lastName());
        patients.birthDateBox.sendKeys("00"+faker.date().birthday().getTime());
        patients.emailBox.sendKeys("Team83_"+faker.internet().emailAddress());
        patients.phoneBox.sendKeys(faker.number().digits(10));
        Select select = new Select(patients.genderBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        select = new Select(patients.bloodGroupBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        patients.addressBox.sendKeys(faker.address().streetAddress());
        patients.descriptionBox.sendKeys(faker.lorem().word());
        select = new Select(patients.userBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        select = new Select(patients.countryBox);
        select.selectByVisibleText("USA");
        select = new Select(patients.stateBox);
        ReusableMethods.waitForVisibility(patients.stateBox, 5);
        select.selectByVisibleText("California");
        patients.saveButton.submit();

    }

    @Then("user should see patient created message US_015")
    public void userShouldSeePatientCreatedMessage() {

        Assert.assertTrue(ReusableMethods.waitForVisibility(patients.successMessage, 5).isDisplayed());
    }
    @Then("user sees all patient information after sorting US_015")
    public void user_sees_all_patient_information_after_sorting() throws InterruptedException {
        patients.firstNameButton.click();
        patients.lastNameButton.click();
        Thread.sleep(3000);
        Assert.assertTrue(patients.patientSsn.isDisplayed());
        Assert.assertTrue(patients.patientFirstName.isDisplayed());
        Assert.assertTrue(patients.patientLastName.isDisplayed());
        Assert.assertTrue(patients.patientBirthDate.isDisplayed());
        Assert.assertTrue(patients.patientPhone.isDisplayed());
        Assert.assertTrue(patients.patientEmail.isDisplayed());
        Assert.assertTrue(patients.patientGender.isDisplayed());
        Assert.assertTrue(patients.patientBloodGroup.isDisplayed());
        Assert.assertTrue(patients.patientAddress.isDisplayed());
        Assert.assertTrue(patients.patientDescription.isDisplayed());
        Assert.assertTrue(patients.patientCreatedDate.isDisplayed());
        Assert.assertTrue(patients.patientUser.isDisplayed());
        Assert.assertTrue(patients.patientCountry.isDisplayed());
        Assert.assertTrue(patients.patientStateCity.isDisplayed());
    }
    @Then("user clicks on edit button US_015")
    public void user_clicks_on_edit_button() {
        Driver.waitAndClick(patients.firstNameButton, 5);
        Driver.waitAndClick(patients.lastNameButton, 5);
        Driver.waitAndClick(patients.editPatient, 1);
    }
    @Then("user sees all patient information US_015")
    public void user_sees_all_patient_information() {
//        Assert.assertTrue(editPatient.id.isDisplayed());
        Assert.assertTrue(patients.firstName.isDisplayed());
        Assert.assertTrue(patients.lastName.isDisplayed());
        Assert.assertTrue(patients.birthDate.isDisplayed());
        Assert.assertTrue(patients.phone.isDisplayed());
        Assert.assertTrue(patients.email.isDisplayed());
        Assert.assertTrue(patients.gender.isDisplayed());
        Assert.assertTrue(patients.bloodGroup.isDisplayed());
        Assert.assertTrue(patients.address.isDisplayed());
        Assert.assertTrue(patients.description.isDisplayed());
        Assert.assertTrue(patients.user.isDisplayed());
        Assert.assertTrue(patients.country.isDisplayed());
//        Assert.assertTrue(editPatient.state.isDisplayed());
    }
    @Then("user clicks on user and assigns patient to the doctor US_015")
    public void user_clicks_on_user_and_assigns_patient_to_the_doctor() {
        select = new Select(patients.user);
        select.selectByValue("3309");
    }
    @Then("user clicks on save button US_015")
    public void user_clicks_on_save_button() {
        patients.saveButton.submit();
    }
    @Then("user sees A Patient is updated with identifier message US_015")
    public void user_sees_a_patient_is_updated_with_identifier_message() {
        Driver.waitForVisibility(patients.patientUpdatedMessage,10);
        Assert.assertTrue(patients.patientUpdatedMessage.isDisplayed());
    }
    @Then("user sees updated patient information US_015")
    public void user_sees_updated_patient_information() {
        Assert.assertTrue(patients.ahmetDoctor.isDisplayed());
    }
    @Then("user enters valid information and select country as USA US_015")
    public void user_enters_valid_information_and_select_country_as_usa() {
        patients.firstNameBox.sendKeys("Team83_"+ faker.name().firstName());
        patients.lastNameBox.sendKeys(faker.name().lastName());
        patients.birthDateBox.sendKeys("00"+faker.date().birthday().getTime());
        patients.emailBox.sendKeys("Team83_"+faker.internet().emailAddress());
        patients.phoneBox.sendKeys(faker.number().digits(10));
        Select select = new Select(patients.genderBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        select = new Select(patients.bloodGroupBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        patients.addressBox.sendKeys(faker.address().streetAddress());
        patients.descriptionBox.sendKeys(faker.lorem().word());
        select = new Select(patients.userBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        select = new Select(patients.countryBox);
        select.selectByVisibleText("USA");
    }
    @Then("user select California and clicks save US_015")
    public void user_select_california_and_clicks_save() {
        select = new Select(patients.stateBox);
        ReusableMethods.waitForVisibility(patients.stateBox, 5);
        select.selectByVisibleText("California");
        patients.saveButton.submit();
    }
    @Then("user clicks Created Date button to see last added patient US_015")
    public void user_clicks_created_date_button_to_see_last_added_patient() {
        patients.createdDate.click();
    }
    @Then("user verifies state is California US_015")
    public void user_verifies_state_is_california() {
        Assert.assertTrue(patients.californiaState.isDisplayed());
    }
    @Then("user does not select any state option and clicks save button US_015")
    public void user_does_not_select_any_state_option_and_clicks_save_button() {
        patients.saveButton.submit();
    }
    @Then("user enters valid information and select country as Morocco US_015")
    public void user_enters_valid_information_and_select_country_as_morocco() {
        patients.firstNameBox.sendKeys("Team83_"+ faker.name().firstName());
        patients.lastNameBox.sendKeys(faker.name().lastName());
        patients.birthDateBox.sendKeys("00"+faker.date().birthday().getTime());
        patients.emailBox.sendKeys("Team83_"+faker.internet().emailAddress());
        patients.phoneBox.sendKeys(faker.number().digits(10));
        Select select = new Select(patients.genderBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        select = new Select(patients.bloodGroupBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        patients.addressBox.sendKeys(faker.address().streetAddress());
        patients.descriptionBox.sendKeys(faker.lorem().word());
        select = new Select(patients.userBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        select = new Select(patients.countryBox);
        select.selectByVisibleText("Morocco");
    }
    @When("user sorts the patients and clicks on delete button on first patient US_015")
    public void user_sorts_the_patients_and_clicks_on_delete_button_on_first_patient() {
        patients.createdDateButton.click();
        patients.deletePatient.click();
    }
    @Then("user confirms delete US_015")
    public void user_confirms_delete() {
        patients.confirmDelete.click();
    }
    @Then("user confirms that patients information is deleted US_015")
    public void user_confirms_that_patients_information_is_deleted() {
        Driver.waitAndClick(patients.createdDateButton, 5);
//        Assert.assertFalse(us015_Patients.deletedUser.isDisplayed());
    }
    @Then("close the application US_015")
    public void closeTheApplication() {
        Driver.closeDriver();
    }
}
