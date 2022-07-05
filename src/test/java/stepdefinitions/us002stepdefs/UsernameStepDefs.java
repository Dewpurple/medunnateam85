package stepdefinitions.us002stepdefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import pages.RegistrationPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class UsernameStepDefs {
    RegistrationPage registrationPage = new RegistrationPage();
    Object driver = null;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Given("user navigates to medunna url")
    public void user_navigates_to_medunna_url() {
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("medunna_url"));
    }
    @Given("user clicks on account menu button")
    public void user_clicks_on_account_menu_button() {
        Driver.waitAndClick(registrationPage.accountMenuButton);
    }
    @Given("user clicks on {string} in the dropdown")
    public void user_clicks_on_in_the_dropdown(String string) {
        Select dropDown = new Select(registrationPage.accountMenuButton);
        dropDown.selectByVisibleText("Register");
        Driver.wait(2);
    }
    @Given("user scrolls down to username textbox")
    public void user_scrolls_down_to_username_textbox() {
        js.executeScript("arguments[0].scrollIntoView();", registrationPage.usernameTextBox);
    }
    @When("user types in  valid username as {string}")
    public void user_types_in_valid_username_as(String string) {
        Driver.waitAndSendText(registrationPage.usernameTextBox,string);
        Driver.wait(1);
    }

    @Then("user continues to next {string} textbox")
    public void user_continues_to_next_textbox(String string) {
       js.executeScript("arguments[0].scrollIntoView();", registrationPage.emailTextbox);
       registrationPage.emailTextbox.click();
    }

}
