package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SearchPatientPage {
    public SearchPatientPage() { PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@name='ssn']")
    public WebElement patientSSNSearch;
    @FindBy (xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement patientSearchEditButton;
    @FindBy (xpath = "//td[contains(text(),'3353')]")
    public WebElement id;
    @FindBy (xpath = "//td[contains(text(),'123-66-5555')]")
    public WebElement ssn;
    @FindBy (xpath = "//td[contains(text(),'Vernice')]")
    public WebElement firstname;
    @FindBy (xpath = "//td[contains(text(),'Carroll')]")
    public WebElement lastname;
    @FindBy (xpath = "//td[contains(text(),'22/06/78 02:50')]")
    public WebElement birthday;
    @FindBy (xpath = "//td[contains(text(),'4165667780')]")
    public WebElement phonenumber;
    @FindBy (xpath = "//td[contains(text(),'dovie.macgyver@hotmail.com')]")
    public WebElement email;
    @FindBy (xpath = "//td[contains(text(),'OTHER')]")
    public WebElement gender;
    @FindBy (xpath = "//td[contains(text(),'O+')]")
    public WebElement bloodgroup;
    @FindBy (xpath = "//td[contains(text(),'Orchard, Port')]")
    public WebElement address;
    @FindBy (xpath = "//td[contains(text(),'asthma')]")
    public WebElement description;
    @FindBy (xpath = "//td[contains(text(),'21/12/21')]")
    public WebElement datecreated;
    @FindBy (xpath = "//td[contains(text(),'doctor84')]")
    public WebElement doctor;
    @FindBy (xpath = "//td[contains(text(),'Türkye')]")
    public WebElement country;
    @FindBy (xpath = "//td[contains(text(),'monster/mons')]")
    public WebElement stateCity;


}
