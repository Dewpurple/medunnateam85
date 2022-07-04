package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
//
public class HomePage {


    public HomePage() {
       PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@class='dropdown nav-item']")
    public WebElement loginDropDown;
    @FindBy(id =  "login-item")
    public WebElement loginSignInButton;
    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInbutton;
    @FindBy (xpath =  " //a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement itemsTitles;
    @FindBy (xpath = "//a[@class='dropdown-item active']")
    public WebElement patient;

}