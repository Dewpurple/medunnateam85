package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StaffEdit {
    public StaffEdit(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnSearchBox;
    @FindBy(xpath = "(//*[contains(text(),'Show Appointments')])")
    public WebElement showAppointmentsButton;

    @FindBy(xpath = "(//*[contains(text(),'View')])")
    public WebElement viewButton;
    // after clicking show appointments
    @FindBy(xpath = "(//a[@class='btn btn-warning btn-sm'])[1]")
    ///html/body/div/div/div/div[4]/div/div/div/div/div/table/tbody/tr/td[13]/div/a[1]
    public WebElement editApptButton;
    @FindBy(xpath = "(//*[contains(text(),'Show Tests')])")
    public WebElement apptShowTestsButton;
    //under appointment edit button
    @FindBy(xpath="//*[@id='appointment-startDate']")
    public WebElement startDateTextBox;
    @FindBy(xpath="(//input[@type='datetime-local'])[2]")
    public WebElement endDateTextBox;
    @FindBy(xpath="//*[@id='appointment-status']")
    public WebElement apptStatusSelect;
    @FindBy(xpath="//*[@value='UNAPPROVED']")
    public WebElement unapprovedStatus;
    @FindBy(xpath="//*[@value='PENDING']")
    public WebElement pendingStatus;
    @FindBy(xpath="//*[@disabled value='COMPLETED']")
    public WebElement completedStatus;
    @FindBy(xpath="//*[@value='CANCELLED']")
    public WebElement cancelledStatus;
    @FindBy(xpath="//*[@name='anamnesis']")
    public WebElement anamnesisTextBox;
    @FindBy(xpath="//*[@name='treatment']")
    public WebElement treatmentTextBox;
    @FindBy(xpath="//*[@name='diagnosis']")
    public WebElement diagnosisTextBox;
    @FindBy(id="appointment-physician")
    public WebElement physicianSelect;
    @FindBy(id="save-entity")
    public WebElement saveButton;
    @FindBy(xpath="//button[@class='Toastify__close-button Toastify__close-button--success']")
    public WebElement apptUpdatedMessage;



}
//try {
//    for (int i = 1; i < 20; i++) {
//        String xpath = "//tbody//tr[" + i + "]//td[4]";
//        WebElement status = Driver.getDriver().findElement(By.xpath(xpath));
//        String xpathEdit = "//tbody//tr[" + i + "]//td[10]";
//        Thread.sleep(2000);
//        if (status.getText().equals("UNAPPROVED")) {
//            Driver.getDriver().findElement(By.xpath(xpathEdit)).click();
//            Thread.sleep(2000);
//            break;
//        }
//    }
//} catch (Exception e){