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
    @FindBy (xpath = "//input[@name='patient-lastName']")
    public WebElement patientLastName;
    @FindBy (xpath = "//input[@name='patient-birthDate']")
    public WebElement patientBirthDate;
    @FindBy (id = "email")
    public WebElement patientEmail;
    @FindBy (id = "patient-phone")
    public WebElement patientPhoneNumber;
    @FindBy (id = "patient-gender")
    public WebElement patientGender;
    @FindBy (id = "patient-bloodGroup")
    public WebElement patientBloodGroup;
    @FindBy (id = "patient-adress")
    public WebElement patientAddress;
    @FindBy (id = "patient-description")
    public WebElement patientDescription;
    @FindBy (id = "patient-user")
    public WebElement patientUser;
    @FindBy (id = "patient-country")
    public WebElement patientCountry;
    @FindBy (id = "patient-cstate")
    public WebElement patientState;
    @FindBy (id = "save-entity")
    public WebElement patientSaveButton;
    @FindBy (id = "patient-id")
    public WebElement patientID;  //watch out for additional lines
    @FindBy(xpath = "(//a[@class='btn btn-link btn-sm']")
    public WebElement editButtonFirstPatient;
    @FindBy (xpath =  "//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[16]/div/a[2]")
    public WebElement editbutton;

}
