import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class UsernameStepDefs {
    RegistrationPage registrationPage = new RegistrationPage();
    HomePage homePage = new HomePage();
    Faker faker = new Faker();
    @Given("user navigates to medunna url")
    public void user_navigates_to_medunna_url() {
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("medunna_url"));
    }
    @Given("user clicks on account menu button")
    public void user_clicks_on_account_menu_button() {

        Driver.waitAndClick(homePage.loginDropDown);
    }
    @And("user clicks on register in the dropdown")
    public void userClicksOnRegisterInTheDropdown() {
        Driver.waitAndClick(homePage.loginRegisterButton);
    }
    @When("user types in  valid username")
    public void userTypesInValidUsername() {
    String username = faker.name().username();
    Driver.waitAndSendText(registrationPage.usernameTextBox,username);
    }
    @Then("user continues to next email textbox")
    public void userContinuesToNextEmailTextbox() {
        Driver.waitAndClick(registrationPage.emailTextbox);
    }




}
