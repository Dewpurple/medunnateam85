package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserSettingsPage {
    public UserSettingsPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy (xpath = "//li[@class='d-flex align-items-center dropdown-toggle nav-link']")
        public WebElement menuButton;
        @FindBy(id="settings-title")
        public WebElement userSettingsTitle;
        @FindBy(id="firstName")
        public WebElement firstNameEditBox;
        @FindBy(id="lastName")
        public WebElement lastNameEditBox;
        @FindBy(id="email")
        public WebElement emailEditBox;
        @FindBy (xpath="//button[@type='submit']")
        public WebElement saveButton;
    }
