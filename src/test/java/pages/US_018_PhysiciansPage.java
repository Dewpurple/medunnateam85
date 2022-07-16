package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_018_PhysiciansPage {

    public US_018_PhysiciansPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Physician']")
    public WebElement physician;
    @FindBy(xpath = "//a[@class='btn btn-primary float-right jh-create-entity']")
    public WebElement createNewPhyscian;
    @FindBy(id = "searchSSN")
    public WebElement ssnbox;
    @FindBy(xpath = "//input[@id='useSSNSearch']")
    public WebElement userSearchCheckbox;
    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchUser;
    @FindBy(xpath = "//*[contains(text(), 'User found')]")
    public WebElement userFoundMessage;
    @FindBy(xpath = "//input[@value='Team85']")
    public WebElement firstnameTeam85;
    @FindBy(xpath = "//input[@value='Physician']")
    public WebElement lastnamePhysician;
    @FindBy(xpath = "//select[@name='speciality']")
    public WebElement specialityBox;
    @FindBy(xpath = "//*[contains(text(), 'Not found')]")
    public WebElement notFoundMessage;
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneBox;
    @FindBy(xpath = "//input[@name='birthDate']")
    public WebElement birthDateBox;
    @FindBy(xpath = "//input[@name='examFee']")
    public WebElement examfeeBox;
    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement saveButton;
    @FindBy(xpath = "//*[contains(text(), 'Physician is updated')]")
    public WebElement physicianUpdatedMessage;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement birthDateError;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement phoneError;
    @FindBy(xpath = "//*[contains(text(),'at least 0')]")
    public WebElement examFeeError;
    @FindBy(xpath = "//input[@value='500']")
    public WebElement updatedExamFeeTeam83;
    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[56]")
    public WebElement editDaqarWerr;
    @FindBy(xpath = "//input[@id='file_image']")
    public WebElement uploadPicture;
    @FindBy(xpath = "//span[text()='17 384 bytes']")
    public WebElement pictureVerify;
    @FindBy(xpath = "//a[.='»»']")
    public WebElement lastPage;
    @FindBy(linkText = "14")
    public WebElement page14;
    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement editTeam85;
    @FindBy(xpath = "//span[.='First Name']")
    public WebElement firstNameButton;
    @FindBy(name = "adress")
    public WebElement addressBox;
    @FindBy(xpath = "//input[@name='description']")
    public WebElement descriptionBox;
    @FindBy(xpath = "//td[.='555-348-3333']")
    public WebElement phoneNumberPhysician;
    @FindBy(xpath = "//td[.='100 Union Street']")
    public WebElement addressPhysician;
    @FindBy(xpath = "//td[.='Best doctor in USA']")
    public WebElement descriptionPhysician;
}
