package stepdefinitions.us002stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.Driver;

public class ValidUserNameStepDefs {
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
    @When("I provide username as {string} US002")
    public void i_provide_username_as(String string) {

        registrationPage.usernameTextBox.sendKeys(string);
    }
    @Then("I move on to {string} textbox US002")

    public void i_move_on_to_textbox(String string) {
        registrationPage.emailTextbox.click();
    }

//    @And("I close the application")
//    public void iCloseTheApplication() {
//        Driver.closeDriver();
//    }
}
