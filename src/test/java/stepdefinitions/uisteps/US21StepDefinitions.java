package stepdefinitions.uisteps;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.UserPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US21StepDefinitions {
    HomePage homePage = new HomePage();
    UserPage userPage=new UserPage();

    @Given("US21_user clicks menu and the signIn button")
    public void us21_user_clicks_menu_and_the_sign_in_button() {
        Driver.waitAndClick(homePage.loginDropDown);
        Driver.waitAndClick(homePage.loginSignInButton);
    }
    @Given("US21_user enters staff credentials")
    public void us21_user_enters_staff_credentials() {
        Driver.waitAndSendText(homePage.username, ConfigurationReader.getProperty("staffusername"));
        Driver.waitAndSendText(homePage.password, ConfigurationReader.getProperty("staffpw"));
    }

}
