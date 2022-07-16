package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PatientEditPage {
    public PatientEditPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (id = "patient-firstName")
    public WebElement patientFirstName;
    @FindBy (id = "patient-lastName")
    public WebElement patientLastName;
    @FindBy (id = "patient-birthDate")
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
}
