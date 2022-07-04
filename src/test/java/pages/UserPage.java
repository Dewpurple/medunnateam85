package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserPage {
    public UserPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="entity-menu")
    public WebElement myPagesMenu;
    @FindBy(id="account-menu")
    public WebElement menuButton;
    @FindBy(partialLinkText = "settings")
    public WebElement settingsButton;
    @FindBy(id="settings-title")
    public WebElement userSettingsTitle;
    @FindBy(id="firstName")
    public WebElement firstNameTextBox;
    @FindBy(id="lastName")
    public WebElement lastNameTextBox;
    @FindBy(id="email")
    public WebElement emailTextBox;
    @FindBy (xpath="//button[@type='submit']")
    public WebElement saveButton;

}
