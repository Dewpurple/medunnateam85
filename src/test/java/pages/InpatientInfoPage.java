package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InpatientInfoPage {

    public InpatientInfoPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    //First Inpatient info locator
    @FindBy(xpath= "//tbody/tr[1]/td[1]")
    public WebElement firstInPatientID;

    @FindBy(xpath= "//tbody/tr[1]/td[2]")
    public WebElement firstInPatientStartDate;

    @FindBy(xpath= "//tbody/tr[1]/td[4]")
    public WebElement firstInPatientStatus;

    @FindBy(xpath= "//tbody/tr[1]/td[6]")
    public WebElement firstInPatientCreatedDate;

    @FindBy(xpath= "//tbody/tr[1]/td[7]")
    public WebElement firstInPatientRoom;

    @FindBy(xpath= "//tbody/tr[1]/td[8]")
    public WebElement firstInPatientAppointment;

    @FindBy(xpath= "//tbody/tr[1]/td[9]")
    public WebElement firstInPatientNameSSN;

    @FindBy(xpath= "(//*[text()='Edit'])[1]")
    public WebElement firstInPatientEditButton;


    @FindBy(xpath= "(//*[text()='Edit'])[3]")
    public WebElement thirdInPatientEditButton;
    @FindBy(xpath= "(//*[text()='Edit'])[4]")
    public WebElement fourthInPatientEditButton;
    @FindBy(xpath= "(//*[text()='Edit'])[5]")
    public WebElement fifthInPatientEditButton;
    @FindBy(xpath= "(//*[text()='Edit'])[6]")
    public WebElement sixthInPatientEditButton;
    @FindBy(xpath= "(//*[text()='Edit'])[7]")
    public WebElement seventhInPatientEditButton;
    @FindBy(xpath= "(//*[text()='Edit'])[8]")
    public WebElement eighthInPatientEditButton;

    @FindBy(xpath = "//select[@id='in-patient-status']")
    public WebElement inpatientStatusDropBox;
    @FindBy(xpath = "//select[@id='in-patient-room']")
    public WebElement inpatientRoomDropBox;
    @FindBy(xpath = "//*[text()='Save']")
    public WebElement inPatientStatusSaveButton;
    @FindBy(xpath ="//*[contains (text(),'The In Patient is updated with identifier')]")
    public WebElement updatedMessage;

    @FindBy(xpath ="//*[contains (text(),'InPatient status can not be changed ')]")
    public WebElement canNotBeUpdatedMessage;

    //Second Inpatient info locator
    @FindBy(xpath= "//tbody/tr[2]/td[1]")
    public WebElement secondInPatientID;

    @FindBy(xpath= "//tbody/tr[2]/td[2]")
    public WebElement secondInPatientStartDate;

    @FindBy(xpath= "//tbody/tr[2]/td[4]")
    public WebElement secondInPatientStatus;

    @FindBy(xpath= "//tbody/tr[2]/td[6]")
    public WebElement secondInPatientCreatedDate;

    @FindBy(xpath= "//tbody/tr[2]/td[7]")
    public WebElement secondInPatientRoom;

    @FindBy(xpath= "//tbody/tr[2]/td[8]")
    public WebElement secondInPatientAppointment;

    @FindBy(xpath= "//tbody/tr[2]/td[9]")
    public WebElement secondInPatientNameSSN;

    @FindBy(xpath= "(//*[text()='Edit'])[2]")
    public WebElement secondInPatientEditButton;

}
