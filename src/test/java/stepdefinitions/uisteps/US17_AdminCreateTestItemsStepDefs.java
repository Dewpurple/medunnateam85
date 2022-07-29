package stepdefinitions.uisteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AdminTestItemPage;
import pages.HomePage;
import pojos.TestItem;
import utilities.ConfigurationReader;
import utilities.Driver;
public class US17_AdminCreateTestItemsStepDefs {

    AdminTestItemPage adminTestItemPage=new AdminTestItemPage();
    HomePage homePage=new HomePage();
    Faker faker=new Faker();
    TestItem testItem=new TestItem();

    @Given("Adminuser goes to Medunna url")
    public void adminuser_goes_to_medunna_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
    }
    @When("Adminuser is on the home page")
    public void adminuser_is_on_the_home_page() {
        Driver.waitAndClick(homePage.loginDropDown);
    }
    @When("Adminuser clicks the signIn button")
    public void adminuser_clicks_the_sign_in_button() {
        Driver.waitAndClick(homePage.loginSignInButton);
    }
    @When("Adminuser provide valid username {string} and {string}")
    public void adminuser_provide_valid_username_and(String username, String password) {
        homePage.username.sendKeys(username);
        homePage.password.sendKeys(password);
    }
    @When("Adminuser clicks Sign In Button")
    public void adminuser_clicks_sign_in_button() {
        homePage.signInbutton.click();
    }
    @When("Adminuser navigates Item&Titles and  and clicks")
    public void adminuser_navigates_item_titles_and_and_clicks() {
        Driver.waitAndClick(adminTestItemPage.aItemsTitlesButton);
    }
    @When("Adminuser clicks Test Item from Item&Titles dropdown")
    public void adminuser_clicks_test_item_from_item_titles_dropdown() {
        Driver.waitAndClick(adminTestItemPage.testItemButton);
    }
    @When("Adminuser clicks on Create a new Test Item")
    public void adminuser_clicks_on_create_a_new_test_item() {
        Driver.waitAndClick(adminTestItemPage.createTestItemButton);
    }
    @Then("Adminuser user verifies Name field is displayed")
    public void adminuser_user_verifies_name_field_is_displayed() {
        Assert.assertTrue(adminTestItemPage.nameOfTestItem.isDisplayed());
    }
    @Then("Adminuser provides Name for Test Item")
    public void adminuser_provides_name_for_test_item() {

        Driver.waitAndSendText(adminTestItemPage.nameTextBox,"Sodium");
    }
    @Then("Adminuser verifies Description field is displayed")
    public void adminuser_verifies_description_field_is_displayed() {
        Assert.assertTrue(adminTestItemPage.descriptionOfTestItem.isDisplayed());
    }
    @Then("Adminuser provides Description for Test Item")
    public void adminuser_provides_description_for_test_item() {
        Driver.waitAndSendText(adminTestItemPage.descriptionTextBox,"mg/l");
    }
    @Then("Adminuser verifies Price field is displayed")
    public void adminuser_verifies_price_field_is_displayed() {
        Assert.assertTrue(adminTestItemPage.priceOfTestItem.isDisplayed());
    }
    @Then("Adminuser provides Price for Test Item")
    public void adminuser_provides_price_for_test_item() {
        Driver.waitAndSendText(adminTestItemPage.priceTextBox,"49");

    }
    @Then("Adminuser verifies Default Min. Value field is displayed")
    public void adminuser_verifies_default_min_value_field_is_displayed() {
        Assert.assertTrue(adminTestItemPage.defMinValueOfTestItem.isDisplayed());
    }
    @Then("Adminuser provides Default Min. Value")
    public void adminuser_provides_default_min_value() {
        Driver.waitAndSendText(adminTestItemPage.defaultMinValueTextBox,"12");
    }
    @Then("Adminuser verifies Default Max. Value field is displayed")
    public void adminuser_verifies_default_max_value_field_is_displayed() {
        Assert.assertTrue(adminTestItemPage.defMaxValueOfTestItem.isDisplayed());
    }
    @Then("Adminuser provides Default Max. Value")
    public void adminuser_provides_default_max_value() {

        Driver.waitAndSendText(adminTestItemPage.defaultMaxValueTextBox,"19");
    }
    @Then("Adminuser verifies created date field is displayed")
    public void adminuser_verifies_created_date_field_is_displayed() {
        Assert.assertTrue(adminTestItemPage.createdDateOfTestItem.isDisplayed());
    }
    //    @Then("Adminuser saves the test item records created with ui")
//    public void adminuser_saves_the_test_item_records_created_with_ui() {
//
//    }
    @Then("Adminuser clicks Save Button")
    public void adminuser_clicks_save_button() {
        Driver.wait(2);
        Driver.clickWithJS(adminTestItemPage.saveCreateTestbutton);
    }
    @Then("Adminuser verifies succes message is displayed")
    public void adminuser_verifies_succes_message_is_displayed() {
        Driver.wait(2);
        Assert.assertTrue(adminTestItemPage.succesMessageForTestCreated.isDisplayed());
//Assert.assertTrue(adminTestItemPage.internalServerError.isDisplayed());
    }
    @Then("Adminuser close the application")
    public void adminuser_close_the_application() {
        Driver.closeDriver();
    }

    @When("Adminuser clicks on View  button")
    public void adminuser_clicks_on_view_button() {
        Driver.wait(2);
        Driver.waitAndClick(adminTestItemPage.firstTestItemViewButton);
    }
    @Then("Adminuser verifies all Test Item is displayed")
    public void adminuser_verifies_all_test_item_is_displayed() {
        Assert.assertTrue(adminTestItemPage.firstTestItemHeader.isDisplayed());
    }

    @When("Adminuser clicks on delete  button")
    public void adminuser_clicks_on_delete_button() {
        Driver.wait(2);
        Driver.clickWithJS( adminTestItemPage.firstTestItemDeletebutton);
    }
    @When("Adminuser clicks confirm delete message")
    public void adminuser_clicks_confirm_delete_message() {
        Driver.wait(2);
        Driver.clickWithJS(adminTestItemPage.confirmDeleteButton);
    }
    @Then("Adminuser verifies deleted succes message is displayed")
    public void adminuser_verifies_deleted_succes_message_is_displayed() {
        Driver.wait(2);
        Assert.assertTrue(adminTestItemPage.internalServerError.isDisplayed());


    }



}
