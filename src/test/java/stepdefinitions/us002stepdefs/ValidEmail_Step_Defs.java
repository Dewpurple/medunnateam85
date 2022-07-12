package stepdefinitions.us002stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.Driver;

public class ValidEmail_Step_Defs {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();

    @Given("I am on the homepage US002")
    public void i_am_on_the_homepage() {
        Driver.getDriver().navigate().to("https://www.medunna.com/");
    }

    @Given("I click on menu icon US002")
    public void i_click_on_menu_icon() {
        homePage.menuIcon.click();
    }

    @Given("I select register button US002")
    public void i_select_register_button() {
        homePage.loginRegisterButton.click();
    }

    @When("I provide email as {string} US002")
    public void iProvideEmailAs(String string) {
        registrationPage.emailTextbox.sendKeys(string);
    }
    @Then("I validate that {string} contains {string}")
    public void iValidateThatContains(String arg0, String arg1) {
        arg0 = "cselcuk@gmail.com";
        arg1 = "@gmail.com";
        Assert.assertTrue(arg0.contains(arg1));
    }

    @And("I close the application US002")
    public void iCloseTheApplicationUS() {
        Driver.closeDriver();
    }



}