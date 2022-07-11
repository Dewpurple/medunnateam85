package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MakeAppointmentPage {
    public MakeAppointmentPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath="(//a[@href='#appointment'])[1]" )
    public WebElement makeAnAppointmentButton;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(id="ssn")
    public WebElement ssnTextBox;

    @FindBy(id="email")
    public WebElement emailTextBox;

    @FindBy(id="phone")
    public WebElement phoneTextBox;

    @FindBy(xpath = "//*[text()='Your FirstName is required.']")
    public WebElement yourFirstNameIsRequiredText;

    @FindBy(xpath="//*[@name='appoDate']")
    public WebElement apDate;

    @FindBy(xpath="//*[text()='Send an Appointment Request']")
    public WebElement sendRequestButton;

    @FindBy(id="account-menu")//should be on homePage
    public WebElement signInAndRegistrationPortal;

    @FindBy(xpath = "//*[text()='Register']")//should be on homePage
    public WebElement registerButton;
<<<<<<< HEAD
    @FindBy(xpath = "//*[contains(text(),' We will call you as soon as possible.')]")
    public WebElement appointmentSuccessMessage;


    @FindBy(xpath = "//*[@id=\"account-menu\"]/a")
    public WebElement preRegisterPage;

    @FindBy(xpath = "//*[@id=\"account-menu\"]/div/a[2]/span")
    public WebElement registerLink;

    @FindBy(xpath = "//*[@id='entity-menu']/a/span")
    public WebElement patientLink;

    @FindBy(xpath = "//*[@id='entity-menu']/div/a[1]/span")
    public WebElement myAppointmentsLink;

    @FindBy(xpath = "//*[@id='appointment-heading']")
    public WebElement appointmentText;



=======

    @FindBy(xpath="//div[@role='alert']/span/strong")
    public WebElement registrationSavedMessage;

    @FindBy(xpath="//*[contains(text(),'can not be past date')]")
    public WebElement apptErrorMessage;
>>>>>>> master
}








