package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DoctorPage {

public DoctorPage() {
    PageFactory.initElements(Driver.getDriver(), this);
}

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signinbutton;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']']")
    public WebElement signinsubmit;

    @FindBy(xpath = "//span[text()='Did you forget your password?']")
    public WebElement forgetpasswordbutton;

    @FindBy(xpath = "//span[text()='Register a new account']")
    public WebElement registeranewaccountbutton;

    @FindBy(xpath = "//span[text()='Cancel']")
    public WebElement cancelbutton;

    @FindBy(xpath = "//input[@id='rememberMe']")
    public WebElement checkboxbutton;

    @FindBy(xpath = "//span[text()='MY PAGES']")
    public WebElement mypages;

    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement myappointments;

    @FindBy(xpath = "//*[@id='appointment-heading']")
    public WebElement appointmentheading;

    @FindBy(xpath = "//input[@id='fromDate']")
    public WebElement fromdate;

    @FindBy(xpath = "//input[@id='toDate']")
    public WebElement todate;

    @FindBy(xpath = "//*[text()='Edit']")
    public WebElement editbutton;

    @FindBy(xpath = "//span[text()='Create or Edit an Appointment']")
    public WebElement createoreditanappointment;



















}



//xpath = "//*[text()='Sign in']"
//
// @FindBy(id = "login-title")
//    public WebElement logintitle;

