package stepdefinitions.us002stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.Driver;

public class InvalidEmail_Step_Defs {
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

    @When("I leave email text box blank")
    public void iLeaveEmailTextBoxBlank() {
        registrationPage.emailTextbox.sendKeys(" ");
    }

    @Then("I validate the error message")
    public void iValidateTheErrorMessage() {

        if (registrationPage.emailTextbox.equals("")) {
            Assert.assertTrue(registrationPage.invalidEmailMessage.isDisplayed());
        }else {
            System.out.println("You have provided your email");
        }

    }
}
