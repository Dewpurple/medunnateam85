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
    @FindBy (xpath = "//td[contains(text(),'125359')]")
    public WebElement id;
    @FindBy (xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[2]/div/table/tbody/tr/td[2]")
    public WebElement ssn;
    @FindBy (xpath = "//td[contains(text(),'Jerrold')]")
    public WebElement firstname;
    @FindBy (xpath = "//td[contains(text(),'Buckridge')]")
    public WebElement lastname;
    @FindBy (xpath = "//span[contains(text(),'05/08/76 21:04')]")
    public WebElement birthday;
    @FindBy (xpath = "//td[contains(text(),'434-527-8968')]")
    public WebElement phonenumber;
    @FindBy (xpath = "//td[contains(text(),'wynona.grimes@hotmail.com')]")
    public WebElement email;
    @FindBy (xpath = "//span[contains(text(),'OTHER')]")
    public WebElement gender;
    @FindBy (xpath = "//span[contains(text(),'B-')]")
    public WebElement bloodgroup;
    @FindBy (xpath = "//td[contains(text(),'Rodriguez Estates')]")
    public WebElement address;
    @FindBy (xpath = "//td[contains(text(),'full blood')]")
    public WebElement description;
    @FindBy (xpath = "//span[contains(text(),'04/12/21 16:00')]")
    public WebElement datecreated;
    @FindBy (xpath = "//td[contains(text(),'doctor84')]")
    public WebElement doctor;
    @FindBy (xpath = "//td[contains(text(),'Germany')]")
    public WebElement country;
    @FindBy (xpath = "//td[contains(text(),'monster/mons')]")
    public WebElement stateCity;


}
