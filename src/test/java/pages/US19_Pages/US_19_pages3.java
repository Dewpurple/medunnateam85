package pages.US19_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_19_pages3 {

    public  US_19_pages3() {
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/thead/tr/th[3]/span")
    public WebElement firstnamebutton;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[15]/div/a[1]/span/span")
    public WebElement viewbutton;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]")
    public WebElement verifyviewbuttonpage;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/a[1]/span/span")
    public WebElement backbutton;





}
