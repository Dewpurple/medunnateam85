package stepdefinitions.uisteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US010_uipages.LoginPage1;
import pages.us20_uipage.US_020_User_Page;
import pages.us20_uipage.UserManagementPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;
public class US_020_User_Management_StepDefs {

    LoginPage1 loginPage1 = new LoginPage1();
    US_020_User_Page us_020_user_page = new US_020_User_Page();

    @Given("Admin20 navigates to medunna login page")
    public void admin20_navigates_to_medunna_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
    }
    @Then("Admin20 signs in")
    public void admin20_signs_in() {
        loginPage1.usernameBox.sendKeys("BernaAdmin");
        loginPage1.passwordBox.sendKeys("team85");
        loginPage1.signInButton.click();
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

    @And("Admin20 clicks on Edit button")
    public void adminClicksOnEditButton() {
        ReusableMethods.waitForVisibility(us_020_user_page.editButton,5).click();
    }

    @And("Admin20 assigns role to the user")
    public void adminAssignsRoleToTheUser() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);
        Select select = new Select(us_020_user_page.profileDropdown);
        select.selectByVisibleText("ROLE_USER");


    }

    @And("Admin20 clicks on Save button")
    public void adminClicksOnSaveButton() {
        Driver.clickWithJS(ReusableMethods.waitForVisibility(us_020_user_page.saveButton,5));
        Assert.assertTrue(ReusableMethods.waitForVisibility(us_020_user_page.successMessage,5).isDisplayed());
    }

    @And("Admin20 activates user's status")
    public void adminActivatesUserSStatus() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        ReusableMethods.waitForVisibility(us_020_user_page.activatedCheckbox,5).click();
        Driver.clickWithJS(ReusableMethods.waitForVisibility(us_020_user_page.saveButton, 5));
        Assert.assertTrue(ReusableMethods.waitForVisibility(us_020_user_page.successMessage, 5).isDisplayed());
    }


    @And("Admin20 deletes the user")
    public void adminDeletesTheUser() throws InterruptedException {
        Thread.sleep(3000);
        Driver.clickWithJS(ReusableMethods.waitForVisibility(us_020_user_page.idButton,5));
        Thread.sleep(3000);
        Driver.clickWithJS(ReusableMethods.waitForVisibility(us_020_user_page.deleteButton,5));
        Driver.clickWithJS(ReusableMethods.waitForVisibility(us_020_user_page.deleteConfirmButton, 5));

        Assert.assertTrue(ReusableMethods.waitForVisibility(us_020_user_page.userDeletedMessage, 5).isDisplayed());
    }

    @Then("Admin20 clicks on menu button")
    public void adminClicksOnMenuButton() {
    loginPage1.accountMenuButton.click();
    }

    @Then("Admin20 clicks on sign in")
    public void adminClicksOnSignIn() {
        loginPage1.accountSigninButton.click();
    }
}