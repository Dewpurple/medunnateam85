package stepdefinitions.uisteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US19_Pages.US_19_pages2;
import pages.US19_Pages.US_19_pages3;
import pages.US19_Pages.US_19_pages4;
import pages.US19_Pages.US_19_pages5;
import pages.UStory_04_Pages1;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_19_stepDefs {


    UStory_04_Pages1 uStory_04_pages1 = new UStory_04_Pages1();
    US_19_pages2 us_19_pages2 = new US_19_pages2();
    US_19_pages3 us_19_pages3 = new US_19_pages3();
    US_19_pages4 us_19_pages4 = new US_19_pages4();
    US_19_pages5 us_19_pages5 = new US_19_pages5();




    @Given("the admin19 go to url")
    public void the_admin19_go_to_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("19medunnaurl"));

    }
    @Then("The admin19 click sign in page")
    public void the_admin19_click_sign_in_page() {
        uStory_04_pages1.signintik.click();
        uStory_04_pages1.signinbutton.click();
    }

    @Then("admin19 enters the username as {string}")
    public void admin19_enters_the_username_as(String username) {
        Driver.waitAndSendText(uStory_04_pages1.username, username);

    }
    @Then("admin19 enters the  password as {string}")
    public void admin19_enters_the_password_as(String password) {
        Driver.waitAndSendText(uStory_04_pages1.password, password);
    }
    @Then("us19 click the Sign In button")
    public void us19_click_the_sign_in_button() {
        Driver.waitAndClick(uStory_04_pages1.submitbutton);
    }
    @Then("us19 Verify to sign-on the web side")
    public void us19_verify_to_sign_on_the_web_side() {
        Assert.assertTrue(uStory_04_pages1.verifypage.isDisplayed());
    }
    //______________________________________________________________________


    @Then("navigate and click Items and Titles")
    public void navigate_and_click_items_and_titles() {
        Driver.waitAndClick(us_19_pages2.itemtitles);


    }
    @Then("click Staff page")
    public void click_staff_page() {
        Driver.waitAndClick(us_19_pages2.stuffbutton);

    }
    @Then("verify staff page")
    public void verify_staff_page() {
        Assert.assertTrue(us_19_pages2.verifystaffpage.isDisplayed());


    }
    @Then("click Create a new stuff button")
    public void click_create_a_new_stuff_button() {
        Driver.waitAndClick(us_19_pages2.createnewstaffbutton);

    }
    @Then("verify Create a new stuff page")
    public void verify_create_a_new_stuff_page() {
        Assert.assertTrue(us_19_pages2.verifycreatenewstaffbutton.isDisplayed());


    }
    @Then("write {string} number SSNSearch")
    public void write_number_ssn_search(String SSN) {
        Driver.waitAndSendText(us_19_pages2.placesearchSSN, SSN);

    }
    @Then("Click UseSearch checkBox")
    public void click_use_search_check_box() {
        Driver.waitAndClick(us_19_pages2.useSSNsearchcheckbox);


    }
    @Then("click SearchUser button")
    public void click_search_user_button() {
        Driver.waitAndClick(us_19_pages2.searchuserbutton);


    }
    @Then("Verify user found with search SSN")
    public void verify_user_found_with_search_ssn() {
        Assert.assertTrue(us_19_pages2.verifyuserfoundwithsearchSSN.isDisplayed());


    }
    @Then("click back button")
    public void click_back_button() {
        Driver.waitAndClick(us_19_pages2.backbutton);

    }
    //---------------------------------------------------------------------------------

    @Then("Click FirstName tik and see  first name")
    public void clickFirstNameTikAndSeeFirstName() {
        Driver.waitAndClick(us_19_pages3.firstnamebutton);
    }

    @Then("click View buton")
    public void click_view_buton() {
        Driver.waitAndClick(us_19_pages3.viewbutton);

    }
    @Then("verify View Staff info page")
    public void verify_view_staff_info_page() {
        Assert.assertTrue(us_19_pages3.verifyviewbuttonpage.isDisplayed());
    }
    @Then("click backbutton")
    public void clickBackbuton() {
        Driver.waitAndClick(us_19_pages3.backbutton);
    }

//---------------------------------------------------------------------------------

    @Then("click Edit button")
    public void click_edit_button() {
        Driver.waitAndClick(us_19_pages4.editbutton);

    }
    @Then("verify Edit page")
    public void verify_edit_page() {
        Assert.assertTrue(us_19_pages4.verifyeditbutton.isDisplayed());

    }
    @Then("should be written in the description as {string}")
    public void shouldBeWrittenInTheDescriptionAs(String Stuff_info) {
        Driver.waitAndSendText(us_19_pages4.editdescription, Stuff_info);
    }

    @Then("click save button")
    public void click_save_button() {
        Driver.waitAndClick(us_19_pages4.savebuttonsave);

    }
    @Then("Verify save success message")
    public void verifySaveSuccessMessage() {
        //Assert.assertTrue(us_19_pages4.verifysavemessage.isDisplayed());
    }


    @Then("click backbuttonfirst")
    public void clickBackbuttonfirst() {
        Driver.waitAndClick(us_19_pages4.backbutton1);
    }

    //---------------------------------------------------------------------------

    @Then("click Delete buton")
    public void click_delete_buton() {
        Driver.waitAndClick(us_19_pages5.clickdeletebutton);


    }
    @Then("Confirm delete operation click delete button")
    public void confirm_delete_operation_click_delete_button() {
        //Assert.assertTrue(us_19_pages5.confirmdeleteoperation.isDisplayed());
        //Driver.waitAndClick(us_19_pages5.lastdeletebutton);


    }
    @Then("verify delete success mesaage")
    public void verify_delete_success_mesaage() {


    }
}
