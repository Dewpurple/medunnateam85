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


}
