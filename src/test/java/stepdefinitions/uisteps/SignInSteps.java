//package stepdefinitions.uisteps;
//
//import io.cucumber.java.en.*;
//import pages.SignInPage;
//import utilities.ConfigurationReader;
//import utilities.Driver;
//
//public class SignInSteps {
//    SignInPage signInPage=new SignInPage();
//    @Given("user is on the home page")
//    public void user_is_on_the_home_page() {
//    Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
//    }
//    @Given("user clicks the signIn button")
//    public void user_clicks_the_sign_in_button() {
//    Driver.waitAndClick(signInPage.accountMenu);
//    Driver.waitAndClick(signInPage.signInMenuButton);
//    }
//    @Given("user types in username as {string}")
//    public void user_types_in_username_as(String username) {
//    Driver.waitAndSendText(signInPage.usernameTextBox, username);
//    }
//
//    @Given("user types in password as {string}")
//    public void user_types_in_password_as(String password) {
//    Driver.waitAndSendText(signInPage.passwordTextBox, password);
//    }
//
//    @Then("user clicks Sign In Button")
//    public void user_clicks_sign_in_button() {
//    Driver.waitAndClick(signInPage.signInSubmitButton);
//    }
//}