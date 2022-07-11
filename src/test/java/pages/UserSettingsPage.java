package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserSettingsPage {
    public UserSettingsPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy (id = "account-menu")
        public WebElement menuButton;
        @FindBy(xpath="//h2[@id='settings-title']")
        public WebElement userSettingsTitle;
        //  //a[@href='/logout']
        @FindBy(xpath="/*[@id=\"account-menu\"]/div/a[3]/span")
        public WebElement signOutButton;
        @FindBy(xpath="//input[@name='firstName']")
        public WebElement firstNameEditBox;
        @FindBy(xpath="//*[contains(text(),'Your first name is required')]")
        public WebElement firstNameErrorMessage;
        @FindBy(xpath="//input[@name='lastName']")
        public WebElement lastNameEditBox;
        @FindBy(xpath="//*[contains(text(),'Your last name is required')]")
        public WebElement lastNameErrorMessage;
        @FindBy(id="email")
        public WebElement emailEditBox;
        @FindBy (xpath="//button[@type='submit']")
        public WebElement saveButton;
        @FindBy(xpath="(//li[@id='account-menu']//span)[1]")
        public WebElement userNameText;
        @FindBy(xpath="//div[@role='alert']/span/strong")
        public WebElement savedMessage;
    }
