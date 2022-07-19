package stepdefinitions.uisteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.LoginPage;
import pages.SignInPage;
import utilities.Driver;





    public class LoginSteps {


        SignInPage cp = new SignInPage();
        LoginPage login = new LoginPage();

        @Given("user navigates to lending page {string}")
        public void user_navigates_to_lending_page(String url) {
            Driver.navigateToUrl(url);
        }
        @Given("user navigates to sign in portal")
        public void user_navigates_to_sign_in_portal() {
            Driver.waitAndClick(cp.accountMenu);
        }
        @Given("user clicks on sign in button")
        public void user_clicks_on_sign_in_button() {
            Driver.waitAndClick(cp.signInMenuButton);

        }

        @When("user provides the username as {string}")
        public void user_provides_the_username_as(String username) {
            Driver.waitAndSendText(login.username, username);
        }
        @When("user provides the password as {string}")
        public void user_provides_the_password_as(String password) {
            Driver.waitAndSendText(login.password, password);
        }
        @Then("user clicks on signin button")
        public void user_clicks_on_signin_button() {
            Driver.waitAndClick(login.signInButton);
        }


        @When("User provides the current {string}")
        public void user_provides_the_current(String password) {
            Driver.waitAndSendText(login.currentPassword,password);
        }
        @When("User provides the {string}")
        public void user_provides_the(String newpassword) {
            Driver.waitAndSendText(login.newPassword,newpassword);

        }
        @When("User provides the {string} again as confirmation")
        public void user_provides_the_again_as_confirmation(String newpassword) {
            Driver.waitAndSendText(login.newPasswordConfrm,newpassword);
        }
        @When("User clicks on save button")
        public void user_clicks_on_save_button() {
            Driver.waitAndClick(login.saveButton);
        }
        @Then("User verifies Password changed! message is displayed")
        public void userVerifiesPasswordChangedMessageIsDisplayed() {
            Assert.assertTrue(login.changeMessage.isDisplayed());
        }

        @And("user verifies the page by  name")
        public void userVerifiesThePageByName() {

            // Assert.assertTrue(login.confirmName.isDisplayed());
            Driver.waitAndClick(login.confirmName);
            Driver.waitAndClick(login.passwordLogin);

        }

        @Then("User verifies {string} message is displayed")
        public void userVerifiesMessageIsDisplayed(String arg0) {
            Driver.sleep(2000);
            Assert.assertTrue(login.changeMessage.isDisplayed());
        }

        @And("User verifies the powerstrenght level")
        public void userVerifiesThePowerstrenghtLevel() {
            Driver.sleep(2000);
            Assert.assertTrue(login.StrengthFirst.isDisplayed());
        }

        @And("User verifies the second_powerstrenght level")
        public void userVerifiesTheSecond_powerstrenghtLevel() {
            Assert.assertTrue(login.StrengthSecond.isDisplayed());
        }

        @And("User verifies the fourth_powerstrenght level")
        public void userVerifiesTheFourth_powerstrenghtLevel() {
            Assert.assertTrue(login.StrengthFourth.isDisplayed());

        }

        @And("User verifies the fifth_powerstrenght level")
        public void userVerifiesTheFifth_powerstrenghtLevel() {
            Assert.assertTrue(login.StrengthFifth.isDisplayed());
        }



        @And("User provides the {string}  And User enters the newpassword with space character")
        public void userProvidesTheAndUserEntersTheNewpasswordWithSpaceCharacter(String newpassport) {
            Driver.sleep(2000);
            login.newPassword.sendKeys(" "+newpassport+" "+ Keys.ENTER);
        }


        @Then("close the page")
        public void close_the_page() {
            Driver.closeDriver();

        }


        @And("User cleans the newpassword")
        public void userCleansTheNewpassword() {
            login.newPassword.clear();
            Driver.sleep(2000);
        }

        @And("user enters the seven character {string}")
        public void userEntersTheSevenCharacter(String newspassword1) {
            Driver.waitAndSendText(login.newPassword,newspassword1);
        }
    }


