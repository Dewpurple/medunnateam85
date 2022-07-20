package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StaffEdit {
    public StaffEdit(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//*[contains(text(),'Show Appointments')])[5]")
    public WebElement showAppointmentsButton;
    @FindBy(xpath = "(//*[contains(text(),'Edit')])[5]")
    public WebElement editButton;
    @FindBy(xpath = "(//*[contains(text(),'Show Tests')])[5]")
    public WebElement showTestsButton;


}
//try {
//    for (int i = 1; i < 20; i++) {
//        String xpath = "//tbody//tr[" + i + "]//td[4]";
//        WebElement status = Driver.getDriver().findElement(By.xpath(xpath));
//        String xpathEdit = "//tbody//tr[" + i + "]//td[10]";
//        Thread.sleep(2000);
//        if (status.getText().equals("UNAPPROVED")) {
//            Driver.getDriver().findElement(By.xpath(xpathEdit)).click();
//            Thread.sleep(2000);
//            break;
//        }
//    }
//} catch (Exception e){