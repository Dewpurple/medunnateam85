package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MessageFillPage {
    public MessageFillPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[@id=\"c-message-name\"]")
    public WebElement messageName;
    @FindBy(xpath = "//*[@id=\"c-message-email\"]")
    public WebElement messageEmail;

    @FindBy(xpath = "//*[@id=\"c-message-subject\"]")
    public WebElement messageSubject;
    //*[@id="c-message-message"]
    @FindBy(xpath = "//*[@id=\"c-message-message\"]")
    public WebElement messageMessage;
    //*[@id="root"]/div/div/div[1]/div
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div")
    public WebElement messageConfirm;
    @FindBy(xpath = "//*[@id=\"save-entity\"]")
    public WebElement messageSignIn;

}
