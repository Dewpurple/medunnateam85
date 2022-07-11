package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UStory_04_Pages3 {

    public UStory_04_Pages3(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='username']")
    public WebElement invalidusername;

    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[1]/span")
    public WebElement cancelbutton;
}
