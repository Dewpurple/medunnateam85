package pages.US04_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UStory_04_Pages2 {

    public UStory_04_Pages2(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[2]/div[4]/a/span")
    public WebElement registeranewaccount;

    @FindBy(xpath = "//*[@id=\"register-title\"]")
    public WebElement verifyregistration;


}