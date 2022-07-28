package pages.US19_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_19_pages5 {

    public  US_19_pages5() {
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[15]/div/a[3]")
    public WebElement clickdeletebutton;

    @FindBy(xpath = "//*[@id=\"hospitalmsappfrontendApp.staff.delete.question\"]")
    public WebElement confirmdeleteoperation;

    @FindBy(xpath = "//*[@id=\"jhi-confirm-delete-staff\"]/span")
    public WebElement lastdeletebutton;


}
