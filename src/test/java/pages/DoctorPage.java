package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DoctorPage {

    public DoctorPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (id= "entity-menu")
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




}