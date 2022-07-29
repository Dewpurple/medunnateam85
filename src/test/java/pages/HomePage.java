package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
//
public class HomePage {//loginpage is included here


    public HomePage() {
       PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@class='dropdown nav-item']")//should change to id
    public WebElement loginDropDown;
    @FindBy(id =  "login-item")
    public WebElement loginSignInButton;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInbutton;
    @FindBy (xpath = "//li[@id='entity-menu']")
    public WebElement itemsTitles;
    @FindBy (xpath = "//a[@class='dropdown-item']")
    public WebElement patient;
    @FindBy (id = "entity-menu")
    public WebElement myPages;
    @FindBy (xpath = "(//a[@role='menuitem']")
    public WebElement searchPatient;
    @FindBy (xpath = "//span[contains(text(),'Search Patient')]")
    public  WebElement searchPatient2;
    @FindBy(xpath = "//*[@id=\"account-menu\"]/div/a[2]/span")
    public WebElement loginRegisterButton;
    @FindBy(xpath = "//*[@id=\"account-menu\"]/a")
    public WebElement menuIcon;
    @FindBy  (xpath = "//span[contains(text(),'Country')]")
    public  WebElement countryButton;
    @FindBy (xpath = "//a[@class='btn btn-primary float-right jh-create-entity']")
    public WebElement createAnewCountryButton;
    @FindBy (xpath = "//input[@id='country-name']")
    public  WebElement nameofNewCountry;
    @FindBy (xpath =  "//button[@type='submit']")
    public WebElement saveButtonForCountry;


}