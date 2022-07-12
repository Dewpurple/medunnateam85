package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_015_PatientsPage {

    public US_015_PatientsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='entity-menu']")
    public WebElement itemsAndTitlesButton;
    @FindBy(xpath = "//*[@id='jh-create-entity']")
    public WebElement createNewPatientButton;
    @FindBy(xpath = "//*[@id='patient-firstName']")
    public WebElement firstNameBox;
    @FindBy(xpath = "//*[@id='patient-lastName']")
    public WebElement lastNameBox;
    @FindBy(xpath = "//*[@id='patient-birthDate']")
    public WebElement birthDateBox;
    @FindBy(xpath = "//*[@id='email']")
    public WebElement emailBox;
    @FindBy(xpath = "//*[@id='patient-phone']")
    public WebElement phoneBox;
    @FindBy(xpath = "//*[@id='patient-gender']")
    public WebElement genderBox;
    @FindBy(xpath = "//*[@id='patient-bloodGroup']")
    public WebElement bloodGroupBox;
    @FindBy(xpath = "//*[@id='patient-adress']")
    public WebElement addressBox;
    @FindBy(xpath = "//*[@id='patient-description']")
    public WebElement descriptionBox;
    @FindBy(xpath = "//*[@id='patient-user']")
    public WebElement userBox;
    @FindBy(xpath = "//*[@id='patient-country']")
    public WebElement countryBox;
    @FindBy(xpath = "//*[@id='patient-cstate']")
    public WebElement stateBox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),'A new Patient is created')]")
    public WebElement successMessage;
    @FindBy(xpath = "//span[.='Created Date']")
    public WebElement createdDate;
    @FindBy(xpath = "(//a[.='California'])[1]")
    public WebElement californiaState;
    @FindBy(xpath = "(//th[@class='hand'])[12]")
    public WebElement createdDateButton;
    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement editPatient;
    @FindBy(xpath = "//*[contains (text(),'Patient is updated')]")
    public WebElement patientUpdatedMessage;
    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[1]")
    public WebElement deletePatient;
    @FindBy(xpath = "//button[@class='btn btn-danger']")
    public WebElement confirmDelete;
    @FindBy(xpath = "//span[.='First Name']")
    public WebElement firstNameButton;
    @FindBy(xpath = "//span[.='Last Name']")
    public WebElement lastNameButton;
    @FindBy(xpath = "//td[.='839-97-7135']")
    public WebElement patientSsn;
    @FindBy(xpath = "(//*[text()='0000001Team83'])[1]")
    public WebElement patientFirstName;
    @FindBy(xpath = "(//*[text()='0000001Team83'])[2]")
    public WebElement patientLastName;
    @FindBy(xpath = "//*[text()='05/07/22 00:00']")
    public WebElement patientBirthDate;
    @FindBy(xpath = "//*[text()='223-223-2222']")
    public WebElement patientPhone;
    @FindBy(xpath = "//*[text()='0000001Team83@gmail.com']")
    public WebElement patientEmail;
    @FindBy(xpath = "//*[text()='Gender']")
    public WebElement patientGender;
    @FindBy(xpath = "//*[text()='O-']")
    public WebElement patientBloodGroup;
    @FindBy(xpath = "//*[text()='123mainst']")
    public WebElement patientAddress;
    @FindBy(xpath = "//*[text()='111']")
    public WebElement patientDescription;
    @FindBy(xpath = "//*[text()='05/07/22 14:06']")
    public WebElement patientCreatedDate;
    @FindBy(xpath = "//*[text()='waylon.rodriguezz']")
    public WebElement patientUser;
    @FindBy(xpath = "//*[text()='USA']")
    public WebElement patientCountry;
    @FindBy(xpath = "//*[text()='California']")
    public WebElement patientStateCity;
    @FindBy(xpath = "//span[.='Patient']")
    public WebElement patientButton;
    @FindBy(xpath = "//*[text()='ahmet']")
    public WebElement ahmetDoctor;
    @FindBy(xpath = "//input[@value='109504']")
    public WebElement id;
    @FindBy(xpath = "(//input[@value='0000001Team83'])[1]")
    public WebElement firstName;
    @FindBy(xpath = "(//input[@value='0000001Team83'])[2]")
    public WebElement lastName;
    @FindBy(xpath = "//input[@value='2022-07-05T00:00']")
    public WebElement birthDate;
    @FindBy(xpath = "//input[@value='0000001Team83@gmail.com']")
    public WebElement email;
    @FindBy(xpath = "//input[@value='223-223-2222']")
    public WebElement phone;
    @FindBy(id = "patient-gender")
    public WebElement gender;
    @FindBy(id = "patient-bloodGroup")
    public WebElement bloodGroup;
    @FindBy(xpath = "//input[@value='123mainst']")
    public WebElement address;
    @FindBy(xpath = "//*[text()='111']")
    public WebElement description;
    @FindBy(xpath = "//select[@id='patient-user']")
    public WebElement user;
    @FindBy(id = "patient-country")
    public WebElement country;
    @FindBy(id = "patient-cstate")
    public WebElement state;
}
