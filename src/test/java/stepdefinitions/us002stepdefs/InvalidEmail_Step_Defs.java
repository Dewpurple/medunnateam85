package stepdefinitions.us002stepdefs;

import io.cucumber.java.en.Given;
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
    @When("I provide  invalid email as {string} US002")
    public void iProvideInvalidEmailAs(String arg0) {
        if (registrationPage.emailTextbox.getText().isEmpty()){
            Assert.assertTrue(registrationPage.invalidEmailMessage.isDisplayed());
        }else {
            System.out.println("You have entered your email address");
        }
    }



}
