package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {

    public RegistrationPage()
    {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id=\"account-menu\"]/a/svg/path")
    public WebElement accountMenuButton;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnTextBox;
    @FindBy(id = "firstName")
    public WebElement firstnameTextBox;
    @FindBy(id = "lastName")
    public WebElement lastnameTextBox;
    @FindBy(id = "username")
    public WebElement usernameTextBox;
    @FindBy(id = "email")
    public WebElement emailTextbox;
    @FindBy(id = "firstPassword")
    public WebElement firstPasswordTextBox;
    @FindBy(id = "secondPassword")
    public WebElement confirmPasswordTextBox;
    @FindBy(id = "register-submit")
    public WebElement registerButton;
    @FindBy(xpath = "//*[contains(text(),'Sign in')]")
    public WebElement successMessageToastContainer;
    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style,'rgb(255, 0, 0)')]")
    public WebElement passwordStrength1;
    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style,'rgb(255, 153, 0)')]")
    public WebElement passwordStrength2;
    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style,'rgb(153, 255, 0)')]")
    public WebElement passwordStrength3;

    @FindBy(xpath = "//*[contains(text(), ' to be at least 4 characters.')]")
    public WebElement invalidPassword;
    @FindBy(xpath = "//*[@id=\"register-form\"]/div[4]/div")
    public WebElement invalidUsernameMessage;
    @FindBy(className = "invalid-feedback")
    public WebElement invalidEmailMessage;
    @FindBy(xpath = "//*[text()='Welcome to MEDUNNA']")
    public WebElement US001_verify_Medunna_Page;

    @FindBy(xpath="//*[@id=\"account-menu\"]")
    public WebElement US001_reg_or_signIn;

    @FindBy(xpath="//*[@id=\"account-menu\"]/div/a[2]/span")
    public WebElement US001_click_register;


    @FindBy(xpath = "//*[@id=\"register-title\"]/span")
    public WebElement US001_verify_Registration_Page;

    @FindBy(xpath="//*[@id=\"ssn\"]")
    public WebElement US001_ssn;

    @FindBy(id = "firstName")
    public WebElement US001_firstnameTextBox;

    @FindBy(id = "lastName")
    public WebElement US001_lastnameTextBox;

    @FindBy(id = "username")
    public WebElement US001_usernameTextBox;

    @FindBy(id = "email")
    public WebElement US001_emailTextbox;

    @FindBy(xpath = "//*[text()='Your SSN is invalid']")
    public WebElement US001_invalid_SSN;

    @FindBy(xpath = "//*[text()='Your SSN is required.']")
    public WebElement US001_SSN_is_Required;

    @FindBy(xpath = "//*[text()='Your FirstName is required.']")
    public WebElement US001_First_Name_is_Required;

    @FindBy(xpath = "//*[@id=\"register-form\"]/div[3]/div")
    public WebElement US001_last_Name_is_Required;
}

