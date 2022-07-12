package stepdefinitions.us002stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.Driver;

public class InvalidUsernameStepDefs {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
//    @Given("I am on the homepage")
//    public void i_am_on_the_homepage() {
//        Driver.getDriver().navigate().to("https://www.medunna.com/");
//    }
//    @Given("I click on menu icon")
//    public void i_click_on_menu_icon() {
//        homePage.menuIcon.click();
//    }
//    @Given("I select register button")
//    public void i_select_register_button() {
//        homePage.loginRegisterButton.click();
//    }
    @When("I provide invalid username as {string} US002")
    public void iProvideInvalidUsernameAs(String string) {
        registrationPage.usernameTextBox.sendKeys(string);
        Driver.wait(2);
    }
    @When("I click on email textbox US002")
    public void i_click_on_email_textbox_us002() {
       Driver.waitAndClick(registrationPage.emailTextbox);
    }

    @Then("I validate the error message US002")
    public void iValidateTheErrorMessage() {
        String errorMessage = "Your username is invalid.";
        Assert.assertEquals(errorMessage,registrationPage.invalidUsernameMessage);
    }


}
