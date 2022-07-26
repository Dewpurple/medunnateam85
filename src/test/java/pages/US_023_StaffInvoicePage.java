package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_023_StaffInvoicePage {

    public US_023_StaffInvoicePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='MY PAGES']")
    public WebElement myPages;
    @FindBy(xpath = "//span[.='Search Patient']")
    public WebElement searchPatient;
    @FindBy(name = "ssn")
    public WebElement ssnBox;
    @FindBy(xpath = "(//span[.='Show Appointments'])[2]")
    public WebElement showAppointments;
    @FindBy(xpath = "(//span[.='Payment / Invoice Process'])[2]")
    public WebElement paymentInvoice;
    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm']")
    public WebElement createInvoice;
    @FindBy(xpath = "//select[@name='paymentMethod']")
    public WebElement paymentMethod;
    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement saveButton;
    @FindBy(xpath = "//*[contains(text(),'Bill is updated')]")
    public WebElement billUpdatedMessage;
    @FindBy(xpath = "//th[.='PAYMENT DETAIL']")
    public WebElement paymentDetailTitle;
    @FindBy(xpath = "//a[@class='btn btn-success btn-sm']")
    public WebElement showInvoice;
    @FindBy(xpath = "//th[.='INVOICE']")
    public WebElement invoiceTitle;
    @FindBy(xpath = "//td[.='PENDING']")
    public WebElement pendingStatus;
    @FindBy(xpath = "//*[contains(text(),'UNAPPROVED')]")
    public WebElement unapprovedStatus;
    @FindBy(xpath = "//*[contains(text(),'500')]")
    public WebElement examFee;
    @FindBy(xpath = "//*[contains(text(),'620')]")
    public WebElement bryonTotalCost;
    @FindBy(xpath = "//*[contains(text(),'1274')]")
    public WebElement alysTotalCost;
    @FindBy(xpath = "//*[contains(text(),'1461')]")
    public WebElement lyannaTotalCost;
    @FindBy(xpath = "//a[@id='cancel-save']")
    public WebElement backButton;

}
