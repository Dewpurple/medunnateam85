package stepdefinitions.uisteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegistrationPage;

import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_001 {

    RegistrationPage us001 = new RegistrationPage();

    @Given("US001 user Go to Medunna home page")
    public void us01_user_go_to_medunna_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
    }

    @Then("US001 verify Medunna home page is open")
    public void us01_verify_medunna_home_page_is_open() {
        Assert.assertTrue(us001.US001_verify_Medunna_Page.isDisplayed());
    }

    @Then("US001 click on Registration button")
    public void us01_click_on_sign_in_button() {
        Driver.waitAndClick(us001.US001_reg_or_signIn, 1000);
        Driver.waitAndClick(us001.US001_click_register, 1000);
    }

    @Then("US001 verify registration page is open")
    public void us01_verify_registration_page_is_open() {
        Assert.assertTrue(us001.US001_verify_Registration_Page.isDisplayed());
    }

    @Then("US001 user write ssn no {string} on registration page for TC01")
    public void us01_for_ssn_user_provides_ssn_as(String SSN_Valid) throws IOException {
        Driver.waitAndSendText(us001.US001_ssn, SSN_Valid, 1000);
        ReusableMethods.getScreenshot("TestResultScreenShots");

    }

        public static boolean isValidSSN(String str) {
            if (str.matches("\\d{3}[-\\s]\\d{2}[-\\s]\\d{4}"))
                return true;
            else
                return false;

        }


    @Then("US001 firstname user types in first name as {string} for TC02")
    public void us01_firstname_user_types_in_first_name_as(String Valid_first_name) throws IOException {
        Driver.waitAndSendText(us001.US001_firstnameTextBox, Valid_first_name);
        ReusableMethods.getScreenshot("TestResultScreenShots");
        Assert.assertTrue(isValidName(Valid_first_name));
    }

    public static boolean isValidName(String name) {
        if (name.matches("^[a-zA-Z0-9]+$"))
            return true;
        else
            return false;


    }

    @Then("US001 for lastname user also types in lastname as {string} for TC03")
    public void us01_for_lastname_user_also_types_in_lastname_as(String Valid_last_name) throws IOException {
        Driver.waitAndSendText(us001.US001_lastnameTextBox, Valid_last_name);
        ReusableMethods.getScreenshot("TestResultScreenShots");

        Assert.assertTrue(isValidLastname(Valid_last_name));
    }

    public static boolean isValidLastname(String lastname) {
        if (lastname.matches("^[a-zA-Z0-9]+$"))
            return true;
        else
            return false;


    }


    @Then("US001 user write ssn no from swagger for api {string} on registration page for TC04")
    public void us001_user_write_ssn_no_from_swagger_for_api_on_registration_page_for_tc04(String SSN_ValidSwagger) throws IOException {
        Driver.waitAndSendText(us001.US001_ssn, SSN_ValidSwagger, 1000);
        ReusableMethods.getScreenshot("TestResultScreenShots");
        Assert.assertTrue(isValidSSNfromSwagger(SSN_ValidSwagger));
        ReusableMethods.getScreenshot("TestResultScreenShots");
    }

    public static boolean isValidSSNfromSwagger(String ssn) {
        if (ssn.matches("\\d{3}[-\\s]\\d{2}[-\\s]\\d{4}"))
            return true;
        else
            return false;

    }


    @Given("US001 user write an invalid ssn as {string} for TC05")
    public void us001_user_write_an_invalid_ssn_as_for_tc05(String invalid_ssn01) {
        Driver.waitAndSendText(us001.US001_ssn, invalid_ssn01);
    }

    @Then("US001 user click first name box, so see the your ssn is invalid for TC05")
    public void us001_user_see_the_your_ssn_is_invalid() throws IOException {
        Driver.waitAndClick(us001.US001_firstnameTextBox);
        Assert.assertTrue(us001.US001_invalid_SSN.isDisplayed());
        ReusableMethods.getScreenshot("TestResultScreenShots");
    }


    @Given("US001 user write an invalid ssn as {string} for TC06")
    public void us001_user_write_an_invalid_ssn_as_for_tc06(String invalid_ssn02) {
        Driver.waitAndSendText(us001.US001_ssn, invalid_ssn02);
    }
    @Then("US001 user click first name box, so see the your ssn is invalid for TC06")
    public void us001_user_click_first_name_box_so_see_the_your_ssn_is_invalid_for_tc06() throws IOException {
        Driver.waitAndClick(us001.US001_firstnameTextBox);
        Assert.assertTrue(us001.US001_invalid_SSN.isDisplayed());
        ReusableMethods.getScreenshot("TestResultScreenShots");
    }


    @Given("US001 user write an invalid ssn as {string} for TC07")
    public void us001_user_write_an_invalid_ssn_as_for_tc07(String invalid_ssn03) {
        Driver.waitAndSendText(us001.US001_ssn, invalid_ssn03);
    }


    @Then("US001 user click first name box, so see the your ssn is invalid for TC07")
    public void us001_user_click_first_name_box_so_see_the_your_ssn_is_invalid_for_tc07() throws IOException {
        Driver.waitAndClick(us001.US001_firstnameTextBox);
        Assert.assertTrue(us001.US001_invalid_SSN.isDisplayed());
        ReusableMethods.getScreenshot("TestResultScreenShots");
    }





    @Given("US001 user write an invalid ssn as {string} for TC08")
    public void us001_user_write_an_invalid_ssn_as_for_tc08(String invalid_ssn04) {
        Driver.waitAndSendText(us001.US001_ssn, invalid_ssn04);
    }

    @Then("US001 user click first name box, so see the your ssn is invalid for TC08")
    public void us001_user_click_first_name_box_so_see_the_your_ssn_is_invalid_for_tc08() throws IOException {
        Driver.waitAndClick(us001.US001_firstnameTextBox);
        Assert.assertTrue(us001.US001_invalid_SSN.isDisplayed());

        ReusableMethods.getScreenshot("TestResultScreenShots");
    }


    @Given("US001 user write an invalid ssn as {string} for TC09")
    public void us001_user_write_an_invalid_ssn_as_for_tc09(String invalid_ssn05) {
        Driver.waitAndSendText(us001.US001_ssn, invalid_ssn05);
    }
    @Then("US001 user click first name box, so see the your ssn is invalid for TC09")
    public void us001_user_click_first_name_box_so_see_the_your_ssn_is_invalid_for_tc09() throws IOException {
        Driver.waitAndClick(us001.US001_firstnameTextBox);
        Assert.assertTrue(us001.US001_invalid_SSN.isDisplayed());
        ReusableMethods.getScreenshot("TestResultScreenShots");
    }

    @Given("US001 user write an invalid ssn as {string} for TC10")
    public void us001_user_write_an_invalid_ssn_as_for_tc10(String invalid_ssn06) {
        Driver.waitAndSendText(us001.US001_ssn, invalid_ssn06);


    }

    @Then("US001 user click first name box, so see the your ssn is invalid for TC10")
    public void us001_user_click_first_name_box_so_see_the_your_ssn_is_invalid_for_tc10() throws IOException {
        Driver.waitAndClick(us001.US001_firstnameTextBox);
        Assert.assertTrue(us001.US001_invalid_SSN.isDisplayed());
        ReusableMethods.getScreenshot("TestResultScreenShots");
    }

    public static boolean isValidSSN_startwithNine(String str) {
        if (str.matches("^(9\\d{2})\\d{3}"))

            return true;
        else
            return false;
    }


    @Given("US001 user write an invalid ssn as {string} for TC11 Woolworth’s Wallet Fiasco")
    public void us001_user_write_an_invalid_ssn_as_for_tc11_woolworth_s_wallet_fiasco(String invalid_ssn07) {
        Driver.waitAndSendText(us001.US001_ssn, invalid_ssn07);
    }
    @Then("US001 user click first name box, so see the your ssn is invalid for TC11 Woolworth’s Wallet Fiasco")
    public void us001_user_click_first_name_box_so_see_the_your_ssn_is_invalid_for_tc11_woolworth_s_wallet_fiasco() throws IOException {
        Driver.waitAndClick(us001.US001_firstnameTextBox);
        ReusableMethods.getScreenshot("TestResultScreenShots");

        Assert.assertTrue(us001.US001_invalid_SSN.isDisplayed());


    }


    @Given("US001 user write an invalid ssn as {string} for TC12 Social Security Administration")
    public void us001_user_write_an_invalid_ssn_as_for_tc12_social_security_administration(String invalid_ssn08) {
        Driver.waitAndSendText(us001.US001_ssn, invalid_ssn08);
    }
    @Then("US001 user click first name box, so see the your ssn is invalid for TC12 Social Security Administration")
    public void us001_user_click_first_name_box_so_see_the_your_ssn_is_invalid_for_tc12_social_security_administration() throws IOException {
        Driver.waitAndClick(us001.US001_firstnameTextBox);
        ReusableMethods.getScreenshot("TestResultScreenShots");
        Assert.assertTrue(us001.US001_invalid_SSN.isDisplayed());

    }

    @Given("US001 user write an invalid ssn as {string} for TC13 after third digit, number starts double zero or last four digit zero")
    public void us001_user_write_an_invalid_ssn_as_for_tc13(String invalid_ssn06) {
        Driver.waitAndSendText(us001.US001_ssn, invalid_ssn06);

    }

    @Then("US001 user click first name box, so see the your ssn is invalid for TC13")
    public void us001_user_click_first_name_box_so_see_the_your_ssn_is_invalid_for_tc13() throws IOException {
        Driver.waitAndClick(us001.US001_firstnameTextBox);
        Assert.assertTrue(us001.US001_invalid_SSN.isDisplayed());
        ReusableMethods.getScreenshot("TestResultScreenShots");


    }
    public static boolean isValidSSN1(String str) {
        if (str.matches("[-\\s](00)\\d{2}[-\\s]"
                + "(0{4})\\d{4}$"))

            return true;
        else
            return false;

    }

    @Given("US001 user will not write an ssn as {string} for TC14 EMPTY BOX")
    public void us001_user_will_not_write_an_ssn_as_for_tc14_empty_box(String invalid_ssn09) throws IOException {
        Driver.waitAndSendText(us001.US001_ssn, invalid_ssn09);
        Assert.assertTrue(us001.US001_SSN_is_Required.isDisplayed());
        ReusableMethods.getScreenshot("TestResultScreenShots");
    }

    @Then("US001 user click first name box, so see the Your SSN is required for TC14")
    public void us001_user_click_first_name_box_so_see_the_your_ssn_is_required_for_tc14() throws IOException {
        Driver.waitAndClick(us001.US001_firstnameTextBox);
        Assert.assertTrue(us001.US001_SSN_is_Required.isDisplayed());
        ReusableMethods.getScreenshot("TestResultScreenShots");
    }



    @Given("US001 a firstname is written with blank {string} and a valid lastname {string} is written for TC15")
    public void usAFirstnameIsWrittenWithBlankAndAValidLastnameIsWrittenForTC(String FirstName_With_blank, String valid_lastName) throws IOException {
        Driver.waitAndSendText(us001.US001_firstnameTextBox, FirstName_With_blank);
        Driver.waitAndSendText(us001.US001_lastnameTextBox, valid_lastName);
        ReusableMethods.getScreenshot("TestResultScreenShots");
        Assert.assertFalse(us001.US001_First_Name_is_Required.isDisplayed());

    }

    @Then("US001 user see the Your FirstName is required for TC15")
    public void us001_user_click_username_box_so_see_the_your_first_name_is_required_for_tc14() {
        Driver.waitAndClick(us001.US001_usernameTextBox);
        Assert.assertTrue(us001.US001_First_Name_is_Required.isDisplayed());

    }


    @Given("US001 user will write his or her valid first name {string} for TC16")
    public void us001_user_will_write_his_or_her_valid_first_name_for_tc15(String valid_firstName) throws IOException {
        Driver.waitAndSendText(us001.US001_firstnameTextBox, valid_firstName);

    }
    @Given("US001 user will not write his or her a last name {string} for TC16 EMPTY BOX")
    public void us001_user_will_not_write_his_or_her_valid_lastname_for_tc15(String EMPTYBOX) throws IOException {
        Driver.waitAndSendText(us001.US001_lastnameTextBox, EMPTYBOX);

    }
    @Then("US001 user click username box, so see the Your LastName is required for TC16")
    public void us001_user_click_username_box_so_see_the_your_last_name_is_required_for_tc15() throws IOException {
        Driver.waitAndClick(us001.US001_usernameTextBox);

        String actual_result_lastName= us001.US001_last_Name_is_Required.getText();
        String expected_result_lastname="Your LastName is required.";
        Assert.assertEquals(expected_result_lastname,actual_result_lastName);

        Assert.assertTrue(us001.US001_last_Name_is_Required.isDisplayed());
        ReusableMethods.getScreenshot("TestResultScreenShots");

    }


}
