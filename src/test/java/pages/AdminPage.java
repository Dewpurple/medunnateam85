package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPage {
    public AdminPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Items&Titles']")
    public WebElement itemsTitles;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[9]/span")
    public WebElement messageLink;

}
