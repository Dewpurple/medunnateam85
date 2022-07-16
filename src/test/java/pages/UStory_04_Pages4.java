package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UStory_04_Pages4 {

    public UStory_04_Pages4(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id='password']")
    public WebElement invalidpassword;

    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[2]/div[3]/a/span")
    public WebElement didyouforgetyourpassword;

    @FindBy(xpath = "/html/body")
    public WebElement failedtosignin;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/h1/span")
    public WebElement resetyourpasswort;

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement entertheemail;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/form/button/span")
    public WebElement resetpasswordbutton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div")
    public WebElement successmessage;

}
