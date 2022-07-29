package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminMessageAPage {
    public AdminMessageAPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//a[@class=\"btn btn-primary float-right jh-create-entity\"]")
    public WebElement createMessageButton;


    @FindBy(xpath="//h2[@id=\"c-message-heading\"]")
    public WebElement messageDisplay;

    @FindBy(xpath="//tbody//td//a")
    public WebElement messageID;

    @FindBy(xpath="(//th[@class='hand'])[1]")
    public WebElement ID;

    @FindBy(xpath="(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement edit;

    @FindBy(xpath="//button[@id='jhi-confirm-delete-cMessage']")
    public WebElement deletePopUp;
    @FindBy(xpath="(//a[@class='btn btn-danger btn-sm'])[2]")
    public WebElement delete;
}
