package pages.US04_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UStory_04_Pages1 {



    public UStory_04_Pages1(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"account-menu\"]/a")
    public WebElement signintik;

    @FindBy(xpath = "//*[@id=\"login-item\"]/span")
    public WebElement signinbutton;



    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[2]/div[1]/div[2]/div[3]/label/span")
    public WebElement rememberme;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitbutton;

    @FindBy(xpath = "//*[@id='app-header']/nav")
    public WebElement verifypage;
}