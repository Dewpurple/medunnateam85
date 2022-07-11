package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DoctorPage_13_14 {
    public DoctorPage_13_14(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//*[text()='MY PAGES']")
    public WebElement myPages;
    @FindBy(xpath="(//*[text()='My Appointments'])[1]")
    public WebElement myAppointments;
    @FindBy(xpath="//*[text()='My Inpatients']")
    public WebElement myInpatientsButton;

    @FindBy(xpath="(//*[text()='Edit'])[3]")
    public WebElement editButton;
    @FindBy(xpath="//*[text()='Show Test Results'] ")
    public WebElement showTestResultButton;
    @FindBy(xpath="//*[text()='View Results']")
    public WebElement viewTestResultButton;
    @FindBy(xpath="//*[text()='ID']")
    public WebElement testResultId;
    @FindBy(xpath="//*[text()='Name']")
    public WebElement testResultName;
    @FindBy(xpath="//*[text()='Result']")
    public WebElement testResult;
    @FindBy(xpath="//*[text()='Default Min. Value']")
    public WebElement testResultDefaultMinValue;
    @FindBy(xpath="//*[text()='Default Max. Value']")
    public WebElement testResultDefaultMaxValue;
    @FindBy(xpath="//*[text()='Test']")
    public WebElement testResultTest;
    @FindBy(xpath="//*[text()='Description']")
    public WebElement testResultDescription;
    @FindBy(xpath="//*[text()='Date']")
    public WebElement testResultDate;
    @FindBy(xpath="//tbody/tr[1]/td[1]")
    public WebElement testResultIdColumn;
    @FindBy(xpath="//tbody/tr[1]/td[2]")
    public WebElement testResultNameColumn;
    @FindBy(xpath="//tbody/tr[1]/td[3]")
    public WebElement testResultColumn;
    @FindBy(xpath="//tbody/tr[1]/td[4]")
    public WebElement testResultDefaultMinValueColumn;
    @FindBy(xpath="//tbody/tr[1]/td[5]")
    public WebElement testResultDefaultMaxValueColumn;
    @FindBy(xpath="//tbody/tr[1]/td[6]")
    public WebElement testResultTestColumn;
    @FindBy(xpath="//tbody/tr[1]/td[7]")
    public WebElement testResultDescriptionColumn;
    @FindBy(xpath="//tbody/tr[1]/td[8]")
    public WebElement testResultDateColumn;

    @FindBy(xpath="//*[text()='Sign out']")
    public WebElement doctorSignOutButton;

    @FindBy(xpath="//*[text()='Request Inpatient']")
    public WebElement requestInpatientButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]")
    public WebElement aNewInPatientIsCreatedWithIdentifierMessage;



    @FindBy(xpath="//*[text()='InPatient request already done for this appointment']")
    public WebElement inpatientRequestFailedMessage;
}
