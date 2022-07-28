package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UStory_011_pages {

    public UStory_011_pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"account-menu\"]/a")
    public WebElement signintik;

    @FindBy(xpath = "//*[@id=\"login-item\"]/span")
    public WebElement signinbutton;

//    @FindBy(xpath = "//*[@class=\"modal-header\"]")
//    public WebElement signinsuccess;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitbutton;

//    @FindBy(xpath = "//*[@id=\"account-menu\"]/a/span")
//    public WebElement verifypage;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a/span")
    public WebElement mypage;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
    public WebElement myappointments;

    @FindBy(xpath = "//*[@id=\"appointment-heading\"]")
    public WebElement verifytitle;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr[1]/td[13]/div/a/span/span")
    public WebElement editbutton;

    @FindBy(xpath = "//*[@id=\"hospitalmsappfrontendApp.appointment.home.createOrEditLabel\"]/span")
    public WebElement createOrEditLabel;


    @FindBy(xpath = "//*[@id='appointment-id']")
    public WebElement appointmentid;

    @FindBy(xpath = "//*[@id=\"appointment-startDate\"]")
    public WebElement appointmentstartDate;

    @FindBy(xpath = "//*[@id=\"appointment-endDate\"]")
    public WebElement appointmentendDate;

    @FindBy(xpath = "//*[@id=\"appointment-status\"]")
    public WebElement appointmentstatus;


    @FindBy(xpath = "//*[@id=\"appointment-anamnesis\"]")
    public WebElement anamnesis;

    @FindBy(xpath = "//*[@id=\"appointment-treatment\"]")
    public WebElement treatment;

    @FindBy(xpath = "//*[@id=\"appointment-diagnosis\"]")
    public WebElement diagnosis;

    @FindBy(xpath = "//*[@id=\"save-entity\"]/span")
    public WebElement savebutton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div")
    public WebElement savesaccessmessage;
}
