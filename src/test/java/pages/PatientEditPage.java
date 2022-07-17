package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PatientEditPage {
    public PatientEditPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//input[@name='firstName']")
    public WebElement patientFirstName;
    @FindBy (xpath = "//input[@name='lastName']")
    public WebElement patientLastName;
    @FindBy (xpath = "//input[@name='birthDate']")
    public WebElement patientBirthDate;
    @FindBy (xpath = "//input[@name='email']")
    public WebElement patientEmail;
    @FindBy (xpath = "//input[@name='phone']")
    public WebElement patientPhoneNumber;
    @FindBy (xpath = "//select[@name='gender']")
    public WebElement patientGender;
    @FindBy (xpath = "//select[@name='bloodGroup']")
    public WebElement patientBloodGroup;
    @FindBy (xpath = "//input[@name='adress']")
    public WebElement patientAddress;
    @FindBy (id = "patient-description")
    public WebElement patientDescription;
    @FindBy (xpath = "//select[@name='user.id']")
    public WebElement patientUser;
    @FindBy (id = "patient-country")
    public WebElement patientCountry;
    @FindBy (id = "patient-cstate")
    public WebElement patientState;
    @FindBy (xpath = "//button[@id='save-entity']")
    public WebElement patientSaveButton;
    @FindBy (id = "patient-id")
    public WebElement patientID;  //watch out for additional lines
    @FindBy(xpath = "(//a[@class='btn btn-link btn-sm']")
    public WebElement editButtonFirstPatient;
    @FindBy (xpath =  "//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[16]/div/a[2]")
    public WebElement editbutton;
    @FindBy (xpath =  "//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]")
    public WebElement savebuttonconfirmation;
    @FindBy (xpath = "//a[@class='btn btn-danger btn-sm']")
    public WebElement deleteButton;
    @FindBy (id = "hospitalmsappfrontendApp.patient.delete.question")
    public WebElement deleteButtonConfirmation;
}
