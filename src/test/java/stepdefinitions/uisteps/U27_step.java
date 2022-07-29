package stepdefinitions.uisteps;

import com.github.javafaker.Faker;


import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.*;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class U27_step {
    CommonPageElements pg=new CommonPageElements();
    AdminPage ad=new AdminPage();
    LoginPage lg=new LoginPage();
    AdminMessageAPage admess=new AdminMessageAPage();
    MessageFillPage msg=new MessageFillPage();
    Faker faker=new Faker();
    MessageVerifyPage msgvrfy=new MessageVerifyPage();
    List<String> newList=new ArrayList<>();

    @Given("user goes to medduna")
    public void user_goes_to_medduna() {

        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
    }

    @And("user goes to the left icon and click")
    public void userGoesToTheLeftIconAndClick() {

        Driver.waitAndClick(pg.signInAndRegistrationPortal);
    }

    @And("user enters username {string}")
    public void userEntersUsername(String username) {
        Driver.waitAndSendText(lg.username,username);
    }

    @And("user enters password {string}")
    public void userEntersPassword(String password) {
        Driver.waitAndSendText(lg.password,password);
    }

    @And("user click on signn button")
    public void userClickOnSignnButton() {
        Driver.waitAndClick(lg.signInButton,3);
    }

    @And("user verifies the page")
    public void userVerifiesThePage() {
        Driver.wait(3);
        Assert.assertTrue(ad.itemsTitles.isDisplayed());
    }

    @And("user clicks on items and titles")
    public void userClicksOnItemsAndTitles() {
        Driver.waitAndClick(ad.itemsTitles);
    }

    @And("user clicks on messages")
    public void userClicksOnMessages() {
        Driver.waitAndClick(ad.messageLink);
    }

    @And("user clicks on create new image button")
    public void userClicksOnCreateNewImageButton() {
        Driver.waitAndClick(admess.createMessageButton,3);


    }


    @And("user enters subject {string}")
    public void userEntersSubject(String subject) {
        Driver.waitAndSendText(msg.messageSubject,subject);
    }

    @And("user enters message {string}")
    public void userEntersMessage(String message) {
        Driver.waitAndSendText(msg.messageMessage,message);

    }

    @And("user clicks on sign in message button")
    public void userClicksOnSignInMessageButton() {
        Driver.waitAndClick(msg.messageSignIn);
    }

    @And("user Click on verify message")
    public void userClickOnVerifyMessage() {
        Driver.wait(3);
        Assert.assertTrue(msg.messageConfirm.isDisplayed());
        String message=msg.messageConfirm.getText();
        String newID=message.replaceAll("[^0-9]","");
        newList.add(newID);

    }


    @And("user enters {string}")
    public void userEnters(String username) {
        username=faker.name().username() ;
        Driver.waitAndSendText(msg.messageName,username);

    }

    @And("user enters {string} US")
    public void userEntersUS(String email) {
        email=faker.internet().emailAddress();
        Driver.waitAndSendText(msg.messageEmail,email);
    }


    @And("user clicks on view")
    public void userClicksOnView() {
        Driver.waitAndClick(admess.messageID);
    }

    @And("user verifies name message and email of the user are visible")
    public void userVerifiesNameMessageAndEmailOfTheUserAreVisible() {
        Assert.assertTrue(msgvrfy.messageVisibility.isDisplayed());
        Assert.assertTrue(msgvrfy.emailVisibility.isDisplayed());
        Assert.assertTrue(msgvrfy.nameVisibility.isDisplayed());
    }

    @And("user close teh page")
    public void userCloseTehPage() {
        Driver.closeDriver();
    }


    @And("user clicks on ID button")
    public void userClicksOnIDButton() {
        Driver.waitAndClick(admess.ID);
    }

    @And("user clicks on edit")
    public void userClicksOnEdit() {
        Driver.waitAndClick(admess.edit);
    }




    @And("user updates the {string}")
    public void userUpdatesThe(String message) {
        Driver.waitAndSendText(msg.messageMessage, " "+message+" " + Keys.ENTER);
    }

    @And("user clicks on delete")
    public void userClicksOnDelete() {
        Driver.waitAndClick(admess.delete);
    }

    @And("user clicks on delete on pop ups")
    public void userClicksOnDeleteOnPopUps() {
        Driver.waitAndClick(admess.deletePopUp);
    }
}

