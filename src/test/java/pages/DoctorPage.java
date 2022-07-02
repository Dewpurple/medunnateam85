package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DoctorPage {

    public DoctorPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//*[@id=\"entity-menu\"]/a/span")
    public WebElement myPages;
    @FindBy (xpath = "//a[@href='/physician-appointment']")
    public WebElement myAppointments;
    @FindBy (xpath = "//a[@href='/physician-appointment']")
    public WebElement myAppointmentssss;




}
