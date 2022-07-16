package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name="username")
    public WebElement username;

    @FindBy(name="password")
    public WebElement password;
    //*[@id="account-menu"]/a/span
    @FindBy(name="rememberMe")
    public WebElement rememberMeCheckmark;

    @FindBy(xpath="(//span[text()='Sign in'])[3]")
    public WebElement signInButton;

//    @FindBy(xpath="//*[text()='Did you forget your password?']")
//    public WebElement updatePassword;
//
//    @FindBy(xpath="//*[text()='Register a new account']")
//    public WebElement proceedToRegistration;

    @FindBy(xpath ="//label[@for='username']" )//body[@class='modal-open
    public WebElement verifyUsername;
    @FindBy(xpath=" //*[@id=\"login-page\"]/div/form/div[2]/div[4]/span/span")
    public WebElement verifyPage;
    //*[@id="login-page"]/div/form/div[2]/div[4]/span/span
    @FindBy(xpath = "//*[@id=\"account-menu\"]/a/span")//*[text()='Amine amine']
    public WebElement confirmName;
    //*[@id="login-page"]/div/form/div[2]/div[4]/span/span
    @FindBy(xpath ="//*[text()='Password']")
    public WebElement passwordLogin;

    @FindBy(xpath="//input[@name='currentPassword']")
    public WebElement currentPassword;

    @FindBy(xpath="//input[@name='newPassword']")
    public WebElement newPassword;

    @FindBy(xpath="//input[@id='confirmPassword']")
    public WebElement newPasswordConfrm;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath="//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement changeMessage ;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style,'rgb(0, 255, 0)')]")
    public WebElement StrengthFifth;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style,'rgb(255, 153, 0)')]")
    public WebElement StrengthSecond;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style,'rgb(153, 255, 0)')]")
    public WebElement StrengthFourth;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style,'rgb(255, 0, 0)')]")
    public WebElement StrengthFirst;
}

