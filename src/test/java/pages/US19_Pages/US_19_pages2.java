package pages.US19_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;



    public class US_19_pages2 {

        public  US_19_pages2() {
            PageFactory.initElements(Driver.getDriver(), this);}



        @FindBy(xpath = "//*[@id=\"login-item\"]/span")
        public WebElement signinbutton2;

        @FindBy(xpath = "//*[@id=\"entity-menu\"]")
        public WebElement itemtitles;

        @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[2]/span")
        public WebElement stuffbutton;

        @FindBy(xpath = "//*[@id=\"staff-heading\"]")
        public WebElement verifystaffpage;

        @FindBy(xpath = "//*[@id=\"jh-create-entity\"]/span")
        public WebElement createnewstaffbutton;

        @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[2]")
        public WebElement verifycreatenewstaffbutton;

        @FindBy(xpath = "//*[@id=\"searchSSN\"]")
        public WebElement placesearchSSN;

        @FindBy(xpath = "//*[@id=\"useSSNSearch\"]")
        public WebElement useSSNsearchcheckbox;

        @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[2]/div/form/div[1]/div[2]/div/button")
        public WebElement searchuserbutton;

        @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[2]")
        public WebElement verifyuserfoundwithsearchSSN;

        @FindBy(xpath = "//*[@id=\"cancel-save\"]/span/span")
        public WebElement backbutton;
}
