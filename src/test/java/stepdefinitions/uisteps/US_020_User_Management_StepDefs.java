package stepdefinitions.uisteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import pages.us20_uipage.US_020_User_Page;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_020_User_Management_StepDefs {
    LoginPage loginPage = new LoginPage();
    US_020_User_Page us_020_user_page = new US_020_User_Page();

    @Given("Admin20 navigates to medunna login page")
    public void admin20_navigates_to_medunna_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
    }
    @Then("Admin20 signs in")
    public void admin20_signs_in() {
        loginPage.username.sendKeys("BernaAdmin");
        loginPage.password.sendKeys("team85");
        loginPage.signInButton.click();
    }
    @Then("Admin20 clicks on Administrations then clicks on User Management")
    public void admin20_clicks_on_administrations_then_clicks_on_user_management() {
        ReusableMethods.waitForVisibility(us_020_user_page.administration,5).click();
        ReusableMethods.waitForVisibility(us_020_user_page.userManagement,5).click();
    }
    @Then("Admin20 clicks on View button")
    public void admin20_clicks_on_view_button() {
        ReusableMethods.waitForVisibility(us_020_user_page.viewButton,5).click();
    }
    @Then("Admin20 verifies user's information on the page")
    public void admin20_verifies_user_s_information_on_the_page() {
        ReusableMethods.waitForVisibility(us_020_user_page.firstNameText, 5);
        Assert.assertTrue(us_020_user_page.firstNameText.isDisplayed());
        ReusableMethods.waitForVisibility(us_020_user_page.lastNameText, 5);
        Assert.assertTrue(us_020_user_page.lastNameText.isDisplayed());
        ReusableMethods.waitForVisibility(us_020_user_page.emailText, 5);
        Assert.assertTrue(us_020_user_page.emailText.isDisplayed());
    }
    @Then("Admin20 closes the application")
    public void admin20_closes_the_application() {
        Driver.closeDriver();
    }

}
