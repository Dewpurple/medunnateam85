package stepdefinitions.uisteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.US002_uipages.AdminHomePage;
import pages.US002_uipages.HomePage002;
import pages.US002_uipages.US_002_RegistrationPage;

import pojos.us002pojo.US_002_RegistrantPojo;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;


//import static utilities.US_002_TXTWriter.saveUIRegistrantData;




public class US_002_ValidationUsernameEmailStepDefs {

    HomePage homePage= new HomePage();
    US_002_RegistrationPage registerPage= new US_002_RegistrationPage();
    US_002_RegistrantPojo registrant= new US_002_RegistrantPojo(); //Pojo class
    Faker faker= new Faker();
    AdminHomePage adminHomePage= new AdminHomePage();
    HomePage002 homePage002 = new HomePage002();

    @Given("user navigates to url US002")
    public void user_navigates_to_url_US002() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
        try{
            adminHomePage.adminAdminLast.click();
            adminHomePage.signOut.click();
        }catch(Exception e){

        }
    }
    @When("user clicks to icon on top right corner US002")
    public void user_clicks_to_icon_on_top_right_corner_US002() {
        homePage002.icon.click();

    }
    @When("user clicks on Register button US002")
    public void user_clicks_on_register_button_US002() {
        homePage002.registerButton.click();
    }
    @Then("user verifies registration page US002")
    public void user_verifies_registration_page_US002() {
        Assert.assertTrue(registerPage.RegistrationTitle.isDisplayed());
    }
    @When("user enters a valid SSN number US002")
    public void user_enters_a_valid_ssn_number_US002() {
        registrant.setSsn(faker.idNumber().ssnValid());
        registerPage.SSN.sendKeys(registrant.getSsn());
    }
    @When("user enters valid first name and last name US002")
    public void user_enters_valid_first_name_and_last_name_US002() {
        registrant.setFirstName(faker.name().firstName());
        registerPage.firstName.sendKeys(registrant.getFirstName());

        registrant.setLastName(faker.name().lastName());
        registerPage.lastName.sendKeys(registrant.getLastName());
    }

    @Then("user closes the browser US002")
    public void user_closes_the_browser_US002() {
        Driver.closeDriver();
    }



    @Then("user verifies username is invalid US002")
    public void user_verifies_username_is_invalid_US002() {
        Assert.assertTrue(registerPage.yourUsernameIsInvalidMessage.isDisplayed());
    }

    @When("user enters invalid email {string} that not contains @ or . US002")
    public void user_enters_invalid_email_that_not_contains_or_US002(String string) {
        registerPage.email.sendKeys(string + Keys.ENTER);
    }


    @Then("user verifies This field is invalid message is displayed US002")
    public void userVerifiesThisFieldIsInvalidMessageIsDisplayedUS002() {
        Assert.assertTrue(registerPage.thisFieldIsInvalidMessage.isDisplayed());
    }

    @Then("user should see Your email is required message US002")
    public void userShouldSeeYourEmailIsRequiredMessageUS002() {
        Assert.assertTrue(registerPage.yourEmailIsRequiredMessage.isDisplayed());
    }

    @When("user enters {string} that contains space US002")
    public void userEntersThatContainsSpaceUS002(String string) {
        string = faker.name().username()+" can";
        registerPage.username.sendKeys(string+Keys.ENTER);
        registrant.setLogin(string);
    }
    @And("user enters {string} that contains special character US002")
    public void userEntersThatContainsSpecialCharacterUS002(String string) {
        string= "*"+faker.name().username()+"#";
        registerPage.username.sendKeys(string);
        registrant.setLogin(string);
    }

    @And("user saves the records into a file US002")
    public void userSavesTheRecordsIntoAFileUS002() {
        saveUIRegistrantData(registrant);
    }

    private void saveUIRegistrantData(US_002_RegistrantPojo registrant) {
    }


    @And("user enters valid username US002")
    public void userEntersAValidUsernameUS() {
        registrant.setLogin(registrant.getFirstName() + registrant.getLastName());
        registerPage.username.sendKeys(registrant.getLogin());
    }

    @And("user enters valid email US002")
    public void userEntersAValidEmailUS() {
        registrant.setEmail(registrant.getFirstName()+registrant.getLastName()+"@gmail.com");
        registerPage.email.sendKeys(registrant.getEmail());
    }

    @And("user enters new password and new password confirmation US002")
    public void userEntersNewPasswordAndPasswordConfirmationUS() {
        registrant.setPassword(faker.internet().password(8,20,true,true));
        registerPage.newPassword.sendKeys(registrant.getPassword());
        registerPage.newPasswordConfirmation.sendKeys(registrant.getPassword());
    }

    @And("user clicks Register button for registration US002")
    public void userClicksOnRegisterButtonForRegistrationUS() {
        registerPage.registerButton.submit();
    }

    @Then("user verifies Registration Saved message is displayed US002")
    public void userVerifiesThatRegistrationSavedMessageIsDisplayedUS() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerPage.registrationSavedMessage.isDisplayed());
    }

    @And("user clicks on Home button US002")
    public void userClicksOnHomeButtonUS() {
        registerPage.homeButton.click();

    }

    @And("user verifies that landed to home page successfully US002")
    public void userVerifiesToLandToHomepageSuccessfullyUS() {
        Assert.assertTrue(homePage002.welcomeToMedunnaText.isDisplayed());
    }

    @And("user closes the browser")
    public void userClosesTheBrowser() {
        Driver.closeDriver();
    }

    @And("user verifies Your username is required message US002")
    public void userVerifiesYourUsernameIsRequiredMessageUS() {
        Assert.assertTrue(registerPage.yourUsernameIsRequiredMessage.isDisplayed());
    }
}