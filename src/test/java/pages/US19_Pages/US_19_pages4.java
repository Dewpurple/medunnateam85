package pages.US19_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_19_pages4 {

    public  US_19_pages4() {
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[15]/div/a[2]")
    public WebElement editbutton;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[2]")
    public WebElement verifyeditbutton;

    @FindBy(xpath = "//*[@id=\"staff-description\"]")
    public WebElement editdescription;

    @FindBy(xpath = "//*[@id=\"save-entity\"]/span")
    public WebElement savebuttonsave;

    @FindBy(xpath = "//*[@id=\"cancel-save\"]/span/span")
    public WebElement backbutton1;
}