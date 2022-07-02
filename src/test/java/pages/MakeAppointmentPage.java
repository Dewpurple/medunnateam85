package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MakeAppointmentPage {
    public MakeAppointmentPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath="(//a[@href='#appointment'])[1]" )
    public WebElement makeAnAppointmentButton;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(id="ssn")
    public WebElement ssnTextBox;

    @FindBy(id="email")
    public WebElement emailTextBox;

    @FindBy(id="phone")
    public WebElement phoneTextBox;

    @FindBy(xpath = "//*[text()='Your FirstName is required.']")
    public WebElement yourFirstNameIsRequiredText;
}








