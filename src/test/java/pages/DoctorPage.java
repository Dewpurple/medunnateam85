package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DoctorPage {

    public DoctorPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath= "//li[@id='entity-menu']")
    public WebElement myPages;
    @FindBy (xpath = "//a[@href='/physician-appointment']")
    public WebElement myAppointments;
    @FindBy (xpath = "//a[@href='/physician-appointment']")
    public WebElement myAppointmentssss;
    @FindBy (xpath = "//a[@href='/physician-appointment']")
    public WebElement myAppointmentssseees;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div")
    public WebElement entireAppointmentsPage;
    @FindBy(xpath = "//*[@id=\"fromDate\"]")
    public WebElement fromDate;
    @FindBy(xpath = "//*[@id=\"toDate\"]")
    public WebElement toDate;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table")
    public WebElement appointmentTable;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/span")
    public WebElement appointmentErrorMessage;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr[1]/td[1]")
    public WebElement patientId1;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr[1]/td[2]/span")
    public WebElement startDateTime1;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr[1]/td[3]/span")
    public WebElement endDateTime1;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr[1]/td[4]/span")
    public WebElement status1;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr[2]/td[1]")
    public WebElement patientId2;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr[2]/td[2]/span")
    public WebElement startDateTime2;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr[2]/td[3]/span")
    public WebElement endDateTime2;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr[2]/td[4]/span")
    public WebElement status2;
    @FindBy (xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement editButton;
    @FindBy (xpath = "//a[@class='btn btn-success btn-sm']")
    public  WebElement requestAtestButton;
    @FindBy (xpath = "//input[@id='30199']")
    public  WebElement diabetesMedicineTest;
    @FindBy  (xpath = "//button[@id='save-entity']")
    public WebElement saveButtonTestRequest;
    @FindBy (xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]")
    public WebElement newTestisCreatedMessage;
    // A new Test is created with identifier 122431
}