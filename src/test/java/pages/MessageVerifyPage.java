package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MessageVerifyPage {
    public MessageVerifyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//*[@id=\"name\"]")
    public WebElement nameVisibility;
    @FindBy(xpath ="//*[@id=\"email\"]")
    public WebElement emailVisibility;
    @FindBy(xpath ="//*[@id=\"message\"]")
    public WebElement messageVisibility;
}
