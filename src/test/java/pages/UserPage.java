package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserPage {//elements from DoctorPage can be moved here
    public UserPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="account-menu")
    public WebElement menuButton;
    @FindBy(xpath = "//a[contains(@href,'settings')]")
    public WebElement settingsButton;
    @FindBy(id="entity-menu")
    public WebElement myPagesMenu;
    @FindBy(xpath="//a[@href='/search-patient']")
    public WebElement searchPatientButton;//under staff only
    @FindBy(xpath="//div[@class='dropdown-menu dropdown-menu-right show']")
    public WebElement myPagesDropDown;


}
